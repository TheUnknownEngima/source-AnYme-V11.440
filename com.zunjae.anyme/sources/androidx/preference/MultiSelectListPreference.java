package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] Z;
    private CharSequence[] a0;
    private Set<String> b0;

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0045a();
        Set<String> e;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a  reason: collision with other inner class name */
        static class C0045a implements Parcelable.Creator<a> {
            C0045a() {
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
            int readInt = parcel.readInt();
            this.e = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.e, strArr);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e.size());
            Set<String> set = this.e;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i2.a(context, R$attr.dialogPreferenceStyle, 16842897));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiSelectListPreference, i, i2);
        this.Z = i2.q(obtainStyledAttributes, R$styleable.MultiSelectListPreference_entries, R$styleable.MultiSelectListPreference_android_entries);
        this.a0 = i2.q(obtainStyledAttributes, R$styleable.MultiSelectListPreference_entryValues, R$styleable.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    public CharSequence[] b1() {
        return this.Z;
    }

    public CharSequence[] c1() {
        return this.a0;
    }

    public Set<String> d1() {
        return this.b0;
    }

    public void e1(Set<String> set) {
        this.b0.clear();
        this.b0.addAll(set);
        x0(set);
        V();
    }

    /* access modifiers changed from: protected */
    public Object g0(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.l0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.l0(aVar.getSuperState());
        e1(aVar.e);
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        Parcelable m0 = super.m0();
        if (S()) {
            return m0;
        }
        a aVar = new a(m0);
        aVar.e = d1();
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
        e1(G((Set) obj));
    }
}
