package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: nh1  reason: default package */
final class nh1 implements eh1, gh1 {
    private nh1 a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, dh1<?>> d;
    private final Map<Class<?>, fh1<?>> e;
    private final dh1<Object> f;
    private final boolean g;

    nh1(Writer writer, Map<Class<?>, dh1<?>> map, Map<Class<?>, fh1<?>> map2, dh1<Object> dh1, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = dh1;
        this.g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private nh1 t(String str, Object obj) {
        v();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        i(obj, false);
        return this;
    }

    private nh1 u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        i(obj, false);
        return this;
    }

    private void v() {
        if (this.b) {
            nh1 nh1 = this.a;
            if (nh1 != null) {
                nh1.v();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public /* bridge */ /* synthetic */ eh1 a(String str, boolean z) {
        n(str, z);
        return this;
    }

    public /* bridge */ /* synthetic */ eh1 b(String str, long j) {
        l(str, j);
        return this;
    }

    public /* bridge */ /* synthetic */ eh1 c(String str, int i) {
        k(str, i);
        return this;
    }

    public /* bridge */ /* synthetic */ gh1 d(String str) {
        j(str);
        return this;
    }

    public /* bridge */ /* synthetic */ gh1 e(boolean z) {
        o(z);
        return this;
    }

    public /* bridge */ /* synthetic */ eh1 f(String str, Object obj) {
        m(str, obj);
        return this;
    }

    public nh1 g(int i) {
        v();
        this.c.value((long) i);
        return this;
    }

    public nh1 h(long j) {
        v();
        this.c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    public nh1 i(Object obj, boolean z) {
        int i = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new ch1(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                p((byte[]) obj);
                return this;
            }
            this.c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    i(i3, false);
                }
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.c.beginArray();
            for (Object i4 : (Collection) obj) {
                i(i4, false);
            }
            this.c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new ch1(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.c.endObject();
            return this;
        } else {
            dh1 dh1 = this.d.get(obj.getClass());
            if (dh1 != null) {
                s(dh1, obj, z);
                return this;
            }
            fh1 fh1 = this.e.get(obj.getClass());
            if (fh1 != null) {
                fh1.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                j(((Enum) obj).name());
                return this;
            } else {
                s(this.f, obj, z);
                return this;
            }
        }
    }

    public nh1 j(String str) {
        v();
        this.c.value(str);
        return this;
    }

    public nh1 k(String str, int i) {
        v();
        this.c.name(str);
        g(i);
        return this;
    }

    public nh1 l(String str, long j) {
        v();
        this.c.name(str);
        h(j);
        return this;
    }

    public nh1 m(String str, Object obj) {
        if (this.g) {
            u(str, obj);
            return this;
        }
        t(str, obj);
        return this;
    }

    public nh1 n(String str, boolean z) {
        v();
        this.c.name(str);
        o(z);
        return this;
    }

    public nh1 o(boolean z) {
        v();
        this.c.value(z);
        return this;
    }

    public nh1 p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        v();
        this.c.flush();
    }

    /* access modifiers changed from: package-private */
    public nh1 s(dh1<Object> dh1, Object obj, boolean z) {
        if (!z) {
            this.c.beginObject();
        }
        dh1.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
