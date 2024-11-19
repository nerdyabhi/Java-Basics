import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputBuffer {
    public static void main(String[] args) throws IOException { 
        InputStreamReader inputReader = new InputStreamReader(System.in);

        BufferedReader buffer = new BufferedReader(inputReader);

        System.out.println("What's Your good Name sir?");
        String Name = buffer.readLine();
        System.out.println("Good Morning sir " + Name);

        buffer.close();
    }
} 
