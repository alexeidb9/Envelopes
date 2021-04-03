import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;


public class Envelope {

    private String name;
    private String envelopeType;
    private BigDecimal envelopeBalance;

    public Envelope(String name, String envelopeType, BigDecimal envelopeBalance) {
        this.name = name;
        this.envelopeType = envelopeType;
        this.envelopeBalance = envelopeBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvelopeType() {
        return envelopeType;
    }

    public void setEnvelopeType(String envelopeType) {
        this.envelopeType = envelopeType;
    }

    public BigDecimal getEnvelopeBalance() {
        return envelopeBalance;
    }

    public void setEnvelopeBalance(BigDecimal envelopeBalance) {
        this.envelopeBalance = envelopeBalance;
    }
}

