package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.g;
import androidx.mediarouter.R$attr;
import androidx.mediarouter.R$id;
import androidx.mediarouter.R$layout;
import androidx.mediarouter.media.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a extends g {
    private final h g;
    private final b h;
    private TextView i;
    private androidx.mediarouter.media.g j;
    private ArrayList<h.f> k;
    private c l;
    private ListView m;
    private boolean n;
    private long o;
    private final Handler p;

    /* renamed from: androidx.mediarouter.app.a$a  reason: collision with other inner class name */
    class C0030a extends Handler {
        C0030a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                a.this.m((List) message.obj);
            }
        }
    }

    private final class b extends h.a {
        b() {
        }

        public void d(h hVar, h.f fVar) {
            a.this.j();
        }

        public void e(h hVar, h.f fVar) {
            a.this.j();
        }

        public void g(h hVar, h.f fVar) {
            a.this.j();
        }

        public void h(h hVar, h.f fVar) {
            a.this.dismiss();
        }
    }

    private final class c extends ArrayAdapter<h.f> implements AdapterView.OnItemClickListener {
        private final LayoutInflater e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;

        public c(Context context, List<h.f> list) {
            super(context, 0, list);
            this.e = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R$attr.mediaRouteDefaultIconDrawable, R$attr.mediaRouteTvIconDrawable, R$attr.mediaRouteSpeakerIconDrawable, R$attr.mediaRouteSpeakerGroupIconDrawable});
            this.f = obtainStyledAttributes.getDrawable(0);
            this.g = obtainStyledAttributes.getDrawable(1);
            this.h = obtainStyledAttributes.getDrawable(2);
            this.i = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        private Drawable a(h.f fVar) {
            int g2 = fVar.g();
            return g2 != 1 ? g2 != 2 ? fVar.z() ? this.i : this.f : this.h : this.g;
        }

        private Drawable b(h.f fVar) {
            Uri k = fVar.k();
            if (k != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(k), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    "Failed to load " + k;
                }
            }
            return a(fVar);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.e.inflate(R$layout.mr_chooser_list_item, viewGroup, false);
            }
            h.f fVar = (h.f) getItem(i2);
            TextView textView = (TextView) view.findViewById(R$id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(R$id.mr_chooser_route_desc);
            textView.setText(fVar.n());
            String e2 = fVar.e();
            boolean z = true;
            if (!(fVar.c() == 2 || fVar.c() == 1)) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(e2)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(e2);
            }
            view.setEnabled(fVar.y());
            ImageView imageView = (ImageView) view.findViewById(R$id.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(b(fVar));
            }
            return view;
        }

        public boolean isEnabled(int i2) {
            return ((h.f) getItem(i2)).y();
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            h.f fVar = (h.f) getItem(i2);
            if (fVar.y()) {
                fVar.J();
                a.this.dismiss();
            }
        }
    }

    static final class d implements Comparator<h.f> {
        public static final d e = new d();

        d() {
        }

        /* renamed from: a */
        public int compare(h.f fVar, h.f fVar2) {
            return fVar.n().compareToIgnoreCase(fVar2.n());
        }
    }

    public a(Context context) {
        this(context, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.g r2 = androidx.mediarouter.media.g.c
            r1.j = r2
            androidx.mediarouter.app.a$a r2 = new androidx.mediarouter.app.a$a
            r2.<init>()
            r1.p = r2
            android.content.Context r2 = r1.getContext()
            androidx.mediarouter.media.h r2 = androidx.mediarouter.media.h.g(r2)
            r1.g = r2
            androidx.mediarouter.app.a$b r2 = new androidx.mediarouter.app.a$b
            r2.<init>()
            r1.h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.a.<init>(android.content.Context, int):void");
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
        if (this.n) {
            ArrayList arrayList = new ArrayList(this.g.i());
            h(arrayList);
            Collections.sort(arrayList, d.e);
            if (SystemClock.uptimeMillis() - this.o >= 300) {
                m(arrayList);
                return;
            }
            this.p.removeMessages(1);
            Handler handler = this.p;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.o + 300);
        }
    }

    public void k(androidx.mediarouter.media.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.j.equals(gVar)) {
            this.j = gVar;
            if (this.n) {
                this.g.l(this.h);
                this.g.b(gVar, this.h, 1);
            }
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        getWindow().setLayout(f.b(getContext()), -2);
    }

    /* access modifiers changed from: package-private */
    public void m(List<h.f> list) {
        this.o = SystemClock.uptimeMillis();
        this.k.clear();
        this.k.addAll(list);
        this.l.notifyDataSetChanged();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        this.g.b(this.j, this.h, 1);
        j();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.mr_chooser_dialog);
        this.k = new ArrayList<>();
        this.l = new c(getContext(), this.k);
        ListView listView = (ListView) findViewById(R$id.mr_chooser_list);
        this.m = listView;
        listView.setAdapter(this.l);
        this.m.setOnItemClickListener(this.l);
        this.m.setEmptyView(findViewById(16908292));
        this.i = (TextView) findViewById(R$id.mr_chooser_title);
        l();
    }

    public void onDetachedFromWindow() {
        this.n = false;
        this.g.l(this.h);
        this.p.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public void setTitle(int i2) {
        this.i.setText(i2);
    }

    public void setTitle(CharSequence charSequence) {
        this.i.setText(charSequence);
    }
}
