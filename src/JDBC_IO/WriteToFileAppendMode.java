package JDBC_IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFileAppendMode {
    public static void main(String[] args) {
        try{
            Path p= Paths.get("c:\\KE001\\test1.txt");
//            Path pp=Files.createFile(p);
            String data="WE are learning adv java"+"\nWe have to learn it";

            Files.write(p,data.getBytes(),StandardOpenOption.APPEND);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
