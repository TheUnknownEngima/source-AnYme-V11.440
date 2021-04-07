package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: bn1  reason: default package */
public class bn1 {
    private static String[] a(Context context, Field[] fieldArr) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            if (field.getName().contains("define_font_")) {
                arrayList.add(c(context, field.getName()));
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] b(Context context) {
        Class d = d(context.getPackageName());
        return d != null ? a(context, d.getFields()) : new String[0];
    }

    private static String c(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        return identifier == 0 ? "" : context.getString(identifier);
    }

    private static Class d(String str) {
        do {
            try {
                return Class.forName(str + ".R$string");
            } catch (ClassNotFoundException unused) {
                str = str.contains(".") ? str.substring(0, str.lastIndexOf(46)) : "";
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
            }
        } while (TextUtils.isEmpty(str));
        return null;
    }
}
