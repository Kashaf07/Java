import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileReader
{
    public static void main(String[] args)
    {
        try
        {
            File r=new File("C:\\Users\\admin\\Desktop\\Try.txt");
            Scanner sc=new Scanner(r);
            while(sc.hasNextLine())  // if data avaiable then return true
            {
                System.out.println(sc.hasNextLine()); // will return True
                System.out.println(sc.nextLine()); // will read and display the data in the file
                System.out.println(sc.hasNextLine()); // will return False
            }

        }
        catch(IOException e)
        {
            System.out.println("Exeption Handled...!");
        }
    }
}