/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");

        department1.save();
        department2.save();

        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Joan Smith", department1, 45000);
        Employee employee3 = new Employee("Jamie Jones", department2, 25000);
        Employee employee4 = new Employee("James Jones", department2, 25000);
        Employee employee5 = new Employee("Bill Jones", department3, 25000);
        Employee employee6 = new Employee("John Jones", department3, 25000);
        Employee employee7 = new Employee("Steve Jones", department4, 25000);
        Employee employee8 = new Employee("Earl Jones", department4, 25000);
        Employee employee9 = new Employee("James Jones", department5, 25000);
        Employee employee10 = new Employee("James Jones", department5, 25000);




        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
        employee9.save();
        employee10.save();

    }
}
