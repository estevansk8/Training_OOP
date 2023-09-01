package pratic1;

public class Employee {
    private String name;
    private long id;
    private double salary;
    private String jobTitle;
    private Department department;
    private Department deptInCharge;

    public Employee(String name, long id, double salary, String jobTitle, Department department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.department = department;
        this.deptInCharge = null;
    }
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    public long getId() { return id; }
    public void setId(long id) { this.id = id;}
    public Department getEmployeeDepartment() { return department;}
    public void setEmployeeDepartment(Department employeeDepartment) { this.department = employeeDepartment;}
    public String getDeptInCharge() {
        if (deptInCharge != null) return deptInCharge.getName();
        return null;
    }

    public void setDeptInCharge(Department deptInCharge) { this.deptInCharge = deptInCharge; }
    public void printState(){
        if (department.getChief().getId() == id) System.out.println("Chief");
        if (department.getChief().getId() != id) System.out.println("Employee");
    }
    public void getAnnualSalary(){
        System.out.println(salary * 12);
    }
}

