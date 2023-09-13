package pratic1;

public class Department {
    public static final int MAX_SIZE = 15;

    private String name;
    private int code;
    private String location;
    private int phoneExtention;
    private double budget;
    private Employee chief;
    private double idEmployee;
    private Employee employee;
    private Employee[] staff;

    //Construtor para quando não houver empregados cadastrados
    public Department(String name, int code, String location, int phoneExtention, double budget) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtention = phoneExtention;
        this.budget = budget;
        staff = new Employee[MAX_SIZE];
    }


    public void setChief(double idEmployee) {
        for (Employee employee : staff){
            //tive que colocar essa verificação para nao dar erro
            if (employee != null){
                if (employee.getId() == idEmployee){
                    employee.setDeptInCharge(employee.getEmployeeDepartment());
                    this.chief = employee;
                }
            }
        }
    }
    public void addEmployee(Employee employee) {
        boolean added = false;
        for (int i=0 ; i < staff.length ; i++){
            if (staff[i] == null && employee.getEmployeeDepartment().getCode() == this.code){
                staff[i] = employee;
                added = true;
                break;
            }
        }
        if (!added) System.out.println("Não é possivel adicionar !!!");
    }
    public void removeEmployee(Employee employee) {
        for (int i = 0; i < staff.length; i++){
            if (staff[i] == employee){
                staff[i] = null;
                break;
            }
        }
    }
    public void removeEmployee(long id) {
        for (int i =0; i < staff.length ; i++){
            if (staff[i] != null && staff[i].getId() == id){
                staff[i] = null;
                break;
            }
        }

//        Employee founded = null;
//
//        for (Employee employee : staff){
//            if (employee.getId() == id) founded = employee;
//        }
//
//        if (founded != null) staff.remove(founded);

    }
    public int sizeOfEmployees(){
        int contador_casos = 0;
        for (Employee employee : staff){
            if (employee != null) contador_casos++;
        }
        return contador_casos;
    }
    public void listAllEmployees(){
        System.out.println("--- LISTA DE EMPREGADOS --");
        for(Employee employee : staff){
            //deu erro nessa linha e precisei colocar essa verificacao
            if (employee != null){
                System.out.println(employee.getName());
            }
        }
        System.out.println("------");
    }
    public Employee getEmployee(long id){
        for(Employee employee : staff){
            if (employee.getId() == id) return employee;
        }
        return null;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public Employee getChief() {
        return chief;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

