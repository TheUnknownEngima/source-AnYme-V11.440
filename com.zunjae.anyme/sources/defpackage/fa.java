package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: fa  reason: default package */
public class fa implements y9<File, jb> {
    private y9<jb, String> a;

    public fa(y9<jb, String> y9Var) {
        this.a = y9Var;
    }

    public /* bridge */ /* synthetic */ Object a(Object obj) {
        d((jb) obj);
        throw null;
    }

    /* renamed from: c */
    public jb b(File file) {
        try {
            return this.a.a(qa.f(file));
        } catch (IOException unused) {
            return null;
        }
    }

    public File d(jb jbVar) {
        throw new UnsupportedOperationException("from(Session value) not supported");
    }
}
