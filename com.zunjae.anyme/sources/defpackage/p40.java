package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: p40  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class p40 implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ p40(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return v50.i0(this.a, runnable);
    }
}
