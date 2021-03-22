import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Envelope newEnvelope = new Envelope("Alex", "Red: Emergency Funds", 500);


        Envelope secondEnvelope = new Envelope("Vika", "Savings for Dental Care" ,45000);
        System.out.println(newEnvelope.getBalance());
        System.out.println(secondEnvelope.getBalance());
        newEnvelope.deposit(55);
        newEnvelope.withdraw(11);
        secondEnvelope.withdraw(110);
        secondEnvelope.withdraw(10);
        System.out.println(newEnvelope.readHistory());
        System.out.println(secondEnvelope.readHistory());
        System.out.println(newEnvelope.getBalance());
        System.out.println(secondEnvelope.getBalance());



    }

}