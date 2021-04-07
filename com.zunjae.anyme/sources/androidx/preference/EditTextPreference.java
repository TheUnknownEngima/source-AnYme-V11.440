package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {
    private String Z;
    private a a0;

    public interface a {
        void a(EditText editText);
    }

    private static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();
        String e;

        static class a implements Parcelable.Creator<b> {
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
            super(parcel);
            this.e = parcel.readString();
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
        }
    }

    public static final class c implements Preference.g<EditTextPreference> {
        private static c a;

        private c() {
        }

        public static c b() {
            if (a == null) {
                a = new c();
            }
            return a;
        }

        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.c1()) ? editTextPreference.q().getString(R$string.not_set) : editTextPreference.c1();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.editTextPreferenceStyle, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditTextPreference, i, i2);
        int i3 = R$styleable.EditTextPreference_useSimpleSummaryProvider;
        if (i2.b(obtainStyledAttributes, i3, i3, false)) {
            N0(c.b());
        }
        obtainStyledAttributes.recycle();
    }

    public boolean Q0() {
        return TextUtils.isEmpty(this.Z) || super.Q0();
    }

    /* access modifiers changed from: package-private */
    public a b1() {
        return this.a0;
    }

    public String c1() {
        return this.Z;
    }

    public void d1(String str) {
        boolean Q0 = Q0();
        this.Z = str;
        w0(str);
        boolean Q02 = Q0();
        if (Q02 != Q0) {
            W(Q02);
        }
        V();
    }

    /* access modifiers changed from: protected */
    public Object g0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.l0(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.l0(bVar.getSuperState());
        d1(bVar.e);
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        Parcelable m0 = super.m0();
        if (S()) {
            return m0;
        }
        b bVar = new b(m0);
        bVar.e = c1();
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
        d1(F((String) obj));
    }
}
