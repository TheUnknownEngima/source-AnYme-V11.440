package defpackage;

import java.util.List;

/* renamed from: sz1  reason: default package */
public interface sz1 {

    /* renamed from: sz1$a */
    public static final class a {
        public static /* synthetic */ ai2 a(sz1 sz1, int i, int i2, int i3, String str, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 4) != 0) {
                    i3 = 50;
                }
                if ((i4 & 8) != 0) {
                    str = "ASC";
                }
                return sz1.c(i, i2, i3, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchEpisodes");
        }
    }

    @dj2("search")
    ai2<uz1> a(@pj2("q") String str);

    @dj2("videos")
    ai2<List<vz1>> b(@pj2("episode_id") int i);

    @dj2("episodes")
    ai2<tz1> c(@pj2("anime_id") int i, @pj2("page") int i2, @pj2("limit") int i3, @pj2("sort") String str);
}
