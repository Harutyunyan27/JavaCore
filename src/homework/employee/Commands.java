package homework.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_EMPLOYEES = "2";
    String SEARCH_EMPLOYEE_BY_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY = "4";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "5";
    String CHANGE_EMPLOYEE_POSITION = "6";
    String PRINT_ONLY_ACTIVE_EMPLOYEE = "7";
    String INACTIVE_EMPLOYEES = "8";
    String PRINT_ONLY_ACTIVE_EMPLOYEES = "9";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit ");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add employee ");
        System.out.println("Please input " + PRINT_EMPLOYEES + " for printed to all employees  ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for search employee by ID ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY + " for search employee by company name ");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by salary range ");
        System.out.println("Please input " + CHANGE_EMPLOYEE_POSITION + " for change employee by position by ID ");
        System.out.println("Please input " + PRINT_ONLY_ACTIVE_EMPLOYEE + " for print only active employee ");
        System.out.println("Please input " + INACTIVE_EMPLOYEES + " for inactivate employee by ID ");
        System.out.println("Please input " + PRINT_ONLY_ACTIVE_EMPLOYEES + " for active employee by ID ");
    }
}
