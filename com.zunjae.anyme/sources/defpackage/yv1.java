package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: yv1  reason: default package */
public final class yv1 {
    public static final yv1 a = new yv1();

    private yv1() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = r3.getItemAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            defpackage.v62.e(r3, r0)
            r0 = 0
            java.lang.String r1 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch:{ Exception -> 0x0030 }
            if (r3 == 0) goto L_0x0028
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3     // Catch:{ Exception -> 0x0030 }
            android.content.ClipData r3 = r3.getPrimaryClip()     // Catch:{ Exception -> 0x0030 }
            if (r3 == 0) goto L_0x0022
            r1 = 0
            android.content.ClipData$Item r3 = r3.getItemAt(r1)     // Catch:{ Exception -> 0x0030 }
            if (r3 == 0) goto L_0x0022
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0023
        L_0x0022:
            r3 = r0
        L_0x0023:
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0034
        L_0x0028:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0030 }
            java.lang.String r1 = "null cannot be cast to non-null type android.content.ClipboardManager"
            r3.<init>(r1)     // Catch:{ Exception -> 0x0030 }
            throw r3     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r3 = move-exception
            defpackage.uj2.d(r3)
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv1.a(android.content.Context):java.lang.String");
    }

    public final void b(Context context, String str) {
        v62.e(context, "context");
        v62.e(str, "messageToClipboard");
        Object systemService = context.getSystemService("clipboard");
        if (!(systemService instanceof ClipboardManager)) {
            systemService = null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("AnYme", str));
        }
    }
}
