package Lesson1.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UserTest {
    private User user;

    @Test
    @DisplayName("Testing on 18")
    public void TestOn18(){
        User user1 = new User("Igor H","Dobrotvir",20, new ArrayList<>());
        int expected = 1;
        int res = user1.FindAge();
        Assertions.assertEquals(expected,res);
    }
}
