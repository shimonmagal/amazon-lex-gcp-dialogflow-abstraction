import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        YamlParser yp = new YamlParser(new File("./src/main/resources/example.yml"));

        yp.exec();
    }
}
