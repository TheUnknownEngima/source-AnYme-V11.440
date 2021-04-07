package defpackage;

/* renamed from: ug1  reason: default package */
public class ug1 implements xg1 {
    private final int a;
    private final xg1[] b;
    private final vg1 c;

    public ug1(int i, xg1... xg1Arr) {
        this.a = i;
        this.b = xg1Arr;
        this.c = new vg1(i);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (xg1 xg1 : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = xg1.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
