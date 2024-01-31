import java.io.*;

public class Test{
    public static void main(String[] args)
        throws IOException
    {
        int myClassNum;
        BufferedReader classID = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the Class ID?");
        
        String IDClass = classID.readLine();

        BufferedReader classNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the class number?");

        String numClass = classNum.readLine();
        
        myClassNum = Integer.valueOf(numClass);
        
        System.out.println("Hello World!");
        System.out.print("Your class is " + IDClass);
        System.out.print(" " + myClassNum);
    }
}