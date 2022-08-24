import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Array Utils test")
public class ArratUtilsTest {
    private ArrayUtills arrayUtills;

    @BeforeEach
    public void init() {
        System.out.println("Before");
        arrayUtills = new ArrayUtills();
    }

    @AfterEach
    public void disconnect() {
        System.out.println("After");
        arrayUtills = null;
    }

    @Test
    @DisplayName("Test find max method")
    public void findMaxTest() {
        int[] array = {1, 24, 32, 32, 66, 5};
        int expected = 66;
        int result = arrayUtills.findMax(array);
        Assertions.assertEquals(expected, result);

    }


//    @Test
//    @DisplayName("Div method test should return Succes")
//    public void divTest() {
//        double expected = 3;
//        Assertions.assertEquals(expected, arrayUtills.div(5, 15));
//    }
//
//    @Test
//    @DisplayName("Div method test should return Succes")
//    public void divTest2() {
//        double expected = 3;
//        Assertions.assertEquals(expected, arrayUtills.div(15, 5));
//    }

    @Test
    @DisplayName("Div method test should throw exception")
    public void divTestException() {
        Assertions.assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                arrayUtills.div(20, 0);
            }
        });
    }


    @ParameterizedTest(name = "a={0}, b = {1},result ={2}")
    @CsvSource({
            "20,4,5",
            "12,4,3",
            "3,18,6",
            "12,0,6"
    })
    @DisplayName("Test Dic Method With Param ")
    public void TestDivMethodWithParam(double a, double b, double result) {
        double actual = arrayUtills.div(a,b);
        Assertions.assertEquals(result,actual);
    }

}


