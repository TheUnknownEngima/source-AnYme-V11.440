package com.zunjae.anyme.features.database;

import androidx.lifecycle.LiveData;
import com.zunjae.downloader.b;
import java.util.ArrayList;
import java.util.List;

public abstract class a {
    public abstract List<Integer> A(int i);

    public abstract LiveData<sy1> B(long j);

    public abstract LiveData<List<bs1>> C(int i);

    public abstract Object D(List<Long> list, k42<? super List<b>> k42);

    public abstract LiveData<List<uv1>> E();

    public abstract Integer F(int i);

    public abstract LiveData<Integer> G(int i);

    public abstract LiveData<Integer> H();

    public abstract LiveData<Integer> I();

    public abstract List<ux1> J(long j, long j2);

    public abstract List<bz1> K(int i, long j);

    public abstract int L(int i);

    public abstract LiveData<List<vv1>> M();

    public abstract List<Integer> N();

    public abstract LiveData<List<sy1>> O(int i);

    public abstract void P(List<sy1> list);

    public abstract void Q(List<bs1> list);

    public abstract void R(ArrayList<zy1> arrayList);

    public abstract void S(List<? extends az1> list);

    public abstract List<xy1> T(List<Integer> list);

    public abstract LiveData<List<bs1>> U();

    public abstract LiveData<List<sy1>> V();

    public abstract List<Integer> W();

    public abstract LiveData<Integer> X();

    public abstract List<ry1> Y(List<Integer> list);

    public abstract xy1 Z();

    public abstract void a(lx1 lx1);

    public void a0(List<bs1> list) {
        v62.e(list, "entries");
        p();
        Q(list);
    }

    public abstract void b(sy1 sy1);

    public abstract Object b0(b bVar, k42<? super u22> k42);

    public abstract LiveData<List<sy1>> c();

    public void c0(ArrayList<zy1> arrayList) {
        v62.e(arrayList, "shows");
        q();
        R(arrayList);
    }

    public abstract List<Integer> d();

    public abstract void d0(List<ux1> list);

    public abstract LiveData<List<sy1>> e();

    public void e0(List<? extends az1> list, int i) {
        v62.e(list, "entries");
        s(i);
        S(list);
    }

    public abstract LiveData<List<bs1>> f();

    public abstract List<ty1> f0();

    public abstract List<Long> g();

    public abstract int g0();

    public abstract LiveData<List<sy1>> h();

    public abstract void h0(sy1 sy1);

    public abstract List<yy1> i();

    public void i0(List<sy1> list) {
        v62.e(list, "animeR2s");
        o();
        P(list);
    }

    public abstract List<sy1> j();

    public abstract List<sy1> k(int i);

    public abstract List<Integer> l(int i);

    public abstract List<Integer> m();

    public abstract int n(int i);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(sy1 sy1);

    public abstract void u(int i);

    public abstract int v();

    public abstract lx1 w(long j, long j2);

    public abstract LiveData<lx1> x(long j);

    public abstract sy1 y(long j);

    public abstract LiveData<List<sy1>> z(int i);
}
