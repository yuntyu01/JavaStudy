package step4.ioStream;

import java.io.*;

public class ByteStreamExample {

    public static void main(String[] args) {
        String original = "C:/Users/82109/OneDrive/.개인공부/still-life-black-background.jpg";
        String target = "C:/Users/82109/OneDrive/.개인공부/bbb.jpg";

        try ( InputStream is = new FileInputStream(original);
              OutputStream os = new FileOutputStream(target)){
            byte[] data = new byte[1024];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                os.write(data, 0, num);
            }

            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
