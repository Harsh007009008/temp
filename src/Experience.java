import java.util.*;
import java.time.*;
public class Experience {
    public LocalDate dateFrom;
    public LocalDate dateTo;
    public String industry;
    public String employmentType;
    public String companyName;
    Experience(LocalDate dateFrom, LocalDate dateTo, String industry, String employmentType, String companyName) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.industry = industry;
        this.employmentType = employmentType;
        this.companyName = companyName;
    }
}
