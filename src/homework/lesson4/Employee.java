package homework.lesson4;

/*
Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст
 */
public class Employee {
    String fio;
    String post;
    int phone;
    int salary;
    int age;

    /*
    Конструктор класса должен заполнять эти поля при создании объекта
     */
    public Employee(String fio, String post, int phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String fio, String post, int age) {
        this.fio = fio;
        this.post = post;
        this.age = age;
    }

    /*
    Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля
     */

    public String getFio() {
        return fio;
    }

    public String getPost() {
        return post;
    }

    public int getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return fio + ", " +
                post + ", " +
                phone + ", " +
                salary + ", " +
                age + ", ";
    }

}
