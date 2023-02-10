package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit ");
            System.out.println("Please input 1 for add ");
            System.out.println("Please input 2 for printed to all employees  ");
            System.out.println("Please input 3 for search for employee by ID ");
            System.out.println("Please input 4 for search employee by company name ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name ");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname ");
                    String surname = scanner.nextLine();
                    System.out.println("Please input  employeeID ");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input company name ");
                    String company = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, company);
                    employeeStorage.add(employee);
                    System.out.println("New worker profile created ");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword ");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByName(keyword);
                    break;
                case "4":
                    System.out.println("Please write company name ");
                    String searchByCompany = scanner.nextLine();
                    employeeStorage.searchByCompany(searchByCompany);
                    break;
                default:
                    System.out.println("wrong command. Please try again ");
            }
        }
    }
}