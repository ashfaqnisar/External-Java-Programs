import java.io.*;

public class CopyLines {

    public void Copy()throws IOException{
        BufferedReader inputStream  = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("input.txt"));
            outputStream = new PrintWriter(new FileWriter("output.txt"));

            String data = null;

            while ((data = inputStream.readLine()) != null){
                outputStream.println(data);
            }
        }

        finally {
            if (inputStream != null){
                inputStream.close();
            }
            if (outputStream != null){
                outputStream.close();
            }
        }

        long timetaken = System.currentTimeMillis();
        System.out.println(timetaken);

    }

}
