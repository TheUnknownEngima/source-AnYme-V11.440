package defpackage;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: lb  reason: default package */
class lb {
    private static final TimeZone a = TimeZone.getTimeZone("GMT");

    private static int a(String str, int i, int i2) {
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        int i3 = 0;
        if (i < i2) {
            int i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                int i5 = i4;
                i3 = -digit;
                i = i5;
            } else {
                throw new NumberFormatException("Invalid number: " + str);
            }
        }
        while (i < i2) {
            int i6 = i + 1;
            int digit2 = Character.digit(str.charAt(i), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i = i6;
            } else {
                throw new NumberFormatException("Invalid number: " + str);
            }
        }
        return -i3;
    }

    public static String b(Date date, boolean z) {
        return c(date, z, a);
    }

    public static String c(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb, gregorianCalendar.get(1), 4);
        char c = '-';
        sb.append('-');
        f(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        f(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        f(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            f(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            if (offset >= 0) {
                c = '+';
            }
            sb.append(c);
            f(sb, abs, 2);
            sb.append(':');
            f(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static Date d(String str) {
        int i;
        String str2 = str;
        try {
            int a2 = a(str2, 0, 4);
            e(str2, 4, '-');
            int a3 = a(str2, 5, 7);
            e(str2, 7, '-');
            int a4 = a(str2, 8, 10);
            e(str2, 10, 'T');
            int a5 = a(str2, 11, 13);
            e(str2, 13, ':');
            int a6 = a(str2, 14, 16);
            e(str2, 16, ':');
            int i2 = 19;
            int a7 = a(str2, 17, 19);
            if (str2.charAt(19) == '.') {
                e(str2, 19, '.');
                i2 = 23;
                i = a(str2, 20, 23);
            } else {
                i = 0;
            }
            char charAt = str2.charAt(i2);
            String str3 = "GMT";
            if (charAt == '+' || charAt == '-') {
                str3 = str3 + str2.substring(i2);
            } else if (charAt != 'Z') {
                throw new IndexOutOfBoundsException("Invalid time zone indicator " + charAt);
            }
            TimeZone timeZone = TimeZone.getTimeZone(str3);
            if (timeZone.getID().equals(str3)) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, a2);
                gregorianCalendar.set(2, a3 - 1);
                gregorianCalendar.set(5, a4);
                gregorianCalendar.set(11, a5);
                gregorianCalendar.set(12, a6);
                gregorianCalendar.set(13, a7);
                gregorianCalendar.set(14, i);
                return gregorianCalendar.getTime();
            }
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Failed to parse date " + str2, e);
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Failed to parse date " + str2, e2);
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Failed to parse date " + str2, e3);
        }
    }

    private static void e(String str, int i, char c) {
        char charAt = str.charAt(i);
        if (charAt != c) {
            throw new IndexOutOfBoundsException("Expected '" + c + "' character but found '" + charAt + "'");
        }
    }

    private static void f(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }
}
