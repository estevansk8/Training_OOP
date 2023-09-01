package pratic1;

import java.util.ArrayList;

public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtention;
    private double budget;
    private Employee chief;
    private double idEmployee;
    private Employee employee;
    private ArrayList<Employee> staff;

    //Construtor para quando não houver empregados cadastrados
    public Department(String name, int code, String location, int phoneExtention, double budget) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtention = phoneExtention;
        this.budget = budget;
        staff = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCode() { return code;}
    public void setCode(int code) { this.code = code;}
    public Employee getChief() {
        return chief;
    }
    public void setChief(double idEmployee) {
        for (Employee employee : staff){
            if (employee.getId() == idEmployee){
                employee.setDeptInCharge(employee.getEmployeeDepartment());
                this.chief = employee;
            }
        }
    }
    public void addEmployee(Employee employee) {
        if (employee.getEmployeeDepartment().getCode() == code) staff.add(employee);
        if (employee.getEmployeeDepartment().getCode() != code) System.out.println("Não pertence ao departamento");
    }
    public void removeEmployee(Employee employee) { staff.remove(employee); }
    public void removeEmployee(long id) {

        Employee founded = null;

        for (Employee employee : staff){
            if (employee.getId() == id) founded = employee;
        }

        if (founded != null) staff.remove(founded);

    }
    public int sizeOfEmployees(){ return staff.size();}
    public void setEmployee(Employee employee) { this.employee = employee;}
    public void listAllEmployees(){
        System.out.println("--- LISTA DE EMPREGADOS --");
        for(Employee employee : staff){
            System.out.println(employee.getName());
        }
        System.out.println("------");
    }
    public Employee getEmployee(long id){
        for(Employee employee : staff){
            if (employee.getId() == id) return employee;
        }
        return null;
    }
}

