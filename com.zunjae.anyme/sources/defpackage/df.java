package defpackage;

import com.bumptech.glide.load.g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: df  reason: default package */
public final class df extends Exception {
    private static final StackTraceElement[] j = new StackTraceElement[0];
    private final List<Throwable> e;
    private g f;
    private com.bumptech.glide.load.a g;
    private Class<?> h;
    private String i;

    /* renamed from: df$a */
    private static final class a implements Appendable {
        private final Appendable e;
        private boolean f = true;

        a(Appendable appendable) {
            this.e = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f) {
                this.f = false;
                this.e.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f = z;
            this.e.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a = a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.f) {
                this.f = false;
                this.e.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f = z;
            this.e.append(a, i, i2);
            return this;
        }
    }

    public df(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public df(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public df(String str, List<Throwable> list) {
        this.i = str;
        setStackTrace(j);
        this.e = list;
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof df) {
            for (Throwable a2 : ((df) th).e()) {
                a(a2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof df) {
                ((df) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.e;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f2 = f();
        int size = f2.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            sb.toString();
            Throwable th = f2.get(i2);
            i2 = i3;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.i);
        String str4 = "";
        if (this.h != null) {
            str = ", " + this.h;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.g != null) {
            str2 = ", " + this.g;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f != null) {
            str4 = ", " + this.f;
        }
        sb.append(str4);
        List<Throwable> f2 = f();
        if (f2.isEmpty()) {
            return sb.toString();
        }
        if (f2.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(f2.size());
            str3 = " causes:";
        }
        sb.append(str3);
        for (Throwable next : f2) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void i(g gVar, com.bumptech.glide.load.a aVar) {
        j(gVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    public void j(g gVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.f = gVar;
        this.g = aVar;
        this.h = cls;
    }

    public void k(Exception exc) {
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }
}
