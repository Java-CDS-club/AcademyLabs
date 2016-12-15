package java.se.lab_1_1;

import java.io.File;

public class MyFilesList {

    public static void main(String[] args) {

        String path = args.length == 1 ? args[0] : ".";
        File file = new File(path);
        if (file.isDirectory()) {
            for (String name : file.list()) {
                System.out.println(name);
            }
        }

    }

}
