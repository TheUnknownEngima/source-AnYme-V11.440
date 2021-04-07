package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.g0;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    private i e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private ImageView l;
    private LinearLayout m;
    private Drawable n;
    private int o;
    private Context p;
    private boolean q;
    private Drawable r;
    private boolean s;
    private LayoutInflater t;
    private boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        g0 u2 = g0.u(getContext(), attributeSet, R$styleable.MenuView, i2, 0);
        this.n = u2.g(R$styleable.MenuView_android_itemBackground);
        this.o = u2.n(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.q = u2.a(R$styleable.MenuView_preserveIconSpacing, false);
        this.p = context;
        this.r = u2.g(R$styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R$attr.dropDownListViewStyle, 0);
        this.s = obtainStyledAttributes.hasValue(0);
        u2.v();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i2) {
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, this, false);
        this.i = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, this, false);
        this.f = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, this, false);
        this.g = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
            rect.top += this.l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i2) {
        this.e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public i getItemData() {
        return this.e;
    }

    public void h(boolean z, char c) {
        int i2 = (!z || !this.e.A()) ? 8 : 0;
        if (i2 == 0) {
            this.j.setText(this.e.h());
        }
        if (this.j.getVisibility() != i2) {
            this.j.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        o4.l0(this, this.n);
        TextView textView = (TextView) findViewById(R$id.title);
        this.h = textView;
        int i2 = this.o;
        if (i2 != -1) {
            textView.setTextAppearance(this.p, i2);
        }
        this.j = (TextView) findViewById(R$id.shortcut);
        ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.l = (ImageView) findViewById(R$id.group_divider);
        this.m = (LinearLayout) findViewById(R$id.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f != null && this.q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.g != null || this.i != null) {
            if (this.e.m()) {
                if (this.g == null) {
                    g();
                }
                compoundButton2 = this.g;
                compoundButton = this.i;
            } else {
                if (this.i == null) {
                    c();
                }
                compoundButton2 = this.i;
                compoundButton = this.g;
            }
            if (z) {
                compoundButton2.setChecked(this.e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.e.m()) {
            if (this.g == null) {
                g();
            }
            compoundButton = this.g;
        } else {
            if (this.i == null) {
                c();
            }
            compoundButton = this.i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.e.z() || this.u;
        if (!z && !this.q) {
            return;
        }
        if (this.f != null || drawable != null || this.q) {
            if (this.f == null) {
                f();
            }
            if (drawable != null || this.q) {
                ImageView imageView = this.f;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                    return;
                }
                return;
            }
            this.f.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.h.setText(charSequence);
            if (this.h.getVisibility() != 0) {
                textView = this.h;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.h.getVisibility() != 8) {
                textView = this.h;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
