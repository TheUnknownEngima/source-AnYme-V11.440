package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {
    int T;
    int U;
    private int V;
    private int W;
    boolean X;
    SeekBar Y;
    private TextView Z;
    boolean a0;
    private boolean b0;
    boolean c0;
    private SeekBar.OnSeekBarChangeListener d0;
    private View.OnKeyListener e0;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.c0 || !seekBarPreference.X) {
                    SeekBarPreference.this.Z0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.a1(i + seekBarPreference2.U);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.X = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.X = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.U != seekBarPreference.T) {
                seekBarPreference.Z0(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if ((!SeekBarPreference.this.a0 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = SeekBarPreference.this.Y) == null) {
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    private static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();
        int e;
        int f;
        int g;

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
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d0 = new a();
        this.e0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SeekBarPreference, i, i2);
        this.U = obtainStyledAttributes.getInt(R$styleable.SeekBarPreference_min, 0);
        V0(obtainStyledAttributes.getInt(R$styleable.SeekBarPreference_android_max, 100));
        W0(obtainStyledAttributes.getInt(R$styleable.SeekBarPreference_seekBarIncrement, 0));
        this.a0 = obtainStyledAttributes.getBoolean(R$styleable.SeekBarPreference_adjustable, true);
        this.b0 = obtainStyledAttributes.getBoolean(R$styleable.SeekBarPreference_showSeekBarValue, false);
        this.c0 = obtainStyledAttributes.getBoolean(R$styleable.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    private void Y0(int i, boolean z) {
        int i2 = this.U;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.V;
        if (i > i3) {
            i = i3;
        }
        if (i != this.T) {
            this.T = i;
            a1(i);
            v0(i);
            if (z) {
                V();
            }
        }
    }

    public final void V0(int i) {
        int i2 = this.U;
        if (i < i2) {
            i = i2;
        }
        if (i != this.V) {
            this.V = i;
            V();
        }
    }

    public final void W0(int i) {
        if (i != this.W) {
            this.W = Math.min(this.V - this.U, Math.abs(i));
            V();
        }
    }

    public void X0(int i) {
        Y0(i, true);
    }

    /* access modifiers changed from: package-private */
    public void Z0(SeekBar seekBar) {
        int progress = this.U + seekBar.getProgress();
        if (progress == this.T) {
            return;
        }
        if (e(Integer.valueOf(progress))) {
            Y0(progress, false);
            return;
        }
        seekBar.setProgress(this.T - this.U);
        a1(this.T);
    }

    /* access modifiers changed from: package-private */
    public void a1(int i) {
        TextView textView = this.Z;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public void c0(l lVar) {
        super.c0(lVar);
        lVar.e.setOnKeyListener(this.e0);
        this.Y = (SeekBar) lVar.M(R$id.seekbar);
        TextView textView = (TextView) lVar.M(R$id.seekbar_value);
        this.Z = textView;
        if (this.b0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.Z = null;
        }
        SeekBar seekBar = this.Y;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.d0);
            this.Y.setMax(this.V - this.U);
            int i = this.W;
            if (i != 0) {
                this.Y.setKeyProgressIncrement(i);
            } else {
                this.W = this.Y.getKeyProgressIncrement();
            }
            this.Y.setProgress(this.T - this.U);
            a1(this.T);
            this.Y.setEnabled(Q());
        }
    }

    /* access modifiers changed from: protected */
    public Object g0(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* access modifiers changed from: protected */
    public void l0(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.l0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.l0(cVar.getSuperState());
        this.T = cVar.e;
        this.U = cVar.f;
        this.V = cVar.g;
        V();
    }

    /* access modifiers changed from: protected */
    public Parcelable m0() {
        Parcelable m0 = super.m0();
        if (S()) {
            return m0;
        }
        c cVar = new c(m0);
        cVar.e = this.T;
        cVar.f = this.U;
        cVar.g = this.V;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        X0(E(((Integer) obj).intValue()));
    }
}
