package Files;

import javax.naming.Name;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyOperations {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Qapitol\\IdeaProjects\\FileProject\\src\\test\\java\\Repo\\config.Properties");
        Properties property = new Properties();

        property.load(new FileInputStream("C:\\Users\\Qapitol\\IdeaProjects\\FileProject\\src\\test\\java\\Repo\\config.Properties"));




       property.setProperty("company","Qapitol");
       String company= property.getProperty("company");
       System.out.println(company);
        property.setProperty("name","bheema");
        property.setProperty("address","jp nagar");

        property.store(fos, "practice");
        String nameee = property.getProperty("name");
        String add= property.getProperty("address");

       System.out.println(nameee);
       System.out.println(add);



    }



    }


