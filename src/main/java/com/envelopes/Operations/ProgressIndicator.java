package com.envelopes.Operations;

public enum ProgressIndicator {

    ZERO("\u2606\u2606\u2606\u2606\u2606"),
    TEN_PERCENT("\u2605\u2606\u2606\u2606\u2606"),
    TWENTY_PERCENT("\u2605\u2605\u2606\u2606\u2606"),
    THIRTY_PERCENT("\u2605\u2605\u2605\u2606\u2606"),
    FORTY_PERCENT("\u2605\u2605\u2605\u2605\u2606"),
    FIFTY_PERCENT("\u2605\u2605\u2605\u2605\u2605"),
    SIXTY_PERCENT("\u2605\u2606\u2606\u2606\u2606"),
    SEVENTY_PERCENT("\u2605\u2605\u2606\u2606\u2606"),
    EIGHTY_PERCENT("\u2605\u2605\u2605\u2606\u2606"),
    NINETY_PERCENT("\u2605\u2605\u2605\u2605\u2606"),
    HUNDRED_PERCENT("\u2605\u2605\u2605\u2605\u2605");
    private String percentsToGoal;

    ProgressIndicator(String percents) {
        this.percentsToGoal = percents;
    }

    public String getPercentsToGoal() {
        return percentsToGoal;
    }

}




