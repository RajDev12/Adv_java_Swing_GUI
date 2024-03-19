package JDBC_IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//createing directory for each file extension type in parent directory

public class CreateDir {
    public static void main(String[] args) {
        Path p= Paths.get("C:\\KE001");

        try{
            Stream<Path> str= Files.list(p);
            str.forEach(x->{
                String name=x.getFileName().toString();
                String token[]=name.split("\\.");
                String extension=token[token.length-1];
                try{
                    Path d=Paths.get(x.getParent()+ "\\"+extension);
                    Files.createDirectory(d);
                }catch(Exception e){}
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
