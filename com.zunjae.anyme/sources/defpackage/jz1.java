package defpackage;

import com.zunjae.dynsourcegen.e;
import com.zunjae.dynsourcegen.f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jz1  reason: default package */
public enum jz1 {
    WonderfulSubs(1, "WonderfulSubs", "WonderfulSubsRepo"),
    AnimeUltima(2, "AnimeUltima", "AnimeUltimaNative"),
    AnimeFlix(3, "AnimeFlix", "AnimeFlixNative"),
    GoGoAnime(4, "GoGoAnime", "GoGoAnimeNative"),
    AnimeKisa(5, "AnimeKisa", "AnimeKisaNative"),
    AnimeOne(6, "Anime1", "Anime1Native");
    
    public static final a Companion = null;
    private final int id;
    private final String repositoryId;
    private final String title;

    /* renamed from: jz1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final List<jz1> a() {
            jz1[] values = jz1.values();
            ArrayList arrayList = new ArrayList();
            for (jz1 jz1 : values) {
                if (jz1.isAvailable()) {
                    arrayList.add(jz1);
                }
            }
            return arrayList;
        }

        public final void b(int i) {
            for (jz1 deleteShowDestinationForId : jz1.values()) {
                deleteShowDestinationForId.deleteShowDestinationForId(i);
            }
        }

        public final iz1 c(int i) {
            switch (i) {
                case 1:
                    return new h02();
                case 2:
                    return new zz1();
                case 3:
                    return new rz1();
                case 4:
                    return new f02();
                case 5:
                    return new wz1();
                case 6:
                    return new xz1();
                default:
                    throw new k22((String) null, 1, (r62) null);
            }
        }

        public final jz1 d(int i) {
            for (jz1 jz1 : jz1.values()) {
                if (jz1.getId() == i) {
                    return jz1;
                }
            }
            return null;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private jz1(int i, String str, String str2) {
        this.id = i;
        this.title = str;
        this.repositoryId = str2;
    }

    private final int forcedSortOrder() {
        return Integer.MAX_VALUE;
    }

    private final String uniqueSeasonShowId(int i, String str) {
        return this.title + "_NSS2{" + i + "}_SLUG" + str;
    }

    private final String uniqueShowId(int i) {
        return this.title + "_NSS2" + i;
    }

    public final void deleteShowDestinationForId(int i) {
        l02.c(uniqueShowId(i));
    }

    public String description() {
        switch (kz1.a[ordinal()]) {
            case 1:
            case 3:
                return "Native, adaptive streaming, good for recently released shows, mostly 1080p";
            case 2:
                return "Native, adaptive streaming, quality picker, 720p, 1080P";
            case 4:
            case 5:
            case 6:
                return "Native";
            default:
                throw new j22();
        }
    }

    public final int getId() {
        return this.id;
    }

    public final String getSeasonIdForSlug(int i, String str) {
        v62.e(str, "slug");
        return l02.l(uniqueSeasonShowId(i, str), (String) null);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUniqueShowDestination(int i) {
        return l02.l(uniqueShowId(i), (String) null);
    }

    public final boolean hasUniqueShowIdDestinationSaved(int i) {
        return l02.m(uniqueShowId(i));
    }

    public final boolean isAvailable() {
        switch (kz1.b[ordinal()]) {
            case 1:
            case 2:
            case 4:
                return false;
            case 3:
            case 5:
            case 6:
                return true;
            default:
                throw new j22();
        }
    }

    public final boolean isSlow() {
        switch (kz1.d[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new j22();
        }
    }

    public final void saveSeasonIdForSlug(int i, String str, String str2) {
        v62.e(str, "seasonId");
        v62.e(str2, "slug");
        if (!f92.n(str)) {
            l02.v(uniqueSeasonShowId(i, str2), str);
        }
    }

    public final void saveUniqueShowId(int i, String str) {
        v62.e(str, "streamingSiteShowIdentifier");
        l02.v(uniqueShowId(i), str);
    }

    public List<String> tags() {
        switch (kz1.c[ordinal()]) {
            case 1:
                return f32.h("Beta", "Native");
            case 2:
                return f32.h("Beta", "Native");
            case 3:
                return f32.h("Beta", "Native");
            case 4:
            case 5:
            case 6:
                return e32.b("Native");
            default:
                throw new j22();
        }
    }

    public e toRepresentable() {
        int i = this.id;
        return new e(i, this.title + " Native", this.repositoryId, description(), f.Native, false, tags(), forcedSortOrder(), 0, 288, (r62) null);
    }
}
