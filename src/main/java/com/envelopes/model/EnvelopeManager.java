package com.envelopes.model;

// Create 3 types of envelopes using object factory


import com.envelopes.Operations.Review;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class EnvelopeManager {

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    public EnvelopeManager() {
    }

    public EnvelopeManager(Locale locale) {
        this.locale = locale;

        resources = ResourceBundle.getBundle("resources.properties", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    private Envelope envelope;
    private Review[] reviews = new Review[5];


    public Envelope createEnvelope(String name, String envelopeType, double envelopeBalance, PriorityScale priority) {

        envelope = new Envelope(name, envelopeType, envelopeBalance, priority);

        return envelope;
    }


    public Envelope reviewEnvelope(Envelope envelope, PriorityScale scale, String comments) {
        if (reviews[reviews.length - 1] != null) {
            reviews = Arrays.copyOf(reviews, reviews.length + 5);
        }
        int sum = 0, i = 0;
        boolean reviewed = false;
        while (i < reviews.length && !reviewed) {

            if (reviews[i] == null) {
                reviews[i] = new Review(scale, comments);
                reviewed = true;
            }
            sum += reviews[i].getScale().ordinal();
            i++;
        }
////        review = new Review(scale, comments);
////        this.envelope = (Envelope) envelope.applyScale(scale);
//        this.envelope = envelope.applyScale(Rateable.convert(Math.round((float) sum / i)));
        return this.envelope;
//
    }

    public void printEnvelopeReport() {
        StringBuilder txt = new StringBuilder();
//        txt.append(MessageFormat.format(resources.getString("envelope"),
//                envelope.getName(),
//                moneyFormat.format(envelope.getBalance()),
//                envelope.getPriority().getStars()));
//        txt.append('\n');
        for (Review review : reviews) {
            if (review == null) {
                break;
//
//                txt.append(MessageFormat.format(resources.getString("review"),
//                        review.getScale().getStars(),
//                        review.getComments()));
//            } else {
//                txt.append(resources.getString("no.reviews"));
//            }
//            txt.append('\n');
//        }
//        System.out.println(txt);
            }


        }
    }
}
