package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b5  reason: default package */
public class b5 {
    private final Object a;

    /* renamed from: b5$a */
    static class a extends AccessibilityNodeProvider {
        final b5 a;

        a(b5 b5Var) {
            this.a = b5Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            a5 a2 = this.a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.H0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<a5> b = this.a.b(str, i);
            if (b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(b.get(i2).H0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.e(i, i2, bundle);
        }
    }

    /* renamed from: b5$b */
    static class b extends a {
        b(b5 b5Var) {
            super(b5Var);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            a5 c = this.a.c(i);
            if (c == null) {
                return null;
            }
            return c.H0();
        }
    }

    public b5() {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 19 ? new b(this) : i >= 16 ? new a(this) : null;
    }

    public b5(Object obj) {
        this.a = obj;
    }

    public a5 a(int i) {
        return null;
    }

    public List<a5> b(String str, int i) {
        return null;
    }

    public a5 c(int i) {
        return null;
    }

    public Object d() {
        return this.a;
    }

    public boolean e(int i, int i2, Bundle bundle) {
        return false;
    }
}
