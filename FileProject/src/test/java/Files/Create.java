package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {

    public static void main(String[] args) throws IOException {
        String fileName = "Temp.txt";
        File file = new File("C:\\Users\\Qapitol\\IdeaProjects\\FileProject\\src\\test\\java\\Repo" + fileName);
        if (!file.exists()) {
            file.createNewFile();
//            file.delete();
//            file.getAbsoluteFile();
//            file.compareTo(file);
//            file.getName();
//            file.isDirectory();


        }
//        file.delete();
        file.getAbsoluteFile();
        file.compareTo(file);
        file.getName();
       System.out.println(file.getName());
        System.out.println(file.isDirectory());
//
//
    }
}



