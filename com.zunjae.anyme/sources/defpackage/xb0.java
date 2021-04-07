package defpackage;

import java.util.Arrays;

/* renamed from: xb0  reason: default package */
class xb0<E> extends ac0<E> {
    Object[] a = new Object[4];
    int b = 0;
    boolean c;

    xb0(int i) {
        vb0.a(4, "initialCapacity");
    }

    public xb0<E> a(E e) {
        sb0.a(e);
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.a = Arrays.copyOf(objArr, i2);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        } else {
            if (this.c) {
                this.a = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            objArr2[i3] = e;
            return this;
        }
        this.c = false;
        Object[] objArr22 = this.a;
        int i32 = this.b;
        this.b = i32 + 1;
        objArr22[i32] = e;
        return this;
    }
}
