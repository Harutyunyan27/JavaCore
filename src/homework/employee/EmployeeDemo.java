package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        employeeStorage.add(new Employee("hlo", "poxosyan", "a001", "Java", 100, "jr manager", true, new Date(), DateUtil.stringToDate("13-07-2000")));
        employeeStorage.add(new Employee("blo", "poxosyan", "a002", "Java", 200, "manager", true, new Date(), DateUtil.stringToDate("21-10-1999")));
        employeeStorage.add(new Employee("vlo", "poxosyan", "a003", "Java", 300, "sr manager", true, new Date(), DateUtil.stringToDate("27-11-1990")));
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    System.out.println("Please write company name ");
                    String searchByCompany = scanner.nextLine();
                    employeeStorage.searchByCompany(searchByCompany);
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeesBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changeEmployeePositionByID();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEE:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVE_EMPLOYEES:
                    inactiveEmployeeById();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    activeEmployeeById();
                    break;
                default:
                    System.out.println("wrong command. Please try again ");
            }
        }

    }

    private static void inactiveEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeID = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeByID(employeeID);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("employee inactivated");
        } else {
            System.out.println("employee does not exists, please try again");
        }
    }

    private static void activeEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeID = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeByID(employeeID);
        if (employee != null && !employee.isActive()) {
            employee.setActive(true);
            System.out.println("employee inactivated");
        } else {
            System.out.println("employee does not exists, or employee already active, please try again");
        }
    }

    private static void changeEmployeePositionByID() {
        employeeStorage.print();
        System.out.println("please choose employee ID");
        String employeeID = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeByID(employeeID);
        if (employee != null) {
            System.out.println("please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed");
        } else {
            System.out.println("employee does not exists, please try again");
        }

    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("pleas input min,max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary should be less then max salary ");
        } else {
            employeeStorage.searchBySalaryRange(minSalary, maxSalary);
        }

    }


    private static void getEmployeeID() {
        System.out.println("Please input employee ID ");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeByID(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + "does not exists");
        } else {
            System.out.println(employeeId);
        }
    }

    public static void addEmployee() throws ParseException {
        System.out.println("please input name,surname,employeeID,company,salary,active,dateOfBirthday(01-01-2000)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeID = employeeData[2];
        Employee employee = employeeStorage.getEmployeeByID(employeeID);
        if (employee == null) {
            Date registerDate = new Date();
            Date dateOfBirthday = DateUtil.stringToDate(employeeData[6]);
            Employee newEmployee = new Employee(employeeData[0], employeeData[1],
                    employeeID, employeeData[3], Double.parseDouble(employeeData[4]), employeeData[5], true, registerDate, dateOfBirthday);
            employeeStorage.add(newEmployee);
            System.out.println("Employee was added");
        } else {
            System.out.println("Employee with " + employeeID + "already exists!!!");
        }
    }


}