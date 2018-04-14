package com.danparkin.introducelocalextension;

import java.util.Date;

public class BillingPeriod {
    private MfDateSub _previousEndSub;
    private MfDateWrap _previousEndWrap;

    public BillingPeriod(MfDateSub previousEnd) {
        _previousEndSub = previousEnd;
    }

    public BillingPeriod(MfDateWrap previousEnd) {

        _previousEndWrap = previousEnd;
    }

    public Date rollOverViaSubclassedDate() {
        return _previousEndSub.nextDay();
    }

    public Date rollOverViaWrappedDate() {
        return _previousEndWrap.nextDay();
    }
}
