import org.junit.Test;

public class MainClass {

     private static int class_number = 20;
     public static int getClassNumber () {
         return class_number;
     }

     public static void main (String [] args ){
            System.out.println (getClassNumber());
}
    }
class MainClassTest extends MainClass {
    public static void main (String [] args ) {
    System.out.println(testGetClassNumber());
}
    @Test
    static String testGetClassNumber () {
        if (getClassNumber () > 45)
            return "Return result is correct";
        else return "Return result is less than 45";
    }
}



