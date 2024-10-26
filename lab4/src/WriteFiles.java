import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args){
        writeFile("file1.txt", "file2.txt");
//        writeFile("filee1.txt", "file2.txt");
    }

    public static void writeFile(String inFile, String outFile) {
        try{
            FileReader reader = new FileReader(inFile);
            FileWriter writer = new FileWriter(outFile);
            int temp;
            while ((temp=reader.read()) != -1) {
                writer.write(temp);
                writer.close();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка");
        }
    }
}
