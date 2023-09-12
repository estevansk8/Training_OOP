package pratic1;

public class Main {
    public static void main(String[] args) {
        //DEPARTAMENTO DE VENDAS
        Department salleDepartment = new Department("Vendas", 1, "São Paulo", 16, 10000);
        //Renato
        Employee Renatoemployee = new Employee("Renato", 1, 3000, "Vendedor", salleDepartment);
        salleDepartment.addEmployee(Renatoemployee);
        //Otavio
        Employee Otavioemployee = new Employee("Otavio", 2, 3000, "Vendedor", salleDepartment);
        salleDepartment.addEmployee(Otavioemployee);
        salleDepartment.setChief(2);


        //DEPARTAMENTO DE MARKETING
        Department marketingDepartment = new Department("Marketing", 2, "São Carlos", 16, 10000);
        //Ruan
        Employee Ruanemployee = new Employee("Ruan", 2, 3000, "Marketer", marketingDepartment);
        marketingDepartment.addEmployee(Ruanemployee);
        marketingDepartment.setChief(2);
        //tentando entrar com o Renato em um departamento que não é o dele para ver se passa
        marketingDepartment.addEmployee(Renatoemployee);



        //TESTES
        salleDepartment.listAllEmployees();
        System.out.println(salleDepartment.sizeOfEmployees());
        salleDepartment.removeEmployee(1);
        System.out.println(salleDepartment.sizeOfEmployees());

        marketingDepartment.listAllEmployees();
        System.out.println(marketingDepartment.sizeOfEmployees());
        marketingDepartment.removeEmployee(Ruanemployee);
        System.out.println(marketingDepartment.sizeOfEmployees());

        System.out.println(salleDepartment.getChief().getName());

        System.out.println(Renatoemployee.getDeptInCharge());
        System.out.println(Otavioemployee.getDeptInCharge());

        System.out.println(marketingDepartment.getChief().getName());

        System.out.println(Renatoemployee.getEmployeeDepartment().getName());

        Renatoemployee.getAnnualSalary();

        Renatoemployee.printState();

        Ruanemployee.printState();
    }
}
