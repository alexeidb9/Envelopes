import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Envelope newEnvelope = new Envelope("Alex", "Red: Emergency Funds", 500);
        newEnvelope.envelopesHistory.add(new Envelope("Alex", "Blue: Charity", 200));



    }

}