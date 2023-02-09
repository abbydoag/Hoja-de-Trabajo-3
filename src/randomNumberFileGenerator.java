import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class randomNumberFileGenerator {
    /* Genera 3000 numeros los pone en un txt file separados por espacios */
    int cantidad = 3000; 
    generate(int cantidad){
        int numberOfRandomNumbers = cantidad;
        try (FileWriter writer = new FileWriter("randomNumbersFile.txt")) {
             Random random = new Random();
             for (int i = 0; i < numberOfRandomNumbers; i++) {
                int randomNumber = random.nextInt();
                writer.write(String.valueOf(randomNumber));
                writer.write("\n");
            }
        } 
        
        catch (IOException e) {
        e.printStackTrace();
        }
    }   
    
}
