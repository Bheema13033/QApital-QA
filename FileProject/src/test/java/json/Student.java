package json;

import org.apache.poi.ss.formula.functions.Address;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private int id;
    private List<Address> addr;
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public  int getId(){
        return id;
    }
    public List<Address>getAddr(){
        return addr;
    }
    public void setAddr(List<json.Address> listOfAddress){
        this.addr=addr;
    }
    public String toString(){
        return "Student[name=" + name +",age=" + age +",id=" + id +",addr=" + addr + "]";

    }
}
