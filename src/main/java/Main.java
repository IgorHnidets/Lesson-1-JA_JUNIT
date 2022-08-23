import lombok.*;
import lombok.experimental.FieldDefaults;

public class Main {

    public static void main(String[] args) {
//        testFunc(sum(10,20),30);
//
//    }
//    public static double sum(double a, double b){
//        return a + b;
//    }
//    public static void testFunc(double actual, double expexted){
//        if (actual==expexted){
//            System.out.println("Test succesful");
//        } else {
//            System.out.println("Test failed");
//        }


        User user = new User("asd", "asd", "dsf", 10);
        User user2 = new User();
        user.getAge();
    }
}
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//@Getter
//@Setter
//@ToString(exclude = {"age"})
//@EqualsAndHashCode
class User{
//    private String firstname;
//    private String lastname;
//    private String email;
//    private int age;
      String firstname;
      String lastname;
      String email;
      int age;
}