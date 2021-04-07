package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {
    protected boolean T;
    private CharSequence U;
    private CharSequence V;
    private boolean W;
    private boolean X;

    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0046a();
        boolean e;

        /* renamed from: androidx.preference.TwoStatePreference$a$a  reason: collision with other inner class name */
        static class C0046a implements Parcelable.Creator<a> {
            C0046a() {
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
            this.e = parcel.readInt() != 1 ? false : true;
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public boolean Q0() {
        return (this.X ? this.T : !this.T) || super.Q0();
    }

    public boolean V0() {
        return this.T;
    }

    public void W0(boolean z) {
        boolean z2 = this.T != z;
        if (z2 || !this.W) {
            this.T = z;
            this.W = true;
            u0(z);
            if (z2) {
                W(Q0());
                V();
            }
        }
    }

    public void X0(boolean z) {
        this.X = z;
    }

    public void Y0(CharSequence charSequence) {
        this.V = charSequence;
        if (!V0()) {
            V();
        }
    }

    public void Z0(CharSequence charSequence) {
        this.U = charSequence;
        if (V0()) {
            V();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a1(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.T
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.U
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.U
        L_0x0017:
            r5.setText(r0)
            r0 = 0
            goto L_0x002b
        L_0x001c:
            boolean r1 = r4.T
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r1 = r4.V
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r0 = r4.V
            goto L_0x0017
        L_0x002b:
            if (r0 == 0) goto L_0x003b
            java.lang.CharSequence r1 = r4.K()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003b
            r5.setText(r1)
            r0 = 0
        L_0x003b:
            r1 = 8
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 8
        L_0x0042:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004b
            r5.setVisibility(r2)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.a1(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void b1(l lVar) {
        a1(lVar.M(16908304));
    }

    /* access modifiers changed from: protected */
    public void d0() {
        super.d0();
        boolean z = !V0();
        if (e(Boolean.valueOf(z))) {
            W0(z);
        }
    }

    /* access modifiers changed from: protected */
    public Object g0(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.l0(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.l0(aVar.getSuperState());
        W0(aVar.e);
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        Parcelable m0 = super.m0();
        if (S()) {
            return m0;
        }
        a aVar = new a(m0);
        aVar.e = V0();
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        W0(C(((Boolean) obj).booleanValue()));
    }
}
