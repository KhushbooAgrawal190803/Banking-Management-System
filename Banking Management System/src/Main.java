import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("=== Banking System Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder's name: ");
                    scanner.nextLine(); // Consume newline left-over
                    String name = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    bank.createAccount(name, balance);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accNum, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accNum, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    bank.checkBalance(accNum);
                    break;

                case 5:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}
