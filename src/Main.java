import java.util.ArrayList;
import java.util.List;








public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("Istiaque Hoosain", "Narayanganj");
        Customer customer2 = new Customer("Nani Gopal", "Dhaka");

        Account acc1 = new Account(1001, 5000, customer1);
        Account acc2 = new Account(1002, 7000, customer2);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        Employee employee1 = new Employee("Remon Hossain", "Manager");
        Employee employee2 = new Employee("Isti", "Teller");
        Employee employee3 = new Employee("Jilll", "Accountent");

        bank.addEmployee(employee1);
        bank.addEmployee(employee2);

        bank.displayAllAccounts();
        bank.displayAllEmployees();

        bank.addEmployee(employee3);

    }
}
