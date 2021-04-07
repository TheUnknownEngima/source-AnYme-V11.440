package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;

public abstract class c {
    public static int e = -1;
    int a;
    int b;
    String c = null;
    HashMap<String, a> d;

    public c() {
        int i = e;
        this.a = i;
        this.b = i;
    }

    public abstract void a(HashMap<String, r> hashMap);

    /* access modifiers changed from: package-private */
    public abstract void b(HashSet<String> hashSet);

    /* access modifiers changed from: package-private */
    public abstract void c(Context context, AttributeSet attributeSet);

    /* access modifiers changed from: package-private */
    public boolean d(String str) {
        String str2 = this.c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void e(HashMap<String, Integer> hashMap) {
    }
}
