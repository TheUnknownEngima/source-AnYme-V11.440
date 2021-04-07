package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import defpackage.de;
import defpackage.fe;
import defpackage.fh;
import defpackage.hh;
import defpackage.ih;
import defpackage.jh;
import defpackage.kh;
import defpackage.lh;
import defpackage.mh;
import defpackage.ng;
import defpackage.nh;
import defpackage.og;
import defpackage.oh;
import defpackage.ph;
import defpackage.qg;
import defpackage.qh;
import defpackage.rg;
import defpackage.sg;
import defpackage.wi;
import defpackage.xg;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c implements ComponentCallbacks2 {
    private static volatile c n;
    private static volatile boolean o;
    private final xe e;
    private final rf f;
    private final ig g;
    private final e h;
    private final h i;
    private final of j;
    private final ik k;
    private final ak l;
    private final List<j> m = new ArrayList();

    public interface a {
        cl a();
    }

    c(Context context, xe xeVar, ig igVar, rf rfVar, of ofVar, ik ikVar, ak akVar, int i2, a aVar, Map<Class<?>, k<?, ?>> map, List<bl<Object>> list, boolean z, boolean z2) {
        k kVar;
        k kVar2;
        Class<od> cls;
        Context context2 = context;
        rf rfVar2 = rfVar;
        of ofVar2 = ofVar;
        Class<od> cls2 = od.class;
        Class<String> cls3 = String.class;
        Class<Integer> cls4 = Integer.class;
        Class<byte[]> cls5 = byte[].class;
        f fVar = f.NORMAL;
        this.e = xeVar;
        this.f = rfVar2;
        this.j = ofVar2;
        this.g = igVar;
        this.k = ikVar;
        this.l = akVar;
        Resources resources = context.getResources();
        h hVar = new h();
        this.i = hVar;
        hVar.o(new ei());
        if (Build.VERSION.SDK_INT >= 27) {
            this.i.o(new ji());
        }
        List<ImageHeaderParser> g2 = this.i.g();
        gj gjVar = new gj(context2, g2, rfVar2, ofVar2);
        k<ParcelFileDescriptor, Bitmap> h2 = vi.h(rfVar);
        gi giVar = new gi(this.i.g(), resources.getDisplayMetrics(), rfVar2, ofVar2);
        if (!z2 || Build.VERSION.SDK_INT < 28) {
            kVar = new ai(giVar);
            kVar2 = new si(giVar, ofVar2);
        } else {
            kVar2 = new ni();
            kVar = new bi();
        }
        cj cjVar = new cj(context2);
        Class<byte[]> cls6 = cls5;
        fh.c cVar = new fh.c(resources);
        fh.d dVar = new fh.d(resources);
        Class<String> cls7 = cls3;
        fh.b bVar = new fh.b(resources);
        fh.d dVar2 = dVar;
        fh.a aVar2 = new fh.a(resources);
        wh whVar = new wh(ofVar2);
        Class<Integer> cls8 = cls4;
        qj qjVar = new qj();
        tj tjVar = new tj();
        ContentResolver contentResolver = context.getContentResolver();
        h hVar2 = this.i;
        fh.b bVar2 = bVar;
        fh.c cVar2 = cVar;
        hVar2.a(ByteBuffer.class, new pg());
        hVar2.a(InputStream.class, new gh(ofVar2));
        cj cjVar2 = cjVar;
        hVar2.e("Bitmap", ByteBuffer.class, Bitmap.class, kVar);
        hVar2.e("Bitmap", InputStream.class, Bitmap.class, kVar2);
        if (fe.c()) {
            cls = cls2;
            this.i.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new pi(giVar));
        } else {
            cls = cls2;
        }
        h hVar3 = this.i;
        hVar3.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h2);
        hVar3.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, vi.c(rfVar));
        hVar3.d(Bitmap.class, Bitmap.class, ih.a.a());
        hVar3.e("Bitmap", Bitmap.class, Bitmap.class, new ui());
        hVar3.b(Bitmap.class, whVar);
        hVar3.e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new uh(resources, kVar));
        hVar3.e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new uh(resources, kVar2));
        hVar3.e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new uh(resources, h2));
        hVar3.b(BitmapDrawable.class, new vh(rfVar2, whVar));
        hVar3.e("Gif", InputStream.class, ij.class, new pj(g2, gjVar, ofVar2));
        hVar3.e("Gif", ByteBuffer.class, ij.class, gjVar);
        hVar3.b(ij.class, new jj());
        Class<od> cls9 = cls;
        hVar3.d(cls9, cls9, ih.a.a());
        hVar3.e("Bitmap", cls9, Bitmap.class, new nj(rfVar2));
        cj cjVar3 = cjVar2;
        hVar3.c(Uri.class, Drawable.class, cjVar3);
        hVar3.c(Uri.class, Bitmap.class, new ri(cjVar3, rfVar2));
        hVar3.p(new wi.a());
        hVar3.d(File.class, ByteBuffer.class, new qg.b());
        hVar3.d(File.class, InputStream.class, new sg.e());
        hVar3.c(File.class, File.class, new ej());
        hVar3.d(File.class, ParcelFileDescriptor.class, new sg.b());
        hVar3.d(File.class, File.class, ih.a.a());
        hVar3.p(new de.a(ofVar2));
        if (fe.c()) {
            this.i.p(new fe.a());
        }
        h hVar4 = this.i;
        fh.c cVar3 = cVar2;
        hVar4.d(Integer.TYPE, InputStream.class, cVar3);
        fh.b bVar3 = bVar2;
        hVar4.d(Integer.TYPE, ParcelFileDescriptor.class, bVar3);
        Class<Integer> cls10 = cls8;
        hVar4.d(cls10, InputStream.class, cVar3);
        hVar4.d(cls10, ParcelFileDescriptor.class, bVar3);
        fh.d dVar3 = dVar2;
        hVar4.d(cls10, Uri.class, dVar3);
        fh.a aVar3 = aVar2;
        hVar4.d(Integer.TYPE, AssetFileDescriptor.class, aVar3);
        hVar4.d(cls10, AssetFileDescriptor.class, aVar3);
        hVar4.d(Integer.TYPE, Uri.class, dVar3);
        Class<String> cls11 = cls7;
        hVar4.d(cls11, InputStream.class, new rg.c());
        hVar4.d(Uri.class, InputStream.class, new rg.c());
        hVar4.d(cls11, InputStream.class, new hh.c());
        hVar4.d(cls11, ParcelFileDescriptor.class, new hh.b());
        hVar4.d(cls11, AssetFileDescriptor.class, new hh.a());
        hVar4.d(Uri.class, InputStream.class, new mh.a());
        hVar4.d(Uri.class, InputStream.class, new ng.c(context.getAssets()));
        hVar4.d(Uri.class, ParcelFileDescriptor.class, new ng.b(context.getAssets()));
        Context context3 = context;
        hVar4.d(Uri.class, InputStream.class, new nh.a(context3));
        hVar4.d(Uri.class, InputStream.class, new oh.a(context3));
        if (Build.VERSION.SDK_INT >= 29) {
            this.i.d(Uri.class, InputStream.class, new ph.c(context3));
            this.i.d(Uri.class, ParcelFileDescriptor.class, new ph.b(context3));
        }
        h hVar5 = this.i;
        ContentResolver contentResolver2 = contentResolver;
        hVar5.d(Uri.class, InputStream.class, new jh.d(contentResolver2));
        hVar5.d(Uri.class, ParcelFileDescriptor.class, new jh.b(contentResolver2));
        hVar5.d(Uri.class, AssetFileDescriptor.class, new jh.a(contentResolver2));
        hVar5.d(Uri.class, InputStream.class, new kh.a());
        hVar5.d(URL.class, InputStream.class, new qh.a());
        hVar5.d(Uri.class, File.class, new xg.a(context3));
        hVar5.d(tg.class, InputStream.class, new lh.a());
        Class<byte[]> cls12 = cls6;
        hVar5.d(cls12, ByteBuffer.class, new og.a());
        hVar5.d(cls12, InputStream.class, new og.d());
        hVar5.d(Uri.class, Uri.class, ih.a.a());
        hVar5.d(Drawable.class, Drawable.class, ih.a.a());
        hVar5.c(Drawable.class, Drawable.class, new dj());
        hVar5.q(Bitmap.class, BitmapDrawable.class, new rj(resources));
        qj qjVar2 = qjVar;
        hVar5.q(Bitmap.class, cls12, qjVar2);
        tj tjVar2 = tjVar;
        hVar5.q(Drawable.class, cls12, new sj(rfVar2, qjVar2, tjVar2));
        hVar5.q(ij.class, cls12, tjVar2);
        if (Build.VERSION.SDK_INT >= 23) {
            k<ByteBuffer, Bitmap> d = vi.d(rfVar);
            this.i.c(ByteBuffer.class, Bitmap.class, d);
            this.i.c(ByteBuffer.class, BitmapDrawable.class, new uh(resources, d));
        }
        Context context4 = context;
        of ofVar3 = ofVar;
        this.h = new e(context4, ofVar3, this.i, new ml(), aVar, map, list, xeVar, z, i2);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!o) {
            o = true;
            n(context, generatedAppGlideModule);
            o = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static c d(Context context) {
        if (n == null) {
            GeneratedAppGlideModule e2 = e(context.getApplicationContext());
            synchronized (c.class) {
                if (n == null) {
                    a(context, e2);
                }
            }
        }
        return n;
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            boolean isLoggable = Log.isLoggable("Glide", 5);
            return null;
        } catch (InstantiationException e2) {
            r(e2);
            throw null;
        } catch (IllegalAccessException e3) {
            r(e3);
            throw null;
        } catch (NoSuchMethodException e4) {
            r(e4);
            throw null;
        } catch (InvocationTargetException e5) {
            r(e5);
            throw null;
        }
    }

    private static ik m(Context context) {
        jm.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    private static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new d(), generatedAppGlideModule);
    }

    private static void o(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<ok> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new qk(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.d();
            Iterator<ok> it = emptyList.iterator();
            while (it.hasNext()) {
                ok next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        "AppGlideModule excludes manifest GlideModule: " + next;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (ok okVar : emptyList) {
                "Discovered GlideModule from manifest: " + okVar.getClass();
            }
        }
        dVar.d(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (ok a2 : emptyList) {
            a2.a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c a3 = dVar.a(applicationContext);
        for (ok next2 : emptyList) {
            try {
                next2.b(applicationContext, a3, a3.i);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, a3, a3.i);
        }
        applicationContext.registerComponentCallbacks(a3);
        n = a3;
    }

    private static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static j u(Activity activity) {
        return m(activity).d(activity);
    }

    public static j v(Context context) {
        return m(context).e(context);
    }

    public static j w(Fragment fragment) {
        return m(fragment.u()).f(fragment);
    }

    public static j x(FragmentActivity fragmentActivity) {
        return m(fragmentActivity).g(fragmentActivity);
    }

    public void b() {
        km.a();
        this.e.e();
    }

    public void c() {
        km.b();
        this.g.b();
        this.f.b();
        this.j.b();
    }

    public of f() {
        return this.j;
    }

    public rf g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public ak h() {
        return this.l;
    }

    public Context i() {
        return this.h.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    public e j() {
        return this.h;
    }

    public h k() {
        return this.i;
    }

    public ik l() {
        return this.k;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        c();
    }

    public void onTrimMemory(int i2) {
        s(i2);
    }

    /* access modifiers changed from: package-private */
    public void p(j jVar) {
        synchronized (this.m) {
            if (!this.m.contains(jVar)) {
                this.m.add(jVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(pl<?> plVar) {
        synchronized (this.m) {
            for (j C : this.m) {
                if (C.C(plVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void s(int i2) {
        km.b();
        for (j onTrimMemory : this.m) {
            onTrimMemory.onTrimMemory(i2);
        }
        this.g.a(i2);
        this.f.a(i2);
        this.j.a(i2);
    }

    /* access modifiers changed from: package-private */
    public void t(j jVar) {
        synchronized (this.m) {
            if (this.m.contains(jVar)) {
                this.m.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
