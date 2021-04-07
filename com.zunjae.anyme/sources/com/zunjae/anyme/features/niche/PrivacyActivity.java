package com.zunjae.anyme.features.niche;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import defpackage.qt1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class PrivacyActivity extends AbstractActivity {
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<qt1.a> E = b9.a();
    /* access modifiers changed from: private */
    public List<String> F;
    private final boolean G;
    private HashMap H;

    public static final class a extends w62 implements o52<b> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.niche.b, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final b invoke() {
            return lg2.b(this.f, f72.b(b.class), this.g, this.h);
        }
    }

    static final class b<T> implements u<com.zunjae.vresult.a<? extends qt1>> {
        final /* synthetic */ PrivacyActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ b f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.f = bVar;
            }

            public final void a() {
                this.f.a.q0().r();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        b(PrivacyActivity privacyActivity) {
            this.a = privacyActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<qt1> aVar) {
            if (aVar instanceof a.c) {
                RecyclerView recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.h(recyclerView);
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.c(recyclerView2, "Could not connect to Kanon", "Retry", new a(this));
            } else if (aVar instanceof a.e) {
                qt1 qt1 = (qt1) ((a.e) aVar).b();
                a9.a.a(this.a.E, qt1.a(), (d62) null, (d62) null, 6, (Object) null);
                TextView textView = (TextView) this.a.l0(C0275R$id.doesNotCollect);
                v62.d(textView, "doesNotCollect");
                textView.setText("The AnYme app does not collect the following information: " + n32.G(qt1.b(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null));
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.g(recyclerView3);
            }
        }
    }

    static final class c extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ PrivacyActivity f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends qt1.a, e>, u22> {
            public static final a f = new a();

            /* renamed from: com.zunjae.anyme.features.niche.PrivacyActivity$c$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0197a extends u62 implements z52<View, e> {
                public static final C0197a n = new C0197a();

                C0197a() {
                    super(1, e.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final e r(View view) {
                    v62.e(view, "p1");
                    return new e(view);
                }
            }

            static final class b extends w62 implements e62<e, Integer, qt1.a, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(e eVar, int i, qt1.a aVar) {
                    v62.e(eVar, "$receiver");
                    v62.e(aVar, "policy");
                    eVar.N().setText(com.zunjae.extensions.c.a(aVar.b()));
                    eVar.M().setText(aVar.a());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((e) obj, ((Number) obj2).intValue(), (qt1.a) obj3);
                    return u22.a;
                }
            }

            a() {
                super(1);
            }

            public final void a(com.afollestad.recyclical.a<qt1.a, e> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0197a.n, b.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PrivacyActivity privacyActivity) {
            super(1);
            this.f = privacyActivity;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.E);
            cVar.h(new LinearLayoutManager(this.f.T()));
            a aVar = a.f;
            String name = qt1.a.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_privacy_policy, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class d extends w62 implements z52<ve2<PrivacyActivity>, u22> {
        final /* synthetic */ PrivacyActivity f;

        static final class a extends w62 implements z52<PrivacyActivity, u22> {
            final /* synthetic */ d f;
            final /* synthetic */ List g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, List list) {
                super(1);
                this.f = dVar;
                this.g = list;
            }

            public final void a(PrivacyActivity privacyActivity) {
                v62.e(privacyActivity, "it");
                this.f.f.F = this.g;
                this.f.f.invalidateOptionsMenu();
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((PrivacyActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PrivacyActivity privacyActivity) {
            super(1);
            this.f = privacyActivity;
        }

        public final void a(ve2<PrivacyActivity> ve2) {
            Boolean bool;
            ServiceInfo[] serviceInfoArr;
            v62.e(ve2, "$receiver");
            List<ApplicationInfo> installedApplications = this.f.getPackageManager().getInstalledApplications(0);
            v62.d(installedApplications, "packageManager.getInstalledApplications(0)");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = installedApplications.iterator();
            while (true) {
                boolean z = true;
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                PackageInfo packageInfo = this.f.getPackageManager().getPackageInfo(((ApplicationInfo) it.next()).packageName, 4);
                if (packageInfo == null || (serviceInfoArr = packageInfo.services) == null) {
                    bool = null;
                } else {
                    int length = serviceInfoArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        String str2 = serviceInfoArr[i].name;
                        v62.d(str2, "service.name");
                        if (g92.v(str2, "FirebaseMessagingService", false, 2, (Object) null)) {
                            break;
                        }
                        i++;
                    }
                    bool = Boolean.valueOf(z);
                }
                ApplicationInfo applicationInfo = this.f.getPackageManager().getApplicationInfo(packageInfo.packageName, 128);
                v62.d(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
                PackageManager packageManager = this.f.getPackageManager();
                CharSequence applicationLabel = packageManager != null ? packageManager.getApplicationLabel(applicationInfo) : null;
                if (v62.a(bool, Boolean.TRUE)) {
                    str = String.valueOf(applicationLabel);
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (!g92.v((String) next, "AnYme", false, 2, (Object) null)) {
                    arrayList2.add(next);
                }
            }
            List T = n32.T(arrayList2);
            if (T.size() >= 3) {
                we2.d(ve2, new a(this, T));
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    public PrivacyActivity() {
        this.G = Build.VERSION.SDK_INT < 30;
    }

    /* access modifiers changed from: private */
    public final b q0() {
        return (b) this.D.getValue();
    }

    private final void r0() {
        q0().k().g(this, new b(this));
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new c(this));
    }

    private final void s0() {
        if (this.G) {
            we2.c(this, (z52) null, new d(this), 1, (Object) null);
        }
    }

    public View l0(int i) {
        if (this.H == null) {
            this.H = new HashMap();
        }
        View view = (View) this.H.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.H.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_privacy);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        r0();
        s0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem;
        getMenuInflater().inflate(C0279R$menu.privacy_policy, menu);
        if (!(menu == null || (findItem = menu.findItem(C0275R$id.funFact)) == null)) {
            findItem.setVisible(this.F != null);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() != 2131296657) {
            return super.onOptionsItemSelected(menuItem);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The AnYme app is not the only app using Firebase on your phone, here are some others: ");
        List<String> list = this.F;
        v62.c(list);
        sb.append(n32.G(list, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null));
        mw1.q(this, sb.toString(), "Beep Boop");
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!com.zunjae.vresult.b.a(q0().k())) {
            q0().r();
        }
    }
}
