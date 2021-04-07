package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class r {
    private static final r c = new r((Long) null, (TimeZone) null);
    private final Long a;
    private final TimeZone b;

    private r(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    static r c() {
        return c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.b);
    }

    /* access modifiers changed from: package-private */
    public Calendar b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
