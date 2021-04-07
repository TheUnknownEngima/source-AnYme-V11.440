package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.s;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class i<S> extends androidx.fragment.app.c {
    static final Object F0 = "CONFIRM_BUTTON_TAG";
    static final Object G0 = "CANCEL_BUTTON_TAG";
    static final Object H0 = "TOGGLE_BUTTON_TAG";
    private int A0;
    private TextView B0;
    /* access modifiers changed from: private */
    public CheckableImageButton C0;
    private ra1 D0;
    /* access modifiers changed from: private */
    public Button E0;
    /* access modifiers changed from: private */
    public final LinkedHashSet<j<? super S>> o0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */
    public final LinkedHashSet<View.OnClickListener> p0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> q0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> r0 = new LinkedHashSet<>();
    private int s0;
    /* access modifiers changed from: private */
    public d<S> t0;
    private p<S> u0;
    private a v0;
    private h<S> w0;
    private int x0;
    private CharSequence y0;
    private boolean z0;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Iterator it = i.this.o0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.j2());
            }
            i.this.L1();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            Iterator it = i.this.p0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.L1();
        }
    }

    class c extends o<S> {
        c() {
        }

        public void a(S s) {
            i.this.p2();
            i.this.E0.setEnabled(i.this.t0.k0());
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            i.this.E0.setEnabled(i.this.t0.k0());
            i.this.C0.toggle();
            i iVar = i.this;
            iVar.q2(iVar.C0);
            i.this.n2();
        }
    }

    private static Drawable f2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, f.d(context, R$drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], f.d(context, R$drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private static int g2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
        return dimensionPixelSize + dimensionPixelSize2 + (m.i * resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height)) + ((m.i - 1) * resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding);
    }

    private static int i2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
        int i = l.h().i;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding));
    }

    private int k2(Context context) {
        int i = this.s0;
        return i != 0 ? i : this.t0.e0(context);
    }

    private void l2(Context context) {
        this.C0.setTag(H0);
        this.C0.setImageDrawable(f2(context));
        this.C0.setChecked(this.A0 != 0);
        o4.i0(this.C0, (w3) null);
        q2(this.C0);
        this.C0.setOnClickListener(new d());
    }

    static boolean m2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ba1.c(context, R$attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    public void n2() {
        this.w0 = h.a2(this.t0, k2(o1()), this.v0);
        this.u0 = this.C0.isChecked() ? k.L1(this.t0, this.v0) : this.w0;
        p2();
        s j = t().j();
        j.q(R$id.mtrl_calendar_frame, this.u0);
        j.k();
        this.u0.J1(new c());
    }

    public static long o2() {
        return l.h().k;
    }

    /* access modifiers changed from: private */
    public void p2() {
        String h2 = h2();
        this.B0.setContentDescription(String.format(O(R$string.mtrl_picker_announce_current_selection), new Object[]{h2}));
        this.B0.setText(h2);
    }

    /* access modifiers changed from: private */
    public void q2(CheckableImageButton checkableImageButton) {
        this.C0.setContentDescription(checkableImageButton.getContext().getString(this.C0.isChecked() ? R$string.mtrl_picker_toggle_to_calendar_input_mode : R$string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.s0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.t0);
        a.b bVar = new a.b(this.v0);
        if (this.w0.W1() != null) {
            bVar.b(this.w0.W1().k);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.x0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.y0);
    }

    public void K0() {
        super.K0();
        Window window = Q1().getWindow();
        if (this.z0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.D0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = I().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.D0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new u91(Q1(), rect));
        }
        n2();
    }

    public void L0() {
        this.u0.K1();
        super.L0();
    }

    public final Dialog P1(Bundle bundle) {
        Dialog dialog = new Dialog(o1(), k2(o1()));
        Context context = dialog.getContext();
        this.z0 = m2(context);
        int c2 = ba1.c(context, R$attr.colorSurface, i.class.getCanonicalName());
        ra1 ra1 = new ra1(context, (AttributeSet) null, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
        this.D0 = ra1;
        ra1.N(context);
        this.D0.Y(ColorStateList.valueOf(c2));
        this.D0.X(o4.t(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String h2() {
        return this.t0.r(u());
    }

    public final S j2() {
        return this.t0.u0();
    }

    public final void n0(Bundle bundle) {
        super.n0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.s0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.t0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.v0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.x0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.y0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.A0 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.r0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) Q();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.z0 ? R$layout.mtrl_picker_fullscreen : R$layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.z0) {
            inflate.findViewById(R$id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(i2(context), -2));
        } else {
            View findViewById = inflate.findViewById(R$id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R$id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(i2(context), -1));
            findViewById2.setMinimumHeight(g2(o1()));
        }
        TextView textView = (TextView) inflate.findViewById(R$id.mtrl_picker_header_selection_text);
        this.B0 = textView;
        o4.k0(textView, 1);
        this.C0 = (CheckableImageButton) inflate.findViewById(R$id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R$id.mtrl_picker_title_text);
        CharSequence charSequence = this.y0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.x0);
        }
        l2(context);
        this.E0 = (Button) inflate.findViewById(R$id.confirm_button);
        if (this.t0.k0()) {
            this.E0.setEnabled(true);
        } else {
            this.E0.setEnabled(false);
        }
        this.E0.setTag(F0);
        this.E0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R$id.cancel_button);
        button.setTag(G0);
        button.setOnClickListener(new b());
        return inflate;
    }
}
