public class Demo {

    public static void main(String[] args) {

      
        DigitalWallet wallet1 = new DigitalWallet();
        DigitalWallet wallet2 = new DigitalWallet();

        System.out.println("DigitalWallet Test");

        // Uncomment this line temporarily to observe the access error:
        // wallet1.balance = -500;

        System.out.println("\nInitial balances:");
        System.out.println("Wallet 1: " + wallet1.getBalance());
        System.out.println("Wallet 2: " + wallet2.getBalance());

        boolean result1 = wallet1.deposit(500);
        System.out.println("\ndeposit(500): " + result1);
        System.out.println("Wallet 1 balance: " + wallet1.getBalance());

        boolean result2 = wallet1.deposit(-10);
        System.out.println("\ndeposit(-10): " + result2);
        System.out.println("Wallet 1 balance: " + wallet1.getBalance());

        boolean result3 = wallet1.spend(200);
        System.out.println("\nspend(200): " + result3);
        System.out.println("Wallet 1 balance: " + wallet1.getBalance());

        boolean result4 = wallet1.spend(1000);
        System.out.println("\nspend(1000): " + result4);
        System.out.println("Wallet 1 balance: " + wallet1.getBalance());

        boolean result5 = wallet1.canAfford(301);
        System.out.println("\ncanAfford(301): " + result5);
        System.out.println("Wallet 1 balance: " + wallet1.getBalance());

        boolean result6 = wallet1.spend(300);
        System.out.println("\nspend(300): " + result6);
        System.out.println("Wallet 1 balance: " + wallet1.getBalance());

        System.out.println("\n Multiple Object Test");
        System.out.println("Wallet 1 final balance: "
                + wallet1.getBalance());
        System.out.println("Wallet 2 final balance: "
                + wallet2.getBalance());
    }
}
