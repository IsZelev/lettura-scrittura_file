import java.io.*;

public class Writelines
{
    public Writelines(String filename) throws IOException
    {
        PrintWriter output = new PrintWriter(new FileWriter(filename)); 
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String linea = input.readLine();
        
        while (!linea.equals(""))
        {
            output.println(linea);
            linea = input.readLine();
        }

        input.close();
        output.close();
    }
    public static void main(String[] args)
    {
    
        try
        {
            Writelines cp = new Writelines(args[0]);
        }
        catch(IOException ex)
        {
            System.out.println("Errore di I/O.");

            System.exit(1);
        }
    }
}    