package step4.ioStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\82109\\OneDrive\\.개인공부\\자바 공부\\JavaStudy" +
                "\\src\\step4\\ioStream\\Example1.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while(true){
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(rowNumber + ":" + rowData);
            rowNumber++;
        }

        br.close();

    }
}
