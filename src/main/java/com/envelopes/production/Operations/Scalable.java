package com.envelopes.production.Operations;

import com.envelopes.production.domain.PriorityScale;

public interface Scalable<T> {

    public static final PriorityScale DEFAULT_SCALE = PriorityScale.NOT_RATED;

    T applyScale(PriorityScale priorityScale);

    public default T applyScale (int stars) {
        return applyScale(convert(stars));
    }


    public default PriorityScale getScale() {
        return DEFAULT_SCALE;
    }





    public static PriorityScale convert(int stars) {
    return (stars >= 0 && stars <=5) ? PriorityScale.values()[stars] : DEFAULT_SCALE;
    }

}
