package homework.employee;

import java.util.Collection;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private String company;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, String company) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!name.equals(employee.name)) return false;
        if (!surname.equals(employee.surname)) return false;
        if (!employeeID.equals(employee.employeeID)) return false;
        return company.equals(employee.company);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + employeeID.hashCode();
        result = 31 * result + company.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
