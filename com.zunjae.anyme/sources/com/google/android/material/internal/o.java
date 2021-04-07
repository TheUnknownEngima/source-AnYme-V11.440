package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

class o implements q {
    protected a a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    static class a extends ViewGroup {
        ViewGroup e;
        View f;
        ArrayList<Drawable> g = null;
        o h;
        private boolean i;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
        }

        a(Context context, ViewGroup viewGroup, View view, o oVar) {
            super(context);
            this.e = viewGroup;
            this.f = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.h = oVar;
        }

        private void b() {
            if (this.i) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void c() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.g;
                if (arrayList == null || arrayList.size() == 0) {
                    this.i = true;
                    this.e.removeView(this);
                }
            }
        }

        private void d(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.e.getLocationOnScreen(iArr2);
            this.f.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            b();
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            if (!this.g.contains(drawable)) {
                this.g.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.e.getLocationOnScreen(iArr);
            this.f.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f.getWidth(), this.f.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.g;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.get(i2).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void e(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.g;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                c();
            }
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.e == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.e != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                d(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.g
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.o.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    o(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    static o c(View view) {
        ViewGroup d = r.d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).h;
            }
        }
        return new n(d.getContext(), d, view);
    }

    public void a(Drawable drawable) {
        this.a.a(drawable);
    }

    public void b(Drawable drawable) {
        this.a.e(drawable);
    }
}
