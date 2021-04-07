package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] j = {16842912};
    private boolean g;
    private boolean h;
    private boolean i;

    class a extends w3 {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            a5Var.b0(CheckableImageButton.this.a());
            a5Var.c0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends j5 {
        public static final Parcelable.Creator<b> CREATOR = new a();
        boolean g;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.g = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = true;
        this.i = true;
        o4.i0(this, new a());
    }

    public boolean a() {
        return this.h;
    }

    public boolean isChecked() {
        return this.g;
    }

    public int[] onCreateDrawableState(int i2) {
        return this.g ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + j.length), j) : super.onCreateDrawableState(i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.g = this.g;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.h != z) {
            this.h = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.h && this.g != z) {
            this.g = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.i = z;
    }

    public void setPressed(boolean z) {
        if (this.i) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.g);
    }
}
