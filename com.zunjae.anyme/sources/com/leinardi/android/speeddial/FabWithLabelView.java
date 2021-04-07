package com.leinardi.android.speeddial;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.leinardi.android.speeddial.SpeedDialView;
import com.leinardi.android.speeddial.a;

public class FabWithLabelView extends LinearLayout {
    private static final String n = FabWithLabelView.class.getSimpleName();
    private TextView e;
    private FloatingActionButton f;
    private CardView g;
    private boolean h;
    private a i;
    /* access modifiers changed from: private */
    public SpeedDialView.h j;
    private int k;
    private float l;
    private Drawable m;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            a speedDialActionItem = FabWithLabelView.this.getSpeedDialActionItem();
            if (FabWithLabelView.this.j != null && speedDialActionItem != null) {
                b.h(speedDialActionItem.y() ? FabWithLabelView.this.getLabelBackground() : FabWithLabelView.this.getFab());
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            a speedDialActionItem = FabWithLabelView.this.getSpeedDialActionItem();
            if (FabWithLabelView.this.j != null && speedDialActionItem != null) {
                FabWithLabelView.this.j.a(speedDialActionItem);
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            a speedDialActionItem = FabWithLabelView.this.getSpeedDialActionItem();
            if (FabWithLabelView.this.j != null && speedDialActionItem != null && speedDialActionItem.y()) {
                FabWithLabelView.this.j.a(speedDialActionItem);
            }
        }
    }

    public FabWithLabelView(Context context) {
        super(context);
        b(context, (AttributeSet) null);
    }

    public FabWithLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public FabWithLabelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        View inflate = LinearLayout.inflate(context, R$layout.sd_fab_with_label_view, this);
        this.f = (FloatingActionButton) inflate.findViewById(R$id.fab);
        this.e = (TextView) inflate.findViewById(R$id.label);
        this.g = (CardView) inflate.findViewById(R$id.label_container);
        setFabSize(1);
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FabWithLabelView, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.FabWithLabelView_srcCompat, Integer.MIN_VALUE);
            if (resourceId == Integer.MIN_VALUE) {
                resourceId = obtainStyledAttributes.getResourceId(R$styleable.FabWithLabelView_android_src, Integer.MIN_VALUE);
            }
            a.b bVar = new a.b(getId(), resourceId);
            bVar.o(obtainStyledAttributes.getString(R$styleable.FabWithLabelView_fabLabel));
            bVar.n(obtainStyledAttributes.getColor(R$styleable.FabWithLabelView_fabBackgroundColor, b.f(context)));
            bVar.r(obtainStyledAttributes.getColor(R$styleable.FabWithLabelView_fabLabelColor, Integer.MIN_VALUE));
            bVar.p(obtainStyledAttributes.getColor(R$styleable.FabWithLabelView_fabLabelBackgroundColor, Integer.MIN_VALUE));
            bVar.q(obtainStyledAttributes.getBoolean(R$styleable.FabWithLabelView_fabLabelClickable, true));
            setSpeedDialActionItem(bVar.m());
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
    }

    private void setFabBackgroundColor(int i2) {
        this.f.setBackgroundTintList(ColorStateList.valueOf(i2));
    }

    private void setFabIcon(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    private void setFabSize(int i2) {
        LinearLayout.LayoutParams layoutParams;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.sd_fab_normal_size);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R$dimen.sd_fab_mini_size);
        int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R$dimen.sd_fab_side_margin);
        int i3 = i2 == 0 ? dimensionPixelSize : dimensionPixelSize2;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        if (getOrientation() == 0) {
            layoutParams = new LinearLayout.LayoutParams(-2, i3);
            layoutParams.gravity = 8388613;
            if (i2 == 0) {
                dimensionPixelSize3 -= (dimensionPixelSize - dimensionPixelSize2) / 2;
            }
            layoutParams2.setMargins(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i3, -2);
            layoutParams.gravity = 16;
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        setLayoutParams(layoutParams);
        this.f.setLayoutParams(layoutParams2);
        this.k = i2;
    }

    private void setLabel(CharSequence charSequence) {
        boolean z = false;
        if (!TextUtils.isEmpty(charSequence)) {
            this.e.setText(charSequence);
            if (getOrientation() == 0) {
                z = true;
            }
        }
        setLabelEnabled(z);
    }

    private void setLabelBackgroundColor(int i2) {
        Drawable drawable;
        if (i2 == 0) {
            this.g.setCardBackgroundColor(0);
            if (Build.VERSION.SDK_INT >= 21) {
                this.l = this.g.getElevation();
                this.g.setElevation(Utils.FLOAT_EPSILON);
                return;
            }
            this.g.setBackgroundColor(0);
            drawable = this.g.getBackground();
        } else {
            this.g.setCardBackgroundColor(ColorStateList.valueOf(i2));
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 21) {
                float f2 = this.l;
                if (f2 != Utils.FLOAT_EPSILON) {
                    this.g.setElevation(f2);
                    this.l = Utils.FLOAT_EPSILON;
                    return;
                }
                return;
            }
            Drawable drawable2 = this.m;
            if (drawable2 != null) {
                if (i3 >= 16) {
                    this.g.setBackground(drawable2);
                } else {
                    this.g.setBackgroundDrawable(drawable2);
                }
                drawable = null;
            } else {
                return;
            }
        }
        this.m = drawable;
    }

    private void setLabelClickable(boolean z) {
        getLabelBackground().setClickable(z);
        getLabelBackground().setFocusable(z);
        getLabelBackground().setEnabled(z);
    }

    private void setLabelColor(int i2) {
        this.e.setTextColor(i2);
    }

    private void setLabelEnabled(boolean z) {
        this.h = z;
        this.g.setVisibility(z ? 0 : 8);
    }

    public boolean c() {
        return this.h;
    }

    public FloatingActionButton getFab() {
        return this.f;
    }

    public CardView getLabelBackground() {
        return this.g;
    }

    public a getSpeedDialActionItem() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("SpeedDialActionItem not set yet!");
    }

    public a.b getSpeedDialActionItemBuilder() {
        return new a.b(getSpeedDialActionItem());
    }

    public void setOnActionSelectedListener(SpeedDialView.h hVar) {
        CardView cardView;
        c cVar;
        this.j = hVar;
        if (hVar != null) {
            setOnClickListener(new a());
            getFab().setOnClickListener(new b());
            cardView = getLabelBackground();
            cVar = new c();
        } else {
            cVar = null;
            getFab().setOnClickListener((View.OnClickListener) null);
            cardView = getLabelBackground();
        }
        cardView.setOnClickListener(cVar);
    }

    public void setOrientation(int i2) {
        super.setOrientation(i2);
        setFabSize(this.k);
        if (i2 == 1) {
            setLabelEnabled(false);
        } else {
            setLabel(this.e.getText().toString());
        }
    }

    public void setSpeedDialActionItem(a aVar) {
        FloatingActionButton floatingActionButton;
        this.i = aVar;
        setId(aVar.s());
        setLabel(aVar.u(getContext()));
        a speedDialActionItem = getSpeedDialActionItem();
        int i2 = 1;
        setLabelClickable(speedDialActionItem != null && speedDialActionItem.y());
        int p = aVar.p();
        Drawable o = aVar.o(getContext());
        if (!(o == null || p == Integer.MIN_VALUE)) {
            o = androidx.core.graphics.drawable.a.r(o);
            androidx.core.graphics.drawable.a.n(o.mutate(), p);
        }
        setFabIcon(o);
        int n2 = aVar.n();
        if (n2 == Integer.MIN_VALUE) {
            n2 = b.f(getContext());
        }
        setFabBackgroundColor(n2);
        int w = aVar.w();
        if (w == Integer.MIN_VALUE) {
            w = h2.a(getResources(), R$color.sd_label_text_color, getContext().getTheme());
        }
        setLabelColor(w);
        int v = aVar.v();
        if (v == Integer.MIN_VALUE) {
            v = h2.a(getResources(), R$color.cardview_light_background, getContext().getTheme());
        }
        setLabelBackgroundColor(v);
        if (aVar.q() == -1) {
            floatingActionButton = getFab();
        } else {
            floatingActionButton = getFab();
            i2 = aVar.q();
        }
        floatingActionButton.setSize(i2);
        setFabSize(aVar.q());
    }

    @SuppressLint({"RestrictedApi"})
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        getFab().setVisibility(i2);
        if (c()) {
            getLabelBackground().setVisibility(i2);
        }
    }
}
