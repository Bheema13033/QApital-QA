package json;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    public static void main(String[] args) throws IOException, IOException {
        // File path to read from and write to (JSON file)
        File file = new File("C:\\Users\\Qapitol\\IdeaProjects\\FileProject\\src\\test\\java\\Repo\\student1.json");

        // Create Address objects
        Address address1 = new Address();
        //address1.setStreetName("BTM");
        address1.setPincode(12345);
        address1.setCompleteAddr("Residential");

        Address address2 = new Address();
        //address2.setStreetName("HSR");
        address2.setPincode(1213345);
        address2.setCompleteAddr("Permanent");

        Address address3 = new Address();
        //address3.setStreetName("Indiranager");
        address3.setPincode(1213345);
        address3.setCompleteAddr("Permanent");

        // Create a list of Address objects
        List<Address> listOfAddress = new LinkedList<>();
        listOfAddress.add(address1);
        listOfAddress.add(address2);
        listOfAddress.add(address3);

        // Create a Student object and set properties
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        //student.setRollNo(101);
        student.setAddr(listOfAddress);

        // ObjectMapper to handle JSON format
        ObjectMapper mapper = new ObjectMapper();

        // Write Student object to JSON file
        mapper.writerWithDefaultPrettyPrinter().writeValue(file, student);
        System.out.println("Student object has been written to JSON file");

        // Read JSON file into a Student object
        Student studentFromFile = mapper.readValue(file, Student.class);
        System.out.println("Read from JSON file: " + studentFromFile);
    }
}


