import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class compliant {
void readData(){
    ByteBuffer buffer = ByteBuffer.allocateDirect(16 * 1024);
    try (FileChannel rdr = (new FileInputStream("file")).getChannel()) {
    while (rdr.read(buffer) > 0) {
       // Do something with the buffer
       buffer.clear();
    }
    } catch (Throwable e) {
       // Handle error
    }
}
  

    public static void main (String [] args) {

    }
}
