package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;

public class i extends j {
    String g = null;
    int h = c.e;
    int i = 0;
    float j = Float.NaN;
    float k = Float.NaN;
    float l = Float.NaN;
    float m = Float.NaN;
    float n = Float.NaN;
    float o = Float.NaN;
    int p = 0;

    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyPosition_motionTarget, 1);
            a.append(R$styleable.KeyPosition_framePosition, 2);
            a.append(R$styleable.KeyPosition_transitionEasing, 3);
            a.append(R$styleable.KeyPosition_curveFit, 4);
            a.append(R$styleable.KeyPosition_drawPath, 5);
            a.append(R$styleable.KeyPosition_percentX, 6);
            a.append(R$styleable.KeyPosition_percentY, 7);
            a.append(R$styleable.KeyPosition_keyPositionType, 9);
            a.append(R$styleable.KeyPosition_sizePercent, 8);
            a.append(R$styleable.KeyPosition_percentWidth, 11);
            a.append(R$styleable.KeyPosition_percentHeight, 12);
            a.append(R$styleable.KeyPosition_pathMotionArc, 10);
        }

        /* access modifiers changed from: private */
        public static void b(i iVar, TypedArray typedArray) {
            float f;
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (MotionLayout.H0) {
                            int resourceId = typedArray.getResourceId(index, iVar.b);
                            iVar.b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type != 3) {
                            iVar.b = typedArray.getResourceId(index, iVar.b);
                            continue;
                        }
                        iVar.c = typedArray.getString(index);
                        break;
                    case 2:
                        iVar.a = typedArray.getInt(index, iVar.a);
                        continue;
                    case 3:
                        iVar.g = typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : l0.c[typedArray.getInteger(index, 0)];
                        continue;
                    case 4:
                        iVar.f = typedArray.getInteger(index, iVar.f);
                        continue;
                    case 5:
                        iVar.i = typedArray.getInt(index, iVar.i);
                        continue;
                    case 6:
                        iVar.l = typedArray.getFloat(index, iVar.l);
                        continue;
                    case 7:
                        iVar.m = typedArray.getFloat(index, iVar.m);
                        continue;
                    case 8:
                        f = typedArray.getFloat(index, iVar.k);
                        iVar.j = f;
                        break;
                    case 9:
                        iVar.p = typedArray.getInt(index, iVar.p);
                        continue;
                    case 10:
                        iVar.h = typedArray.getInt(index, iVar.h);
                        continue;
                    case 11:
                        iVar.j = typedArray.getFloat(index, iVar.j);
                        continue;
                    case 12:
                        f = typedArray.getFloat(index, iVar.k);
                        break;
                    default:
                        "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index);
                        continue;
                }
                iVar.k = f;
            }
            int i2 = iVar.a;
        }
    }

    public void a(HashMap<String, r> hashMap) {
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R$styleable.KeyPosition));
    }
}
