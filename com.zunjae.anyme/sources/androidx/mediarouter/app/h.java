package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.R$dimen;
import androidx.mediarouter.R$id;
import androidx.mediarouter.R$integer;
import androidx.mediarouter.R$layout;
import androidx.mediarouter.R$string;
import androidx.mediarouter.media.d;
import androidx.mediarouter.media.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class h extends androidx.appcompat.app.g {
    static final boolean U = Log.isLoggable("MediaRouteCtrlDialog", 3);
    boolean A;
    private boolean B;
    private boolean C;
    private ImageButton D;
    private Button E;
    private ImageView F;
    private View G;
    ImageView H;
    private TextView I;
    private TextView J;
    private String K;
    MediaControllerCompat L;
    e M;
    MediaDescriptionCompat N;
    d O;
    Bitmap P;
    Uri Q;
    boolean R;
    Bitmap S;
    int T;
    final androidx.mediarouter.media.h g;
    private final g h;
    private androidx.mediarouter.media.g i;
    h.f j;
    final List<h.f> k;
    final List<h.f> l;
    final List<h.f> m;
    final List<h.f> n;
    Context o;
    private boolean p;
    private boolean q;
    private long r;
    final Handler s;
    RecyclerView t;
    C0032h u;
    j v;
    Map<String, f> w;
    h.f x;
    Map<String, Integer> y;
    boolean z;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                h.this.v();
            } else if (i == 2) {
                h hVar = h.this;
                if (hVar.x != null) {
                    hVar.x = null;
                    hVar.w();
                }
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            h.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            if (h.this.j.D()) {
                h.this.g.p(2);
            }
            h.this.dismiss();
        }
    }

    private class d extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap a;
        private final Uri b;
        private int c;

        d() {
            MediaDescriptionCompat mediaDescriptionCompat = h.this.N;
            Uri uri = null;
            Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
            this.a = h.k(b2) ? null : b2;
            MediaDescriptionCompat mediaDescriptionCompat2 = h.this.N;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : uri;
        }

        private InputStream e(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = h.this.o.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(4:7|8|(2:10|11)|12)(3:14|15|(2:(2:46|47)|48)(8:19|20|21|22|(3:24|(2:26|27)|28)|30|31|(2:(2:34|35)|36)(4:38|39|(2:41|42)|43)))|53|54|(2:56|57)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|(3:24|(2:26|27)|28)|30|31|(2:(2:34|35)|36)(4:38|39|(2:41|42)|43)) */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b6, code lost:
            r8 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b7, code lost:
            r3 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0042 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00a0 */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ IOException -> 0x00a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2 A[SYNTHETIC, Splitter:B:56:0x00b2] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba A[SYNTHETIC, Splitter:B:61:0x00ba] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r8) {
            /*
                r7 = this;
                java.lang.String r8 = "Unable to open: "
                android.graphics.Bitmap r0 = r7.a
                r1 = 0
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x000b
                goto L_0x00bf
            L_0x000b:
                android.net.Uri r0 = r7.b
                if (r0 == 0) goto L_0x00be
                java.io.InputStream r0 = r7.e(r0)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
                if (r0 != 0) goto L_0x002b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0 }
                r4.<init>()     // Catch:{ IOException -> 0x00a0 }
                r4.append(r8)     // Catch:{ IOException -> 0x00a0 }
                android.net.Uri r5 = r7.b     // Catch:{ IOException -> 0x00a0 }
                r4.append(r5)     // Catch:{ IOException -> 0x00a0 }
                r4.toString()     // Catch:{ IOException -> 0x00a0 }
                if (r0 == 0) goto L_0x002a
                r0.close()     // Catch:{ IOException -> 0x002a }
            L_0x002a:
                return r3
            L_0x002b:
                android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00a0 }
                r4.<init>()     // Catch:{ IOException -> 0x00a0 }
                r4.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x00a0 }
                android.graphics.BitmapFactory.decodeStream(r0, r3, r4)     // Catch:{ IOException -> 0x00a0 }
                int r5 = r4.outWidth     // Catch:{ IOException -> 0x00a0 }
                if (r5 == 0) goto L_0x0097
                int r5 = r4.outHeight     // Catch:{ IOException -> 0x00a0 }
                if (r5 != 0) goto L_0x003e
                goto L_0x0097
            L_0x003e:
                r0.reset()     // Catch:{ IOException -> 0x0042 }
                goto L_0x0063
            L_0x0042:
                r0.close()     // Catch:{ IOException -> 0x00a0 }
                android.net.Uri r5 = r7.b     // Catch:{ IOException -> 0x00a0 }
                java.io.InputStream r0 = r7.e(r5)     // Catch:{ IOException -> 0x00a0 }
                if (r0 != 0) goto L_0x0063
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a0 }
                r4.<init>()     // Catch:{ IOException -> 0x00a0 }
                r4.append(r8)     // Catch:{ IOException -> 0x00a0 }
                android.net.Uri r5 = r7.b     // Catch:{ IOException -> 0x00a0 }
                r4.append(r5)     // Catch:{ IOException -> 0x00a0 }
                r4.toString()     // Catch:{ IOException -> 0x00a0 }
                if (r0 == 0) goto L_0x0062
                r0.close()     // Catch:{ IOException -> 0x0062 }
            L_0x0062:
                return r3
            L_0x0063:
                r4.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x00a0 }
                androidx.mediarouter.app.h r5 = androidx.mediarouter.app.h.this     // Catch:{ IOException -> 0x00a0 }
                android.content.Context r5 = r5.o     // Catch:{ IOException -> 0x00a0 }
                android.content.res.Resources r5 = r5.getResources()     // Catch:{ IOException -> 0x00a0 }
                int r6 = androidx.mediarouter.R$dimen.mr_cast_meta_art_size     // Catch:{ IOException -> 0x00a0 }
                int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ IOException -> 0x00a0 }
                int r6 = r4.outHeight     // Catch:{ IOException -> 0x00a0 }
                int r6 = r6 / r5
                int r5 = java.lang.Integer.highestOneBit(r6)     // Catch:{ IOException -> 0x00a0 }
                int r5 = java.lang.Math.max(r2, r5)     // Catch:{ IOException -> 0x00a0 }
                r4.inSampleSize = r5     // Catch:{ IOException -> 0x00a0 }
                boolean r5 = r7.isCancelled()     // Catch:{ IOException -> 0x00a0 }
                if (r5 == 0) goto L_0x008c
                if (r0 == 0) goto L_0x008b
                r0.close()     // Catch:{ IOException -> 0x008b }
            L_0x008b:
                return r3
            L_0x008c:
                android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r0, r3, r4)     // Catch:{ IOException -> 0x00a0 }
                if (r0 == 0) goto L_0x0095
                r0.close()     // Catch:{ IOException -> 0x0095 }
            L_0x0095:
                r0 = r8
                goto L_0x00bf
            L_0x0097:
                if (r0 == 0) goto L_0x009c
                r0.close()     // Catch:{ IOException -> 0x009c }
            L_0x009c:
                return r3
            L_0x009d:
                r8 = move-exception
                goto L_0x00b8
            L_0x009f:
                r0 = r3
            L_0x00a0:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
                r4.<init>()     // Catch:{ all -> 0x00b6 }
                r4.append(r8)     // Catch:{ all -> 0x00b6 }
                android.net.Uri r8 = r7.b     // Catch:{ all -> 0x00b6 }
                r4.append(r8)     // Catch:{ all -> 0x00b6 }
                r4.toString()     // Catch:{ all -> 0x00b6 }
                if (r0 == 0) goto L_0x00be
                r0.close()     // Catch:{ IOException -> 0x00be }
                goto L_0x00be
            L_0x00b6:
                r8 = move-exception
                r3 = r0
            L_0x00b8:
                if (r3 == 0) goto L_0x00bd
                r3.close()     // Catch:{ IOException -> 0x00bd }
            L_0x00bd:
                throw r8
            L_0x00be:
                r0 = r3
            L_0x00bf:
                boolean r8 = androidx.mediarouter.app.h.k(r0)
                if (r8 == 0) goto L_0x00d6
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r8.append(r1)
                r8.append(r0)
                r8.toString()
                return r3
            L_0x00d6:
                if (r0 == 0) goto L_0x0109
                int r8 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r8 >= r3) goto L_0x0109
                c6$b r8 = new c6$b
                r8.<init>(r0)
                r8.c(r2)
                c6 r8 = r8.a()
                java.util.List r2 = r8.f()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00f9
                goto L_0x0107
            L_0x00f9:
                java.util.List r8 = r8.f()
                java.lang.Object r8 = r8.get(r1)
                c6$d r8 = (defpackage.c6.d) r8
                int r1 = r8.e()
            L_0x0107:
                r7.c = r1
            L_0x0109:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.h.d.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* access modifiers changed from: package-private */
        public Bitmap b() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Uri c() {
            return this.b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Bitmap bitmap) {
            h hVar = h.this;
            hVar.O = null;
            if (!p3.a(hVar.P, this.a) || !p3.a(h.this.Q, this.b)) {
                h hVar2 = h.this;
                hVar2.P = this.a;
                hVar2.S = bitmap;
                hVar2.Q = this.b;
                hVar2.T = this.c;
                hVar2.R = true;
                hVar2.t();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            h.this.h();
        }
    }

    private final class e extends MediaControllerCompat.a {
        e() {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
            h.this.N = mediaMetadataCompat == null ? null : mediaMetadataCompat.e();
            h.this.n();
            h.this.t();
        }

        public void i() {
            h hVar = h.this;
            MediaControllerCompat mediaControllerCompat = hVar.L;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.h(hVar.M);
                h.this.L = null;
            }
        }
    }

    private abstract class f extends RecyclerView.c0 {
        h.f x;
        final ImageButton y;
        final MediaRouteVolumeSlider z;

        class a implements View.OnClickListener {
            a() {
            }

            public void onClick(View view) {
                h hVar = h.this;
                if (hVar.x != null) {
                    hVar.s.removeMessages(2);
                }
                f fVar = f.this;
                h.this.x = fVar.x;
                boolean z = !view.isActivated();
                int N = z ? 0 : f.this.N();
                f.this.O(z);
                f.this.z.setProgress(N);
                f.this.x.H(N);
                h.this.s.sendEmptyMessageDelayed(2, 500);
            }
        }

        f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.y = imageButton;
            this.z = mediaRouteVolumeSlider;
            this.y.setImageDrawable(i.k(h.this.o));
            i.v(h.this.o, this.z);
        }

        /* access modifiers changed from: package-private */
        public void M(h.f fVar) {
            this.x = fVar;
            int t = fVar.t();
            this.y.setActivated(t == 0);
            this.y.setOnClickListener(new a());
            this.z.setTag(this.x);
            this.z.setMax(fVar.v());
            this.z.setProgress(t);
            this.z.setOnSeekBarChangeListener(h.this.v);
        }

        /* access modifiers changed from: package-private */
        public int N() {
            Integer num = h.this.y.get(this.x.l());
            if (num == null) {
                return 1;
            }
            return Math.max(1, num.intValue());
        }

        /* access modifiers changed from: package-private */
        public void O(boolean z2) {
            if (this.y.isActivated() != z2) {
                this.y.setActivated(z2);
                if (z2) {
                    h.this.y.put(this.x.l(), Integer.valueOf(this.z.getProgress()));
                } else {
                    h.this.y.remove(this.x.l());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void P() {
            int t = this.x.t();
            O(t == 0);
            this.z.setProgress(t);
        }
    }

    private final class g extends h.a {
        g() {
        }

        public void d(androidx.mediarouter.media.h hVar, h.f fVar) {
            h.this.v();
        }

        public void e(androidx.mediarouter.media.h hVar, h.f fVar) {
            boolean z;
            h.f.a i;
            if (fVar == h.this.j && fVar.i() != null) {
                Iterator<h.f> it = fVar.r().f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h.f next = it.next();
                    if (!h.this.j.m().contains(next) && (i = next.i()) != null && i.b() && !h.this.l.contains(next)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                h.this.w();
                h.this.u();
                return;
            }
            h.this.v();
        }

        public void g(androidx.mediarouter.media.h hVar, h.f fVar) {
            h.this.v();
        }

        public void h(androidx.mediarouter.media.h hVar, h.f fVar) {
            h hVar2 = h.this;
            hVar2.j = fVar;
            hVar2.z = false;
            hVar2.w();
            h.this.u();
        }

        public void i(androidx.mediarouter.media.h hVar, h.f fVar) {
            h.this.v();
        }

        public void k(androidx.mediarouter.media.h hVar, h.f fVar) {
            f fVar2;
            int t = fVar.t();
            if (h.U) {
                "onRouteVolumeChanged(), route.getVolume:" + t;
            }
            h hVar2 = h.this;
            if (hVar2.x != fVar && (fVar2 = hVar2.w.get(fVar.l())) != null) {
                fVar2.P();
            }
        }
    }

    /* renamed from: androidx.mediarouter.app.h$h  reason: collision with other inner class name */
    private final class C0032h extends RecyclerView.g<RecyclerView.c0> {
        private final ArrayList<f> c = new ArrayList<>();
        private final LayoutInflater d;
        private final Drawable e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private f i;
        private final int j;
        private final Interpolator k;

        /* renamed from: androidx.mediarouter.app.h$h$a */
        class a extends Animation {
            final /* synthetic */ int e;
            final /* synthetic */ int f;
            final /* synthetic */ View g;

            a(C0032h hVar, int i, int i2, View view) {
                this.e = i;
                this.f = i2;
                this.g = view;
            }

            /* access modifiers changed from: protected */
            public void applyTransformation(float f2, Transformation transformation) {
                int i = this.e;
                int i2 = this.f;
                h.o(this.g, i2 + ((int) (((float) (i - i2)) * f2)));
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$b */
        class b implements Animation.AnimationListener {
            b() {
            }

            public void onAnimationEnd(Animation animation) {
                h hVar = h.this;
                hVar.A = false;
                hVar.w();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                h.this.A = true;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$c */
        private class c extends RecyclerView.c0 {
            final TextView A;
            final float B;
            h.f C;
            final View x;
            final ImageView y;
            final ProgressBar z;

            /* renamed from: androidx.mediarouter.app.h$h$c$a */
            class a implements View.OnClickListener {
                a() {
                }

                public void onClick(View view) {
                    c cVar = c.this;
                    h.this.z = true;
                    cVar.C.J();
                    c.this.y.setVisibility(4);
                    c.this.z.setVisibility(0);
                }
            }

            c(View view) {
                super(view);
                this.x = view;
                this.y = (ImageView) view.findViewById(R$id.mr_cast_group_icon);
                this.z = (ProgressBar) view.findViewById(R$id.mr_cast_group_progress_bar);
                this.A = (TextView) view.findViewById(R$id.mr_cast_group_name);
                this.B = i.h(h.this.o);
                i.t(h.this.o, this.z);
            }

            private boolean N(h.f fVar) {
                if (h.this.j.i() != null) {
                    List<h.f> m = h.this.j.m();
                    return (m.size() == 1 && m.get(0) == fVar) ? false : true;
                }
            }

            /* access modifiers changed from: package-private */
            public void M(f fVar) {
                h.f fVar2 = (h.f) fVar.a();
                this.C = fVar2;
                this.y.setVisibility(0);
                this.z.setVisibility(4);
                this.x.setAlpha(N(fVar2) ? 1.0f : this.B);
                this.x.setOnClickListener(new a());
                this.y.setImageDrawable(C0032h.this.J(fVar2));
                this.A.setText(fVar2.n());
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$d */
        private class d extends f {
            private final TextView B;
            private final int C;

            d(View view) {
                super(view, (ImageButton) view.findViewById(R$id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R$id.mr_cast_volume_slider));
                this.B = (TextView) view.findViewById(R$id.mr_group_volume_route_name);
                Resources resources = h.this.o.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R$dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.C = (int) typedValue.getDimension(displayMetrics);
            }

            /* access modifiers changed from: package-private */
            public void Q(f fVar) {
                h.o(this.e, C0032h.this.L() ? this.C : 0);
                h.f fVar2 = (h.f) fVar.a();
                super.M(fVar2);
                this.B.setText(fVar2.n());
            }

            /* access modifiers changed from: package-private */
            public int R() {
                return this.C;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$e */
        private class e extends RecyclerView.c0 {
            private final TextView x;

            e(C0032h hVar, View view) {
                super(view);
                this.x = (TextView) view.findViewById(R$id.mr_cast_header_name);
            }

            /* access modifiers changed from: package-private */
            public void M(f fVar) {
                this.x.setText(fVar.a().toString());
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$f */
        private class f {
            private final Object a;
            private final int b;

            f(C0032h hVar, Object obj, int i) {
                this.a = obj;
                this.b = i;
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* renamed from: androidx.mediarouter.app.h$h$g */
        private class g extends f {
            final View B;
            final ImageView C;
            final ProgressBar D;
            final TextView E;
            final RelativeLayout F;
            final CheckBox G;
            final float H;
            final int I;
            final int J;
            final View.OnClickListener K = new a();

            /* renamed from: androidx.mediarouter.app.h$h$g$a */
            class a implements View.OnClickListener {
                a() {
                }

                public void onClick(View view) {
                    g gVar = g.this;
                    boolean z = !gVar.S(gVar.x);
                    boolean z2 = g.this.x.z();
                    g gVar2 = g.this;
                    androidx.mediarouter.media.h hVar = h.this.g;
                    h.f fVar = gVar2.x;
                    if (z) {
                        hVar.c(fVar);
                    } else {
                        hVar.m(fVar);
                    }
                    g.this.T(z, !z2);
                    if (z2) {
                        List<h.f> m = h.this.j.m();
                        for (h.f next : g.this.x.m()) {
                            if (m.contains(next) != z) {
                                f fVar2 = h.this.w.get(next.l());
                                if (fVar2 instanceof g) {
                                    ((g) fVar2).T(z, true);
                                }
                            }
                        }
                    }
                    g gVar3 = g.this;
                    C0032h.this.M(gVar3.x, z);
                }
            }

            g(View view) {
                super(view, (ImageButton) view.findViewById(R$id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R$id.mr_cast_volume_slider));
                this.B = view;
                this.C = (ImageView) view.findViewById(R$id.mr_cast_route_icon);
                this.D = (ProgressBar) view.findViewById(R$id.mr_cast_route_progress_bar);
                this.E = (TextView) view.findViewById(R$id.mr_cast_route_name);
                this.F = (RelativeLayout) view.findViewById(R$id.mr_cast_volume_layout);
                this.G = (CheckBox) view.findViewById(R$id.mr_cast_checkbox);
                this.G.setButtonDrawable(i.e(h.this.o));
                i.t(h.this.o, this.D);
                this.H = i.h(h.this.o);
                Resources resources = h.this.o.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R$dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.I = (int) typedValue.getDimension(displayMetrics);
                this.J = 0;
            }

            private boolean R(h.f fVar) {
                if (h.this.n.contains(fVar)) {
                    return false;
                }
                if (S(fVar) && h.this.j.m().size() < 2) {
                    return false;
                }
                if (!S(fVar) || h.this.j.i() == null) {
                    return true;
                }
                h.f.a i = fVar.i();
                return i != null && i.d();
            }

            /* access modifiers changed from: package-private */
            public void Q(f fVar) {
                h.f fVar2 = (h.f) fVar.a();
                if (fVar2 == h.this.j && fVar2.m().size() > 0) {
                    Iterator<h.f> it = fVar2.m().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        h.f next = it.next();
                        if (!h.this.l.contains(next)) {
                            fVar2 = next;
                            break;
                        }
                    }
                }
                M(fVar2);
                this.C.setImageDrawable(C0032h.this.J(fVar2));
                this.E.setText(fVar2.n());
                float f = 1.0f;
                boolean z = false;
                if (h.this.j.i() != null) {
                    this.G.setVisibility(0);
                    boolean S = S(fVar2);
                    boolean R = R(fVar2);
                    this.G.setChecked(S);
                    this.D.setVisibility(4);
                    this.C.setVisibility(0);
                    this.B.setEnabled(R);
                    this.G.setEnabled(R);
                    this.y.setEnabled(R || S);
                    MediaRouteVolumeSlider mediaRouteVolumeSlider = this.z;
                    if (R || S) {
                        z = true;
                    }
                    mediaRouteVolumeSlider.setEnabled(z);
                    this.B.setOnClickListener(this.K);
                    this.G.setOnClickListener(this.K);
                    h.o(this.F, (!S || this.x.z()) ? this.J : this.I);
                    this.B.setAlpha((R || S) ? 1.0f : this.H);
                    CheckBox checkBox = this.G;
                    if (!R && S) {
                        f = this.H;
                    }
                    checkBox.setAlpha(f);
                    return;
                }
                this.G.setVisibility(8);
                this.D.setVisibility(4);
                this.C.setVisibility(0);
                h.o(this.F, this.I);
                this.B.setAlpha(1.0f);
            }

            /* access modifiers changed from: package-private */
            public boolean S(h.f fVar) {
                if (fVar.D()) {
                    return true;
                }
                h.f.a i = fVar.i();
                return i != null && i.a() == 3;
            }

            /* access modifiers changed from: package-private */
            public void T(boolean z, boolean z2) {
                this.G.setEnabled(false);
                this.B.setEnabled(false);
                this.G.setChecked(z);
                if (z) {
                    this.C.setVisibility(4);
                    this.D.setVisibility(0);
                }
                if (z2) {
                    C0032h.this.H(this.F, z ? this.I : this.J);
                }
            }
        }

        C0032h() {
            this.d = LayoutInflater.from(h.this.o);
            this.e = i.g(h.this.o);
            this.f = i.q(h.this.o);
            this.g = i.m(h.this.o);
            this.h = i.n(h.this.o);
            this.j = h.this.o.getResources().getInteger(R$integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.k = new AccelerateDecelerateInterpolator();
            O();
        }

        private Drawable I(h.f fVar) {
            int g2 = fVar.g();
            return g2 != 1 ? g2 != 2 ? fVar.z() ? this.h : this.e : this.g : this.f;
        }

        public void D(RecyclerView.c0 c0Var) {
            super.D(c0Var);
            h.this.w.values().remove(c0Var);
        }

        /* access modifiers changed from: package-private */
        public void H(View view, int i2) {
            a aVar = new a(this, i2, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b());
            aVar.setDuration((long) this.j);
            aVar.setInterpolator(this.k);
            view.startAnimation(aVar);
        }

        /* access modifiers changed from: package-private */
        public Drawable J(h.f fVar) {
            Uri k2 = fVar.k();
            if (k2 != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(h.this.o.getContentResolver().openInputStream(k2), (String) null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    "Failed to load " + k2;
                }
            }
            return I(fVar);
        }

        public f K(int i2) {
            return i2 == 0 ? this.i : this.c.get(i2 - 1);
        }

        /* access modifiers changed from: package-private */
        public boolean L() {
            return h.this.j.m().size() > 1;
        }

        /* access modifiers changed from: package-private */
        public void M(h.f fVar, boolean z) {
            List<h.f> m = h.this.j.m();
            boolean z2 = true;
            int max = Math.max(1, m.size());
            int i2 = -1;
            if (fVar.z()) {
                for (h.f contains : fVar.m()) {
                    if (m.contains(contains) != z) {
                        max += z ? 1 : -1;
                    }
                }
            } else {
                if (z) {
                    i2 = 1;
                }
                max += i2;
            }
            boolean L = L();
            int i3 = 0;
            if (max < 2) {
                z2 = false;
            }
            if (L != z2) {
                RecyclerView.c0 Y = h.this.t.Y(0);
                if (Y instanceof d) {
                    d dVar = (d) Y;
                    View view = dVar.e;
                    if (z2) {
                        i3 = dVar.R();
                    }
                    H(view, i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void N() {
            h.this.n.clear();
            h hVar = h.this;
            hVar.n.addAll(f.g(hVar.l, hVar.j()));
            l();
        }

        /* access modifiers changed from: package-private */
        public void O() {
            this.c.clear();
            this.i = new f(this, h.this.j, 1);
            if (!h.this.k.isEmpty()) {
                for (h.f fVar : h.this.k) {
                    this.c.add(new f(this, fVar, 3));
                }
            } else {
                this.c.add(new f(this, h.this.j, 3));
            }
            boolean z = false;
            if (!h.this.l.isEmpty()) {
                boolean z2 = false;
                for (h.f next : h.this.l) {
                    if (!h.this.k.contains(next)) {
                        if (!z2) {
                            d.b h2 = h.this.j.h();
                            String k2 = h2 != null ? h2.k() : null;
                            if (TextUtils.isEmpty(k2)) {
                                k2 = h.this.o.getString(R$string.mr_dialog_groupable_header);
                            }
                            this.c.add(new f(this, k2, 2));
                            z2 = true;
                        }
                        this.c.add(new f(this, next, 3));
                    }
                }
            }
            if (!h.this.m.isEmpty()) {
                for (h.f next2 : h.this.m) {
                    h.f fVar2 = h.this.j;
                    if (fVar2 != next2) {
                        if (!z) {
                            d.b h3 = fVar2.h();
                            String l2 = h3 != null ? h3.l() : null;
                            if (TextUtils.isEmpty(l2)) {
                                l2 = h.this.o.getString(R$string.mr_dialog_transferable_header);
                            }
                            this.c.add(new f(this, l2, 2));
                            z = true;
                        }
                        this.c.add(new f(this, next2, 4));
                    }
                }
            }
            N();
        }

        public int g() {
            return this.c.size() + 1;
        }

        public int i(int i2) {
            return K(i2).b();
        }

        public void w(RecyclerView.c0 c0Var, int i2) {
            int i3 = i(i2);
            f K = K(i2);
            if (i3 == 1) {
                h.this.w.put(((h.f) K.a()).l(), (f) c0Var);
                ((d) c0Var).Q(K);
            } else if (i3 == 2) {
                ((e) c0Var).M(K);
            } else if (i3 == 3) {
                h.this.w.put(((h.f) K.a()).l(), (f) c0Var);
                ((g) c0Var).Q(K);
            } else if (i3 == 4) {
                ((c) c0Var).M(K);
            }
        }

        public RecyclerView.c0 y(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new d(this.d.inflate(R$layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i2 == 2) {
                return new e(this, this.d.inflate(R$layout.mr_cast_header_item, viewGroup, false));
            }
            if (i2 == 3) {
                return new g(this.d.inflate(R$layout.mr_cast_route_item, viewGroup, false));
            }
            if (i2 != 4) {
                return null;
            }
            return new c(this.d.inflate(R$layout.mr_cast_group_item, viewGroup, false));
        }
    }

    static final class i implements Comparator<h.f> {
        static final i e = new i();

        i() {
        }

        /* renamed from: a */
        public int compare(h.f fVar, h.f fVar2) {
            return fVar.n().compareToIgnoreCase(fVar2.n());
        }
    }

    private class j implements SeekBar.OnSeekBarChangeListener {
        j() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                h.f fVar = (h.f) seekBar.getTag();
                f fVar2 = h.this.w.get(fVar.l());
                if (fVar2 != null) {
                    fVar2.O(i == 0);
                }
                fVar.H(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            h hVar = h.this;
            if (hVar.x != null) {
                hVar.s.removeMessages(2);
            }
            h.this.x = (h.f) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            h.this.s.sendEmptyMessageDelayed(2, 500);
        }
    }

    public h(Context context) {
        this(context, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            androidx.mediarouter.media.g r2 = androidx.mediarouter.media.g.c
            r1.i = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.m = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.n = r2
            androidx.mediarouter.app.h$a r2 = new androidx.mediarouter.app.h$a
            r2.<init>()
            r1.s = r2
            android.content.Context r2 = r1.getContext()
            r1.o = r2
            androidx.mediarouter.media.h r2 = androidx.mediarouter.media.h.g(r2)
            r1.g = r2
            androidx.mediarouter.app.h$g r2 = new androidx.mediarouter.app.h$g
            r2.<init>()
            r1.h = r2
            androidx.mediarouter.media.h r2 = r1.g
            androidx.mediarouter.media.h$f r2 = r2.j()
            r1.j = r2
            androidx.mediarouter.app.h$e r2 = new androidx.mediarouter.app.h$e
            r2.<init>()
            r1.M = r2
            androidx.mediarouter.media.h r2 = r1.g
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.h()
            r1.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.h.<init>(android.content.Context, int):void");
    }

    private static Bitmap g(Bitmap bitmap, float f2, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f2);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(bitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return bitmap;
    }

    static boolean k(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    static void o(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void p(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.L;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.h(this.M);
            this.L = null;
        }
        if (token != null && this.q) {
            try {
                this.L = new MediaControllerCompat(this.o, token);
            } catch (RemoteException unused) {
            }
            MediaControllerCompat mediaControllerCompat2 = this.L;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.f(this.M);
            }
            MediaControllerCompat mediaControllerCompat3 = this.L;
            MediaMetadataCompat b2 = mediaControllerCompat3 == null ? null : mediaControllerCompat3.b();
            if (b2 != null) {
                mediaDescriptionCompat = b2.e();
            }
            this.N = mediaDescriptionCompat;
            n();
            t();
        }
    }

    private boolean r() {
        if (this.x != null || this.z || this.A) {
            return true;
        }
        return !this.p;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.R = false;
        this.S = null;
        this.T = 0;
    }

    /* access modifiers changed from: package-private */
    public List<h.f> j() {
        ArrayList arrayList = new ArrayList();
        if (this.j.i() != null) {
            for (h.f next : this.j.r().f()) {
                h.f.a i2 = next.i();
                if (i2 != null && i2.b()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public boolean l(h.f fVar) {
        return !fVar.x() && fVar.y() && fVar.F(this.i) && this.j != fVar;
    }

    public void m(List<h.f> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!l(list.get(size))) {
                list.remove(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        MediaDescriptionCompat mediaDescriptionCompat = this.N;
        Uri uri = null;
        Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.N;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.c();
        }
        d dVar = this.O;
        Bitmap b3 = dVar == null ? this.P : dVar.b();
        d dVar2 = this.O;
        Uri c2 = dVar2 == null ? this.Q : dVar2.c();
        if (b3 != b2 || (b3 == null && !p3.a(c2, uri))) {
            d dVar3 = this.O;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d();
            this.O = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
        this.g.b(this.i, this.h, 1);
        u();
        p(this.g.h());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.mr_cast_dialog);
        i.s(this.o, this);
        ImageButton imageButton = (ImageButton) findViewById(R$id.mr_cast_close_button);
        this.D = imageButton;
        imageButton.setColorFilter(-1);
        this.D.setOnClickListener(new b());
        Button button = (Button) findViewById(R$id.mr_cast_stop_button);
        this.E = button;
        button.setTextColor(-1);
        this.E.setOnClickListener(new c());
        this.u = new C0032h();
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.mr_cast_list);
        this.t = recyclerView;
        recyclerView.setAdapter(this.u);
        this.t.setLayoutManager(new LinearLayoutManager(this.o));
        this.v = new j();
        this.w = new HashMap();
        this.y = new HashMap();
        this.F = (ImageView) findViewById(R$id.mr_cast_meta_background);
        this.G = findViewById(R$id.mr_cast_meta_black_scrim);
        this.H = (ImageView) findViewById(R$id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R$id.mr_cast_meta_title);
        this.I = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R$id.mr_cast_meta_subtitle);
        this.J = textView2;
        textView2.setTextColor(-1);
        this.K = this.o.getResources().getString(R$string.mr_cast_dialog_title_view_placeholder);
        this.p = true;
        s();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = false;
        this.g.l(this.h);
        this.s.removeCallbacksAndMessages((Object) null);
        p((MediaSessionCompat.Token) null);
    }

    public void q(androidx.mediarouter.media.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.i.equals(gVar)) {
            this.i = gVar;
            if (this.q) {
                this.g.l(this.h);
                this.g.b(gVar, this.h, 1);
                u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        getWindow().setLayout(f.c(this.o), f.a(this.o));
        this.P = null;
        this.Q = null;
        n();
        t();
        v();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (r()) {
            this.C = true;
            return;
        }
        this.C = false;
        if (!this.j.D() || this.j.x()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.R || k(this.S) || this.S == null) {
            if (k(this.S)) {
                "Can't set artwork image with recycled bitmap: " + this.S;
            }
            this.H.setVisibility(8);
            this.G.setVisibility(8);
            this.F.setImageBitmap((Bitmap) null);
        } else {
            this.H.setVisibility(0);
            this.H.setImageBitmap(this.S);
            this.H.setBackgroundColor(this.T);
            this.G.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 17) {
                Bitmap bitmap = this.S;
                g(bitmap, 10.0f, this.o);
                this.F.setImageBitmap(bitmap);
            } else {
                this.F.setImageBitmap(Bitmap.createBitmap(this.S));
            }
        }
        h();
        MediaDescriptionCompat mediaDescriptionCompat = this.N;
        CharSequence g2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.g();
        boolean z2 = !TextUtils.isEmpty(g2);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.N;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.f();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z2) {
            this.I.setText(g2);
        } else {
            this.I.setText(this.K);
        }
        if (isEmpty) {
            this.J.setText(charSequence);
            this.J.setVisibility(0);
            return;
        }
        this.J.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.k.addAll(this.j.m());
        if (this.j.i() != null) {
            for (h.f next : this.j.r().f()) {
                h.f.a i2 = next.i();
                if (i2 != null) {
                    if (i2.b()) {
                        this.l.add(next);
                    }
                    if (i2.c()) {
                        this.m.add(next);
                    }
                }
            }
        }
        m(this.l);
        m(this.m);
        Collections.sort(this.k, i.e);
        Collections.sort(this.l, i.e);
        Collections.sort(this.m, i.e);
        this.u.O();
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (!this.q) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.r < 300) {
            this.s.removeMessages(1);
            this.s.sendEmptyMessageAtTime(1, this.r + 300);
        } else if (r()) {
            this.B = true;
        } else {
            this.B = false;
            if (!this.j.D() || this.j.x()) {
                dismiss();
            }
            this.r = SystemClock.uptimeMillis();
            this.u.N();
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        if (this.B) {
            v();
        }
        if (this.C) {
            t();
        }
    }
}
