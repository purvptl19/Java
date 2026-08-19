import java.io.*;

public class FileStreamDemo
{
    public static void main(String[] args)
    {
        String data = "Hello, this is a demo of FileInputStream and FileOutputStream in Java.";
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            fos.write(data.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("demo.txt");
            int i;
            System.out.println("Reading data from demo.txt:");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();

        } catch (IOException e)
            {
                System.out.println("An error occurred: " + e);
            }
    }
}
