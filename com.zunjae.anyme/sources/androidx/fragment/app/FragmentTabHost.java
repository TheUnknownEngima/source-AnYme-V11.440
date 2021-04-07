package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList<b> e = new ArrayList<>();
    private Context f;
    private k g;
    private int h;
    private TabHost.OnTabChangeListener i;
    private b j;
    private boolean k;

    static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0023a();
        String e;

        /* renamed from: androidx.fragment.app.FragmentTabHost$a$a  reason: collision with other inner class name */
        static class C0023a implements Parcelable.Creator<a> {
            C0023a() {
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

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.e + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
        }
    }

    static final class b {
        final String a;
        final Class<?> b;
        final Bundle c;
        Fragment d;
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    private s a(String str, s sVar) {
        Fragment fragment;
        b b2 = b(str);
        if (this.j != b2) {
            if (sVar == null) {
                sVar = this.g.j();
            }
            b bVar = this.j;
            if (!(bVar == null || (fragment = bVar.d) == null)) {
                sVar.m(fragment);
            }
            if (b2 != null) {
                Fragment fragment2 = b2.d;
                if (fragment2 == null) {
                    Fragment a2 = this.g.h0().a(this.f.getClassLoader(), b2.b.getName());
                    b2.d = a2;
                    a2.u1(b2.c);
                    sVar.c(this.h, b2.d, b2.a);
                } else {
                    sVar.h(fragment2);
                }
            }
            this.j = b2;
        }
        return sVar;
    }

    private b b(String str) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.e.get(i2);
            if (bVar.a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.h = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.e.size();
        s sVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.e.get(i2);
            Fragment Z = this.g.Z(bVar.a);
            bVar.d = Z;
            if (Z != null && !Z.W()) {
                if (bVar.a.equals(currentTabTag)) {
                    this.j = bVar;
                } else {
                    if (sVar == null) {
                        sVar = this.g.j();
                    }
                    sVar.m(bVar.d);
                }
            }
        }
        this.k = true;
        s a2 = a(currentTabTag, sVar);
        if (a2 != null) {
            a2.i();
            this.g.V();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k = false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCurrentTabByTag(aVar.e);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.e = getCurrentTabTag();
        return aVar;
    }

    @Deprecated
    public void onTabChanged(String str) {
        s a2;
        if (this.k && (a2 = a(str, (s) null)) != null) {
            a2.i();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.i;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.i = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
