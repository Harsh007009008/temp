import java.lang.reflect.Array;
import java.util.*;
import java.time.*;
public class Employee {
    public String name;
    public LocalDate dateOfBirth;
    public LocalDate dateOfJoining;
    public ArrayList<Experience> listOfPriorExperience;
    public String employeeId;
    Employee(String name, LocalDate dateOfBirth, LocalDate dateOfJoining, ArrayList<Experience> listOfPriorExperience, String employeeId)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.listOfPriorExperience = listOfPriorExperience;
        this.employeeId = employeeId;
    }
}
