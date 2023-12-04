import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Car car1 = new Car("a", "b");

        File file = new File("C:\\Users\\cti22c113\\IdeaProjects\\labo10\\Main.txt");
        objectMapper.writeValue(file, car1);
        Car car = null;
        try {
            car = objectMapper.readValue(file, Car.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(car);
    }
}
