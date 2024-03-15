package JDBC_IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyData {
    public static void main(String[] args) {
        try{
            Path p1= Paths.get("c:\\KE001\\test1.txt");
            Path p2= Files.createFile(p1);

            Path p3=Paths.get("c:\\KE001\\test2.txt");
            List<String> ls=Files.readAllLines(p3);

            Files.write(p2,ls);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
