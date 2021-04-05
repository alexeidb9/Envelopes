import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Envelope newEnvelope = new Envelope("Alex", "Red: Emergency Funds", 500);
        Envelope secondEnvelope = new Envelope("Vika", "Savings for Dental Care" ,45000);
        Envelope testEn = new Envelope("Test", "asd", 123, PriorityScale.NOT_RATED);
        System.out.println(testEn.getPriority());
    }

}