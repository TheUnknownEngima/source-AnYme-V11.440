package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.mikepenz.materialdrawer.R$color;
import com.mikepenz.materialdrawer.R$dimen;
import com.mikepenz.materialdrawer.R$styleable;
import defpackage.mn1;

@SuppressLint({"InlinedApi"})
/* renamed from: no1  reason: default package */
public class no1 {
    public static boolean a(Context context, int i, boolean z) {
        return context.getTheme().obtainStyledAttributes(R$styleable.MaterialDrawer).getBoolean(i, z);
    }

    public static int b(Context context) {
        return Math.min(to1.e(context) - to1.b(context), context.getResources().getDimensionPixelSize(R$dimen.material_drawer_width));
    }

    public static Drawable c(Context context) {
        tm1 tm1 = new tm1(context, mn1.a.mdf_person);
        tm1.j(R$color.accent);
        tm1.d(R$color.primary);
        tm1.E(56);
        tm1.w(16);
        return tm1;
    }

    public static ColorStateList d(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{i2, i});
    }

    public static boolean e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return !(displayMetrics.widthPixels != displayMetrics.heightPixels && context.getResources().getConfiguration().smallestScreenWidthDp < 600) || displayMetrics.widthPixels < displayMetrics.heightPixels;
    }

    public static void f(View view) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.material_drawer_vertical_padding);
        view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public static void g(View view, int i) {
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.material_drawer_vertical_padding);
        int i2 = i * dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, 0, dimensionPixelSize, 0);
        } else {
            view.setPadding(i2, 0, dimensionPixelSize, 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.graphics.drawable.StateListDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.graphics.drawable.RippleDrawable} */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.graphics.drawable.ColorDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(android.content.Context r12, android.view.View r13, int r14, boolean r15) {
        /*
            int r0 = com.mikepenz.materialdrawer.R$styleable.MaterialDrawer_material_drawer_legacy_style
            r1 = 0
            boolean r0 = a(r12, r0, r1)
            r2 = 17694720(0x10e0000, float:2.608128E-38)
            r3 = 1
            if (r0 == 0) goto L_0x0017
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r14)
            android.graphics.drawable.Drawable r14 = defpackage.to1.f(r12)
            goto L_0x00ca
        L_0x0017:
            android.content.res.Resources r0 = r12.getResources()
            int r4 = com.mikepenz.materialdrawer.R$dimen.material_drawer_item_corner_radius
            int r0 = r0.getDimensionPixelSize(r4)
            android.content.res.Resources r4 = r12.getResources()
            int r5 = com.mikepenz.materialdrawer.R$dimen.material_drawer_item_background_padding_top_bottom
            int r4 = r4.getDimensionPixelSize(r5)
            android.content.res.Resources r5 = r12.getResources()
            int r6 = com.mikepenz.materialdrawer.R$dimen.material_drawer_item_background_padding_start_end
            int r5 = r5.getDimensionPixelSize(r6)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r7.setColor(r14)
            float r14 = (float) r0
            r7.setCornerRadius(r14)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r6 = r0
            r8 = r5
            r9 = r4
            r10 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r6 < r7) goto L_0x0085
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setColor(r6)
            r7.setCornerRadius(r14)
            android.graphics.drawable.InsetDrawable r14 = new android.graphics.drawable.InsetDrawable
            r6 = r14
            r8 = r5
            r9 = r4
            r10 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            int[][] r6 = new int[r3][]
            int[] r7 = new int[r1]
            r6[r1] = r7
            int[] r7 = new int[r3]
            int r8 = com.mikepenz.materialdrawer.R$attr.colorControlHighlight
            int r8 = defpackage.to1.l(r12, r8)
            r7[r1] = r8
            r5.<init>(r6, r7)
            r6 = 0
            r4.<init>(r5, r6, r14)
        L_0x0083:
            r14 = r4
            goto L_0x00ca
        L_0x0085:
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            int r6 = com.mikepenz.materialdrawer.R$attr.colorControlHighlight
            int r6 = defpackage.to1.l(r12, r6)
            r7.setColor(r6)
            r7.setCornerRadius(r14)
            android.graphics.drawable.InsetDrawable r14 = new android.graphics.drawable.InsetDrawable
            r6 = r14
            r8 = r5
            r9 = r4
            r10 = r5
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            android.graphics.drawable.StateListDrawable r4 = new android.graphics.drawable.StateListDrawable
            r4.<init>()
            if (r15 == 0) goto L_0x00b5
            android.content.res.Resources r5 = r12.getResources()
            int r5 = r5.getInteger(r2)
            r4.setEnterFadeDuration(r5)
            r4.setExitFadeDuration(r5)
        L_0x00b5:
            int[] r5 = new int[r3]
            r6 = 16842919(0x10100a7, float:2.3694026E-38)
            r5[r1] = r6
            r4.addState(r5, r14)
            int[] r14 = new int[r1]
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>(r1)
            r4.addState(r14, r5)
            goto L_0x0083
        L_0x00ca:
            android.graphics.drawable.StateListDrawable r4 = new android.graphics.drawable.StateListDrawable
            r4.<init>()
            if (r15 == 0) goto L_0x00df
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getInteger(r2)
            r4.setEnterFadeDuration(r12)
            r4.setExitFadeDuration(r12)
        L_0x00df:
            int r12 = android.os.Build.VERSION.SDK_INT
            r15 = 23
            r2 = 16842913(0x10100a1, float:2.369401E-38)
            if (r12 < r15) goto L_0x0100
            int[] r12 = new int[r3]
            r12[r1] = r2
            r4.addState(r12, r0)
            int[] r12 = new int[r1]
            android.graphics.drawable.ColorDrawable r15 = new android.graphics.drawable.ColorDrawable
            r15.<init>(r1)
            r4.addState(r12, r15)
            defpackage.o4.l0(r13, r4)
            r13.setForeground(r14)
            goto L_0x010f
        L_0x0100:
            int[] r12 = new int[r3]
            r12[r1] = r2
            r4.addState(r12, r0)
            int[] r12 = new int[r1]
            r4.addState(r12, r14)
            defpackage.o4.l0(r13, r4)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no1.h(android.content.Context, android.view.View, int, boolean):void");
    }
}
