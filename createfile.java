import java.io.File;
import java.io.IOException;

class createfile
{
    public static void main(String[] args)
    {
        try
        {
            File f=new File("C:\\Users\\admin\\Desktop\\Try.txt");
            if(f.createNewFile())
            {
                System.out.println("File Successfully Created!");
            }
            else
            {
                System.out.println("File Alrady Exist..!");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception Handled..!");
        }
    }
}