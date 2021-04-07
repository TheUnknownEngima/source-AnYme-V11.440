package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l02  reason: default package */
public class l02 {
    private static SharedPreferences a;
    private static Gson b;
    private static k02 c;

    /* renamed from: l02$a */
    static class a implements k02 {
        a() {
        }

        public String a(String str) {
            return str;
        }

        public String b(String str) {
            return str;
        }
    }

    /* renamed from: l02$b */
    private static class b<T> implements ParameterizedType {
        private final Class<?> e;

        b(Class<T> cls) {
            this.e = cls;
        }

        public Type[] getActualTypeArguments() {
            return new Type[]{this.e};
        }

        public Type getOwnerType() {
            return null;
        }

        public Type getRawType() {
            return List.class;
        }
    }

    public static <T> void a(String str, j02 j02, Class<T> cls) {
        String a2 = j02.a();
        ArrayList<T> j = j(str, cls);
        Iterator<T> it = j.iterator();
        while (it.hasNext()) {
            if (((j02) it.next()).a().equals(a2)) {
                return;
            }
        }
        j.add(cls.cast(j02));
        u(str, j);
    }

    public static void b() {
        a.edit().clear().apply();
    }

    public static void c(String str) {
        a.edit().remove(str).apply();
    }

    public static <T> boolean d(String str, j02 j02, Class<T> cls) {
        ArrayList<T> j = j(str, cls);
        String a2 = j02.a();
        if (j.size() == 0) {
            return false;
        }
        Iterator<T> it = j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((j02) it.next()).a().equals(a2)) {
                j.remove(i);
                u(str, j);
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean e(String str, boolean z) {
        SharedPreferences sharedPreferences = a;
        c.b(str);
        return sharedPreferences.getBoolean(str, z);
    }

    public static <T> ArrayList<T> f(String str, Class<T> cls) {
        String l = l(str, (String) null);
        if (l == null || l.length() == 0) {
            return new ArrayList<>();
        }
        try {
            return (ArrayList) b.fromJson(l, (Type) new b(cls));
        } catch (Exception e) {
            uj2.d(e);
            return new ArrayList<>();
        }
    }

    public static int g(String str, int i) {
        SharedPreferences sharedPreferences = a;
        c.b(str);
        return sharedPreferences.getInt(str, i);
    }

    public static long h(String str, long j) {
        SharedPreferences sharedPreferences = a;
        c.b(str);
        return sharedPreferences.getLong(str, j);
    }

    public static <T> T i(String str, Class<T> cls) {
        String l = l(str, (String) null);
        if (!(l == null || l.length() == 0)) {
            try {
                return b.fromJson(l, cls);
            } catch (Exception e) {
                uj2.d(e);
            }
        }
        return null;
    }

    public static <T> ArrayList<T> j(String str, Class<T> cls) {
        String l = l(str, (String) null);
        if (l == null) {
            return new ArrayList<>();
        }
        try {
            return (ArrayList) b.fromJson(l, (Type) new b(cls));
        } catch (Exception e) {
            uj2.d(e);
            return new ArrayList<>();
        }
    }

    public static SharedPreferences k() {
        return a;
    }

    public static String l(String str, String str2) {
        SharedPreferences sharedPreferences = a;
        c.a(str);
        String string = sharedPreferences.getString(str, str2);
        if (string == null || string.equals(str2)) {
            return str2;
        }
        c.b(string);
        return string;
    }

    public static boolean m(String str) {
        return a.contains(str);
    }

    public static void n(Context context) {
        boolean z = context instanceof Activity;
        b = new Gson();
        a = o(context);
        if (c == null) {
            c = new a();
        }
    }

    private static SharedPreferences o(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void p(String str, boolean z) {
        SharedPreferences.Editor edit = a.edit();
        c.a(str);
        edit.putBoolean(str, z).apply();
    }

    public static <T> void q(String str, List<T> list) {
        v(str, b.toJson((Object) list));
    }

    public static void r(String str, int i) {
        SharedPreferences.Editor edit = a.edit();
        c.a(str);
        edit.putInt(str, i).apply();
    }

    public static void s(String str, long j) {
        SharedPreferences.Editor edit = a.edit();
        c.a(str);
        edit.putLong(str, j).apply();
    }

    public static void t(String str, Object obj) {
        v(str, b.toJson(obj));
    }

    private static <T> void u(String str, ArrayList<T> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof j02)) {
                throw new IllegalArgumentException("All models in your list should implement the DBModel interface");
            }
        }
        v(str, b.toJson((Object) arrayList));
    }

    public static void v(String str, String str2) {
        SharedPreferences.Editor edit = a.edit();
        c.a(str);
        c.a(str2);
        edit.putString(str, str2).apply();
    }
}
