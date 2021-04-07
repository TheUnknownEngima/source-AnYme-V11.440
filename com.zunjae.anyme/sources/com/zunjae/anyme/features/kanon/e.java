package com.zunjae.anyme.features.kanon;

import com.zunjae.anyme.features.bookmarks.b;
import com.zunjae.anyme.features.bookmarks.c;
import com.zunjae.anyme.features.bookmarks.f;
import com.zunjae.anyme.features.bookmarks.h;
import com.zunjae.anyme.features.bookmarks.j;
import com.zunjae.anyme.features.discover.advanced_search_v3.a;
import com.zunjae.anyme.features.notes.d;
import com.zunjae.anyme.features.waifus.k;
import java.util.ArrayList;
import java.util.List;

public interface e {
    @kj2("/bookmark")
    ai2<b> A(@pj2("bookmark_name") String str);

    @dj2("/anime/CurrentSeason")
    ai2<List<jt1>> B();

    @dj2("/anime/producer/{producerId}")
    ai2<ArrayList<vy1>> C(@oj2("producerId") int i, @pj2("pageNumber") int i2);

    @dj2("/anime/category/relevant")
    ai2<ArrayList<b>> D();

    @kj2("/anime/userrecs")
    ai2<List<vx1>> E(@zi2 wx1 wx1, @pj2("minimumYear") int i, @pj2("minimumScore") int i2);

    @kj2("/anime/search/v4")
    ai2<List<vy1>> F(@pj2("pageNumber") int i, @zi2 a aVar);

    @kj2("/waifus/ids")
    ai2<List<k>> G(@zi2 List<Integer> list);

    @dj2("/bookmark")
    ai2<ArrayList<b>> H();

    @aj2("/waifus/{waifuid}")
    ai2<db2> I(@oj2("waifuid") int i);

    @aj2("/vydia/snapshot/{animeId}/{episode}/{duration}")
    ai2<Void> J(@oj2("animeId") int i, @oj2("episode") int i2, @oj2("duration") long j);

    @lj2("/bookmark/{bookmarkId}/entries")
    ai2<Void> K(@oj2("bookmarkId") String str, @zi2 j jVar);

    @kj2("/anime/continue")
    ai2<ArrayList<vy1>> L(@zi2 k kVar);

    @dj2("/anime/recommendation/{animeId}")
    ai2<List<vy1>> M(@oj2("animeId") int i);

    @kj2("/events/anime_watched/{animeId}")
    ai2<db2> N(@oj2("animeId") int i, @pj2("host") int i2);

    @dj2("/notes/all")
    ai2<ArrayList<vy1>> O();

    @dj2("/events/popular_hosts")
    ai2<List<g>> P();

    @aj2("/notes/anime/{animeId}")
    ai2<db2> Q(@oj2("animeId") int i, @pj2("episodeNumber") int i2);

    @dj2("/anime/popular_by_genre/{genreId}")
    ai2<List<vy1>> a(@oj2("genreId") int i);

    @kj2("/user/stats")
    ai2<yx1> b(@zi2 zx1 zx1);

    @kj2("/anime/KitsuInfo")
    ai2<List<yy1>> c(@zi2 List<Integer> list);

    @dj2("/anime/relations/{animeid}")
    ai2<List<az1>> d(@oj2("animeid") int i);

    @dj2("/notes/anime/{animeId}/{episodeNumber}")
    ai2<List<d>> e(@oj2("animeId") int i, @oj2("episodeNumber") int i2);

    @dj2("/waifus")
    ai2<List<com.zunjae.anyme.features.waifus.j>> f();

    @dj2("/anime/genre")
    ai2<ArrayList<vy1>> g(@pj2("genreId") int i, @pj2("pageNumber") int i2);

    @aj2("/bookmark/{bookmarkId}")
    ai2<Void> h(@oj2("bookmarkId") String str);

    @dj2("/events/anime_watched/top/{timesAgo}")
    ai2<ArrayList<vy1>> i(@oj2("timesAgo") int i);

    @kj2("/notes")
    ai2<db2> j(@zi2 d dVar);

    @kj2("/vydia/snapshot/{animeId}/{episode}")
    ai2<Void> k(@oj2("animeId") int i, @oj2("episode") int i2, @zi2 f fVar);

    @kj2("/bookmark/check/{animeId}")
    ai2<List<c>> l(@oj2("animeId") int i);

    @dj2("/waifus/top/{count}")
    ai2<List<com.zunjae.anyme.features.waifus.j>> m(@oj2("count") int i);

    @dj2("/anime/score_distribution/{animeId}")
    ai2<List<h>> n(@oj2("animeId") int i);

    @kj2("/anime/continue/v2")
    ai2<ArrayList<com.zunjae.anyme.features.discover.continue_watching.c>> o(@zi2 k kVar);

    @dj2("/anime/genres/aggregated")
    ai2<List<ct1>> p();

    @lj2("/bookmark/{bookmarkId}/rename")
    ai2<Void> q(@oj2("bookmarkId") String str, @pj2("bookmark_name") String str2);

    @dj2("/vydia/snapshot/{animeId}/{episode}")
    ai2<List<n>> r(@oj2("animeId") int i, @oj2("episode") int i2);

    @kj2("/user/stats/favorite_genres")
    ai2<List<l>> s(@zi2 m mVar);

    @kj2("/anime/genres/showgenres")
    ai2<List<a>> t(@zi2 List<Integer> list);

    @dj2("/staff/recommendation")
    ai2<List<j>> u();

    @dj2("/notes/anime/{animeid}")
    ai2<List<d>> v(@oj2("animeid") int i);

    @dj2("/anime/category")
    ai2<ArrayList<vy1>> w(@pj2("id") int i, @pj2("pageNumber") int i2);

    @kj2("/waifus")
    ai2<db2> x(@zi2 com.zunjae.anyme.features.waifus.j jVar);

    @lj2("/bookmark/bulk/{animeId}")
    ai2<Void> y(@oj2("animeId") int i, @zi2 h hVar);

    @dj2("/bookmark/{bookmarkId}/entries")
    ai2<List<f>> z(@oj2("bookmarkId") String str);
}
