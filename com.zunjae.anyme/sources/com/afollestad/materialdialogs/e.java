package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

public enum e {
    START,
    CENTER,
    END;
    
    private static final boolean HAS_RTL = false;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.afollestad.materialdialogs.e[] r0 = com.afollestad.materialdialogs.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.e.a.<clinit>():void");
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return HAS_RTL ? 8388611 : 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return HAS_RTL ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i = a.a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
