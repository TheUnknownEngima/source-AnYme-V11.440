package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.R$id;
import androidx.mediarouter.R$layout;
import androidx.mediarouter.R$string;
import androidx.mediarouter.media.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class g extends androidx.appcompat.app.g {
    final h g;
    private final c h;
    Context i;
    private androidx.mediarouter.media.g j;
    List<h.f> k;
    private ImageButton l;
    private d m;
    private RecyclerView n;
    private boolean o;
    private long p;
    private long q;
    private final Handler r;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                g.this.m((List) message.obj);
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            g.this.dismiss();
        }
    }

    private final class c extends h.a {
        c() {
        }

        public void d(h hVar, h.f fVar) {
            g.this.j();
        }

        public void e(h hVar, h.f fVar) {
            g.this.j();
        }

        public void g(h hVar, h.f fVar) {
            g.this.j();
        }

        public void h(h hVar, h.f fVar) {
            g.this.dismiss();
        }
    }

    private final class d extends RecyclerView.g<RecyclerView.c0> {
        private final ArrayList<b> c = new ArrayList<>();
        private final LayoutInflater d;
        private final Drawable e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;

        private class a extends RecyclerView.c0 {
            TextView x;

            a(d dVar, View view) {
                super(view);
                this.x = (TextView) view.findViewById(R$id.mr_picker_header_name);
            }

            public void M(b bVar) {
                this.x.setText(bVar.a().toString());
            }
        }

        private class b {
            private final Object a;
            private final int b;

            b(d dVar, Object obj) {
                this.a = obj;
                this.b = obj instanceof String ? 1 : obj instanceof h.f ? 2 : 0;
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        private class c extends RecyclerView.c0 {
            final TextView A;
            final View x;
            final ImageView y;
            final ProgressBar z;

            class a implements View.OnClickListener {
                final /* synthetic */ h.f e;

                a(h.f fVar) {
                    this.e = fVar;
                }

                public void onClick(View view) {
                    this.e.J();
                    c.this.y.setVisibility(4);
                    c.this.z.setVisibility(0);
                }
            }

            c(View view) {
                super(view);
                this.x = view;
                this.y = (ImageView) view.findViewById(R$id.mr_picker_route_icon);
                this.z = (ProgressBar) view.findViewById(R$id.mr_picker_route_progress_bar);
                this.A = (TextView) view.findViewById(R$id.mr_picker_route_name);
                i.t(g.this.i, this.z);
            }

            public void M(b bVar) {
                h.f fVar = (h.f) bVar.a();
                this.x.setVisibility(0);
                this.z.setVisibility(4);
                this.x.setOnClickListener(new a(fVar));
                this.A.setText(fVar.n());
                this.y.setImageDrawable(d.this.I(fVar));
            }
        }

        d() {
            this.d = LayoutInflater.from(g.this.i);
            this.e = i.g(g.this.i);
            this.f = i.q(g.this.i);
            this.g = i.m(g.this.i);
            this.h = i.n(g.this.i);
            K();
        }

        private Drawable H(h.f fVar) {
            int g2 = fVar.g();
            return g2 != 1 ? g2 != 2 ? fVar.z() ? this.h : this.e : this.g : this.f;
        }

        /* access modifiers changed from: package-private */
        public Drawable I(h.f fVar) {
            Uri k = fVar.k();
            if (k != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(g.this.i.getContentResolver().openInputStream(k), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    "Failed to load " + k;
                }
            }
            return H(fVar);
        }

        public b J(int i2) {
            return this.c.get(i2);
        }

        /* access modifiers changed from: package-private */
        public void K() {
            this.c.clear();
            this.c.add(new b(this, g.this.i.getString(R$string.mr_chooser_title)));
            for (h.f bVar : g.this.k) {
                this.c.add(new b(this, bVar));
            }
            l();
        }

        public int g() {
            return this.c.size();
        }

        public int i(int i2) {
            return this.c.get(i2).b();
        }

        public void w(RecyclerView.c0 c0Var, int i2) {
            int i3 = i(i2);
            b J = J(i2);
            if (i3 == 1) {
                ((a) c0Var).M(J);
            } else if (i3 == 2) {
                ((c) c0Var).M(J);
            }
        }

        public RecyclerView.c0 y(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new a(this, this.d.inflate(R$layout.mr_picker_header_item, viewGroup, false));
            }
            if (i2 != 2) {
                return null;
            }
            return new c(this.d.inflate(R$layout.mr_picker_route_item, viewGroup, false));
        }
    }

    static final class e implements Comparator<h.f> {
        public static final e e = new e();

        e() {
        }

        /* renamed from: a */
        public int compare(h.f fVar, h.f fVar2) {
            return fVar.n().compareToIgnoreCase(fVar2.n());
        }
    }

    public g(Context context) {
        this(context, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.g r2 = androidx.mediarouter.media.g.c
            r1.j = r2
            androidx.mediarouter.app.g$a r2 = new androidx.mediarouter.app.g$a
            r2.<init>()
            r1.r = r2
            android.content.Context r2 = r1.getContext()
            androidx.mediarouter.media.h r3 = androidx.mediarouter.media.h.g(r2)
            r1.g = r3
            androidx.mediarouter.app.g$c r3 = new androidx.mediarouter.app.g$c
            r3.<init>()
            r1.h = r3
            r1.i = r2
            android.content.res.Resources r2 = r2.getResources()
            int r3 = androidx.mediarouter.R$integer.mr_update_routes_delay_ms
            int r2 = r2.getInteger(r3)
            long r2 = (long) r2
            r1.p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.g.<init>(android.content.Context, int):void");
    }

    public boolean g(h.f fVar) {
        return !fVar.x() && fVar.y() && fVar.F(this.j);
    }

    public void h(List<h.f> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                if (!g(list.get(i2))) {
                    list.remove(i2);
                }
                size = i2;
            } else {
                return;
            }
        }
    }

    public void j() {
        if (this.o) {
            ArrayList arrayList = new ArrayList(this.g.i());
            h(arrayList);
            Collections.sort(arrayList, e.e);
            if (SystemClock.uptimeMillis() - this.q >= this.p) {
                m(arrayList);
                return;
            }
            this.r.removeMessages(1);
            Handler handler = this.r;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.q + this.p);
        }
    }

    public void k(androidx.mediarouter.media.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.j.equals(gVar)) {
            this.j = gVar;
            if (this.o) {
                this.g.l(this.h);
                this.g.b(gVar, this.h, 1);
            }
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        getWindow().setLayout(f.c(this.i), f.a(this.i));
    }

    /* access modifiers changed from: package-private */
    public void m(List<h.f> list) {
        this.q = SystemClock.uptimeMillis();
        this.k.clear();
        this.k.addAll(list);
        this.m.K();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
        this.g.b(this.j, this.h, 1);
        j();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.mr_picker_dialog);
        i.s(this.i, this);
        this.k = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(R$id.mr_picker_close_button);
        this.l = imageButton;
        imageButton.setOnClickListener(new b());
        this.m = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.mr_picker_list);
        this.n = recyclerView;
        recyclerView.setAdapter(this.m);
        this.n.setLayoutManager(new LinearLayoutManager(this.i));
        l();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o = false;
        this.g.l(this.h);
        this.r.removeMessages(1);
    }
}
