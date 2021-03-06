import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class YamlParser {
    YamlParser() throws IOException {
        try (InputStream inputStream = new FileInputStream(new File("example.yml"))) {

            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);
            System.out.println(data);
        }
    }
}
