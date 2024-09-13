package step4.ioStream;

import java.io.*;

public class WriteExample {

    public static void main(String[] args) {



        try(Writer writer = new FileWriter("C:/Users/82109/OneDrive/.개인공부/asd.txt")){

            writer.write("ASDASD");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
