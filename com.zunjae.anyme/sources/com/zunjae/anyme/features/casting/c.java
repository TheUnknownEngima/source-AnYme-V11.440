package com.zunjae.anyme.features.casting;

import android.content.Context;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum c {
    AllCast(1, "AllCast", "com.koushikdutta.cast", C0274R$drawable.allcast, false, false, 48, (boolean) null),
    AllScreen(2, "All Screen", "com.toxic.apps.chrome", C0274R$drawable.allscreen, false, false, 48, (boolean) null),
    LocalCast(3, "LocalCast", "de.stefanpledl.localcast", C0274R$drawable.localcast, false, false, 48, (boolean) null),
    WebVideoCast(4, "Web Video Cast", "com.instantbits.cast.webvideo", C0274R$drawable.webvideocast, false, false, 48, (boolean) null),
    BubbleUPnP(5, "BubbleUPnP", "com.bubblesoft.android.bubbleupnp", C0274R$drawable.bubbleupnp, false, false, 48, (boolean) null),
    Yatse(6, "Yatse", "org.leetzone.android.yatsewidgetfree", C0274R$drawable.yatse, false, false, 48, (boolean) null),
    SpYral(7, "SpYral", "com.zunjae.spyral", C0274R$drawable.yatse, true, false);
    
    public static final a Companion = null;
    private static final String KEY_REMEMBER_CAST_APP = "KEY_REMEMBER_CAST_APP";
    private final String appName;
    private final int drawableId;
    private final int id;
    private final boolean isAvailable;
    private final boolean isNative;
    private final String packageId;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        private final c c(int i) {
            for (c cVar : c.values()) {
                if (cVar.getId() == i) {
                    return cVar;
                }
            }
            return null;
        }

        public final List<c> a() {
            List q = b32.q(c.values());
            ArrayList arrayList = new ArrayList();
            for (Object next : q) {
                if (((c) next).isAvailable()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final void b() {
            l02.c(c.KEY_REMEMBER_CAST_APP);
        }

        public final c d(Context context) {
            v62.e(context, "context");
            c c = c(l02.g(c.KEY_REMEMBER_CAST_APP, -1));
            if (c == null) {
                return null;
            }
            if (com.zunjae.zapplib.a.c(context, c.getPackageId())) {
                return c;
            }
            return null;
        }

        public final void e(c cVar) {
            v62.e(cVar, "castApp");
            l02.r(c.KEY_REMEMBER_CAST_APP, cVar.getId());
        }

        public final boolean f(AnimeInfoActivity animeInfoActivity) {
            v62.e(animeInfoActivity, "activity");
            c[] values = c.values();
            ArrayList<c> arrayList = new ArrayList<>();
            for (c cVar : values) {
                if (!cVar.isNative()) {
                    arrayList.add(cVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(g32.l(arrayList, 10));
            for (c packageId : arrayList) {
                arrayList2.add(packageId.getPackageId());
            }
            Object[] array = arrayList2.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return com.zunjae.zapplib.a.b(animeInfoActivity, (String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private c(int i, String str, String str2, int i2, boolean z, boolean z2) {
        this.id = i;
        this.appName = str;
        this.packageId = str2;
        this.drawableId = i2;
        this.isNative = z;
        this.isAvailable = z2;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final int getDrawableId() {
        return this.drawableId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isNative() {
        return this.isNative;
    }
}
