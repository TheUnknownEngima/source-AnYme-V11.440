package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.R$dimen;
import androidx.mediarouter.R$id;
import androidx.mediarouter.R$integer;
import androidx.mediarouter.R$layout;
import androidx.mediarouter.R$string;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.media.h;
import com.github.mikephil.charting.utils.Utils;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class c extends androidx.appcompat.app.c {
    static final boolean t0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    static final int u0 = ((int) TimeUnit.SECONDS.toMillis(30));
    private TextView A;
    private TextView B;
    private boolean C;
    private LinearLayout D;
    private RelativeLayout E;
    private LinearLayout F;
    private View G;
    OverlayListView H;
    r I;
    private List<h.f> J;
    Set<h.f> K;
    private Set<h.f> L;
    Set<h.f> M;
    SeekBar N;
    q O;
    h.f P;
    private int Q;
    private int R;
    private int S;
    private final int T;
    Map<h.f, SeekBar> U;
    MediaControllerCompat V;
    o W;
    PlaybackStateCompat X;
    MediaDescriptionCompat Y;
    n Z;
    Bitmap a0;
    Uri b0;
    boolean c0;
    Bitmap d0;
    int e0;
    boolean f0;
    boolean g0;
    final androidx.mediarouter.media.h h;
    boolean h0;
    private final p i;
    boolean i0;
    final h.f j;
    boolean j0;
    Context k;
    int k0;
    private boolean l;
    private int l0;
    private boolean m;
    private int m0;
    private int n;
    private Interpolator n0;
    private View o;
    private Interpolator o0;
    private Button p;
    private Interpolator p0;
    private Button q;
    private Interpolator q0;
    private ImageButton r;
    final AccessibilityManager r0;
    private ImageButton s;
    Runnable s0;
    private MediaRouteExpandCollapseButton t;
    private FrameLayout u;
    private LinearLayout v;
    FrameLayout w;
    private FrameLayout x;
    private ImageView y;
    private TextView z;

    class a implements OverlayListView.a.C0029a {
        final /* synthetic */ h.f a;

        a(h.f fVar) {
            this.a = fVar;
        }

        public void a() {
            c.this.M.remove(this.a);
            c.this.I.notifyDataSetChanged();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            c.this.H.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            c.this.G();
        }
    }

    /* renamed from: androidx.mediarouter.app.c$c  reason: collision with other inner class name */
    class C0031c implements Animation.AnimationListener {
        C0031c() {
        }

        public void onAnimationEnd(Animation animation) {
            c.this.q(true);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            c.this.F();
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            c.this.dismiss();
        }
    }

    class f implements View.OnClickListener {
        f(c cVar) {
        }

        public void onClick(View view) {
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            PendingIntent d;
            MediaControllerCompat mediaControllerCompat = c.this.V;
            if (mediaControllerCompat != null && (d = mediaControllerCompat.d()) != null) {
                try {
                    d.send();
                    c.this.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    d + " was not sent, it had been canceled.";
                }
            }
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            c cVar = c.this;
            boolean z = !cVar.h0;
            cVar.h0 = z;
            if (z) {
                cVar.H.setVisibility(0);
            }
            c.this.A();
            c.this.K(true);
        }
    }

    class i implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean e;

        i(boolean z) {
            this.e = z;
        }

        public void onGlobalLayout() {
            c.this.w.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            c cVar = c.this;
            if (cVar.i0) {
                cVar.j0 = true;
            } else {
                cVar.L(this.e);
            }
        }
    }

    class j extends Animation {
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ View g;

        j(c cVar, int i, int i2, View view) {
            this.e = i;
            this.f = i2;
            this.g = view;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f2, Transformation transformation) {
            int i = this.e;
            c.D(this.g, i - ((int) (((float) (i - this.f)) * f2)));
        }
    }

    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ Map e;
        final /* synthetic */ Map f;

        k(Map map, Map map2) {
            this.e = map;
            this.f = map2;
        }

        public void onGlobalLayout() {
            c.this.H.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            c.this.k(this.e, this.f);
        }
    }

    class l implements Animation.AnimationListener {
        l() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            c.this.H.b();
            c cVar = c.this;
            cVar.H.postDelayed(cVar.s0, (long) cVar.k0);
        }
    }

    private final class m implements View.OnClickListener {
        m() {
        }

        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int id = view.getId();
            int i = 1;
            if (id == 16908313 || id == 16908314) {
                if (c.this.j.D()) {
                    androidx.mediarouter.media.h hVar = c.this.h;
                    if (id == 16908313) {
                        i = 2;
                    }
                    hVar.p(i);
                }
            } else if (id == R$id.mr_control_playback_ctrl) {
                c cVar = c.this;
                if (cVar.V != null && (playbackStateCompat = cVar.X) != null) {
                    int i2 = 0;
                    if (playbackStateCompat.g() != 3) {
                        i = 0;
                    }
                    if (i != 0 && c.this.w()) {
                        c.this.V.e().a();
                        i2 = R$string.mr_controller_pause;
                    } else if (i != 0 && c.this.y()) {
                        c.this.V.e().c();
                        i2 = R$string.mr_controller_stop;
                    } else if (i == 0 && c.this.x()) {
                        c.this.V.e().b();
                        i2 = R$string.mr_controller_play;
                    }
                    AccessibilityManager accessibilityManager = c.this.r0;
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(c.this.k.getPackageName());
                        obtain.setClassName(m.class.getName());
                        obtain.getText().add(c.this.k.getString(i2));
                        c.this.r0.sendAccessibilityEvent(obtain);
                        return;
                    }
                    return;
                }
                return;
            } else if (id != R$id.mr_close) {
                return;
            }
            c.this.dismiss();
        }
    }

    private class n extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap a;
        private final Uri b;
        private int c;
        private long d;

        n() {
            MediaDescriptionCompat mediaDescriptionCompat = c.this.Y;
            Uri uri = null;
            Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
            this.a = c.u(b2) ? null : b2;
            MediaDescriptionCompat mediaDescriptionCompat2 = c.this.Y;
            this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c() : uri;
        }

        private InputStream e(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = c.this.k.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(c.u0);
                openConnection.setReadTimeout(c.u0);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|(3:24|(2:26|27)|28)|30|31|(2:(2:34|35)|36)(4:38|39|(2:41|42)|43)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0042 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x009c */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ IOException -> 0x009c }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae A[SYNTHETIC, Splitter:B:56:0x00ae] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00b6 A[SYNTHETIC, Splitter:B:61:0x00b6] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                java.lang.String r9 = "Unable to open: "
                android.graphics.Bitmap r0 = r8.a
                r1 = 0
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x000b
                goto L_0x00bb
            L_0x000b:
                android.net.Uri r0 = r8.b
                if (r0 == 0) goto L_0x00ba
                java.io.InputStream r0 = r8.e(r0)     // Catch:{ IOException -> 0x009b, all -> 0x0099 }
                if (r0 != 0) goto L_0x002b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c }
                r4.<init>()     // Catch:{ IOException -> 0x009c }
                r4.append(r9)     // Catch:{ IOException -> 0x009c }
                android.net.Uri r5 = r8.b     // Catch:{ IOException -> 0x009c }
                r4.append(r5)     // Catch:{ IOException -> 0x009c }
                r4.toString()     // Catch:{ IOException -> 0x009c }
                if (r0 == 0) goto L_0x002a
                r0.close()     // Catch:{ IOException -> 0x002a }
            L_0x002a:
                return r3
            L_0x002b:
                android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x009c }
                r4.<init>()     // Catch:{ IOException -> 0x009c }
                r4.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x009c }
                android.graphics.BitmapFactory.decodeStream(r0, r3, r4)     // Catch:{ IOException -> 0x009c }
                int r5 = r4.outWidth     // Catch:{ IOException -> 0x009c }
                if (r5 == 0) goto L_0x0093
                int r5 = r4.outHeight     // Catch:{ IOException -> 0x009c }
                if (r5 != 0) goto L_0x003e
                goto L_0x0093
            L_0x003e:
                r0.reset()     // Catch:{ IOException -> 0x0042 }
                goto L_0x0063
            L_0x0042:
                r0.close()     // Catch:{ IOException -> 0x009c }
                android.net.Uri r5 = r8.b     // Catch:{ IOException -> 0x009c }
                java.io.InputStream r0 = r8.e(r5)     // Catch:{ IOException -> 0x009c }
                if (r0 != 0) goto L_0x0063
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009c }
                r4.<init>()     // Catch:{ IOException -> 0x009c }
                r4.append(r9)     // Catch:{ IOException -> 0x009c }
                android.net.Uri r5 = r8.b     // Catch:{ IOException -> 0x009c }
                r4.append(r5)     // Catch:{ IOException -> 0x009c }
                r4.toString()     // Catch:{ IOException -> 0x009c }
                if (r0 == 0) goto L_0x0062
                r0.close()     // Catch:{ IOException -> 0x0062 }
            L_0x0062:
                return r3
            L_0x0063:
                r4.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x009c }
                androidx.mediarouter.app.c r5 = androidx.mediarouter.app.c.this     // Catch:{ IOException -> 0x009c }
                int r6 = r4.outWidth     // Catch:{ IOException -> 0x009c }
                int r7 = r4.outHeight     // Catch:{ IOException -> 0x009c }
                int r5 = r5.r(r6, r7)     // Catch:{ IOException -> 0x009c }
                int r6 = r4.outHeight     // Catch:{ IOException -> 0x009c }
                int r6 = r6 / r5
                int r5 = java.lang.Integer.highestOneBit(r6)     // Catch:{ IOException -> 0x009c }
                int r5 = java.lang.Math.max(r2, r5)     // Catch:{ IOException -> 0x009c }
                r4.inSampleSize = r5     // Catch:{ IOException -> 0x009c }
                boolean r5 = r8.isCancelled()     // Catch:{ IOException -> 0x009c }
                if (r5 == 0) goto L_0x0088
                if (r0 == 0) goto L_0x0087
                r0.close()     // Catch:{ IOException -> 0x0087 }
            L_0x0087:
                return r3
            L_0x0088:
                android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r0, r3, r4)     // Catch:{ IOException -> 0x009c }
                if (r0 == 0) goto L_0x0091
                r0.close()     // Catch:{ IOException -> 0x0091 }
            L_0x0091:
                r0 = r9
                goto L_0x00bb
            L_0x0093:
                if (r0 == 0) goto L_0x0098
                r0.close()     // Catch:{ IOException -> 0x0098 }
            L_0x0098:
                return r3
            L_0x0099:
                r9 = move-exception
                goto L_0x00b4
            L_0x009b:
                r0 = r3
            L_0x009c:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
                r4.<init>()     // Catch:{ all -> 0x00b2 }
                r4.append(r9)     // Catch:{ all -> 0x00b2 }
                android.net.Uri r9 = r8.b     // Catch:{ all -> 0x00b2 }
                r4.append(r9)     // Catch:{ all -> 0x00b2 }
                r4.toString()     // Catch:{ all -> 0x00b2 }
                if (r0 == 0) goto L_0x00ba
                r0.close()     // Catch:{ IOException -> 0x00ba }
                goto L_0x00ba
            L_0x00b2:
                r9 = move-exception
                r3 = r0
            L_0x00b4:
                if (r3 == 0) goto L_0x00b9
                r3.close()     // Catch:{ IOException -> 0x00b9 }
            L_0x00b9:
                throw r9
            L_0x00ba:
                r0 = r3
            L_0x00bb:
                boolean r9 = androidx.mediarouter.app.c.u(r0)
                if (r9 == 0) goto L_0x00d2
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r9.append(r1)
                r9.append(r0)
                r9.toString()
                return r3
            L_0x00d2:
                if (r0 == 0) goto L_0x0105
                int r9 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r9 >= r3) goto L_0x0105
                c6$b r9 = new c6$b
                r9.<init>(r0)
                r9.c(r2)
                c6 r9 = r9.a()
                java.util.List r2 = r9.f()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x00f5
                goto L_0x0103
            L_0x00f5:
                java.util.List r9 = r9.f()
                java.lang.Object r9 = r9.get(r1)
                c6$d r9 = (defpackage.c6.d) r9
                int r1 = r9.e()
            L_0x0103:
                r8.c = r1
            L_0x0105:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.c.n.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        public Bitmap b() {
            return this.a;
        }

        public Uri c() {
            return this.b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Bitmap bitmap) {
            c cVar = c.this;
            cVar.Z = null;
            if (!p3.a(cVar.a0, this.a) || !p3.a(c.this.b0, this.b)) {
                c cVar2 = c.this;
                cVar2.a0 = this.a;
                cVar2.d0 = bitmap;
                cVar2.b0 = this.b;
                cVar2.e0 = this.c;
                boolean z = true;
                cVar2.c0 = true;
                long uptimeMillis = SystemClock.uptimeMillis() - this.d;
                c cVar3 = c.this;
                if (uptimeMillis <= 120) {
                    z = false;
                }
                cVar3.H(z);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            c.this.o();
        }
    }

    private final class o extends MediaControllerCompat.a {
        o() {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
            c.this.Y = mediaMetadataCompat == null ? null : mediaMetadataCompat.e();
            c.this.I();
            c.this.H(false);
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
            c cVar = c.this;
            cVar.X = playbackStateCompat;
            cVar.H(false);
        }

        public void i() {
            c cVar = c.this;
            MediaControllerCompat mediaControllerCompat = cVar.V;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.h(cVar.W);
                c.this.V = null;
            }
        }
    }

    private final class p extends h.a {
        p() {
        }

        public void e(androidx.mediarouter.media.h hVar, h.f fVar) {
            c.this.H(true);
        }

        public void i(androidx.mediarouter.media.h hVar, h.f fVar) {
            c.this.H(false);
        }

        public void k(androidx.mediarouter.media.h hVar, h.f fVar) {
            SeekBar seekBar = c.this.U.get(fVar);
            int t = fVar.t();
            if (c.t0) {
                "onRouteVolumeChanged(), route.getVolume:" + t;
            }
            if (seekBar != null && c.this.P != fVar) {
                seekBar.setProgress(t);
            }
        }
    }

    private class q implements SeekBar.OnSeekBarChangeListener {
        private final Runnable a = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                c cVar = c.this;
                if (cVar.P != null) {
                    cVar.P = null;
                    if (cVar.f0) {
                        cVar.H(cVar.g0);
                    }
                }
            }
        }

        q() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                h.f fVar = (h.f) seekBar.getTag();
                if (c.t0) {
                    "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")";
                }
                fVar.H(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = c.this;
            if (cVar.P != null) {
                cVar.N.removeCallbacks(this.a);
            }
            c.this.P = (h.f) seekBar.getTag();
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            c.this.N.postDelayed(this.a, 500);
        }
    }

    private class r extends ArrayAdapter<h.f> {
        final float e;

        public r(Context context, List<h.f> list) {
            super(context, 0, list);
            this.e = i.h(context);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = 0;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mr_controller_volume_item, viewGroup, false);
            } else {
                c.this.P(view);
            }
            h.f fVar = (h.f) getItem(i);
            if (fVar != null) {
                boolean y = fVar.y();
                TextView textView = (TextView) view.findViewById(R$id.mr_name);
                textView.setEnabled(y);
                textView.setText(fVar.n());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R$id.mr_volume_slider);
                i.w(viewGroup.getContext(), mediaRouteVolumeSlider, c.this.H);
                mediaRouteVolumeSlider.setTag(fVar);
                c.this.U.put(fVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.c(!y);
                mediaRouteVolumeSlider.setEnabled(y);
                if (y) {
                    if (c.this.z(fVar)) {
                        mediaRouteVolumeSlider.setMax(fVar.v());
                        mediaRouteVolumeSlider.setProgress(fVar.t());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(c.this.O);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(R$id.mr_volume_item_icon)).setAlpha(y ? 255 : (int) (this.e * 255.0f));
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.volume_item_container);
                if (c.this.M.contains(fVar)) {
                    i2 = 4;
                }
                linearLayout.setVisibility(i2);
                Set<h.f> set = c.this.K;
                if (set != null && set.contains(fVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    public c(Context context) {
        this(context, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            android.content.Context r2 = androidx.mediarouter.app.i.b(r2, r3, r0)
            int r3 = androidx.mediarouter.app.i.c(r2)
            r1.<init>(r2, r3)
            r1.C = r0
            androidx.mediarouter.app.c$d r3 = new androidx.mediarouter.app.c$d
            r3.<init>()
            r1.s0 = r3
            android.content.Context r3 = r1.getContext()
            r1.k = r3
            androidx.mediarouter.app.c$o r3 = new androidx.mediarouter.app.c$o
            r3.<init>()
            r1.W = r3
            android.content.Context r3 = r1.k
            androidx.mediarouter.media.h r3 = androidx.mediarouter.media.h.g(r3)
            r1.h = r3
            androidx.mediarouter.app.c$p r3 = new androidx.mediarouter.app.c$p
            r3.<init>()
            r1.i = r3
            androidx.mediarouter.media.h r3 = r1.h
            androidx.mediarouter.media.h$f r3 = r3.j()
            r1.j = r3
            androidx.mediarouter.media.h r3 = r1.h
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.h()
            r1.E(r3)
            android.content.Context r3 = r1.k
            android.content.res.Resources r3 = r3.getResources()
            int r0 = androidx.mediarouter.R$dimen.mr_controller_volume_group_list_padding_top
            int r3 = r3.getDimensionPixelSize(r0)
            r1.T = r3
            android.content.Context r3 = r1.k
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            r1.r0 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r3 < r0) goto L_0x0072
            int r3 = androidx.mediarouter.R$interpolator.mr_linear_out_slow_in
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.o0 = r3
            int r3 = androidx.mediarouter.R$interpolator.mr_fast_out_slow_in
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
            r1.p0 = r2
        L_0x0072:
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.q0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.c.<init>(android.content.Context, int):void");
    }

    private void C(boolean z2) {
        List<h.f> m2 = this.j.m();
        if (m2.isEmpty()) {
            this.J.clear();
        } else if (!f.i(this.J, m2)) {
            HashMap e2 = z2 ? f.e(this.H, this.I) : null;
            HashMap d2 = z2 ? f.d(this.k, this.H, this.I) : null;
            this.K = f.f(this.J, m2);
            this.L = f.g(this.J, m2);
            this.J.addAll(0, this.K);
            this.J.removeAll(this.L);
            this.I.notifyDataSetChanged();
            if (!z2 || !this.h0 || this.K.size() + this.L.size() <= 0) {
                this.K = null;
                this.L = null;
                return;
            }
            j(e2, d2);
            return;
        }
        this.I.notifyDataSetChanged();
    }

    static void D(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private void E(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.V;
        PlaybackStateCompat playbackStateCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.h(this.W);
            this.V = null;
        }
        if (token != null && this.m) {
            try {
                this.V = new MediaControllerCompat(this.k, token);
            } catch (RemoteException unused) {
            }
            MediaControllerCompat mediaControllerCompat2 = this.V;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.f(this.W);
            }
            MediaControllerCompat mediaControllerCompat3 = this.V;
            MediaMetadataCompat b2 = mediaControllerCompat3 == null ? null : mediaControllerCompat3.b();
            this.Y = b2 == null ? null : b2.e();
            MediaControllerCompat mediaControllerCompat4 = this.V;
            if (mediaControllerCompat4 != null) {
                playbackStateCompat = mediaControllerCompat4.c();
            }
            this.X = playbackStateCompat;
            I();
            H(false);
        }
    }

    private void M(boolean z2) {
        int i2 = 0;
        this.G.setVisibility((this.F.getVisibility() != 0 || !z2) ? 8 : 0);
        LinearLayout linearLayout = this.D;
        if (this.F.getVisibility() == 8 && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void N() {
        /*
            r8 = this;
            boolean r0 = r8.m()
            if (r0 == 0) goto L_0x00e7
            android.support.v4.media.MediaDescriptionCompat r0 = r8.Y
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x0011
        L_0x000d:
            java.lang.CharSequence r0 = r0.g()
        L_0x0011:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            r2 = r2 ^ r3
            android.support.v4.media.MediaDescriptionCompat r4 = r8.Y
            if (r4 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            java.lang.CharSequence r1 = r4.f()
        L_0x0020:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r4 = r4 ^ r3
            androidx.mediarouter.media.h$f r5 = r8.j
            int r5 = r5.q()
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L_0x0039
            android.widget.TextView r0 = r8.z
            int r1 = androidx.mediarouter.R$string.mr_controller_casting_screen
        L_0x0033:
            r0.setText(r1)
            r0 = 1
        L_0x0037:
            r1 = 0
            goto L_0x0065
        L_0x0039:
            android.support.v4.media.session.PlaybackStateCompat r5 = r8.X
            if (r5 == 0) goto L_0x0060
            int r5 = r5.g()
            if (r5 != 0) goto L_0x0044
            goto L_0x0060
        L_0x0044:
            if (r2 != 0) goto L_0x004d
            if (r4 != 0) goto L_0x004d
            android.widget.TextView r0 = r8.z
            int r1 = androidx.mediarouter.R$string.mr_controller_no_info_available
            goto L_0x0033
        L_0x004d:
            if (r2 == 0) goto L_0x0056
            android.widget.TextView r2 = r8.z
            r2.setText(r0)
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x0037
            android.widget.TextView r2 = r8.A
            r2.setText(r1)
            r1 = 1
            goto L_0x0065
        L_0x0060:
            android.widget.TextView r0 = r8.z
            int r1 = androidx.mediarouter.R$string.mr_controller_no_media_selected
            goto L_0x0033
        L_0x0065:
            android.widget.TextView r2 = r8.z
            r4 = 8
            if (r0 == 0) goto L_0x006d
            r0 = 0
            goto L_0x006f
        L_0x006d:
            r0 = 8
        L_0x006f:
            r2.setVisibility(r0)
            android.widget.TextView r0 = r8.A
            if (r1 == 0) goto L_0x0078
            r1 = 0
            goto L_0x007a
        L_0x0078:
            r1 = 8
        L_0x007a:
            r0.setVisibility(r1)
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.X
            if (r0 == 0) goto L_0x00e7
            int r0 = r0.g()
            r1 = 6
            if (r0 == r1) goto L_0x0094
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.X
            int r0 = r0.g()
            r1 = 3
            if (r0 != r1) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = 1
        L_0x0095:
            android.widget.ImageButton r1 = r8.r
            android.content.Context r1 = r1.getContext()
            if (r0 == 0) goto L_0x00a8
            boolean r2 = r8.w()
            if (r2 == 0) goto L_0x00a8
            int r0 = androidx.mediarouter.R$attr.mediaRoutePauseDrawable
            int r2 = androidx.mediarouter.R$string.mr_controller_pause
            goto L_0x00c5
        L_0x00a8:
            if (r0 == 0) goto L_0x00b5
            boolean r2 = r8.y()
            if (r2 == 0) goto L_0x00b5
            int r0 = androidx.mediarouter.R$attr.mediaRouteStopDrawable
            int r2 = androidx.mediarouter.R$string.mr_controller_stop
            goto L_0x00c5
        L_0x00b5:
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r8.x()
            if (r0 == 0) goto L_0x00c2
            int r0 = androidx.mediarouter.R$attr.mediaRoutePlayDrawable
            int r2 = androidx.mediarouter.R$string.mr_controller_play
            goto L_0x00c5
        L_0x00c2:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x00c5:
            android.widget.ImageButton r5 = r8.r
            if (r3 == 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r7 = 8
        L_0x00cc:
            r5.setVisibility(r7)
            if (r3 == 0) goto L_0x00e7
            android.widget.ImageButton r3 = r8.r
            int r0 = androidx.mediarouter.app.i.p(r1, r0)
            r3.setImageResource(r0)
            android.widget.ImageButton r0 = r8.r
            android.content.res.Resources r1 = r1.getResources()
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setContentDescription(r1)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.c.N():void");
    }

    private void O() {
        int i2 = 8;
        if (!z(this.j)) {
            this.F.setVisibility(8);
        } else if (this.F.getVisibility() == 8) {
            this.F.setVisibility(0);
            this.N.setMax(this.j.v());
            this.N.setProgress(this.j.t());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.t;
            if (this.j.z()) {
                i2 = 0;
            }
            mediaRouteExpandCollapseButton.setVisibility(i2);
        }
    }

    private static boolean Q(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    private void j(Map<h.f, Rect> map, Map<h.f, BitmapDrawable> map2) {
        this.H.setEnabled(false);
        this.H.requestLayout();
        this.i0 = true;
        this.H.getViewTreeObserver().addOnGlobalLayoutListener(new k(map, map2));
    }

    private void l(View view, int i2) {
        j jVar = new j(this, s(view), i2, view);
        jVar.setDuration((long) this.k0);
        if (Build.VERSION.SDK_INT >= 21) {
            jVar.setInterpolator(this.n0);
        }
        view.startAnimation(jVar);
    }

    private boolean m() {
        return this.o == null && !(this.Y == null && this.X == null);
    }

    private void p() {
        C0031c cVar = new C0031c();
        int firstVisiblePosition = this.H.getFirstVisiblePosition();
        boolean z2 = false;
        for (int i2 = 0; i2 < this.H.getChildCount(); i2++) {
            View childAt = this.H.getChildAt(i2);
            r rVar = this.I;
            if (this.K.contains((h.f) rVar.getItem(firstVisiblePosition + i2))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(Utils.FLOAT_EPSILON, 1.0f);
                alphaAnimation.setDuration((long) this.l0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z2) {
                    alphaAnimation.setAnimationListener(cVar);
                    z2 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    private static int s(View view) {
        return view.getLayoutParams().height;
    }

    private int t(boolean z2) {
        if (!z2 && this.F.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.D.getPaddingTop() + this.D.getPaddingBottom();
        if (z2) {
            paddingTop += this.E.getMeasuredHeight();
        }
        if (this.F.getVisibility() == 0) {
            paddingTop += this.F.getMeasuredHeight();
        }
        return (!z2 || this.F.getVisibility() != 0) ? paddingTop : paddingTop + this.G.getMeasuredHeight();
    }

    static boolean u(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    private boolean v() {
        MediaDescriptionCompat mediaDescriptionCompat = this.Y;
        Uri uri = null;
        Bitmap b2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.Y;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.c();
        }
        n nVar = this.Z;
        Bitmap b3 = nVar == null ? this.a0 : nVar.b();
        n nVar2 = this.Z;
        Uri c = nVar2 == null ? this.b0 : nVar2.c();
        if (b3 != b2) {
            return true;
        }
        return b3 == null && !Q(c, uri);
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.n0 = Build.VERSION.SDK_INT >= 21 ? this.h0 ? this.o0 : this.p0 : this.q0;
    }

    public View B(Bundle bundle) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        n(true);
        this.H.requestLayout();
        this.H.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    /* access modifiers changed from: package-private */
    public void G() {
        Set<h.f> set = this.K;
        if (set == null || set.size() == 0) {
            q(true);
        } else {
            p();
        }
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z2) {
        if (this.P != null) {
            this.f0 = true;
            this.g0 = z2 | this.g0;
            return;
        }
        int i2 = 0;
        this.f0 = false;
        this.g0 = false;
        if (!this.j.D() || this.j.x()) {
            dismiss();
        } else if (this.l) {
            this.B.setText(this.j.n());
            Button button = this.p;
            if (!this.j.a()) {
                i2 = 8;
            }
            button.setVisibility(i2);
            if (this.o == null && this.c0) {
                if (u(this.d0)) {
                    "Can't set artwork image with recycled bitmap: " + this.d0;
                } else {
                    this.y.setImageBitmap(this.d0);
                    this.y.setBackgroundColor(this.e0);
                }
                o();
            }
            O();
            N();
            K(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        if (this.o == null && v()) {
            n nVar = this.Z;
            if (nVar != null) {
                nVar.cancel(true);
            }
            n nVar2 = new n();
            this.Z = nVar2;
            nVar2.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        int b2 = f.b(this.k);
        getWindow().setLayout(b2, -2);
        View decorView = getWindow().getDecorView();
        this.n = (b2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.k.getResources();
        this.Q = resources.getDimensionPixelSize(R$dimen.mr_controller_volume_group_list_item_icon_size);
        this.R = resources.getDimensionPixelSize(R$dimen.mr_controller_volume_group_list_item_height);
        this.S = resources.getDimensionPixelSize(R$dimen.mr_controller_volume_group_list_max_height);
        this.a0 = null;
        this.b0 = null;
        I();
        H(false);
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z2) {
        this.w.requestLayout();
        this.w.getViewTreeObserver().addOnGlobalLayoutListener(new i(z2));
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z2) {
        int i2;
        Bitmap bitmap;
        int s2 = s(this.D);
        D(this.D, -1);
        M(m());
        View decorView = getWindow().getDecorView();
        boolean z3 = false;
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        D(this.D, s2);
        if (this.o != null || !(this.y.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.y.getDrawable()).getBitmap()) == null) {
            i2 = 0;
        } else {
            i2 = r(bitmap.getWidth(), bitmap.getHeight());
            this.y.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int t2 = t(m());
        int size = this.J.size();
        int size2 = this.j.z() ? this.R * this.j.m().size() : 0;
        if (size > 0) {
            size2 += this.T;
        }
        int min = Math.min(size2, this.S);
        if (!this.h0) {
            min = 0;
        }
        int max = Math.max(i2, min) + t2;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.v.getMeasuredHeight() - this.w.getMeasuredHeight());
        if (this.o != null || i2 <= 0 || max > height) {
            if (s(this.H) + this.D.getMeasuredHeight() >= this.w.getMeasuredHeight()) {
                this.y.setVisibility(8);
            }
            max = min + t2;
            i2 = 0;
        } else {
            this.y.setVisibility(0);
            D(this.y, i2);
        }
        if (!m() || max > height) {
            this.E.setVisibility(8);
        } else {
            this.E.setVisibility(0);
        }
        M(this.E.getVisibility() == 0);
        if (this.E.getVisibility() == 0) {
            z3 = true;
        }
        int t3 = t(z3);
        int max2 = Math.max(i2, min) + t3;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        this.D.clearAnimation();
        this.H.clearAnimation();
        this.w.clearAnimation();
        LinearLayout linearLayout = this.D;
        if (z2) {
            l(linearLayout, t3);
            l(this.H, min);
            l(this.w, height);
        } else {
            D(linearLayout, t3);
            D(this.H, min);
            D(this.w, height);
        }
        D(this.u, rect.height());
        C(z2);
    }

    /* access modifiers changed from: package-private */
    public void P(View view) {
        D((LinearLayout) view.findViewById(R$id.volume_item_container), this.R);
        View findViewById = view.findViewById(R$id.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i2 = this.Q;
        layoutParams.width = i2;
        layoutParams.height = i2;
        findViewById.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void k(Map<h.f, Rect> map, Map<h.f, BitmapDrawable> map2) {
        OverlayListView.a aVar;
        Map<h.f, Rect> map3 = map;
        Set<h.f> set = this.K;
        if (set != null && this.L != null) {
            int size = set.size() - this.L.size();
            l lVar = new l();
            int firstVisiblePosition = this.H.getFirstVisiblePosition();
            boolean z2 = false;
            for (int i2 = 0; i2 < this.H.getChildCount(); i2++) {
                View childAt = this.H.getChildAt(i2);
                h.f fVar = (h.f) this.I.getItem(firstVisiblePosition + i2);
                Rect rect = map3.get(fVar);
                int top = childAt.getTop();
                int i3 = rect != null ? rect.top : (this.R * size) + top;
                AnimationSet animationSet = new AnimationSet(true);
                Set<h.f> set2 = this.K;
                if (set2 != null && set2.contains(fVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                    alphaAnimation.setDuration((long) this.l0);
                    animationSet.addAnimation(alphaAnimation);
                    i3 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) (i3 - top), Utils.FLOAT_EPSILON);
                translateAnimation.setDuration((long) this.k0);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(this.n0);
                if (!z2) {
                    animationSet.setAnimationListener(lVar);
                    z2 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                map3.remove(fVar);
                map2.remove(fVar);
            }
            Map<h.f, BitmapDrawable> map4 = map2;
            for (Map.Entry next : map2.entrySet()) {
                h.f fVar2 = (h.f) next.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) next.getValue();
                Rect rect2 = map3.get(fVar2);
                if (this.L.contains(fVar2)) {
                    aVar = new OverlayListView.a(bitmapDrawable, rect2);
                    aVar.c(1.0f, Utils.FLOAT_EPSILON);
                    aVar.e((long) this.m0);
                    aVar.f(this.n0);
                } else {
                    OverlayListView.a aVar2 = new OverlayListView.a(bitmapDrawable, rect2);
                    aVar2.g(this.R * size);
                    aVar2.e((long) this.k0);
                    aVar2.f(this.n0);
                    aVar2.d(new a(fVar2));
                    this.M.add(fVar2);
                    aVar = aVar2;
                }
                this.H.a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z2) {
        Set<h.f> set;
        int firstVisiblePosition = this.H.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.H.getChildCount(); i2++) {
            View childAt = this.H.getChildAt(i2);
            h.f fVar = (h.f) this.I.getItem(firstVisiblePosition + i2);
            if (!z2 || (set = this.K) == null || !set.contains(fVar)) {
                ((LinearLayout) childAt.findViewById(R$id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.H.c();
        if (!z2) {
            q(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.c0 = false;
        this.d0 = null;
        this.e0 = 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
        this.h.b(androidx.mediarouter.media.g.c, this.i, 2);
        E(this.h.h());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(R$layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        m mVar = new m();
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.mr_expandable_area);
        this.u = frameLayout;
        frameLayout.setOnClickListener(new e());
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.mr_dialog_area);
        this.v = linearLayout;
        linearLayout.setOnClickListener(new f(this));
        int d2 = i.d(this.k);
        Button button = (Button) findViewById(16908314);
        this.p = button;
        button.setText(R$string.mr_controller_disconnect);
        this.p.setTextColor(d2);
        this.p.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(16908313);
        this.q = button2;
        button2.setText(R$string.mr_controller_stop_casting);
        this.q.setTextColor(d2);
        this.q.setOnClickListener(mVar);
        this.B = (TextView) findViewById(R$id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(R$id.mr_close);
        this.s = imageButton;
        imageButton.setOnClickListener(mVar);
        this.x = (FrameLayout) findViewById(R$id.mr_custom_control);
        this.w = (FrameLayout) findViewById(R$id.mr_default_control);
        g gVar = new g();
        ImageView imageView = (ImageView) findViewById(R$id.mr_art);
        this.y = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(R$id.mr_control_title_container).setOnClickListener(gVar);
        this.D = (LinearLayout) findViewById(R$id.mr_media_main_control);
        this.G = findViewById(R$id.mr_control_divider);
        this.E = (RelativeLayout) findViewById(R$id.mr_playback_control);
        this.z = (TextView) findViewById(R$id.mr_control_title);
        this.A = (TextView) findViewById(R$id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(R$id.mr_control_playback_ctrl);
        this.r = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R$id.mr_volume_control);
        this.F = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R$id.mr_volume_slider);
        this.N = seekBar;
        seekBar.setTag(this.j);
        q qVar = new q();
        this.O = qVar;
        this.N.setOnSeekBarChangeListener(qVar);
        this.H = (OverlayListView) findViewById(R$id.mr_volume_group_list);
        this.J = new ArrayList();
        r rVar = new r(this.H.getContext(), this.J);
        this.I = rVar;
        this.H.setAdapter(rVar);
        this.M = new HashSet();
        i.u(this.k, this.D, this.H, this.j.z());
        i.w(this.k, (MediaRouteVolumeSlider) this.N, this.D);
        HashMap hashMap = new HashMap();
        this.U = hashMap;
        hashMap.put(this.j, this.N);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R$id.mr_group_expand_collapse);
        this.t = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h());
        A();
        this.k0 = this.k.getResources().getInteger(R$integer.mr_controller_volume_group_list_animation_duration_ms);
        this.l0 = this.k.getResources().getInteger(R$integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.m0 = this.k.getResources().getInteger(R$integer.mr_controller_volume_group_list_fade_out_duration_ms);
        View B2 = B(bundle);
        this.o = B2;
        if (B2 != null) {
            this.x.addView(B2);
            this.x.setVisibility(0);
        }
        this.l = true;
        J();
    }

    public void onDetachedFromWindow() {
        this.h.l(this.i);
        E((MediaSessionCompat.Token) null);
        this.m = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.j.I(i2 == 25 ? -1 : 1);
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
        this.K = null;
        this.L = null;
        this.i0 = false;
        if (this.j0) {
            this.j0 = false;
            K(z2);
        }
        this.H.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    public int r(int i2, int i3) {
        return i2 >= i3 ? (int) (((((float) this.n) * ((float) i3)) / ((float) i2)) + 0.5f) : (int) (((((float) this.n) * 9.0f) / 16.0f) + 0.5f);
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return (this.X.b() & 514) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return (this.X.b() & 516) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return (this.X.b() & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean z(h.f fVar) {
        return this.C && fVar.u() == 1;
    }
}
