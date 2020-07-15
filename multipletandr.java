import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class multipletandr {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:/Users/akshat/Desktop/job.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
