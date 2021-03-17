import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class YamlParser {
    YamlParser(File file) throws IOException {
        try (InputStream inputStream = new FileInputStream(file)) {

            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);
            System.out.println(data);
        }
    }

    public void exec() {
    }
}
