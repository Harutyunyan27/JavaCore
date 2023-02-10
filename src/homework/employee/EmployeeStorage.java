package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
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
            Employee employee = array[i];
            if (employee.getCompany().contains(company)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Company with " + company + "not found!");
        }
    }
}