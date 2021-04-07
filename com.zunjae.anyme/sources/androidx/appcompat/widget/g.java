package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$drawable;
import androidx.appcompat.widget.w;

public final class g {
    /* access modifiers changed from: private */
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static g c;
    private w a;

    static class a implements w.e {
        private final int[] a = {R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};
        private final int[] b = {R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};
        private final int[] c = {R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl_dark, R$drawable.abc_text_select_handle_middle_mtrl_dark, R$drawable.abc_text_select_handle_right_mtrl_dark, R$drawable.abc_text_select_handle_left_mtrl_light, R$drawable.abc_text_select_handle_middle_mtrl_light, R$drawable.abc_text_select_handle_right_mtrl_light};
        private final int[] d = {R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};
        private final int[] f = {R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_btn_check_material_anim, R$drawable.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int b2 = b0.b(context, R$attr.colorControlHighlight);
            int a2 = b0.a(context, R$attr.colorButtonNormal);
            return new ColorStateList(new int[][]{b0.b, b0.d, b0.c, b0.f}, new int[]{a2, j2.i(b2, i), j2.i(b2, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, b0.b(context, R$attr.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, b0.b(context, R$attr.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d2 = b0.d(context, R$attr.colorSwitchThumbNormal);
            if (d2 == null || !d2.isStateful()) {
                iArr[0] = b0.b;
                iArr2[0] = b0.a(context, R$attr.colorSwitchThumbNormal);
                iArr[1] = b0.e;
                iArr2[1] = b0.b(context, R$attr.colorControlActivated);
                iArr[2] = b0.f;
                iArr2[2] = b0.b(context, R$attr.colorSwitchThumbNormal);
            } else {
                iArr[0] = b0.b;
                iArr2[0] = d2.getColorForState(iArr[0], 0);
                iArr[1] = b0.e;
                iArr2[1] = b0.b(context, R$attr.colorControlActivated);
                iArr[2] = b0.f;
                iArr2[2] = d2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (q.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = g.b;
            }
            drawable.setColorFilter(g.e(i, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.g.b
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = androidx.appcompat.R$attr.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = androidx.appcompat.R$attr.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = androidx.appcompat.R$drawable.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = androidx.appcompat.R$drawable.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.q.a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.b0.b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.g.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i) {
            if (i == R$drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(w wVar, Context context, int i) {
            if (i != R$drawable.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{wVar.j(context, R$drawable.abc_cab_background_internal_bg), wVar.j(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
        }

        public ColorStateList d(Context context, int i) {
            if (i == R$drawable.abc_edit_text_material) {
                return f.c(context, R$color.abc_tint_edittext);
            }
            if (i == R$drawable.abc_switch_track_mtrl_alpha) {
                return f.c(context, R$color.abc_tint_switch_track);
            }
            if (i == R$drawable.abc_switch_thumb_material) {
                return k(context);
            }
            if (i == R$drawable.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i == R$drawable.abc_btn_borderless_material) {
                return g(context);
            }
            if (i == R$drawable.abc_btn_colored_material) {
                return i(context);
            }
            if (i == R$drawable.abc_spinner_mtrl_am_alpha || i == R$drawable.abc_spinner_textfield_background_material) {
                return f.c(context, R$color.abc_tint_spinner);
            }
            if (f(this.b, i)) {
                return b0.d(context, R$attr.colorControlNormal);
            }
            if (f(this.e, i)) {
                return f.c(context, R$color.abc_tint_default);
            }
            if (f(this.f, i)) {
                return f.c(context, R$color.abc_tint_btn_checkable);
            }
            if (i == R$drawable.abc_seekbar_thumb_material) {
                return f.c(context, R$color.abc_tint_seek_thumb);
            }
            return null;
        }

        public boolean e(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == R$drawable.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(16908288), b0.b(context, R$attr.colorControlNormal), g.b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = R$attr.colorControlNormal;
            } else if (i != R$drawable.abc_ratingbar_material && i != R$drawable.abc_ratingbar_indicator_material && i != R$drawable.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(16908288), b0.a(context, R$attr.colorControlNormal), g.b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = R$attr.colorControlActivated;
            }
            l(findDrawableByLayerId, b0.b(context, i2), g.b);
            l(layerDrawable.findDrawableByLayerId(16908301), b0.b(context, R$attr.colorControlActivated), g.b);
            return true;
        }
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            if (c == null) {
                h();
            }
            gVar = c;
        }
        return gVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (g.class) {
            l = w.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (g.class) {
            if (c == null) {
                g gVar = new g();
                c = gVar;
                gVar.a = w.h();
                c.a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, e0 e0Var, int[] iArr) {
        w.w(drawable, e0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
