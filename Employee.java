import db.SqlRunner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;

    public Employee(String name, Department department, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void save() {
       String sql = String.format("INSERT INTO employee (name, department, salary) Values ('%s', '%s', %7.2f );", this.salary,this.department, salary);
       this.id = SqlRunner.executeUpdate(sql);
       SqlRunner.closeConnection();
    }
    public void selectall() {
        String sql = String.format("SELECT employee.name, employee.salary,employee.department,department.title  FROM department JOIN employee ON id WHERE id = %d%", this.id);
        SqlRunner.closeConnection();
    }

    public static void deleteALL(){
        String sql = "DELETE FROM employee;";
        SqlRunner.executeUpdate(sql);
    }
}