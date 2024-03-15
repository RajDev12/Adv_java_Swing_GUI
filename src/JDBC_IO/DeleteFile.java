package JDBC_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("c:\\KE001\\test.txt");
        if(Files.exists(p)){
            Files.delete(p);
            System.out.println("files deleted");
        }else {
            System.out.println("File not found");
        }
    }
}
