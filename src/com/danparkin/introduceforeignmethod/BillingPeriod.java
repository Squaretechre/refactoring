package com.danparkin.introduceforeignmethod;

import java.util.Date;

public class BillingPeriod {
    private Date _previousEnd;

    public BillingPeriod(Date previousEnd) {
        _previousEnd = previousEnd;
    }

    public Date rollOver() {
        // extract to method name "nextDay"
        // a foreign method that should be on Date
        Date newStart = new Date(_previousEnd.getYear(), _previousEnd.getMonth(), _previousEnd.getDate() + 1);
        return newStart;
    }
}
