package homework.employee.storage;

import homework.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee value) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = value;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = employees[i];
        }
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(employees[i] + " ");
        }
    }
    public  void printByStatus(boolean active){
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == active){
                System.out.println(employees[i]);
            }

        }
    }


    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getName().contains(keyword)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Name with" + keyword + "not found!");
        }
    }

    public void searchByCompany(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().contains(company)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Company with " + company + "not found!");
        }
    }


    public Employee getEmployeeByID(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getemployeID().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void searchBySalaryRange(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary()>= minSalary && employee.getSalary() <= maxSalary)
                System.out.println(employee);
        }
    }
}