package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.r;

final class m {
    private final String a;
    private final Intent b;

    static class a implements dh1<m> {
        a() {
        }

        /* renamed from: b */
        public void a(m mVar, eh1 eh1) {
            Intent b = mVar.b();
            eh1.c("ttl", p.q(b));
            eh1.f("event", mVar.a());
            eh1.f("instanceId", p.e());
            eh1.c("priority", p.n(b));
            eh1.f("packageName", p.m());
            eh1.f("sdkPlatform", "ANDROID");
            eh1.f("messageType", p.k(b));
            String g = p.g(b);
            if (g != null) {
                eh1.f("messageId", g);
            }
            String p = p.p(b);
            if (p != null) {
                eh1.f("topic", p);
            }
            String b2 = p.b(b);
            if (b2 != null) {
                eh1.f("collapseKey", b2);
            }
            if (p.h(b) != null) {
                eh1.f("analyticsLabel", p.h(b));
            }
            if (p.d(b) != null) {
                eh1.f("composerLabel", p.d(b));
            }
            String o = p.o();
            if (o != null) {
                eh1.f("projectNumber", o);
            }
        }
    }

    static final class b {
        private final m a;

        b(m mVar) {
            r.j(mVar);
            this.a = mVar;
        }

        /* access modifiers changed from: package-private */
        public final m a() {
            return this.a;
        }
    }

    static final class c implements dh1<b> {
        c() {
        }

        /* renamed from: b */
        public final void a(b bVar, eh1 eh1) {
            eh1.f("messaging_client_event", bVar.a());
        }
    }

    m(String str, Intent intent) {
        r.g(str, "evenType must be non-null");
        this.a = str;
        r.k(intent, "intent must be non-null");
        this.b = intent;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final Intent b() {
        return this.b;
    }
}
