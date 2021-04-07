package com.zunjae.anyme.features.update;

import android.app.DownloadManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import defpackage.bf2;
import defpackage.m22;
import java.util.Arrays;
import java.util.HashMap;

public final class UpdateActivity extends AbstractActivity {
    public static final b G = new b((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public com.afollestad.materialdialogs.f E;
    private HashMap F;

    public static final class a extends w62 implements o52<ut1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [ut1, java.lang.Object] */
        public final ut1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(ut1.class), this.g, this.h);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final Intent a(Context context) {
            v62.e(context, "context");
            return new Intent(context, UpdateActivity.class);
        }
    }

    static final class c extends w62 implements z52<ve2<UpdateActivity>, u22> {
        final /* synthetic */ UpdateActivity f;
        final /* synthetic */ int g;
        final /* synthetic */ long h;
        final /* synthetic */ DownloadManager i;
        final /* synthetic */ long j;

        static final class a extends w62 implements z52<UpdateActivity, u22> {
            final /* synthetic */ c f;
            final /* synthetic */ int g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, int i) {
                super(1);
                this.f = cVar;
                this.g = i;
            }

            public final void a(UpdateActivity updateActivity) {
                v62.e(updateActivity, "it");
                com.afollestad.materialdialogs.f m0 = this.f.f.E;
                if (m0 != null) {
                    m0.s(this.g);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((UpdateActivity) obj);
                return u22.a;
            }
        }

        static final class b extends w62 implements z52<UpdateActivity, u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(1);
                this.f = cVar;
            }

            public final void a(UpdateActivity updateActivity) {
                v62.e(updateActivity, "it");
                this.f.f.s0();
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((UpdateActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UpdateActivity updateActivity, int i2, long j2, DownloadManager downloadManager, long j3) {
            super(1);
            this.f = updateActivity;
            this.g = i2;
            this.h = j2;
            this.i = downloadManager;
            this.j = j3;
        }

        public final void a(ve2<UpdateActivity> ve2) {
            v62.e(ve2, "$receiver");
            int i2 = 0;
            while (i2 < this.g) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(new long[]{this.h});
                Cursor query2 = this.i.query(query);
                query2.moveToFirst();
                int i3 = query2.getInt(query2.getColumnIndex("bytes_so_far"));
                int i4 = query2.getInt(query2.getColumnIndex("total_size"));
                int i5 = query2.getInt(query2.getColumnIndex("status"));
                UpdateActivity updateActivity = this.f;
                v62.d(query2, "cursor");
                String q0 = updateActivity.y0(query2, i3);
                int i6 = (i3 / i4) * 100;
                uj2.f((((double) i3) / 1000000.0d) + ' ' + i4 + ", " + q0, new Object[0]);
                if (i5 == 2) {
                    we2.d(ve2, new a(this, i6));
                }
                if (i5 != 8) {
                    if (i5 == 16) {
                        we2.d(ve2, new b(this));
                        return;
                    }
                    try {
                        Thread.sleep(this.j);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class d extends w62 implements z52<String, u22> {
        final /* synthetic */ UpdateActivity f;

        static final class a extends w62 implements z52<ve2<UpdateActivity>, u22> {
            final /* synthetic */ d f;
            final /* synthetic */ String g;

            /* renamed from: com.zunjae.anyme.features.update.UpdateActivity$d$a$a  reason: collision with other inner class name */
            static final class C0210a extends w62 implements z52<UpdateActivity, u22> {
                final /* synthetic */ a f;
                final /* synthetic */ Object g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0210a(a aVar, Object obj) {
                    super(1);
                    this.f = aVar;
                    this.g = obj;
                }

                public final void a(UpdateActivity updateActivity) {
                    v62.e(updateActivity, "it");
                    Object obj = this.g;
                    Throwable b = m22.b(obj);
                    if (b == null) {
                        String str = (String) obj;
                        uj2.a("Success with endpoint " + str, new Object[0]);
                        this.f.f.f.x0(str);
                        return;
                    }
                    com.afollestad.materialdialogs.f m0 = this.f.f.f.E;
                    if (m0 != null) {
                        m0.dismiss();
                    }
                    uj2.a("Failure ): " + b.getMessage(), new Object[0]);
                    this.f.f.f.s0();
                }

                public /* bridge */ /* synthetic */ Object r(Object obj) {
                    a((UpdateActivity) obj);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, String str) {
                super(1);
                this.f = dVar;
                this.g = str;
            }

            public final void a(ve2<UpdateActivity> ve2) {
                Object obj;
                v62.e(ve2, "$receiver");
                try {
                    bf2 a = df2.a(this.g);
                    a.b(false);
                    a.e(true);
                    bf2.e h = a.h();
                    if (h.v() == 302) {
                        m22.a aVar = m22.e;
                        obj = h.t("location");
                    } else {
                        m22.a aVar2 = m22.e;
                        obj = h.m().toExternalForm();
                    }
                    m22.a(obj);
                } catch (Exception e) {
                    uj2.d(e);
                    m22.a aVar3 = m22.e;
                    obj = n22.a(e);
                    m22.a(obj);
                }
                we2.d(ve2, new C0210a(this, obj));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((ve2) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UpdateActivity updateActivity) {
            super(1);
            this.f = updateActivity;
        }

        public final void a(String str) {
            v62.e(str, "updateURL");
            we2.c(this.f, (z52) null, new a(this, str), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((String) obj);
            return u22.a;
        }
    }

    public static final class e implements ci2<com.zunjae.anyme.features.niche.au.a> {
        final /* synthetic */ UpdateActivity a;
        final /* synthetic */ d b;

        e(UpdateActivity updateActivity, d dVar) {
            this.a = updateActivity;
            this.b = dVar;
        }

        public void a(ai2<com.zunjae.anyme.features.niche.au.a> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
            uj2.d(th);
            this.a.s0();
        }

        public void b(ai2<com.zunjae.anyme.features.niche.au.a> ai2, qi2<com.zunjae.anyme.features.niche.au.a> qi2) {
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            com.zunjae.anyme.features.niche.au.a a2 = qi2.a();
            String a3 = a2 != null ? a2.a() : null;
            if (a3 == null || !g92.v(a3, "https://", false, 2, (Object) null)) {
                this.a.s0();
            } else {
                this.b.a(a3);
            }
        }
    }

    static final class f implements View.OnClickListener {
        final /* synthetic */ UpdateActivity e;

        f(UpdateActivity updateActivity) {
            this.e = updateActivity;
        }

        public final void onClick(View view) {
            this.e.s0();
        }
    }

    static final class g implements View.OnClickListener {
        final /* synthetic */ UpdateActivity e;

        g(UpdateActivity updateActivity) {
            this.e = updateActivity;
        }

        public final void onClick(View view) {
            mw1.c(this.e, "Check the Discord server for the changelog", "Info").D();
        }
    }

    static final class h implements View.OnClickListener {
        final /* synthetic */ UpdateActivity e;

        h(UpdateActivity updateActivity) {
            this.e = updateActivity;
        }

        public final void onClick(View view) {
            mw1.c(this.e, "Updating the app will take less than a minute", "Info").D();
        }
    }

    static final class i implements View.OnClickListener {
        final /* synthetic */ UpdateActivity e;

        i(UpdateActivity updateActivity) {
            this.e = updateActivity;
        }

        public final void onClick(View view) {
            com.afollestad.materialdialogs.f m0 = this.e.E;
            if (m0 != null) {
                m0.show();
            }
            this.e.u0();
        }
    }

    private final ut1 r0() {
        return (ut1) this.D.getValue();
    }

    /* access modifiers changed from: private */
    public final void s0() {
        g0(qv1.a.a());
    }

    private final void t0(long j, DownloadManager downloadManager) {
        we2.c(this, (z52) null, new c(this, (int) (((long) 30000) / 150), j, downloadManager, 150), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void u0() {
        r0().b().Q(new e(this, new d(this)));
    }

    private final void v0() {
        xv1.a.b();
        wv1 wv1 = wv1.Alpha;
        ((TextView) l0(C0275R$id.manualUpdateButton)).setOnClickListener(new f(this));
        ((Button) l0(C0275R$id.changelogButton)).setOnClickListener(new g(this));
        ((TextView) l0(C0275R$id.skipThisUpdate)).setOnClickListener(new h(this));
        ((Button) l0(C0275R$id.inAppUpdateButton)).setOnClickListener(new i(this));
        Button button = (Button) l0(C0275R$id.inAppUpdateButton);
        v62.d(button, "inAppUpdateButton");
        button.setAnimation(gw1.a.a(1.0d, 0.75d, 300));
        String string = getString(C0283R$string.curnew);
        v62.d(string, "getString(R.string.curnew)");
        String format = String.format(string, Arrays.copyOf(new Object[]{com.zunjae.zapplib.a.f(this), Double.valueOf(qv1.a.g())}, 2));
        v62.d(format, "java.lang.String.format(this, *args)");
        TextView textView = (TextView) l0(C0275R$id.version);
        v62.d(textView, "version");
        textView.setText(format);
    }

    private final void w0() {
        f.e eVar = new f.e(this);
        eVar.E(getTitle());
        eVar.i("Downloading .APK file... Please wait");
        eVar.C(true, 0);
        this.E = eVar.c();
    }

    /* access modifiers changed from: private */
    public final void x0(String str) {
        uj2.a("Will work with url: " + str, new Object[0]);
        String str2 = "AnYme Update " + qv1.a.g();
        Uri parse = Uri.parse(str);
        Object systemService = T().getSystemService("download");
        if (systemService != null) {
            DownloadManager downloadManager = (DownloadManager) systemService;
            long enqueue = downloadManager.enqueue(new DownloadManager.Request(parse).setNotificationVisibility(0).setTitle(str2));
            T().registerReceiver(new DownloadBroadcastReceiver(enqueue), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            t0(enqueue, downloadManager);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }

    /* access modifiers changed from: private */
    public final String y0(Cursor cursor, int i2) {
        StringBuilder sb;
        String str;
        int i3 = cursor.getInt(cursor.getColumnIndex("status"));
        if (i3 == 1) {
            sb = new StringBuilder();
            str = "Download pending: ";
        } else if (i3 == 2) {
            sb = new StringBuilder();
            str = "Download in progress: ";
        } else if (i3 == 4) {
            sb = new StringBuilder();
            str = "Download paused: ";
        } else if (i3 == 8) {
            sb = new StringBuilder();
            str = "Download complete: ";
        } else if (i3 != 16) {
            return "STATUS MESSAGE ERROR";
        } else {
            sb = new StringBuilder();
            str = "Download failed: ";
        }
        sb.append(str);
        sb.append(i2);
        sb.append(" bytes downloaded.");
        return sb.toString();
    }

    @vq1
    public final void downloadBroadcastResult(a aVar) {
        v62.e(aVar, "result");
        com.afollestad.materialdialogs.f fVar = this.E;
        if (fVar != null) {
            fVar.dismiss();
        }
        if (b.a[aVar.ordinal()] == 2) {
            s0();
        }
    }

    public View l0(int i2) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.F.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_update);
        v0();
        w0();
    }

    public void onStart() {
        super.onStart();
        cw1.k.a().j(this);
    }

    public void onStop() {
        super.onStop();
        cw1.k.a().l(this);
    }
}
