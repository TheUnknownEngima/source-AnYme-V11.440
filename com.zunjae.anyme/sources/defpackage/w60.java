package defpackage;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: w60  reason: default package */
public final class w60 {
    private static final u60 a = new u60("MetadataUtils");
    private static final String[] b;
    private static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        c = valueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(valueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    public static void a(List<k80> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new k80(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public static Calendar b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        String c2 = c(str);
        if (TextUtils.isEmpty(c2)) {
            a.a("Invalid date format", new Object[0]);
            return null;
        }
        String d = d(str);
        if (!TextUtils.isEmpty(d)) {
            String valueOf = String.valueOf(c2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(d).length());
            sb.append(valueOf);
            sb.append("T");
            sb.append(d);
            c2 = sb.toString();
            str2 = d.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(c2));
            return instance;
        } catch (ParseException e) {
            a.a("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e) {
            a.e("Error extracting the date: %s", e.getMessage());
            return null;
        }
    }

    private static String d(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            a.a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            a.a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                if (length == b[1].length() + 6 || length == b[2].length() + 6 || length == b[3].length() + 6) {
                    z = true;
                }
                if (z) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else if (charAt != 'Z' || substring.length() != b[0].length() + 6) {
                return null;
            } else {
                String valueOf = String.valueOf(substring.substring(0, substring.length() - 1));
                return "+0000".length() != 0 ? valueOf.concat("+0000") : new String(valueOf);
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            a.a("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    public static JSONArray e(List<k80> list) {
        if (list == null && list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (k80 j : list) {
            jSONArray.put(j.j());
        }
        return jSONArray;
    }
}
