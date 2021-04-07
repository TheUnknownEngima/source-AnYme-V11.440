package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.util.i;
import javax.annotation.concurrent.GuardedBy;

public final class e {
    @GuardedBy("sCache")
    private static final h0<String, String> a = new h0<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return v80.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : R$string.common_google_play_services_enable_button : R$string.common_google_play_services_update_button : R$string.common_google_play_services_install_button);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, new Object[]{a2});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R$string.common_google_play_services_enable_text, new Object[]{a2});
            } else if (i == 5) {
                return i(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                if (i == 7) {
                    return i(context, "common_google_play_services_network_error_text", a2);
                }
                if (i == 9) {
                    return resources.getString(R$string.common_google_play_services_unsupported_text, new Object[]{a2});
                } else if (i == 20) {
                    return i(context, "common_google_play_services_restricted_profile_text", a2);
                } else {
                    switch (i) {
                        case 16:
                            return i(context, "common_google_play_services_api_unavailable_text", a2);
                        case 17:
                            return i(context, "common_google_play_services_sign_in_failed_text", a2);
                        case 18:
                            return resources.getString(R$string.common_google_play_services_updating_text, new Object[]{a2});
                        default:
                            return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, new Object[]{a2});
                    }
                }
            }
        } else if (i.d(context)) {
            return resources.getString(R$string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R$string.common_google_play_services_update_text, new Object[]{a2});
        }
    }

    public static String e(Context context, int i) {
        return (i == 6 || i == 19) ? i(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i);
    }

    public static String f(Context context, int i) {
        String h = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : g(context, i);
        return h == null ? context.getResources().getString(R$string.common_google_play_services_notification_ticker) : h;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                return h(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return h(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                sb.toString();
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String h(android.content.Context r4, java.lang.String r5) {
        /*
            h0<java.lang.String, java.lang.String> r0 = a
            monitor-enter(r0)
            h0<java.lang.String, java.lang.String> r1 = a     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x000f:
            android.content.res.Resources r4 = com.google.android.gms.common.h.d(r4)     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r4 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0018:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0053
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0058
        L_0x0053:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x005a:
            h0<java.lang.String, java.lang.String> r1 = a     // Catch:{ all -> 0x0061 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.e.h(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String i(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = h(context, str);
        if (h == null) {
            h = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h, new Object[]{str2});
    }
}
