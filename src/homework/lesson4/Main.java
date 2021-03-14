package homework.lesson4;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Михаил Иванович", "менеджер", 9772517, 25000, 34);
        Employee employee2 = new Employee("Леонова Лариса Васильевна", "уборщица", 1239536, 15000, 57);

        /*
        Вывести при помощи методов из пункта 3 ФИО и должность.
         */
        System.out.println(employee1.getFio() + ", " + employee1.getPost());
        System.out.println("--------");


       /*
       Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        */
        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = new Employee("Чудикин Василий Григорьевич", "охраник", 9773645, 19000, 63);
        employees[3] = new Employee("Ковуль Ольга Михайловна", "секретарь", 9771506, 27000, 26);
        employees[4] = new Employee("Сидоркин Валерий Юрьевич", "генеральный директор", 9777931, 150000, 41);

        employeesOlderForty(employees);
        System.out.println("--------");
        raiseSalaryEmployeeOlderThirtyFive(employees);
    }

    public static void employeesOlderForty(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i]);
            }
        }
    }
    /*
    Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
     */
    public static void raiseSalaryEmployeeOlderThirtyFive (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 35) {
                employees[i].setSalary(employees[i].getSalary() + 10000);
            }
            System.out.println(employees[i]);
        }
    }
}
