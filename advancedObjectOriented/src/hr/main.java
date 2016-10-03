package hr;

/**
 *
 * @author Sam Rizzo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Rizzo", "Male", "Barrie, ON", "705-555-5555", 3425, 1995, 03, 23, "Software Developer", 
        "Full Time", "Development", 233, 34500.00, 44.00);
        
        System.out.println(sam.toString());
        System.out.println(sam.advancedToString());
    }
}
