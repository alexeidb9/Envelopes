import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Envelope newEnvelope = new Envelope("Alex", "Red: Emergency Funds", 500);
        newEnvelope.deposit(750);
        newEnvelope.withdraw(350);
        newEnvelope.withdraw(50);
        newEnvelope.withdraw(150);
        System.out.println(newEnvelope.getBalance());
        System.out.println(newEnvelope.getEnvelopesHistory());

        Envelope secondEnvelope = new Envelope("Vika", "Savings for Dental Care" ,45000);
        secondEnvelope.deposit(670);
        secondEnvelope.withdraw(70);
        System.out.println(secondEnvelope.getBalance());
        System.out.println(secondEnvelope.getEnvelopesHistory());




    }

}