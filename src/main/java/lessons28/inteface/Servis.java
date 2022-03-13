package lessons28.inteface;

import java.io.IOException;

public interface Servis {

    String arhZip(String course) throws IOException;

    String arhUnZip(String course);
}
