package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;

public class b implements m {
    private g e;
    private BottomNavigationMenuView f;
    private boolean g = false;
    private int h;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0093a();
        int e;
        com.google.android.material.internal.g f;

        /* renamed from: com.google.android.material.bottomnavigation.b$a$a  reason: collision with other inner class name */
        static class C0093a implements Parcelable.Creator<a> {
            C0093a() {
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

        a() {
        }

        a(Parcel parcel) {
            this.e = parcel.readInt();
            this.f = (com.google.android.material.internal.g) parcel.readParcelable(a.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.e);
            parcel.writeParcelable(this.f, 0);
        }
    }

    public void a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.f = bottomNavigationMenuView;
    }

    public void b(int i) {
        this.h = i;
    }

    public void c(g gVar, boolean z) {
    }

    public void d(boolean z) {
        this.g = z;
    }

    public int f() {
        return this.h;
    }

    public void g(boolean z) {
        if (!this.g) {
            if (z) {
                this.f.d();
            } else {
                this.f.k();
            }
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
    }

    public void l(Context context, g gVar) {
        this.e = gVar;
        this.f.b(gVar);
    }

    public void m(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f.j(aVar.e);
            this.f.setBadgeDrawables(r91.b(this.f.getContext(), aVar.f));
        }
    }

    public boolean o(r rVar) {
        return false;
    }

    public Parcelable p() {
        a aVar = new a();
        aVar.e = this.f.getSelectedItemId();
        aVar.f = r91.c(this.f.getBadgeDrawables());
        return aVar;
    }
}
