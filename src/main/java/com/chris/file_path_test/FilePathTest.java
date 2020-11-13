package com.chris.file_path_test;

import com.chris.Main;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/**
 * Created by ye830 on 10/29/2018.
 */
public class FilePathTest {
    public static void main(String[] args) {
        try {
            // Read file in file relative path
            File f = new File("src/main/java/com/chris/slash_test.json");
            System.out.println("Read file in relative path: " + f.length());

            // Read file in file absolute path
            f = new File("C:\\development\\IdeaProjects\\JavaBasic\\src\\main\\java\\com\\chris\\slash_test.json");
            System.out.println("Read file in absolute path: " + f.length());

            // Read file in resource folder which in root path
            URL url = Main.class.getResource("/slash_test.json");
            System.out.println(url.toString());

            BufferedInputStream bufferedInputStream = new BufferedInputStream(Main.class.getResourceAsStream("/slash_test.json"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int len;
            try {
                while (-1 != (len = bufferedInputStream.read(buffer, 0, 1024))){
                    byteArrayOutputStream.write(buffer, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println(byteArrayOutputStream.toString());

                ObjectMapper objectMapper = new ObjectMapper();
                Map<String, Object> map = objectMapper.readValue(byteArrayOutputStream.toByteArray(), Map.class);

                System.out.println(map.size());

                bufferedInputStream.close();
                byteArrayOutputStream.close();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
