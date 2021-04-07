package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class c {
    private final View a;
    private final String b;
    private final Context c;
    private final AttributeSet d;

    public static final class a {
        private View a;
        private String b;
        private Context c;
        private AttributeSet d;

        public a(c cVar) {
            v62.f(cVar, "result");
            this.a = cVar.e();
            this.b = cVar.c();
            this.c = cVar.b();
            this.d = cVar.a();
        }

        public final c a() {
            String str = this.b;
            if (str != null) {
                View view = this.a;
                if (view == null) {
                    view = null;
                } else if (!v62.a(str, view.getClass().getName())) {
                    throw new IllegalStateException(("name (" + str + ") must be the view's fully qualified name (" + view.getClass().getName() + ')').toString());
                }
                Context context = this.c;
                if (context != null) {
                    return new c(view, str, context, this.d);
                }
                throw new IllegalStateException("context == null");
            }
            throw new IllegalStateException("name == null".toString());
        }

        public final a b(View view) {
            this.a = view;
            return this;
        }
    }

    public c(View view, String str, Context context, AttributeSet attributeSet) {
        v62.f(str, "name");
        v62.f(context, "context");
        this.a = view;
        this.b = str;
        this.c = context;
        this.d = attributeSet;
    }

    public final AttributeSet a() {
        return this.d;
    }

    public final Context b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final a d() {
        return new a(this);
    }

    public final View e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v62.a(this.a, cVar.a) && v62.a(this.b, cVar.b) && v62.a(this.c, cVar.c) && v62.a(this.d, cVar.d);
    }

    public int hashCode() {
        View view = this.a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Context context = this.c;
        int hashCode3 = (hashCode2 + (context != null ? context.hashCode() : 0)) * 31;
        AttributeSet attributeSet = this.d;
        if (attributeSet != null) {
            i = attributeSet.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "InflateResult(view=" + this.a + ", name=" + this.b + ", context=" + this.c + ", attrs=" + this.d + ")";
    }
}
