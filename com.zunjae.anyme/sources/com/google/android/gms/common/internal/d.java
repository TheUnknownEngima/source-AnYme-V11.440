package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class d {
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final String e;
    private final String f;
    private final g71 g;
    private Integer h;

    public static final class a {
        private Account a;
        private c0<Scope> b;
        private Map<com.google.android.gms.common.api.a<?>, b> c;
        private int d = 0;
        private View e;
        private String f;
        private String g;
        private g71 h = g71.j;
        private boolean i;

        public final a a(Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new c0<>();
            }
            this.b.addAll(collection);
            return this;
        }

        public final d b() {
            return new d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a c(Account account) {
            this.a = account;
            return this;
        }

        public final a d(String str) {
            this.g = str;
            return this;
        }

        public final a e(String str) {
            this.f = str;
            return this;
        }
    }

    public static final class b {
        public final Set<Scope> a;
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i, View view, String str, String str2, g71 g71, boolean z) {
        this.a = account;
        this.b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.emptyMap() : map;
        this.e = str;
        this.f = str2;
        this.g = g71;
        HashSet hashSet = new HashSet(this.b);
        for (b bVar : this.d.values()) {
            hashSet.addAll(bVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    public final Account a() {
        return this.a;
    }

    public final Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.c;
    }

    @Nullable
    public final Integer d() {
        return this.h;
    }

    @Nullable
    public final String e() {
        return this.f;
    }

    @Nullable
    public final String f() {
        return this.e;
    }

    public final Set<Scope> g() {
        return this.b;
    }

    @Nullable
    public final g71 h() {
        return this.g;
    }

    public final void i(Integer num) {
        this.h = num;
    }
}
