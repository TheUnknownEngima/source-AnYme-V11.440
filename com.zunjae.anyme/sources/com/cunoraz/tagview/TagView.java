package com.cunoraz.tagview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

public class TagView extends RelativeLayout {
    private List<b> e = new ArrayList();
    private LayoutInflater f;
    private ViewTreeObserver g;
    /* access modifiers changed from: private */
    public e h;
    /* access modifiers changed from: private */
    public f i;
    /* access modifiers changed from: private */
    public g j;
    private int k;
    /* access modifiers changed from: private */
    public boolean l = false;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (!TagView.this.l) {
                boolean unused = TagView.this.l = true;
                TagView.this.h();
            }
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ int f;

        b(b bVar, int i) {
            this.e = bVar;
            this.f = i;
        }

        public void onClick(View view) {
            if (TagView.this.h != null) {
                TagView.this.h.a(this.e, this.f);
            }
        }
    }

    class c implements View.OnLongClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ int f;

        c(b bVar, int i) {
            this.e = bVar;
            this.f = i;
        }

        public boolean onLongClick(View view) {
            if (TagView.this.j == null) {
                return true;
            }
            TagView.this.j.a(this.e, this.f);
            return true;
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ b e;
        final /* synthetic */ int f;

        d(b bVar, int i) {
            this.e = bVar;
            this.f = i;
        }

        public void onClick(View view) {
            if (TagView.this.i != null) {
                TagView.this.i.a(TagView.this, this.e, this.f);
            }
        }
    }

    public interface e {
        void a(b bVar, int i);
    }

    public interface f {
        void a(TagView tagView, b bVar, int i);
    }

    public interface g {
        void a(b bVar, int i);
    }

    public TagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j(context, attributeSet, 0);
    }

    public TagView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        j(context, attributeSet, i2);
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.l) {
            removeAllViews();
            float paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
            ViewGroup viewGroup = null;
            b bVar = null;
            int i2 = 1;
            int i3 = 1;
            int i4 = 1;
            for (b next : this.e) {
                int i5 = i2 - 1;
                View inflate = this.f.inflate(R$layout.tagview_item, viewGroup);
                inflate.setId(i2);
                if (Build.VERSION.SDK_INT < 16) {
                    inflate.setBackgroundDrawable(i(next));
                } else {
                    inflate.setBackground(i(next));
                }
                TextView textView = (TextView) inflate.findViewById(R$id.tv_tag_item_contain);
                textView.setText(next.l());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.setMargins(this.o, this.q, this.p, this.r);
                textView.setLayoutParams(layoutParams);
                textView.setTextColor(next.j());
                textView.setTextSize(2, next.k());
                inflate.setOnClickListener(new b(next, i5));
                inflate.setOnLongClickListener(new c(next, i5));
                float measureText = textView.getPaint().measureText(next.l()) + ((float) this.o) + ((float) this.p);
                TextView textView2 = (TextView) inflate.findViewById(R$id.tv_tag_item_delete);
                if (next.n()) {
                    textView2.setVisibility(0);
                    textView2.setText(next.b());
                    int a2 = c.a(getContext(), 2.0f);
                    textView2.setPadding(a2, this.q, this.p + a2, this.r);
                    textView2.setTextColor(next.c());
                    textView2.setTextSize(2, next.d());
                    textView2.setOnClickListener(new d(next, i5));
                    measureText += textView2.getPaint().measureText(next.b()) + ((float) this.o) + ((float) this.p);
                } else {
                    textView2.setVisibility(8);
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.bottomMargin = this.m;
                if (((float) this.k) <= paddingLeft + measureText + ((float) c.a(getContext(), 2.0f))) {
                    if (bVar != null) {
                        layoutParams2.addRule(3, i4);
                    }
                    paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
                    i3 = i2;
                    i4 = i3;
                } else {
                    layoutParams2.addRule(6, i3);
                    if (i2 != i3) {
                        layoutParams2.addRule(1, i5);
                        int i6 = this.n;
                        layoutParams2.leftMargin = i6;
                        paddingLeft += (float) i6;
                        if (bVar.k() < next.k()) {
                            i4 = i2;
                        }
                    }
                }
                paddingLeft += measureText;
                addView(inflate, layoutParams2);
                i2++;
                bVar = next;
                viewGroup = null;
            }
        }
    }

    private Drawable i(b bVar) {
        if (bVar.a() != null) {
            return bVar.a();
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(bVar.g());
        gradientDrawable.setCornerRadius(bVar.i());
        if (bVar.f() > Utils.FLOAT_EPSILON) {
            gradientDrawable.setStroke(c.a(getContext(), bVar.f()), bVar.e());
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(bVar.h());
        gradientDrawable2.setCornerRadius(bVar.i());
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    private void j(Context context, AttributeSet attributeSet, int i2) {
        this.f = (LayoutInflater) context.getSystemService("layout_inflater");
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.g = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(new a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagView, i2, i2);
        this.m = (int) obtainStyledAttributes.getDimension(R$styleable.TagView_lineMargin, (float) c.a(getContext(), 5.0f));
        this.n = (int) obtainStyledAttributes.getDimension(R$styleable.TagView_tagMargin, (float) c.a(getContext(), 5.0f));
        this.o = (int) obtainStyledAttributes.getDimension(R$styleable.TagView_textPaddingLeft, (float) c.a(getContext(), 8.0f));
        this.p = (int) obtainStyledAttributes.getDimension(R$styleable.TagView_textPaddingRight, (float) c.a(getContext(), 8.0f));
        this.q = (int) obtainStyledAttributes.getDimension(R$styleable.TagView_textPaddingTop, (float) c.a(getContext(), 5.0f));
        this.r = (int) obtainStyledAttributes.getDimension(R$styleable.TagView_textPaddingBottom, (float) c.a(getContext(), 5.0f));
        obtainStyledAttributes.recycle();
    }

    public void g(b bVar) {
        this.e.add(bVar);
        h();
    }

    public int getLineMargin() {
        return this.m;
    }

    public int getTagMargin() {
        return this.n;
    }

    public List<b> getTags() {
        return this.e;
    }

    public int getTextPaddingLeft() {
        return this.o;
    }

    public int getTextPaddingRight() {
        return this.p;
    }

    public int getTextPaddingTop() {
        return this.q;
    }

    public int gettextPaddingBottom() {
        return this.r;
    }

    public void k() {
        this.e.clear();
        removeAllViews();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (getMeasuredWidth() > 0) {
            this.k = getMeasuredWidth();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.k = i2;
    }

    public void setLineMargin(float f2) {
        this.m = c.a(getContext(), f2);
    }

    public void setOnTagClickListener(e eVar) {
        this.h = eVar;
    }

    public void setOnTagDeleteListener(f fVar) {
        this.i = fVar;
    }

    public void setOnTagLongClickListener(g gVar) {
        this.j = gVar;
    }

    public void setTagMargin(float f2) {
        this.n = c.a(getContext(), f2);
    }

    public void setTextPaddingLeft(float f2) {
        this.o = c.a(getContext(), f2);
    }

    public void setTextPaddingRight(float f2) {
        this.p = c.a(getContext(), f2);
    }

    public void setTextPaddingTop(float f2) {
        this.q = c.a(getContext(), f2);
    }

    public void settextPaddingBottom(float f2) {
        this.r = c.a(getContext(), f2);
    }
}
