package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class b {
    private final String a;
    private final Context b;
    private final AttributeSet c;
    private final View d;
    private final a e;

    public b(String str, Context context, AttributeSet attributeSet, View view, a aVar) {
        v62.f(str, "name");
        v62.f(context, "context");
        v62.f(aVar, "fallbackViewCreator");
        this.a = str;
        this.b = context;
        this.c = attributeSet;
        this.d = view;
        this.e = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Context context, AttributeSet attributeSet, View view, a aVar, int i, r62 r62) {
        this(str, context, (i & 4) != 0 ? null : attributeSet, (i & 8) != 0 ? null : view, aVar);
    }

    public final AttributeSet a() {
        return this.c;
    }

    public final Context b() {
        return this.b;
    }

    public final a c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final View e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v62.a(this.a, bVar.a) && v62.a(this.b, bVar.b) && v62.a(this.c, bVar.c) && v62.a(this.d, bVar.d) && v62.a(this.e, bVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Context context = this.b;
        int hashCode2 = (hashCode + (context != null ? context.hashCode() : 0)) * 31;
        AttributeSet attributeSet = this.c;
        int hashCode3 = (hashCode2 + (attributeSet != null ? attributeSet.hashCode() : 0)) * 31;
        View view = this.d;
        int hashCode4 = (hashCode3 + (view != null ? view.hashCode() : 0)) * 31;
        a aVar = this.e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "InflateRequest(name=" + this.a + ", context=" + this.b + ", attrs=" + this.c + ", parent=" + this.d + ", fallbackViewCreator=" + this.e + ")";
    }
}
