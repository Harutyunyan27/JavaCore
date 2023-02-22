package homework.employee.model;

import homework.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private String company;
    private double salary;
    private String position;
    private boolean active;
    private Date registerDate;
    private Date dateOfBirthday;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, String company, double salary, String position, boolean active, Date registerDate, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.company = company;
        this.salary = salary;
        this.position = position;
        this.active = active;
        this.registerDate = registerDate;
        this.dateOfBirthday = dateOfBirthday;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (active != employee.active) return false;
        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(surname, employee.surname)) return false;
        if (!Objects.equals(employeeID, employee.employeeID)) return false;
        if (!Objects.equals(company, employee.company)) return false;
        if (!Objects.equals(position, employee.position)) return false;
        if (!Objects.equals(registerDate, employee.registerDate))
            return false;
        return Objects.equals(dateOfBirthday, employee.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (employeeID != null ? employeeID.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (dateOfBirthday != null ? dateOfBirthday.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate=" + DateUtil.dateTosString(registerDate) +
                ", dateOfBirthday=" + DateUtil.dateTosString(dateOfBirthday) +
                '}';
    }

    public Object getemployeID() {
        return null;
    }
}
