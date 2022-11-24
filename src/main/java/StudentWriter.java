import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter
{   String filename="studenti.txt";
    File file=new File(filename);
    BufferedWriter bw;
    {
        try
        {
            bw = new BufferedWriter(new FileWriter(filename));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        
    }
}
