package defpackage;

import java.nio.charset.Charset;

/* renamed from: q82  reason: default package */
public final class q82 {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        v62.d(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        v62.d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        v62.d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        v62.d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        v62.d(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        v62.d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
