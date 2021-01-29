package ru.vitalynec.java;

public class Application {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", null, "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Kuznetsov", "Ivan", null, "QA", "kuzivan@mailbox.com", "892312312", 31000, 35);
        employees[2] = new Employee("Petrov", "Ivan", null, "Engineer", "petivan@mailbox.com", "892312312", 32000, 40);
        employees[3] = new Employee("Sidorov", "Ivan", null, "DevOps", "sidivan@mailbox.com", "892312312", 33000, 45);
        employees[4] = new Employee("Ivanov", "Sergey", null, "CTO", "ivserg@mailbox.com", "892312312", 34000, 50);

        for (Employee employee : employees) {
            if (employee.getAge() >= 40) {
                System.out.println(employee.toString());
            }
        }

    }
}