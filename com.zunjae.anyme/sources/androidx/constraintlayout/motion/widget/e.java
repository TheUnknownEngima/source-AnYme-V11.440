package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

public class e {
    HashMap<Object, HashMap<String, float[]>> a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public float a(Object obj, String str, int i) {
        if (!this.a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = this.a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    /* access modifiers changed from: package-private */
    public void b(Object obj, String str, int i, float f) {
        HashMap hashMap;
        if (!this.a.containsKey(obj)) {
            hashMap = new HashMap();
            float[] fArr = new float[(i + 1)];
            fArr[i] = f;
            hashMap.put(str, fArr);
        } else {
            hashMap = this.a.get(obj);
            if (!hashMap.containsKey(str)) {
                float[] fArr2 = new float[(i + 1)];
                fArr2[i] = f;
                hashMap.put(str, fArr2);
            } else {
                float[] fArr3 = (float[]) hashMap.get(str);
                if (fArr3.length <= i) {
                    fArr3 = Arrays.copyOf(fArr3, i + 1);
                }
                fArr3[i] = f;
                hashMap.put(str, fArr3);
                return;
            }
        }
        this.a.put(obj, hashMap);
    }
}
