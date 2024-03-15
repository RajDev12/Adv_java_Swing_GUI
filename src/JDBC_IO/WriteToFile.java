package JDBC_IO;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            Path p= Paths.get("c:\\KE001\\test1.txt");
            Path pp=Files.createFile(p);
            String data="WE are learning adv java"+"\nWe have to learn it";

            Files.write(pp,data.getBytes());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
