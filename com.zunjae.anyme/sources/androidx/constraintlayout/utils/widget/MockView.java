package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import com.github.mikephil.charting.utils.Utils;

public class MockView extends View {
    private Paint e = new Paint();
    private Paint f = new Paint();
    private Paint g = new Paint();
    private boolean h = true;
    private boolean i = true;
    protected String j = null;
    private Rect k = new Rect();
    private int l = Color.argb(255, 0, 0, 0);
    private int m = Color.argb(255, 200, 200, 200);
    private int n = Color.argb(255, 50, 50, 50);
    private int o = 4;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R$styleable.MockView_mock_label) {
                    this.j = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.MockView_mock_showDiagonals) {
                    this.h = obtainStyledAttributes.getBoolean(index, this.h);
                } else if (index == R$styleable.MockView_mock_diagonalsColor) {
                    this.l = obtainStyledAttributes.getColor(index, this.l);
                } else if (index == R$styleable.MockView_mock_labelBackgroundColor) {
                    this.n = obtainStyledAttributes.getColor(index, this.n);
                } else if (index == R$styleable.MockView_mock_labelColor) {
                    this.m = obtainStyledAttributes.getColor(index, this.m);
                } else if (index == R$styleable.MockView_mock_showLabel) {
                    this.i = obtainStyledAttributes.getBoolean(index, this.i);
                }
            }
        }
        if (this.j == null) {
            try {
                this.j = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.e.setColor(this.l);
        this.e.setAntiAlias(true);
        this.f.setColor(this.m);
        this.f.setAntiAlias(true);
        this.g.setColor(this.n);
        this.o = Math.round(((float) this.o) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.h) {
            width--;
            height--;
            float f2 = (float) width;
            float f3 = (float) height;
            canvas.drawLine(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f2, f3, this.e);
            Canvas canvas2 = canvas;
            float f4 = f2;
            canvas2.drawLine(Utils.FLOAT_EPSILON, f3, f4, Utils.FLOAT_EPSILON, this.e);
            canvas2.drawLine(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f4, Utils.FLOAT_EPSILON, this.e);
            float f5 = f2;
            float f6 = f3;
            canvas2.drawLine(f5, Utils.FLOAT_EPSILON, f4, f6, this.e);
            float f7 = f3;
            canvas2.drawLine(f5, f7, Utils.FLOAT_EPSILON, f6, this.e);
            canvas2.drawLine(Utils.FLOAT_EPSILON, f7, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.e);
        }
        String str = this.j;
        if (str != null && this.i) {
            this.f.getTextBounds(str, 0, str.length(), this.k);
            float width2 = ((float) (width - this.k.width())) / 2.0f;
            float height2 = (((float) (height - this.k.height())) / 2.0f) + ((float) this.k.height());
            this.k.offset((int) width2, (int) height2);
            Rect rect = this.k;
            int i2 = rect.left;
            int i3 = this.o;
            rect.set(i2 - i3, rect.top - i3, rect.right + i3, rect.bottom + i3);
            canvas.drawRect(this.k, this.g);
            canvas.drawText(this.j, width2, height2, this.f);
        }
    }
}
