package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {
    private final View.OnClickListener A;
    /* access modifiers changed from: private */
    public c B;
    /* access modifiers changed from: private */
    public d C;
    private final Chip x;
    private final Chip y;
    private final MaterialButtonToggleGroup z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.C != null) {
                TimePickerView.this.C.a(((Integer) view.getTag(R$id.selection_type)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == R$id.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.B != null && z) {
                TimePickerView.this.B.a(i2);
            }
        }
    }

    interface c {
        void a(int i);
    }

    interface d {
        void a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new a();
        LayoutInflater.from(context).inflate(R$layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R$id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R$id.material_clock_period_toggle);
        this.z = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.x = (Chip) findViewById(R$id.material_minute_tv);
        this.y = (Chip) findViewById(R$id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R$id.material_clock_hand);
        E();
    }

    private void E() {
        this.x.setTag(R$id.selection_type, 12);
        this.y.setTag(R$id.selection_type, 10);
        this.x.setOnClickListener(this.A);
        this.y.setOnClickListener(this.A);
    }

    private void F() {
        if (this.z.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.j(this);
            int i = 1;
            if (o4.y(this) == 0) {
                i = 2;
            }
            cVar.h(R$id.material_clock_display, i);
            cVar.d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        F();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            F();
        }
    }
}
