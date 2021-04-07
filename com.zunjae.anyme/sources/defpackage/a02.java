package defpackage;

/* renamed from: a02  reason: default package */
public interface a02 {

    /* renamed from: a02$a */
    public static final class a {
        public static /* synthetic */ ai2 a(a02 a02, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return a02.d(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAnimeEpisodes");
        }

        public static /* synthetic */ ai2 b(a02 a02, String str, int i, String str2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str2 = "sub";
                }
                return a02.c(str, i, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchEpisodeInfo");
        }

        public static /* synthetic */ ai2 c(a02 a02, int i, String str, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str = "sub";
                }
                return a02.b(i, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchEpisodeInformation");
        }
    }

    @dj2("search")
    ai2<e02> a(@pj2("q") String str);

    @dj2("episodeVideos")
    ai2<c02> b(@pj2("id") int i, @pj2("type") String str);

    @dj2("getEpisode")
    ai2<b02> c(@pj2("slug") String str, @pj2("episode_num") int i, @pj2("type") String str2);

    @dj2("getAnime")
    ai2<d02> d(@pj2("slug") String str, @pj2("withSchema") boolean z);
}
