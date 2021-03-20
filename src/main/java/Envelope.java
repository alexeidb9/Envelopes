import java.io.*;
import java.util.ArrayList;


public class Envelope {


//    BufferedReader br = new BufferedReader(new FileReader("history.json"));
//    private ArrayList<String> envelopes = new ArrayList<String>();
//    String testAmount = br.readLine();
//    while(testAmount !=null)
//
//    {
//        envelopes.add(testAmount);
//        testAmount = br.readLine();
//    }


    InputStream inputStream = Envelope.class.getResourceAsStream("/history.json");


    public ArrayList<Envelope> envelopesHistory;
    private String name;
    private String envelopesType;
    private double balance;
    boolean type;


    Envelope(String ownersName, String envelopesType, double balance) throws IOException {
        this.name = ownersName;
        this.envelopesType = envelopesType;
        this.balance = balance;


    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("There are not enough savings in the envelope.");
        }
        balance -= amount;
//        envelopes.add(amount);
        return balance;
    }


// Getters and setters for balance and history;

    public double getBalance() {
        return balance;
    }

    public ArrayList<Envelope> getEnvelopesHistory() {
        return envelopesHistory;
    }

    public void setEnvelopesHistory(ArrayList<Envelope> envelopesHistory) {
        this.envelopesHistory = envelopesHistory;
    }


}

