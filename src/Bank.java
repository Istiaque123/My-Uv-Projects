import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts;
    private List<Employee> employees;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int accountNumber) {
        accounts.removeIf(acc -> acc.getAccountNumber() == accountNumber);
    }

    public Account getAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("Accounts in the bank:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        System.out.println("Employees in the bank:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}