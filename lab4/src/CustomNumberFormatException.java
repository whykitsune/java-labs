import java.io.FileWriter;
import java.io.IOException;

public class CustomNumberFormatException extends Exception{
    public CustomNumberFormatException(String message, String num) {
        super(message);
        try {
            FileWriter writer = new FileWriter("errors.txt", true);
            writer.write(num + " " + message + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Запись не удалась");
        }
    }
}
