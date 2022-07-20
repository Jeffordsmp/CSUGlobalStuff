import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class nonCompliant {
    void readData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(
            new FileInputStream("file")));
        // Read from the file
        String data = br.readLine();
    }

    public static void main (String [] args) {

    }
}
