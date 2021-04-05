//Envelope & PriorityScale - same package

public class Envelope {

    private String name;
    private String envelopeType;
    private double envelopeBalance;
    private PriorityScale priority;

    public Envelope() {
    }

    public Envelope(String name, String envelopeType, double envelopeBalance) {
        this(name, envelopeType, envelopeBalance, PriorityScale.NOT_RATED);
    }

    public Envelope(String name, String envelopeType, double envelopeBalance, PriorityScale priority) {
        this.name = name;
        this.envelopeType = envelopeType;
        this.envelopeBalance = envelopeBalance;
        this.priority = priority;
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

    public double getEnvelopeBalance() {
        return envelopeBalance;
    }

    public void setEnvelopeBalance(final double envelopeBalance) {
        this.envelopeBalance = envelopeBalance;
    }

    public PriorityScale getPriority() {
        return priority;
    }

}

