import java.math.BigDecimal;

public class Envelope {

    private String name;
    private String envelopeType;
    private double envelopeBalance;

    public Envelope() {

    }

    public Envelope(String name, String envelopeType,final double envelopeBalance) {
        this.name = name;
        this.envelopeType = envelopeType;
        this.envelopeBalance = envelopeBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEnvelopeType() {
        return envelopeType;
    }

    public void setEnvelopeType(final String envelopeType) {
        this.envelopeType = envelopeType;
    }

    public static double getEnvelopeBalance() {
        return envelopeBalance;
    }

    public void setEnvelopeBalance(final double envelopeBalance) {
        this.envelopeBalance = envelopeBalance;
    }
}

