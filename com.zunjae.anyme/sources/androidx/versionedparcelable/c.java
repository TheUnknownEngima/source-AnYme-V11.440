package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

class c extends b {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b0(), new b0(), new b0());
    }

    private c(Parcel parcel, int i2, int i3, String str, b0<String, Method> b0Var, b0<String, Method> b0Var2, b0<String, Class> b0Var3) {
        super(b0Var, b0Var2, b0Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
            return;
        }
        this.e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    public void E(int i2) {
        this.e.writeInt(i2);
    }

    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.e.writeString(str);
    }

    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(dataPosition - i3);
            this.e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public b b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        int i3 = i2;
        return new c(parcel, dataPosition, i3, this.h + "  ", this.a, this.b, this.c);
    }

    public boolean g() {
        return this.e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    public boolean m(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    public int o() {
        return this.e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.e.readParcelable(c.class.getClassLoader());
    }

    public String s() {
        return this.e.readString();
    }

    public void w(int i2) {
        a();
        this.i = i2;
        this.d.put(i2, this.e.dataPosition());
        E(0);
        E(i2);
    }

    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }
}
