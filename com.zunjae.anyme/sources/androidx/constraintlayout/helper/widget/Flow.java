package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.c;

public class Flow extends VirtualLayout {
    private g1 o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.o = new g1();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_orientation) {
                    this.o.P1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_padding) {
                    this.o.W0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.o.b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.o.Y0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.o.Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.o.c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.o.a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.o.X0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.o.U1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.o.J1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.o.T1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.o.D1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.o.L1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.o.F1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.o.N1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.o.H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.o.C1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.o.K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.o.E1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.o.M1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.o.R1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.o.G1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.o.Q1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.o.I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.o.S1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.o.O1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.h = this.o;
        t();
    }

    public void m(c.a aVar, j1 j1Var, ConstraintLayout.LayoutParams layoutParams, SparseArray<e1> sparseArray) {
        super.m(aVar, j1Var, layoutParams, sparseArray);
        if (j1Var instanceof g1) {
            g1 g1Var = (g1) j1Var;
            int i = layoutParams.R;
            if (i != -1) {
                g1Var.P1(i);
            }
        }
    }

    public void n(e1 e1Var, boolean z) {
        this.o.I0(z);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        u(this.o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.o.C1(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.o.D1(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.o.E1(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.o.F1(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.o.G1(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.o.H1(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.o.I1(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.o.J1(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.o.O1(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.o.P1(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.o.W0(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.o.X0(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.o.Z0(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.o.a1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.o.c1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.o.Q1(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.o.R1(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.o.S1(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.o.T1(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.o.U1(i);
        requestLayout();
    }

    public void u(l1 l1Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (l1Var != null) {
            l1Var.Q0(mode, size, mode2, size2);
            setMeasuredDimension(l1Var.L0(), l1Var.K0());
            return;
        }
        setMeasuredDimension(0, 0);
    }
}
