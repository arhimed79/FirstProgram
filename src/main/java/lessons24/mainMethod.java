package lessons24;

import lombok.SneakyThrows;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;


public class mainMethod {
    @SneakyThrows
    public static void main(String[] args) {
        try (final Connection connection = getConnection();
             final PreparedStatement dropIfExistsTableBooks = connection.prepareStatement("drop table if exists books")) {
            dropIfExistsTableBooks.execute();
        }

        try (final Connection connection = getConnection();
             final PreparedStatement dropIfExistsTableBooks = connection.prepareStatement(
                     """
                             create table books
                               (
                                   id       int auto_increment,
                                   isbn     varchar(40)   not null,
                                   nameBook varchar(100)  not null,
                                   url      varchar(4000) not null,
                                   pages    int           not null,
                                   author   varchar(200)  null,
                                   constraint books_pk
                                       primary key (id)
                               );
                              
                               
                             """
             )) {
            dropIfExistsTableBooks.execute();
        }
        for (Books books : CsvReader.getBook()) {
            List<Books> book = List.of(
                    new Books(books.getIsbn(),
                            books.getNameBook(),
                            books.getUrl(),
                            books.getPageCount(),
                            books.getAuthor()));
            insertBook(book.get(args.length));
        }
    }

    public static final Properties DB_SETTINGS = new Properties();

    static {
        try {
            DB_SETTINGS.load(mainMethod.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
    }

    @SneakyThrows(SQLException.class)
    public static Optional<Integer> insertBook(Books book) {


        try (final Connection connection = getConnection();
             final PreparedStatement fullBookStatement = connection.prepareStatement(
                     """
                             insert into books(isbn, nameBook, url, pages, author)
                             values (?, ?, ?, ?, ?)
                             """
             );
        ) {
            fullBookStatement.setString(1, book.getIsbn());
            fullBookStatement.setString(2, book.getNameBook());
            fullBookStatement.setString(3, book.getUrl());
            fullBookStatement.setInt(4, book.getPageCount());
            fullBookStatement.setString(5, book.getAuthor());
            fullBookStatement.execute();
        }


        return Optional.empty();
    }
}
