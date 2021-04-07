package defpackage;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: mb  reason: default package */
public class mb extends DateFormat {
    private static Calendar e = new GregorianCalendar();
    private static NumberFormat f = new DecimalFormat();
    private static mb g;

    private mb() {
        this.numberFormat = f;
        this.calendar = e;
    }

    public static mb b() {
        if (g == null) {
            synchronized (mb.class) {
                if (g == null) {
                    g = new mb();
                }
            }
        }
        return g;
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(lb.b(date, true));
        return stringBuffer;
    }

    public Date parse(String str, ParsePosition parsePosition) {
        parsePosition.setIndex(str.length());
        return lb.d(str);
    }
}
