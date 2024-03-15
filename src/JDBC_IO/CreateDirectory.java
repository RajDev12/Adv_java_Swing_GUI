package JDBC_IO;

//checked=checked by us using try and catch
//unchecked=checked by compiler

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
    public static void main(String[] args) {
        //CREATING  A DIRECTORY
//        try{
//            Path p= Paths.get("c:\\KE001");
//            if(Files.exists(p)) System.out.println("Directory already Exists");
//            else{
//                Path pp=Files.createDirectory(p);
//                System.out.println("Directory Created");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        try{
            Path p= Paths.get("c:\\KE001\\test.txt");
            if(Files.exists(p)) System.out.println("File already Exists");
            else{
                Path pp=Files.createFile(p);
                System.out.println("File Created");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
