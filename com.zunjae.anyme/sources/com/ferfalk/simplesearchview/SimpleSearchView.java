package com.ferfalk.simplesearchview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.tabs.TabLayout;

public class SimpleSearchView extends FrameLayout {
    private Context e;
    private int f;
    private Point g;
    private CharSequence h;
    private CharSequence i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private int n;
    private ViewGroup o;
    private EditText p;
    private ImageButton q;
    private ImageButton r;
    private ImageButton s;
    private View t;
    private TabLayout u;
    /* access modifiers changed from: private */
    public int v;
    private f w;
    /* access modifiers changed from: private */
    public h x;
    /* access modifiers changed from: private */
    public boolean y;
    private boolean z;

    class a extends h {
        a() {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!SimpleSearchView.this.y) {
                SimpleSearchView.this.w(charSequence);
            }
        }
    }

    class b extends sm {
        b() {
        }

        public boolean b(View view) {
            if (SimpleSearchView.this.x == null) {
                return false;
            }
            SimpleSearchView.this.x.c();
            return false;
        }
    }

    class c extends sm {
        c() {
        }

        public boolean b(View view) {
            if (SimpleSearchView.this.x == null) {
                return false;
            }
            SimpleSearchView.this.x.d();
            return false;
        }
    }

    class d implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ TabLayout e;

        d(TabLayout tabLayout) {
            this.e = tabLayout;
        }

        public boolean onPreDraw() {
            int unused = SimpleSearchView.this.v = this.e.getHeight();
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    class e extends g {
        e() {
        }

        public void c(TabLayout.g gVar) {
            SimpleSearchView.this.f();
        }
    }

    public interface f {
        boolean a(String str);

        boolean b(String str);

        boolean c();
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();
        String e;
        boolean f;
        int g;
        String h;
        boolean i;

        static class a implements Parcelable.Creator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (a) null);
            }

            /* renamed from: b */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        private g(Parcel parcel) {
            super(parcel);
            this.e = parcel.readString();
            boolean z = false;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readInt() == 1 ? true : z;
        }

        /* synthetic */ g(Parcel parcel, a aVar) {
            this(parcel);
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g);
            parcel.writeString(this.h);
            parcel.writeInt(this.i ? 1 : 0);
        }
    }

    public interface h {
        void a();

        void b();

        void c();

        void d();
    }

    public SimpleSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleSearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = 250;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = "";
        this.n = 0;
        this.y = false;
        this.z = false;
        this.e = context;
        j();
        m(attributeSet, i2);
        l();
        k();
        B(true);
        if (!isInEditMode()) {
            setVisibility(4);
        }
    }

    private void C() {
        Activity d2 = pm.d(this.e);
        if (d2 != null) {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            String str = this.m;
            if (str != null && str.isEmpty()) {
                intent.putExtra("android.speech.extra.PROMPT", this.m);
            }
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            d2.startActivityForResult(intent, 735);
        }
    }

    private void e() {
        this.p.setText((CharSequence) null);
        f fVar = this.w;
        if (fVar != null) {
            fVar.c();
        }
    }

    private GradientDrawable getCardStyleBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius((float) qm.a(4, this.e));
        return gradientDrawable;
    }

    private void j() {
        LayoutInflater.from(this.e).inflate(R$layout.search_view, this, true);
        this.o = (ViewGroup) findViewById(R$id.searchContainer);
        this.p = (EditText) findViewById(R$id.searchEditText);
        this.q = (ImageButton) findViewById(R$id.buttonBack);
        this.r = (ImageButton) findViewById(R$id.buttonClear);
        this.s = (ImageButton) findViewById(R$id.buttonVoice);
        this.t = findViewById(R$id.bottomLine);
    }

    private void k() {
        this.q.setOnClickListener(new f(this));
        this.r.setOnClickListener(new d(this));
        this.s.setOnClickListener(new b(this));
    }

    private void l() {
        this.p.setOnEditorActionListener(new c(this));
        this.p.addTextChangedListener(new a());
        this.p.setOnFocusChangeListener(new a(this));
    }

    private void m(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(attributeSet, R$styleable.SimpleSearchView, i2, 0);
        if (obtainStyledAttributes == null) {
            setCardStyle(this.n);
            return;
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_type)) {
            setCardStyle(obtainStyledAttributes.getInt(R$styleable.SimpleSearchView_type, this.n));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_backIconAlpha)) {
            setBackIconAlpha(obtainStyledAttributes.getFloat(R$styleable.SimpleSearchView_backIconAlpha, 0.87f));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_iconsAlpha)) {
            setIconsAlpha(obtainStyledAttributes.getFloat(R$styleable.SimpleSearchView_iconsAlpha, 0.54f));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_backIconTint)) {
            setBackIconColor(obtainStyledAttributes.getColor(R$styleable.SimpleSearchView_backIconTint, pm.b(this.e)));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_iconsTint)) {
            setIconsColor(obtainStyledAttributes.getColor(R$styleable.SimpleSearchView_iconsTint, -16777216));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_cursorColor)) {
            setCursorColor(obtainStyledAttributes.getColor(R$styleable.SimpleSearchView_cursorColor, pm.a(this.e)));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_hintColor)) {
            setHintTextColor(obtainStyledAttributes.getColor(R$styleable.SimpleSearchView_hintColor, getResources().getColor(R$color.default_textColorHint)));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_searchBackground)) {
            setSearchBackground(obtainStyledAttributes.getDrawable(R$styleable.SimpleSearchView_searchBackground));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_searchBackIcon)) {
            setBackIconDrawable(obtainStyledAttributes.getDrawable(R$styleable.SimpleSearchView_searchBackIcon));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_searchClearIcon)) {
            setClearIconDrawable(obtainStyledAttributes.getDrawable(R$styleable.SimpleSearchView_searchClearIcon));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_searchVoiceIcon)) {
            setVoiceIconDrawable(obtainStyledAttributes.getDrawable(R$styleable.SimpleSearchView_searchVoiceIcon));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_voiceSearch)) {
            h(obtainStyledAttributes.getBoolean(R$styleable.SimpleSearchView_voiceSearch, this.j));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_voiceSearchPrompt)) {
            setVoiceSearchPrompt(obtainStyledAttributes.getString(R$styleable.SimpleSearchView_voiceSearchPrompt));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_android_hint)) {
            setHint(obtainStyledAttributes.getString(R$styleable.SimpleSearchView_android_hint));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_android_inputType)) {
            setInputType(obtainStyledAttributes.getInt(R$styleable.SimpleSearchView_android_inputType, 524288));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SimpleSearchView_android_textColor)) {
            setTextColor(obtainStyledAttributes.getColor(R$styleable.SimpleSearchView_android_textColor, getResources().getColor(R$color.default_textColor)));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean o() {
        if (isInEditMode()) {
            return true;
        }
        return !getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).isEmpty();
    }

    private void v() {
        Editable text = this.p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            f fVar = this.w;
            if (fVar == null || !fVar.b(text.toString())) {
                f();
                this.y = true;
                this.p.setText((CharSequence) null);
                this.y = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public void w(CharSequence charSequence) {
        this.h = charSequence;
        boolean z2 = true;
        if (!TextUtils.isEmpty(charSequence)) {
            z2 = false;
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
        B(z2);
        if (this.w != null && !TextUtils.equals(charSequence, this.i)) {
            this.w.a(charSequence.toString());
        }
        this.i = charSequence.toString();
    }

    public void A(boolean z2) {
        TabLayout tabLayout = this.u;
        if (tabLayout != null) {
            if (z2) {
                tm.l(tabLayout, 0, this.v, this.f).start();
            } else {
                tabLayout.setVisibility(0);
            }
        }
    }

    public void B(boolean z2) {
        ImageButton imageButton;
        int i2;
        if (!z2 || !o() || !this.j) {
            imageButton = this.s;
            i2 = 8;
        } else {
            imageButton = this.s;
            i2 = 0;
        }
        imageButton.setVisibility(i2);
    }

    public void clearFocus() {
        this.l = true;
        pm.c(this);
        super.clearFocus();
        this.p.clearFocus();
        this.l = false;
    }

    public void f() {
        g(true);
    }

    public void g(boolean z2) {
        if (n()) {
            this.y = true;
            this.p.setText((CharSequence) null);
            this.y = false;
            clearFocus();
            if (z2) {
                tm.h(this, this.f, new c(), getRevealAnimationCenter()).start();
            } else {
                setVisibility(4);
            }
            A(z2);
            this.k = false;
            h hVar = this.x;
            if (hVar != null) {
                hVar.b();
            }
        }
    }

    public int getAnimationDuration() {
        return this.f;
    }

    public int getCardStyle() {
        return this.n;
    }

    public Point getRevealAnimationCenter() {
        Point point = this.g;
        if (point != null) {
            return point;
        }
        Point point2 = new Point(getWidth() - qm.a(26, this.e), getHeight() / 2);
        this.g = point2;
        return point2;
    }

    public EditText getSearchEditText() {
        return this.p;
    }

    public TabLayout getTabLayout() {
        return this.u;
    }

    public void h(boolean z2) {
        this.j = z2;
    }

    public void i(boolean z2) {
        TabLayout tabLayout = this.u;
        if (tabLayout != null) {
            if (z2) {
                tm.l(tabLayout, tabLayout.getHeight(), 0, this.f).start();
            } else {
                tabLayout.setVisibility(8);
            }
        }
    }

    public boolean n() {
        return this.k;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        this.h = gVar.e;
        this.f = gVar.g;
        this.m = gVar.h;
        this.z = gVar.i;
        if (gVar.f) {
            z(false);
            x(gVar.e, false);
        }
        super.onRestoreInstanceState(gVar.getSuperState());
    }

    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        CharSequence charSequence = this.h;
        gVar.e = charSequence != null ? charSequence.toString() : null;
        gVar.f = this.k;
        gVar.g = this.f;
        gVar.i = this.z;
        return gVar;
    }

    public /* synthetic */ void p(View view) {
        f();
    }

    public /* synthetic */ void q(View view) {
        e();
    }

    public /* synthetic */ void r(View view) {
        C();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (!this.l && isFocusable()) {
            return this.p.requestFocus(i2, rect);
        }
        return false;
    }

    public /* synthetic */ boolean s(TextView textView, int i2, KeyEvent keyEvent) {
        v();
        return true;
    }

    public void setAnimationDuration(int i2) {
        this.f = i2;
    }

    public void setBackIconAlpha(float f2) {
        this.q.setAlpha(f2);
    }

    public void setBackIconColor(int i2) {
        androidx.core.widget.e.c(this.q, ColorStateList.valueOf(i2));
    }

    public void setBackIconDrawable(Drawable drawable) {
        this.q.setImageDrawable(drawable);
    }

    public void setCardStyle(int i2) {
        float f2;
        this.n = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (i2 != 1) {
            this.o.setBackgroundColor(-1);
            this.t.setVisibility(0);
            f2 = Utils.FLOAT_EPSILON;
        } else {
            this.o.setBackground(getCardStyleBackground());
            this.t.setVisibility(8);
            int a2 = qm.a(6, this.e);
            layoutParams.setMargins(a2, a2, a2, a2);
            f2 = (float) qm.a(2, this.e);
        }
        this.o.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 21) {
            this.o.setElevation(f2);
        }
    }

    public void setClearIconDrawable(Drawable drawable) {
        this.r.setImageDrawable(drawable);
    }

    public void setCursorColor(int i2) {
        rm.a(this.p, i2);
    }

    public void setCursorDrawable(int i2) {
        rm.b(this.p, i2);
    }

    public void setHint(CharSequence charSequence) {
        this.p.setHint(charSequence);
    }

    public void setHintTextColor(int i2) {
        this.p.setHintTextColor(i2);
    }

    public void setIconsAlpha(float f2) {
        this.r.setAlpha(f2);
        this.s.setAlpha(f2);
    }

    public void setIconsColor(int i2) {
        androidx.core.widget.e.c(this.r, ColorStateList.valueOf(i2));
        androidx.core.widget.e.c(this.s, ColorStateList.valueOf(i2));
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setKeepQuery(boolean z2) {
        this.z = z2;
    }

    public void setMenuItem(MenuItem menuItem) {
        menuItem.setOnMenuItemClickListener(new e(this));
    }

    public void setOnQueryTextListener(f fVar) {
        this.w = fVar;
    }

    public void setOnSearchViewListener(h hVar) {
        this.x = hVar;
    }

    public void setRevealAnimationCenter(Point point) {
        this.g = point;
    }

    public void setSearchBackground(Drawable drawable) {
        this.o.setBackground(drawable);
    }

    public void setTabLayout(TabLayout tabLayout) {
        this.u = tabLayout;
        tabLayout.getViewTreeObserver().addOnPreDrawListener(new d(tabLayout));
        this.u.c(new e());
    }

    public void setTextColor(int i2) {
        this.p.setTextColor(i2);
    }

    public void setVoiceIconDrawable(Drawable drawable) {
        this.s.setImageDrawable(drawable);
    }

    public void setVoiceSearchPrompt(String str) {
        this.m = str;
    }

    public /* synthetic */ void t(View view, boolean z2) {
        if (z2) {
            pm.e(this.p);
        }
    }

    public /* synthetic */ boolean u(MenuItem menuItem) {
        y();
        return true;
    }

    public void x(CharSequence charSequence, boolean z2) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            EditText editText = this.p;
            editText.setSelection(editText.length());
            this.h = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            v();
        }
    }

    public void y() {
        z(true);
    }

    public void z(boolean z2) {
        if (!n()) {
            this.p.setText(this.z ? this.h : null);
            this.p.requestFocus();
            if (z2) {
                tm.k(this, this.f, new b(), getRevealAnimationCenter()).start();
            } else {
                setVisibility(0);
            }
            i(z2);
            this.k = true;
            h hVar = this.x;
            if (hVar != null) {
                hVar.a();
            }
        }
    }
}
