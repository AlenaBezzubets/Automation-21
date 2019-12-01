import org.junit.Test;

public class MainClass {

     static int getLocalNumber () {
        return 14;
    }
}

class MainClassTest extends MainClass {
    public static void main (String [] args ) {
        System.out.println(testGetLocalNumber());
    }
    @Test
    static String testGetLocalNumber () {
if (getLocalNumber() == 14)
    return "Return result is correct";
else return "Return result is not correct";
    }
}