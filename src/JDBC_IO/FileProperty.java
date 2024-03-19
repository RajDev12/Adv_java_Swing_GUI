package JDBC_IO;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProperty {
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("C:\\KE001\\Subfolder");
        System.out.println(p);
        System.out.println(p.getParent());
        System.out.println(p.subpath(0,2));
        System.out.println(p.getName(1));
        System.out.println(p.getRoot());
//        System.out.println(files.exists(p,LinkOption.NOFOLLOW_LINKS());
        System.out.println();
    }
}
