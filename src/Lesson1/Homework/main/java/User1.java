import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor()
@Data
public class User1 {
    public String fullname;
    public String address;
    public int age;
    ArrayList<String> animal = new ArrayList<String>();


    public int FindAge(){
//        Коли age>18 то буде повертати а
        int a = 11;
        int b = 12;
        if (age>18){
            return a;
        }
        return b;
    }

    public String addAdress(){
        return address = "Dobrotvir";
    }

    public String removeAdress(){
        return address = "";
    }

    public boolean addAnimal(){
        return animal.add("cat");
    }

    public boolean remAnimal(){
        return animal.remove("cat");
    }
}
