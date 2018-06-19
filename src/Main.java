import java.net.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://github.com/AlexKhristoforov/Patients-list/blob/master/list.txt");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream stream = connection.getInputStream();
            System.out.printf("File size: %d bytes \n", stream.available());

            int i = -1;
            while ((i = stream.read()) != -1) {

                System.out.print((char) i);
            }
        }
           catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}