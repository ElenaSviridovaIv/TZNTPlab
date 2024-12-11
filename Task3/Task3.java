import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

// загрузка данных из файла
public class Task3 {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Map<String, Object>> valuesData = objectMapper.readValue(new File("values.json"), new TypeReference<List<Map<String, Object>>>() {});
            List<Map<String, Object>> testsData = objectMapper.readValue(new File("tests.json"), new TypeReference<List<Map<String, Object>>>() {});

            // обработка данных
            for (Map<String, Object> testItem : testsData) {
                String testId = (String) testItem.get("id");
            // Поиск соответствующего значения в values.json<br>
                for (Map<String, Object> valueItem : valuesData) {
                    if (valueItem.get("id").equals(testId)) {
                        testItem.put("value", valueItem.get("value"));
                        break;
                    }
                }
            }

            // запись конечного результата в report.json
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("report.json"), testsData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}