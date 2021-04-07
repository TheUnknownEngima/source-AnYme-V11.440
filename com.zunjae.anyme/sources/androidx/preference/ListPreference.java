package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;

public class ListPreference extends DialogPreference {
    private CharSequence[] Z;
    private CharSequence[] a0;
    private String b0;
    private String c0;
    private boolean d0;

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0044a();
        String e;

        /* renamed from: androidx.preference.ListPreference$a$a  reason: collision with other inner class name */
        static class C0044a implements Parcelable.Creator<a> {
            C0044a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.e = parcel.readString();
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
        }
    }

    public static final class b implements Preference.g<ListPreference> {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.d1()) ? listPreference.q().getString(R$string.not_set) : listPreference.d1();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPreference, i, i2);
        this.Z = i2.q(obtainStyledAttributes, R$styleable.ListPreference_entries, R$styleable.ListPreference_android_entries);
        this.a0 = i2.q(obtainStyledAttributes, R$styleable.ListPreference_entryValues, R$styleable.ListPreference_android_entryValues);
        int i3 = R$styleable.ListPreference_useSimpleSummaryProvider;
        if (i2.b(obtainStyledAttributes, i3, i3, false)) {
            N0(b.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.Preference, i, i2);
        this.c0 = i2.o(obtainStyledAttributes2, R$styleable.Preference_summary, R$styleable.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    private int g1() {
        return b1(this.b0);
    }

    public CharSequence K() {
        if (L() != null) {
            return L().a(this);
        }
        Object d1 = d1();
        CharSequence K = super.K();
        String str = this.c0;
        if (str == null) {
            return K;
        }
        Object[] objArr = new Object[1];
        if (d1 == null) {
            d1 = "";
        }
        objArr[0] = d1;
        String format = String.format(str, objArr);
        return TextUtils.equals(format, K) ? K : format;
    }

    public void M0(CharSequence charSequence) {
        String charSequence2;
        super.M0(charSequence);
        if (charSequence == null && this.c0 != null) {
            charSequence2 = null;
        } else if (charSequence != null && !charSequence.equals(this.c0)) {
            charSequence2 = charSequence.toString();
        } else {
            return;
        }
        this.c0 = charSequence2;
    }

    public int b1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.a0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.a0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] c1() {
        return this.Z;
    }

    public CharSequence d1() {
        CharSequence[] charSequenceArr;
        int g1 = g1();
        if (g1 < 0 || (charSequenceArr = this.Z) == null) {
            return null;
        }
        return charSequenceArr[g1];
    }

    public CharSequence[] e1() {
        return this.a0;
    }

    public String f1() {
        return this.b0;
    }

    /* access modifiers changed from: protected */
    public Object g0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public void h1(String str) {
        boolean z = !TextUtils.equals(this.b0, str);
        if (z || !this.d0) {
            this.b0 = str;
            this.d0 = true;
            w0(str);
            if (z) {
                V();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.l0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.l0(aVar.getSuperState());
        h1(aVar.e);
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        Parcelable m0 = super.m0();
        if (S()) {
            return m0;
        }
        a aVar = new a(m0);
        aVar.e = f1();
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
        h1(F((String) obj));
    }
}
