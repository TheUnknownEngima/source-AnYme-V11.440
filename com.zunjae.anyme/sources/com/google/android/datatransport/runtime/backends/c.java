package com.google.android.datatransport.runtime.backends;

import android.content.Context;

final class c extends h {
    private final Context a;
    private final kq b;
    private final kq c;
    private final String d;

    c(Context context, kq kqVar, kq kqVar2, String str) {
        if (context != null) {
            this.a = context;
            if (kqVar != null) {
                this.b = kqVar;
                if (kqVar2 != null) {
                    this.c = kqVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.a;
    }

    public String c() {
        return this.d;
    }

    public kq d() {
        return this.c;
    }

    public kq e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.b()) && this.b.equals(hVar.e()) && this.c.equals(hVar.d()) && this.d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
