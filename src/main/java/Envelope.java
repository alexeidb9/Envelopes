import java.io.*;
import java.util.ArrayList;


public class Envelope {

    // Reads and updates resent history and transactions.
    public ArrayList<String> readHistory() throws IOException {
        try (InputStream inputStream = Envelope.class.getResourceAsStream("/history.txt")) {

            BufferedReader file = new BufferedReader(new InputStreamReader(inputStream));
            for ( ; ; ) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                envelopesHistory.add(line);
            }
            System.out.println("The latest transactions: (D - Deposits, W - Withdraws) for " + envelopesType + " are: ");
            return envelopesHistory;
        }
    }


    protected final ArrayList<String> envelopesHistory = new ArrayList<String>();
    private String name;
    private String envelopesType;
    private double balance;
//    boolean type; - checks whether is the right envelope is chosen.


    Envelope(String ownersName, String envelopesType, double firstDeposit) throws IOException {
        this.name = ownersName;
        this.envelopesType = envelopesType;
        this.balance = deposit(firstDeposit);

    }

    public double deposit(double amount) {
        balance += amount;

        envelopesHistory.add(String.valueOf("D" + amount));

        return balance;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("There are not enough savings in the envelope.");
        }
        balance -= amount;
        envelopesHistory.add(String.valueOf("W" + amount));

        return balance;
    }


    public double getBalance() {
        System.out.println("The current balance of an envelope - " + envelopesType + " is:");
        return balance;
    }

}

