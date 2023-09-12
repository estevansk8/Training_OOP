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

    public void printState(){
        System.out.println("------ STATE ------");
        System.out.println("ID: " + this.id);
        System.out.println("Nome:" + this.name);
        System.out.println("Departamento: " + this.department.getName());
        //VERIFICA SE O EMPREGADO É CHEFE OU NÃO PARA IMPRIMIR SUA POSIÇÃO
        if (department.getChief().getId() == this.id) System.out.println("Chief");
        if (department.getChief().getId() != this.id) System.out.println("Employee");

        System.out.println("Salario: " + this.salary);
        System.out.println("Função: " + this.jobTitle);

    }
    public void getAnnualSalary(){
        System.out.println(salary * 12);
    }
    public String getDeptInCharge() {
        if (deptInCharge != null) return deptInCharge.getName();
        return null;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Department getEmployeeDepartment() {
        return department;
    }
    public void setEmployeeDepartment(Department employeeDepartment) {
        this.department = employeeDepartment;
    }
    public void setDeptInCharge(Department deptInCharge) {
        this.deptInCharge = deptInCharge;
    }
}

