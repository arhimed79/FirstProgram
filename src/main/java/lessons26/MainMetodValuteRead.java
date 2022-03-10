package lessons26;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Scanner;

@Configuration
@ComponentScan("lessons26")

public class MainMetodValuteRead {
    public static void main(String[] args) {
        String EXIT = "y";
         final AnnotationConfigApplicationContext annotationConfigApplicationContext =
                 new AnnotationConfigApplicationContext(MainMetodValuteRead.class);
         final InterValute interValute = annotationConfigApplicationContext.getBean(InterValute.class);

         System.out.println("Введите код валюты, курс которого вы хотите узнать \n"
        + "или нажмите Y, для выхода");

        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            if (EXIT.equalsIgnoreCase(text)){
               System.exit(0);
            }
            if (StringUtils.isNumeric(text)) {
                System.out.println("Вы ввели цифры, по умолчанию будет подстален доллар");
                text = "USD";
            }
            String finalText = text;
            interValute.getName(text.toUpperCase()).ifPresentOrElse(
           value1 -> {
               System.out.println(value1.toUpperCase());
               },
                    () -> System.out.println("Такая ваалюта не найдена \n ")
                    );

        //    System.out.println(finalText);

          interValute.getCode(text.toUpperCase()).ifPresentOrElse(
                 value -> {
                     System.out.print("Текущий курс 1 "+ finalText.toUpperCase() +" = " +value + " рублей\n \n"
                     + "Заново введите код валюты или нажмите Y для выхода\n");
                },
                  () -> System.out.println("Попробуйте еще раз")
            );
        }
    }
}
