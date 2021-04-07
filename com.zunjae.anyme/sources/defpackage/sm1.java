package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: sm1  reason: default package */
public final class sm1 {
    public static final String a = "sm1";
    private static boolean b = false;
    private static HashMap<String, an1> c = new HashMap<>();

    /* renamed from: sm1$a */
    public static class a {
        private List<CharacterStyle> a = new LinkedList();
        private HashMap<String, List<CharacterStyle>> b = new HashMap<>();
        private List<an1> c = new LinkedList();
        private Context d;

        public a a(Context context) {
            this.d = context;
            return this;
        }

        public b b(Spanned spanned) {
            return new b(this.d, this.c, spanned, this.a, this.b);
        }

        public b c(CharSequence charSequence) {
            return d(charSequence.toString());
        }

        public b d(String str) {
            return b(new SpannableString(str));
        }
    }

    /* renamed from: sm1$b */
    public static class b {
        private Context a;
        private Spanned b;
        private List<CharacterStyle> c;
        private HashMap<String, List<CharacterStyle>> d;
        private List<an1> e;

        public b(Context context, List<an1> list, Spanned spanned, List<CharacterStyle> list2, HashMap<String, List<CharacterStyle>> hashMap) {
            this.a = context;
            this.e = list;
            this.b = spanned;
            this.c = list2;
            this.d = hashMap;
        }

        public Spanned a() {
            HashMap hashMap = new HashMap();
            for (an1 next : this.e) {
                hashMap.put(next.getMappingPrefix(), next);
            }
            return sm1.d(this.a, hashMap, this.b, this.c, this.d);
        }
    }

    public static an1 a(Context context, String str) {
        c(context);
        return c.get(str);
    }

    private static HashMap<String, an1> b(Context context, HashMap<String, an1> hashMap) {
        c(context);
        return (hashMap == null || hashMap.size() == 0) ? c : hashMap;
    }

    public static void c(Context context) {
        if (!b) {
            for (String str : bn1.b(context)) {
                try {
                    an1 an1 = (an1) Class.forName(str).newInstance();
                    e(an1);
                    c.put(an1.getMappingPrefix(), an1);
                } catch (Exception unused) {
                    "Can't init: " + str;
                }
            }
            b = true;
        }
    }

    public static Spanned d(Context context, HashMap<String, an1> hashMap, Spanned spanned, List<CharacterStyle> list, HashMap<String, List<CharacterStyle>> hashMap2) {
        fn1 b2 = dn1.b(spanned, b(context, hashMap));
        SpannableString valueOf = SpannableString.valueOf(b2.a);
        dn1.a(context, valueOf, b2.b, list, hashMap2);
        return valueOf;
    }

    private static void e(an1 an1) {
        if (an1.getMappingPrefix().length() != 3) {
            throw new IllegalArgumentException("The mapping prefix of a font must be three characters long.");
        }
    }
}
