package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: ns  reason: default package */
public final class ns implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<ns> CREATOR = new a();
    private final b[] e;
    private int f;
    public final String g;
    public final int h;

    /* renamed from: ns$a */
    class a implements Parcelable.Creator<ns> {
        a() {
        }

        /* renamed from: a */
        public ns createFromParcel(Parcel parcel) {
            return new ns(parcel);
        }

        /* renamed from: b */
        public ns[] newArray(int i) {
            return new ns[i];
        }
    }

    /* renamed from: ns$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private int e;
        /* access modifiers changed from: private */
        public final UUID f;
        public final String g;
        public final String h;
        public final byte[] i;

        /* renamed from: ns$b$a */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        b(Parcel parcel) {
            this.f = new UUID(parcel.readLong(), parcel.readLong());
            this.g = parcel.readString();
            String readString = parcel.readString();
            v50.g(readString);
            this.h = readString;
            this.i = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            q40.e(uuid);
            this.f = uuid;
            this.g = str;
            q40.e(str2);
            this.h = str2;
            this.i = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        public boolean b(b bVar) {
            return d() && !bVar.d() && e(bVar.f);
        }

        public b c(byte[] bArr) {
            return new b(this.f, this.g, this.h, bArr);
        }

        public boolean d() {
            return this.i != null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return v.a.equals(this.f) || uuid.equals(this.f);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return v50.b(this.g, bVar.g) && v50.b(this.h, bVar.h) && v50.b(this.f, bVar.f) && Arrays.equals(this.i, bVar.i);
        }

        public int hashCode() {
            if (this.e == 0) {
                int hashCode = this.f.hashCode() * 31;
                String str = this.g;
                this.e = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode()) * 31) + Arrays.hashCode(this.i);
            }
            return this.e;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f.getMostSignificantBits());
            parcel.writeLong(this.f.getLeastSignificantBits());
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeByteArray(this.i);
        }
    }

    ns(Parcel parcel) {
        this.g = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        v50.g(bVarArr);
        b[] bVarArr2 = bVarArr;
        this.e = bVarArr2;
        this.h = bVarArr2.length;
    }

    public ns(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ns$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ns(java.lang.String r1, boolean r2, defpackage.ns.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.g = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            ns$b[] r3 = (defpackage.ns.b[]) r3
        L_0x000e:
            r0.e = r3
            int r1 = r3.length
            r0.h = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns.<init>(java.lang.String, boolean, ns$b[]):void");
    }

    public ns(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public ns(List<b> list) {
        this((String) null, false, (b[]) list.toArray(new b[0]));
    }

    public ns(b... bVarArr) {
        this((String) null, bVarArr);
    }

    private static boolean b(ArrayList<b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static ns d(ns nsVar, ns nsVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (nsVar != null) {
            str = nsVar.g;
            for (b bVar : nsVar.e) {
                if (bVar.d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (nsVar2 != null) {
            if (str == null) {
                str = nsVar2.g;
            }
            int size = arrayList.size();
            for (b bVar2 : nsVar2.e) {
                if (bVar2.d() && !b(arrayList, size, bVar2.f)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ns(str, (List<b>) arrayList);
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        return v.a.equals(bVar.f) ? v.a.equals(bVar2.f) ? 0 : 1 : bVar.f.compareTo(bVar2.f);
    }

    public ns c(String str) {
        return v50.b(this.g, str) ? this : new ns(str, false, this.e);
    }

    public int describeContents() {
        return 0;
    }

    public b e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ns.class != obj.getClass()) {
            return false;
        }
        ns nsVar = (ns) obj;
        return v50.b(this.g, nsVar.g) && Arrays.equals(this.e, nsVar.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ns f(defpackage.ns r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.g
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.g
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            defpackage.q40.f(r0)
            java.lang.String r0 = r2.g
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.g
        L_0x001c:
            ns$b[] r1 = r2.e
            ns$b[] r3 = r3.e
            java.lang.Object[] r3 = defpackage.v50.o0(r1, r3)
            ns$b[] r3 = (defpackage.ns.b[]) r3
            ns r1 = new ns
            r1.<init>((java.lang.String) r0, (defpackage.ns.b[]) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns.f(ns):ns");
    }

    public int hashCode() {
        if (this.f == 0) {
            String str = this.g;
            this.f = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeTypedArray(this.e, 0);
    }
}
