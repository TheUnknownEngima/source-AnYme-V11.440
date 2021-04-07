package ru.dimorinny.floatingtextbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public class FloatingTextButton extends FrameLayout {
    /* access modifiers changed from: private */
    public CardView e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private String i;
    private int j;
    private Drawable k;
    private Drawable l;
    private int m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            FloatingTextButton.this.e.setRadius((float) (FloatingTextButton.this.e.getHeight() / 2));
        }
    }

    public FloatingTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
        e(attributeSet);
        f();
    }

    private int b(int i2) {
        return Build.VERSION.SDK_INT < 21 ? tj2.a(getContext(), i2) / 2 : tj2.a(getContext(), i2);
    }

    private int c(int i2) {
        return Build.VERSION.SDK_INT < 21 ? tj2.a(getContext(), i2) / 4 : tj2.a(getContext(), i2);
    }

    private void d(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.widget_floating_text_button, this, true);
        this.e = (CardView) inflate.findViewById(R$id.layout_button_container);
        this.f = (ImageView) inflate.findViewById(R$id.layout_button_image_left);
        this.g = (ImageView) inflate.findViewById(R$id.layout_button_image_right);
        this.h = (TextView) inflate.findViewById(R$id.layout_button_text);
    }

    private void e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.FloatingTextButton, 0, 0);
        this.i = obtainStyledAttributes.getString(R$styleable.FloatingTextButton_floating_title);
        this.j = obtainStyledAttributes.getColor(R$styleable.FloatingTextButton_floating_title_color, -16777216);
        this.k = obtainStyledAttributes.getDrawable(R$styleable.FloatingTextButton_floating_left_icon);
        this.l = obtainStyledAttributes.getDrawable(R$styleable.FloatingTextButton_floating_right_icon);
        this.m = obtainStyledAttributes.getColor(R$styleable.FloatingTextButton_floating_background_color, -1);
        obtainStyledAttributes.recycle();
    }

    private void f() {
        setTitle(this.i);
        setTitleColor(this.j);
        setLeftIconDrawable(this.k);
        setRightIconDrawable(this.l);
        setBackgroundColor(this.m);
        this.e.h(b(16), c(8), b(16), c(8));
        g();
    }

    private void g() {
        this.e.post(new a());
    }

    public int getBackgroundColor() {
        return this.m;
    }

    public Drawable getLeftIconDrawable() {
        return this.k;
    }

    public Drawable getRightIconDrawable() {
        return this.l;
    }

    public String getTitle() {
        return this.i;
    }

    public int getTitleColor() {
        return this.j;
    }

    public boolean hasOnClickListeners() {
        return this.e.hasOnClickListeners();
    }

    public void setBackgroundColor(int i2) {
        this.m = i2;
        this.e.setCardBackgroundColor(i2);
    }

    public void setLeftIconDrawable(Drawable drawable) {
        this.k = drawable;
        if (drawable != null) {
            this.f.setVisibility(0);
            this.f.setImageDrawable(drawable);
            return;
        }
        this.f.setVisibility(8);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e.setOnLongClickListener(onLongClickListener);
    }

    public void setRightIconDrawable(Drawable drawable) {
        this.l = drawable;
        if (drawable != null) {
            this.g.setVisibility(0);
            this.g.setImageDrawable(drawable);
            return;
        }
        this.g.setVisibility(8);
    }

    public void setTitle(String str) {
        int i2;
        TextView textView;
        this.i = str;
        if (str == null || str.isEmpty()) {
            textView = this.h;
            i2 = 8;
        } else {
            textView = this.h;
            i2 = 0;
        }
        textView.setVisibility(i2);
        this.h.setText(str);
    }

    public void setTitleColor(int i2) {
        this.j = i2;
        this.h.setTextColor(i2);
    }
}
