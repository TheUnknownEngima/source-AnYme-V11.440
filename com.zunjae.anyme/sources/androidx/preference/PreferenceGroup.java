package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    final h0<String, Long> T;
    private final Handler U;
    private List<Preference> V;
    private boolean W;
    private int X;
    private boolean Y;
    private int Z;
    private b a0;
    private final Runnable b0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.T.clear();
            }
        }
    }

    public interface b {
        void a();
    }

    static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();
        int e;

        static class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.e = parcel.readInt();
        }

        c(Parcelable parcelable, int i) {
            super(parcelable);
            this.e = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T = new h0<>();
        this.U = new Handler();
        this.W = true;
        this.X = 0;
        this.Y = false;
        this.Z = Integer.MAX_VALUE;
        this.a0 = null;
        this.b0 = new a();
        this.V = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PreferenceGroup, i, i2);
        int i3 = R$styleable.PreferenceGroup_orderingFromXml;
        this.W = i2.b(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(R$styleable.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = R$styleable.PreferenceGroup_initialExpandedChildrenCount;
            h1(i2.d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean f1(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.k0();
            if (preference.B() == this) {
                preference.a((PreferenceGroup) null);
            }
            remove = this.V.remove(preference);
            if (remove) {
                String x = preference.x();
                if (x != null) {
                    this.T.put(x, Long.valueOf(preference.v()));
                    this.U.removeCallbacks(this.b0);
                    this.U.post(this.b0);
                }
                if (this.Y) {
                    preference.f0();
                }
            }
        }
        return remove;
    }

    public void V0(Preference preference) {
        W0(preference);
    }

    public void W(boolean z) {
        super.W(z);
        int b1 = b1();
        for (int i = 0; i < b1; i++) {
            a1(i).j0(this, z);
        }
    }

    public boolean W0(Preference preference) {
        long j;
        if (this.V.contains(preference)) {
            return true;
        }
        if (preference.x() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.B() != null) {
                preferenceGroup = preferenceGroup.B();
            }
            String x = preference.x();
            if (preferenceGroup.X0(x) != null) {
                "Found duplicated key: \"" + x + "\". This can cause unintended behaviour, please use unique keys for every preference.";
            }
        }
        if (preference.A() == Integer.MAX_VALUE) {
            if (this.W) {
                int i = this.X;
                this.X = i + 1;
                preference.L0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).i1(this.W);
            }
        }
        int binarySearch = Collections.binarySearch(this.V, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * -1) - 1;
        }
        if (!d1(preference)) {
            return false;
        }
        synchronized (this) {
            this.V.add(binarySearch, preference);
        }
        j I = I();
        String x2 = preference.x();
        if (x2 == null || !this.T.containsKey(x2)) {
            j = I.d();
        } else {
            j = this.T.get(x2).longValue();
            this.T.remove(x2);
        }
        preference.b0(I, j);
        preference.a(this);
        if (this.Y) {
            preference.Z();
        }
        Y();
        return true;
    }

    public <T extends Preference> T X0(CharSequence charSequence) {
        T X0;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(x(), charSequence)) {
            return this;
        } else {
            int b1 = b1();
            for (int i = 0; i < b1; i++) {
                T a1 = a1(i);
                if (TextUtils.equals(a1.x(), charSequence)) {
                    return a1;
                }
                if ((a1 instanceof PreferenceGroup) && (X0 = ((PreferenceGroup) a1).X0(charSequence)) != null) {
                    return X0;
                }
            }
            return null;
        }
    }

    public int Y0() {
        return this.Z;
    }

    public void Z() {
        super.Z();
        this.Y = true;
        int b1 = b1();
        for (int i = 0; i < b1; i++) {
            a1(i).Z();
        }
    }

    public b Z0() {
        return this.a0;
    }

    public Preference a1(int i) {
        return this.V.get(i);
    }

    public int b1() {
        return this.V.size();
    }

    /* access modifiers changed from: protected */
    public boolean c1() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean d1(Preference preference) {
        preference.j0(this, Q0());
        return true;
    }

    public boolean e1(Preference preference) {
        boolean f1 = f1(preference);
        Y();
        return f1;
    }

    public void f0() {
        super.f0();
        this.Y = false;
        int b1 = b1();
        for (int i = 0; i < b1; i++) {
            a1(i).f0();
        }
    }

    public boolean g1(CharSequence charSequence) {
        Preference X0 = X0(charSequence);
        if (X0 == null) {
            return false;
        }
        return X0.B().e1(X0);
    }

    public void h1(int i) {
        if (i != Integer.MAX_VALUE && !O()) {
            getClass().getSimpleName() + " should have a key defined if it contains an expandable preference";
        }
        this.Z = i;
    }

    /* access modifiers changed from: protected */
    public void i(Bundle bundle) {
        super.i(bundle);
        int b1 = b1();
        for (int i = 0; i < b1; i++) {
            a1(i).i(bundle);
        }
    }

    public void i1(boolean z) {
        this.W = z;
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        synchronized (this) {
            Collections.sort(this.V);
        }
    }

    /* access modifiers changed from: protected */
    public void k(Bundle bundle) {
        super.k(bundle);
        int b1 = b1();
        for (int i = 0; i < b1; i++) {
            a1(i).k(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.l0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        this.Z = cVar.e;
        super.l0(cVar.getSuperState());
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        return new c(super.m0(), this.Z);
    }
}
