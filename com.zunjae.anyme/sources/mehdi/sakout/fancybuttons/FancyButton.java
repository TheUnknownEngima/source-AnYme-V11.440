package mehdi.sakout.fancybuttons;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FancyButton extends LinearLayout {
    public static final String Q = FancyButton.class.getSimpleName();
    private int A = 0;
    private int B = 0;
    private int C = 0;
    private int D = 0;
    private boolean E = true;
    private boolean F = false;
    private Typeface G = null;
    private Typeface H = null;
    private String I = "fontawesome.ttf";
    private String J = "robotoregular.ttf";
    private ImageView K;
    private TextView L;
    private TextView M;
    private boolean N = false;
    private boolean O = false;
    private boolean P = true;
    private Context e;
    private int f = -16777216;
    private int g = 0;
    private int h = Color.parseColor("#f6f7f9");
    private int i = Color.parseColor("#bec2c9");
    private int j = Color.parseColor("#dddfe2");
    private int k = -1;
    private int l = -1;
    private int m = a.c(getContext(), 15.0f);
    private int n = 17;
    private String o = null;
    private Drawable p = null;
    private int q = a.c(getContext(), 15.0f);
    private String r = null;
    private int s = 1;
    private int t = 10;
    private int u = 10;
    private int v = 0;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    /* access modifiers changed from: private */
    public int z = 0;

    @TargetApi(21)
    private class a extends ViewOutlineProvider {
        int a;
        int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void getOutline(View view, Outline outline) {
            if (FancyButton.this.z == 0) {
                outline.setRect(0, 10, this.a, this.b);
                return;
            }
            outline.setRoundRect(0, 10, this.a, this.b, (float) FancyButton.this.z);
        }
    }

    public FancyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FancyButtonsAttrs, 0, 0);
        d(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        f();
    }

    private void b(GradientDrawable gradientDrawable) {
        int i2 = this.z;
        if (i2 > 0) {
            gradientDrawable.setCornerRadius((float) i2);
            return;
        }
        int i3 = this.A;
        int i4 = this.B;
        int i5 = this.D;
        int i6 = this.C;
        gradientDrawable.setCornerRadii(new float[]{(float) i3, (float) i3, (float) i4, (float) i4, (float) i5, (float) i5, (float) i6, (float) i6});
    }

    @TargetApi(21)
    private Drawable c(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        return !this.E ? drawable3 : new RippleDrawable(ColorStateList.valueOf(this.g), drawable, drawable2);
    }

    private void d(TypedArray typedArray) {
        this.f = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_defaultColor, this.f);
        this.g = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_focusColor, this.g);
        this.h = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_disabledColor, this.h);
        this.E = typedArray.getBoolean(R$styleable.FancyButtonsAttrs_android_enabled, true);
        this.i = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_disabledTextColor, this.i);
        this.j = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_disabledBorderColor, this.j);
        int color = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_textColor, this.k);
        this.k = color;
        this.l = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_iconColor, color);
        int dimension = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_textSize, (float) this.m);
        this.m = dimension;
        this.m = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_android_textSize, (float) dimension);
        this.n = typedArray.getInt(R$styleable.FancyButtonsAttrs_fb_textGravity, this.n);
        this.x = typedArray.getColor(R$styleable.FancyButtonsAttrs_fb_borderColor, this.x);
        this.y = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_borderWidth, (float) this.y);
        int dimension2 = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_radius, (float) this.z);
        this.z = dimension2;
        this.A = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_radiusTopLeft, (float) dimension2);
        this.B = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_radiusTopRight, (float) this.z);
        this.C = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_radiusBottomLeft, (float) this.z);
        this.D = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_radiusBottomRight, (float) this.z);
        this.q = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_fontIconSize, (float) this.q);
        this.t = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_iconPaddingLeft, (float) this.t);
        this.u = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_iconPaddingRight, (float) this.u);
        this.v = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_iconPaddingTop, (float) this.v);
        this.w = (int) typedArray.getDimension(R$styleable.FancyButtonsAttrs_fb_iconPaddingBottom, (float) this.w);
        this.F = typedArray.getBoolean(R$styleable.FancyButtonsAttrs_fb_textAllCaps, false);
        this.F = typedArray.getBoolean(R$styleable.FancyButtonsAttrs_android_textAllCaps, false);
        this.N = typedArray.getBoolean(R$styleable.FancyButtonsAttrs_fb_ghost, this.N);
        this.O = typedArray.getBoolean(R$styleable.FancyButtonsAttrs_fb_useSystemFont, this.O);
        String string = typedArray.getString(R$styleable.FancyButtonsAttrs_fb_text);
        if (string == null) {
            string = typedArray.getString(R$styleable.FancyButtonsAttrs_android_text);
        }
        this.s = typedArray.getInt(R$styleable.FancyButtonsAttrs_fb_iconPosition, this.s);
        String string2 = typedArray.getString(R$styleable.FancyButtonsAttrs_fb_fontIconResource);
        String string3 = typedArray.getString(R$styleable.FancyButtonsAttrs_fb_iconFont);
        String string4 = typedArray.getString(R$styleable.FancyButtonsAttrs_fb_textFont);
        try {
            this.p = typedArray.getDrawable(R$styleable.FancyButtonsAttrs_fb_iconResource);
        } catch (Exception unused) {
            this.p = null;
        }
        if (string2 != null) {
            this.r = string2;
        }
        if (string != null) {
            if (this.F) {
                string = string.toUpperCase();
            }
            this.o = string;
        }
        if (!isInEditMode()) {
            Context context = this.e;
            String str = this.I;
            this.H = string3 != null ? a.a(context, string3, str) : a.a(context, str, (String) null);
            Context context2 = this.e;
            String str2 = this.J;
            this.G = string4 != null ? a.a(context2, string4, str2) : a.a(context2, str2, (String) null);
        }
    }

    private void e() {
        int i2 = this.s;
        if (i2 == 3 || i2 == 4) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        setGravity(17);
        setClickable(true);
        setFocusable(true);
        if (this.p == null && this.r == null && getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
            setPadding(20, 20, 20, 20);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r3 = this;
            r3.e()
            android.widget.TextView r0 = r3.j()
            r3.M = r0
            android.widget.ImageView r0 = r3.i()
            r3.K = r0
            android.widget.TextView r0 = r3.h()
            r3.L = r0
            r3.removeAllViews()
            r3.g()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.s
            r2 = 1
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 != r2) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            android.widget.TextView r1 = r3.M
            if (r1 == 0) goto L_0x0030
            r0.add(r1)
        L_0x0030:
            android.widget.ImageView r1 = r3.K
            if (r1 == 0) goto L_0x0037
            r0.add(r1)
        L_0x0037:
            android.widget.TextView r1 = r3.L
            if (r1 == 0) goto L_0x0051
            goto L_0x004e
        L_0x003c:
            android.widget.ImageView r1 = r3.K
            if (r1 == 0) goto L_0x0043
            r0.add(r1)
        L_0x0043:
            android.widget.TextView r1 = r3.L
            if (r1 == 0) goto L_0x004a
            r0.add(r1)
        L_0x004a:
            android.widget.TextView r1 = r3.M
            if (r1 == 0) goto L_0x0051
        L_0x004e:
            r0.add(r1)
        L_0x0051:
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r3.addView(r1)
            goto L_0x0055
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mehdi.sakout.fancybuttons.FancyButton.f():void");
    }

    @SuppressLint({"NewApi"})
    private void g() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        b(gradientDrawable);
        gradientDrawable.setColor(this.N ? getResources().getColor(17170445) : this.f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        b(gradientDrawable2);
        gradientDrawable2.setColor(this.g);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        b(gradientDrawable3);
        gradientDrawable3.setColor(this.h);
        gradientDrawable3.setStroke(this.y, this.j);
        int i2 = this.x;
        if (i2 != 0) {
            gradientDrawable.setStroke(this.y, i2);
        }
        if (!this.E) {
            gradientDrawable.setStroke(this.y, this.j);
            if (this.N) {
                gradientDrawable3.setColor(getResources().getColor(17170445));
            }
        }
        if (!this.P || Build.VERSION.SDK_INT < 21) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            b(gradientDrawable4);
            gradientDrawable4.setColor(this.N ? getResources().getColor(17170445) : this.g);
            int i3 = this.x;
            if (i3 != 0) {
                if (this.N) {
                    gradientDrawable4.setStroke(this.y, this.g);
                } else {
                    gradientDrawable4.setStroke(this.y, i3);
                }
            }
            if (!this.E) {
                boolean z2 = this.N;
                gradientDrawable4.setStroke(this.y, this.j);
            }
            if (this.g != 0) {
                stateListDrawable.addState(new int[]{16842919}, gradientDrawable4);
                stateListDrawable.addState(new int[]{16842908}, gradientDrawable4);
                stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
            }
            stateListDrawable.addState(new int[0], gradientDrawable);
            if (Build.VERSION.SDK_INT < 16) {
                setBackgroundDrawable(stateListDrawable);
            } else {
                setBackground(stateListDrawable);
            }
        } else {
            setBackground(c(gradientDrawable, gradientDrawable2, gradientDrawable3));
        }
    }

    private TextView h() {
        if (this.r == null) {
            return null;
        }
        TextView textView = new TextView(this.e);
        textView.setTextColor(this.E ? this.l : this.i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = this.u;
        layoutParams.leftMargin = this.t;
        layoutParams.topMargin = this.v;
        layoutParams.bottomMargin = this.w;
        if (this.M != null) {
            int i2 = this.s;
            if (i2 == 3 || i2 == 4) {
                layoutParams.gravity = 17;
                textView.setGravity(17);
            } else {
                textView.setGravity(16);
                layoutParams.gravity = 16;
            }
        } else {
            layoutParams.gravity = 17;
            textView.setGravity(16);
        }
        textView.setLayoutParams(layoutParams);
        if (!isInEditMode()) {
            textView.setTextSize((float) a.b(getContext(), (float) this.q));
            textView.setText(this.r);
            textView.setTypeface(this.H);
        } else {
            textView.setTextSize((float) a.b(getContext(), (float) this.q));
            textView.setText("O");
        }
        return textView;
    }

    private ImageView i() {
        if (this.p == null) {
            return null;
        }
        ImageView imageView = new ImageView(this.e);
        imageView.setImageDrawable(this.p);
        imageView.setPadding(this.t, this.v, this.u, this.w);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.M != null) {
            int i2 = this.s;
            layoutParams.gravity = (i2 == 3 || i2 == 4) ? 17 : 8388611;
            layoutParams.rightMargin = 10;
            layoutParams.leftMargin = 10;
        } else {
            layoutParams.gravity = 16;
        }
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private TextView j() {
        if (this.o == null) {
            this.o = "Fancy Button";
        }
        TextView textView = new TextView(this.e);
        textView.setText(this.o);
        textView.setGravity(this.n);
        textView.setTextColor(this.E ? this.k : this.i);
        textView.setTextSize((float) a.b(getContext(), (float) this.m));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (!isInEditMode() && !this.O) {
            textView.setTypeface(this.G);
        }
        return textView;
    }

    public TextView getIconFontObject() {
        return this.L;
    }

    public ImageView getIconImageObject() {
        return this.K;
    }

    public CharSequence getText() {
        TextView textView = this.M;
        return textView != null ? textView.getText() : "";
    }

    public TextView getTextViewObject() {
        return this.M;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a(i2, i3));
        }
    }

    public void setBackgroundColor(int i2) {
        this.f = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setBorderColor(int i2) {
        this.x = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setBorderWidth(int i2) {
        this.y = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setCustomIconFont(String str) {
        Typeface a2 = a.a(this.e, str, this.I);
        this.H = a2;
        TextView textView = this.L;
        if (textView == null) {
            f();
        } else {
            textView.setTypeface(a2);
        }
    }

    public void setCustomTextFont(String str) {
        Typeface a2 = a.a(this.e, str, this.J);
        this.G = a2;
        TextView textView = this.M;
        if (textView == null) {
            f();
        } else {
            textView.setTypeface(a2);
        }
    }

    public void setDisableBackgroundColor(int i2) {
        this.h = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setDisableBorderColor(int i2) {
        this.j = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setDisableTextColor(int i2) {
        this.i = i2;
        TextView textView = this.M;
        if (textView == null) {
            f();
        } else if (!this.E) {
            textView.setTextColor(i2);
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.E = z2;
        f();
    }

    public void setFocusBackgroundColor(int i2) {
        this.g = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setFontIconSize(int i2) {
        float f2 = (float) i2;
        this.q = a.c(getContext(), f2);
        TextView textView = this.L;
        if (textView != null) {
            textView.setTextSize(f2);
        }
    }

    public void setGhost(boolean z2) {
        this.N = z2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setIconColor(int i2) {
        TextView textView = this.L;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setIconPosition(int i2) {
        if (i2 <= 0 || i2 >= 5) {
            i2 = 1;
        }
        this.s = i2;
        f();
    }

    public void setIconResource(int i2) {
        Drawable drawable = this.e.getResources().getDrawable(i2);
        this.p = drawable;
        ImageView imageView = this.K;
        if (imageView == null || this.L != null) {
            this.L = null;
            f();
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setIconResource(Drawable drawable) {
        this.p = drawable;
        ImageView imageView = this.K;
        if (imageView == null || this.L != null) {
            this.L = null;
            f();
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public void setIconResource(String str) {
        this.r = str;
        TextView textView = this.L;
        if (textView == null) {
            this.K = null;
            f();
            return;
        }
        textView.setText(str);
    }

    public void setRadius(int i2) {
        this.z = i2;
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setRadius(int[] iArr) {
        this.A = iArr[0];
        this.B = iArr[1];
        this.C = iArr[2];
        this.D = iArr[3];
        if (this.K != null || this.L != null || this.M != null) {
            g();
        }
    }

    public void setText(String str) {
        if (this.F) {
            str = str.toUpperCase();
        }
        this.o = str;
        TextView textView = this.M;
        if (textView == null) {
            f();
        } else {
            textView.setText(str);
        }
    }

    public void setTextAllCaps(boolean z2) {
        this.F = z2;
        setText(this.o);
    }

    public void setTextColor(int i2) {
        this.k = i2;
        TextView textView = this.M;
        if (textView == null) {
            f();
        } else {
            textView.setTextColor(i2);
        }
    }

    public void setTextGravity(int i2) {
        this.n = i2;
        if (this.M != null) {
            setGravity(i2);
        }
    }

    public void setTextSize(int i2) {
        float f2 = (float) i2;
        this.m = a.c(getContext(), f2);
        TextView textView = this.M;
        if (textView != null) {
            textView.setTextSize(f2);
        }
    }

    public void setUsingSystemFont(boolean z2) {
        this.O = z2;
    }
}
