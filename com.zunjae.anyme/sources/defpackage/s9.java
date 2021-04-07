package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s9  reason: default package */
public class s9 implements Parcelable {
    public static final Parcelable.Creator<s9> CREATOR = new a();
    /* access modifiers changed from: private */
    public String e;
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;

    /* renamed from: s9$a */
    static class a implements Parcelable.Creator<s9> {
        a() {
        }

        /* renamed from: a */
        public s9 createFromParcel(Parcel parcel) {
            return new s9(parcel, (a) null);
        }

        /* renamed from: b */
        public s9[] newArray(int i) {
            return new s9[i];
        }
    }

    /* renamed from: s9$b */
    public static class b {
        private String a;
        private int b;
        private int c;

        public s9 a() {
            s9 s9Var = new s9();
            String unused = s9Var.e = this.a;
            int unused2 = s9Var.f = this.b;
            int unused3 = s9Var.g = this.c;
            return s9Var;
        }

        public b b(String str) {
            this.a = str;
            return this;
        }
    }

    public s9() {
    }

    private s9(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    /* synthetic */ s9(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static List<s9> d(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new s9());
        }
        return arrayList;
    }

    public static s9 i(String str) {
        b bVar = new b();
        bVar.b(str);
        return bVar.a();
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public boolean h() {
        return TextUtils.isEmpty(this.e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
