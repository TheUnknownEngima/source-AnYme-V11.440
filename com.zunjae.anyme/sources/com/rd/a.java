package com.rd;

import defpackage.wo1;

public class a implements wo1.a {
    private rp1 a;
    private uo1 b;
    private C0156a c;

    /* renamed from: com.rd.a$a  reason: collision with other inner class name */
    interface C0156a {
        void c();
    }

    a(C0156a aVar) {
        this.c = aVar;
        rp1 rp1 = new rp1();
        this.a = rp1;
        this.b = new uo1(rp1.b(), this);
    }

    public void a(xo1 xo1) {
        this.a.g(xo1);
        C0156a aVar = this.c;
        if (aVar != null) {
            aVar.c();
        }
    }

    public uo1 b() {
        return this.b;
    }

    public rp1 c() {
        return this.a;
    }

    public vp1 d() {
        return this.a.b();
    }
}
