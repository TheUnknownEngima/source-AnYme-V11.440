package com.leinardi.android.speeddial;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0148a();
    /* access modifiers changed from: private */
    public final int e;
    /* access modifiers changed from: private */
    public final String f;
    /* access modifiers changed from: private */
    public final int g;
    /* access modifiers changed from: private */
    public final int h;
    /* access modifiers changed from: private */
    public final Drawable i;
    /* access modifiers changed from: private */
    public final int j;
    /* access modifiers changed from: private */
    public final int k;
    /* access modifiers changed from: private */
    public final int l;
    /* access modifiers changed from: private */
    public final int m;
    /* access modifiers changed from: private */
    public final boolean n;
    /* access modifiers changed from: private */
    public final int o;
    /* access modifiers changed from: private */
    public final int p;

    /* renamed from: com.leinardi.android.speeddial.a$a  reason: collision with other inner class name */
    class C0148a implements Parcelable.Creator<a> {
        C0148a() {
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

    public static class b {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final int b;
        /* access modifiers changed from: private */
        public Drawable c;
        /* access modifiers changed from: private */
        public int d = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public String e;
        /* access modifiers changed from: private */
        public int f = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public int g = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public int h = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public int i = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public boolean j = true;
        /* access modifiers changed from: private */
        public int k = -1;
        /* access modifiers changed from: private */
        public int l = Integer.MIN_VALUE;

        public b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
            this.c = null;
        }

        public b(a aVar) {
            this.a = aVar.e;
            this.e = aVar.f;
            this.f = aVar.g;
            this.b = aVar.h;
            this.c = aVar.i;
            this.d = aVar.j;
            this.g = aVar.k;
            this.h = aVar.l;
            this.i = aVar.m;
            this.j = aVar.n;
            this.k = aVar.o;
            this.l = aVar.p;
        }

        public a m() {
            return new a(this, (C0148a) null);
        }

        public b n(int i2) {
            this.g = i2;
            return this;
        }

        public b o(String str) {
            this.e = str;
            return this;
        }

        public b p(int i2) {
            this.i = i2;
            return this;
        }

        public b q(boolean z) {
            this.j = z;
            return this;
        }

        public b r(int i2) {
            this.h = i2;
            return this;
        }
    }

    protected a(Parcel parcel) {
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = null;
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readByte() != 0;
        this.o = parcel.readInt();
        this.p = parcel.readInt();
    }

    private a(b bVar) {
        this.e = bVar.a;
        this.f = bVar.e;
        this.g = bVar.f;
        this.j = bVar.d;
        this.h = bVar.b;
        this.i = bVar.c;
        this.k = bVar.g;
        this.l = bVar.h;
        this.m = bVar.i;
        this.n = bVar.j;
        this.o = bVar.k;
        this.p = bVar.l;
    }

    /* synthetic */ a(b bVar, C0148a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public FabWithLabelView m(Context context) {
        int x = x();
        FabWithLabelView fabWithLabelView = x == Integer.MIN_VALUE ? new FabWithLabelView(context) : new FabWithLabelView(new ContextThemeWrapper(context, x), (AttributeSet) null, x);
        fabWithLabelView.setSpeedDialActionItem(this);
        return fabWithLabelView;
    }

    public int n() {
        return this.k;
    }

    public Drawable o(Context context) {
        Drawable drawable = this.i;
        if (drawable != null) {
            return drawable;
        }
        int i2 = this.h;
        if (i2 != Integer.MIN_VALUE) {
            return f.d(context, i2);
        }
        return null;
    }

    public int p() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.o;
    }

    public int s() {
        return this.e;
    }

    public String u(Context context) {
        String str = this.f;
        if (str != null) {
            return str;
        }
        int i2 = this.g;
        if (i2 != Integer.MIN_VALUE) {
            return context.getString(i2);
        }
        return null;
    }

    public int v() {
        return this.m;
    }

    public int w() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeByte(this.n ? (byte) 1 : 0);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }

    public int x() {
        return this.p;
    }

    public boolean y() {
        return this.n;
    }
}
