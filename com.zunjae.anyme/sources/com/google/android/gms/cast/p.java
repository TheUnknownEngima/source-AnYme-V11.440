package com.google.android.gms.cast;

import com.google.android.gms.common.internal.q;
import org.json.JSONObject;

public class p {
    private final long a;
    private final int b;
    private final boolean c;
    private final JSONObject d;

    public static class a {
        private long a;
        private int b = 0;
        private boolean c;
        private JSONObject d;

        public p a() {
            return new p(this.a, this.b, this.c, this.d);
        }

        public a b(JSONObject jSONObject) {
            this.d = jSONObject;
            return this;
        }

        public a c(boolean z) {
            this.c = z;
            return this;
        }

        public a d(long j) {
            this.a = j;
            return this;
        }

        public a e(int i) {
            this.b = i;
            return this;
        }
    }

    private p(long j, int i, boolean z, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = jSONObject;
    }

    public JSONObject a() {
        return this.d;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && q.a(this.d, pVar.d);
    }

    public int hashCode() {
        return q.b(Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d);
    }
}
