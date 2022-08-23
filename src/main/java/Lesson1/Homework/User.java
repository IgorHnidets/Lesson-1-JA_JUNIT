package Lesson1.Homework;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
@AllArgsConstructor()
@Data
public class User {
    public String fullname;
    public String address;
    public int age;
    ArrayList<String> animal = new ArrayList<String>();


    public int FindAge(){
        if (age>18){
            System.out.println(1);
        }
            return -1;
    }
}
