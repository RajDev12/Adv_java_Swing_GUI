package JDBC_IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class CopyFile {
    public static void main(String[] args) {
        try{
            System.out.println("Started :" + new Date());
        Path source= Paths.get("c:\\KE001\\test1.txt");
        Path destination=Paths.get("c:\\TempKE001\\test1.txt");

        //Copy test1.txt from KE001 to TempKE001
        Files.copy(source,destination);
            System.out.println("Completed :"+ new Date());
    }catch(Exception e){
            e.printStackTrace();
        }
    }
}
