package com.zunjae.anyme.features.niche.open_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.browsers.sites.BasicWebViewBrowser;
import com.zunjae.anyme.features.discover.fast_search.FastAnimeSearchActivity;
import java.util.List;
import java.util.ListIterator;

public final class HandleIntentActivity extends AbstractActivity {
    private final int l0(String str) {
        List<T> list;
        boolean z;
        try {
            List<String> e = new u82("/").e(str, 0);
            if (!e.isEmpty()) {
                ListIterator<String> listIterator = e.listIterator(e.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = n32.X(e, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = f32.f();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                return Integer.parseInt(((String[]) array)[4]);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ Exception -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf A[Catch:{ Exception -> 0x00d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m0(java.lang.String r17) {
        /*
            r16 = this;
            java.lang.String r0 = "/"
            u82 r1 = new u82     // Catch:{ Exception -> 0x00d7 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00d7 }
            r0 = 0
            r2 = r17
            java.util.List r1 = r1.e(r2, r0)     // Catch:{ Exception -> 0x00d7 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x00d7 }
            r3 = 1
            if (r2 != 0) goto L_0x003e
            int r2 = r1.size()     // Catch:{ Exception -> 0x00d7 }
            java.util.ListIterator r2 = r1.listIterator(r2)     // Catch:{ Exception -> 0x00d7 }
        L_0x001d:
            boolean r4 = r2.hasPrevious()     // Catch:{ Exception -> 0x00d7 }
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r2.previous()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00d7 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00d7 }
            if (r4 != 0) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r4 != 0) goto L_0x001d
            int r2 = r2.nextIndex()     // Catch:{ Exception -> 0x00d7 }
            int r2 = r2 + r3
            java.util.List r1 = defpackage.n32.X(r1, r2)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x0042
        L_0x003e:
            java.util.List r1 = defpackage.f32.f()     // Catch:{ Exception -> 0x00d7 }
        L_0x0042:
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ Exception -> 0x00d7 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ Exception -> 0x00d7 }
            r2 = 5
            r4 = r1[r2]     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r5 = "_"
            java.lang.String r6 = " "
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r10 = defpackage.f92.q(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r11 = "  "
            java.lang.String r12 = " "
            r13 = 0
            r14 = 4
            r15 = 0
            java.lang.String r1 = defpackage.f92.q(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00d7 }
            int r2 = r1.length()     // Catch:{ Exception -> 0x00d7 }
            int r2 = r2 - r3
            r4 = 0
            r5 = 0
        L_0x006c:
            if (r4 > r2) goto L_0x0091
            if (r5 != 0) goto L_0x0072
            r6 = r4
            goto L_0x0073
        L_0x0072:
            r6 = r2
        L_0x0073:
            char r6 = r1.charAt(r6)     // Catch:{ Exception -> 0x00d7 }
            r7 = 32
            int r6 = defpackage.v62.g(r6, r7)     // Catch:{ Exception -> 0x00d7 }
            if (r6 > 0) goto L_0x0081
            r6 = 1
            goto L_0x0082
        L_0x0081:
            r6 = 0
        L_0x0082:
            if (r5 != 0) goto L_0x008b
            if (r6 != 0) goto L_0x0088
            r5 = 1
            goto L_0x006c
        L_0x0088:
            int r4 = r4 + 1
            goto L_0x006c
        L_0x008b:
            if (r6 != 0) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            int r2 = r2 + -1
            goto L_0x006c
        L_0x0091:
            int r2 = r2 + r3
            java.lang.CharSequence r0 = r1.subSequence(r4, r2)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "?location"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00d7 }
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r0 = defpackage.g92.U(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object r0 = defpackage.n32.z(r0)     // Catch:{ Exception -> 0x00d7 }
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "_location"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00d7 }
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r0 = defpackage.g92.U(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object r0 = defpackage.n32.z(r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r1 = "URLDecoder.decode(title, \"UTF-8\")"
            defpackage.v62.d(r0, r1)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d9
        L_0x00cf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d7 }
            throw r0     // Catch:{ Exception -> 0x00d7 }
        L_0x00d7:
            java.lang.String r0 = ""
        L_0x00d9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.niche.open_intent.HandleIntentActivity.m0(java.lang.String):java.lang.String");
    }

    private final boolean n0(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!new u82("^.*myanimelist\\.net/anime/[0-9]{1,8}.*$").c(lowerCase)) {
                return false;
            }
            int l0 = l0(str);
            String m0 = m0(str);
            if (l0 > 0) {
                startActivity(AnimeInfoActivity.M.b(T(), new xy1((long) l0, m0, "")));
                return true;
            }
            p0(str);
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean o0(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!g92.v(lowerCase, "myanimelist.net/anime.php?q=", false, 2, (Object) null)) {
                return false;
            }
            String queryParameter = Uri.parse(str).getQueryParameter("q");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String str2 = queryParameter;
            v62.d(str2, "Uri.parse(url).getQueryParameter(\"q\") ?: \"\"");
            startActivity(FastAnimeSearchActivity.c.b(FastAnimeSearchActivity.J, this, str2, false, 4, (Object) null));
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final void p0(String str) {
        startActivity(BasicWebViewBrowser.S.a(T(), str));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        v62.d(intent, "intent");
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        v62.d(dataString, "intent.dataString ?: \"\"");
        if (n0(dataString)) {
            finish();
            return;
        }
        boolean o0 = o0(dataString);
        finish();
    }
}
