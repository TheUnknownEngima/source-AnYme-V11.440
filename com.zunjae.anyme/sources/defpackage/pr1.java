package defpackage;

import com.zunjae.anyme.features.browsers.sites.AnimeFLVBrowser;
import com.zunjae.dynsourcegen.e;
import com.zunjae.dynsourcegen.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pr1  reason: default package */
public enum pr1 {
    AnimeFLV(9, AnimeFLVBrowser.class, "AnimeFLV", "AnimeFLVRepository");
    
    public static final a Companion = null;
    private final Class<?> browser;
    private final int id;
    private final String repo;
    private final String title;

    /* renamed from: pr1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final List<pr1> a() {
            pr1[] values = pr1.values();
            ArrayList arrayList = new ArrayList();
            for (pr1 pr1 : values) {
                if (pr1.isAvailable()) {
                    arrayList.add(pr1);
                }
            }
            return arrayList;
        }

        public final pr1 b(int i) {
            T t;
            boolean z;
            Iterator<T> it = a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((pr1) t).getId() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return (pr1) t;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private pr1(int i, Class<?> cls, String str, String str2) {
        this.id = i;
        this.browser = cls;
        this.title = str;
        this.repo = str2;
    }

    /* access modifiers changed from: private */
    public final boolean isAvailable() {
        if (qr1.b[ordinal()] == 1) {
            return true;
        }
        throw new j22();
    }

    public String description() {
        if (qr1.c[ordinal()] == 1) {
            return "Spanish 🇪🇸";
        }
        throw new j22();
    }

    public final Class<?> getBrowser() {
        return this.browser;
    }

    public final int getId() {
        return this.id;
    }

    public final String getRepo() {
        return this.repo;
    }

    public final String getTitle() {
        return this.title;
    }

    public List<String> tags() {
        if (qr1.a[ordinal()] == 1) {
            return null;
        }
        throw new j22();
    }

    public e toRepresentable() {
        return new e(this.id, this.title, this.repo, description(), f.Local, isAvailable(), tags(), 0, 0, 384, (r62) null);
    }
}
