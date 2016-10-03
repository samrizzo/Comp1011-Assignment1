package service;

/**
 *
 * @author Sam Rizzo
 */
public class ServiceClass {
    
    private static int employeeId = 10000;
    
    public static int getEmployeeId()
    {
        return ++employeeId;
    }

}
