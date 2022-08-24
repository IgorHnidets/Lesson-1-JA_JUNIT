import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class UserTest {

    User1 user = new User1("Igor Hnidets","",20, new ArrayList<String>());
    @BeforeEach
    public void init() {
        System.out.println("Before: " + user);
    }

    @AfterEach
    public void disconnect() {
        System.out.println("After: " + user);
//        user = null;
    }


//    @Test
//    @DisplayName("Testing on 18")
//    public void TestOn18(){
////        User1 user = new User1("Igor Hnidets","Dobrotvir",20);
//        int expected = 11;
//        int res = user.FindAge();
//        Assertions.assertEquals(expected,res);
//    }

//    @Test
//    @DisplayName("Add a address")
//    public void TestAddAddress(){
//        String expected = "Dobrotvir";
//        String res = user.addAdress();
//        Assertions.assertEquals(expected,res);
//    }
//
//    @Test
//    @DisplayName("Remove a address")
//    public void TestRemAddress(){
//        String expected = "";
//        String res = user.removeAdress();
//        Assertions.assertEquals(expected,res);
//    }

    @Test
    @DisplayName("Add Animal")
    public void AddAnimal(){
        boolean expected = true;
        boolean res = user.addAnimal();
        Assertions.assertEquals(expected,res);
    }

    @Test
    @DisplayName("Remove Animal")
    public void RemAnimal(){
        boolean expected = true;
        boolean res = user.remAnimal();
        Assertions.assertEquals(expected,res);
    }
}
