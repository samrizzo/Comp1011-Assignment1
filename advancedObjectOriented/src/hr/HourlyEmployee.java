package hr;

/**
 *
 * @author Sam Rizzo
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyRate;
    private double hoursWorked;
    
    public HourlyEmployee()
    {
    
    }
    
    public HourlyEmployee(String firstName, String lastName, String gender,
            String address, String phoneNumber, int sin, int year, 
            int month, int day) {
        
        super(firstName, lastName, gender, address, phoneNumber, sin, year, 
                month, day);
        
    } // end of basic HourlyEmployee constructor
    
    public HourlyEmployee(String firstName, String lastName, 
            String gender, String address, String phoneNumber,int sin, 
            int year, int month, int day, String position,String status, 
            String department, int idNumber,double earnings, double payRate, 
            double hourlyRate, double hoursWorked) {
        
        super(firstName, lastName, gender, address, phoneNumber, sin, year, 
                month, day, position, status, department, idNumber, earnings, 
                payRate);
        
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        
    } // end of advanced HourlyEmployee constructor
}
