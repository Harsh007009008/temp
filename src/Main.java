import java.util.*;
import java.time.*;
public class Main {


    public static int calculateYears(LocalDate A, LocalDate B){
        return Period.between(A, B).getYears();
    }


    public static void main(String[] args) {
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Harsh", LocalDate.of(1985, 5, 15), LocalDate.of(2010, 6, 1), new ArrayList<>(), "8034"));
        empList.add(new Employee("Aditya", LocalDate.of(1992, 8, 25), LocalDate.of(2015, 4, 10), new ArrayList<>(),"8592"));


        Experience  a=new Experience(LocalDate.of(2005, 1, 1), LocalDate.of(2010, 12, 31), "Tech", "Full-time", "Accolite");
        Experience  b=new Experience(LocalDate.of(2007, 1, 1), LocalDate.of(2011, 12, 31), "Tech", "Full-time", "Bounteous");
        empList.get(0).listOfPriorExperience.add(a);
        empList.get(1).listOfPriorExperience.add(b);

        HashMap<String,Integer> ageGroup=new HashMap<>();
        HashMap<String,Integer> domCount=new HashMap<>();
        HashMap<Integer,Integer> yearOrg=new HashMap<>();

        for(Employee e:empList){
            for (Experience exp : e.listOfPriorExperience) {
                domCount.put(exp.industry,domCount.getOrDefault(exp.industry, 0) + 1);
            }
        }
        for(Employee e:empList){
            for (Experience exp : e.listOfPriorExperience) {
                Integer experience=calculateYears(exp.dateFrom,exp.dateTo);

                yearOrg.put(experience,yearOrg.getOrDefault(experience, 0) + 1);
            }
        }
        for(Employee e:empList){
            int age=calculateYears(e.dateOfBirth,LocalDate.now());
            int first=age/10;
            first*=10;
            int second=age+9;
            second/=10;
            second*=10;
            String key=Integer.toString(first) + "-" + Integer.toString(second);
            ageGroup.put(key, ageGroup.getOrDefault(key,0)+1);
        }

        System.out.println(domCount);
        System.out.println(ageGroup);
        System.out.println(yearOrg);
    }
}