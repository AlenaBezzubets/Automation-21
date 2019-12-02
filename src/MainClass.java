import org.junit.Test;

public class MainClass {

     private static String class_string = "Hello,world";
     public static String getClassString () {
         return class_string;
     }
     public static void main (String [] args ){
            System.out.println (getClassString());
}
}
class MainClassTest extends MainClass {
    public static void main (String [] args ) {
        System.out.println(testGetClassString());
    }
    @Test
    static String testGetClassString () {
        if (getClassString ().contains("hello") || getClassString().contains("Hello"))
            return "Return result is correct, it contains Hello";
        else return "Test is failed. Return result does not contain Hello ";
    }
}




