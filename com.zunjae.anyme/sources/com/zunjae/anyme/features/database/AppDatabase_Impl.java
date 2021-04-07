package com.zunjae.anyme.features.database;

import androidx.room.c;
import androidx.room.i;
import androidx.room.l;
import androidx.room.n;
import defpackage.k6;
import defpackage.n6;
import java.util.HashMap;
import java.util.HashSet;

public final class AppDatabase_Impl extends AppDatabase {
    private volatile a m;
    private volatile c n;
    private volatile e o;

    class a extends n.a {
        a(int i) {
            super(i);
        }

        public void a(m6 m6Var) {
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `animes` (`series_animedb_id` INTEGER NOT NULL, `series_title` TEXT NOT NULL, `series_type` INTEGER NOT NULL, `series_episodes` INTEGER NOT NULL, `series_status` INTEGER NOT NULL, `series_image` TEXT NOT NULL, `my_watched_episodes` INTEGER NOT NULL, `my_score` INTEGER NOT NULL, `my_status` INTEGER NOT NULL, `my_order` INTEGER NOT NULL, `kitsu_malId` INTEGER, `kitsu_kitsuId` INTEGER, `kitsu_startDate2` TEXT, `kitsu_endDate2` TEXT, `kitsu_posterId` TEXT, `kitsu_coverId` TEXT, `kitsu_type` TEXT, `kitsu_titleEnJp` TEXT, `kitsu_titleEn` TEXT, `kitsu_titleJaJp` TEXT, `livechart_malid` INTEGER, `livechart_time` INTEGER, `livechart_episode` INTEGER, PRIMARY KEY(`series_animedb_id`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `characters` (`name` TEXT, `characterURL` TEXT, `imageURL` TEXT NOT NULL, `animeId` INTEGER NOT NULL, PRIMARY KEY(`imageURL`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `AnimeJikanInfoR2` (`malId` INTEGER, `title` TEXT, `title_english` TEXT, `image_url` TEXT, `type` TEXT, `source` TEXT, `episodes` INTEGER, `status` TEXT, `duration` TEXT, `rating` TEXT, `popularity` TEXT, `score` REAL, `rank` INTEGER, `trailer_url` TEXT, `synopsis` TEXT, `broadcast` TEXT, `studio` TEXT, `genre` TEXT, `opening_theme` TEXT, `ending_theme` TEXT, `expirationDate` INTEGER NOT NULL, `jikanRelated` TEXT, `synonyms` TEXT, `airedInfo` TEXT, PRIMARY KEY(`malId`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `animerecommendations` (`animeId` INTEGER NOT NULL, `parentAnimeId` INTEGER NOT NULL, `title` TEXT, `image` TEXT, `priority` INTEGER NOT NULL, `expirationDate` INTEGER NOT NULL, PRIMARY KEY(`animeId`, `parentAnimeId`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `releasedays` (`day` TEXT, `anime_id` INTEGER NOT NULL, PRIMARY KEY(`anime_id`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `MinimalAnimeInfo` (`series_animedb_id` INTEGER NOT NULL, `series_title` TEXT, `series_image` TEXT, PRIMARY KEY(`series_animedb_id`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `minimal_kitsu_info` (`malId` INTEGER NOT NULL, `kitsuId` INTEGER NOT NULL, `startDate2` TEXT, `endDate2` TEXT, `posterId` TEXT, `coverId` TEXT, `type` TEXT, `titleEnJp` TEXT, `titleEn` TEXT, `titleJaJp` TEXT, PRIMARY KEY(`malId`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `CalendarEntry` (`malid` INTEGER, `time` INTEGER NOT NULL, `series_cover` TEXT, `tags` TEXT, `title` TEXT, `episode` INTEGER NOT NULL, `dayOfWeek` INTEGER NOT NULL, PRIMARY KEY(`malid`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `related_animes` (`parent_anime_id` INTEGER NOT NULL, `series_id` INTEGER NOT NULL, `title` TEXT, `type` TEXT, `episodes` INTEGER, `picture` TEXT, `expiration_date` INTEGER NOT NULL, PRIMARY KEY(`parent_anime_id`, `series_id`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `AnimeDownloadEntry` (`fileDownloadId` INTEGER NOT NULL, `malid` INTEGER NOT NULL, `seriesTitle` TEXT NOT NULL, `episodeNumber` INTEGER NOT NULL, `series_animedb_id` INTEGER, `series_title` TEXT, `series_type` INTEGER, `series_episodes` INTEGER, `series_status` INTEGER, `series_image` TEXT, `my_watched_episodes` INTEGER, `my_score` INTEGER, `my_status` INTEGER, `my_order` INTEGER, `kitsu_malId` INTEGER, `kitsu_kitsuId` INTEGER, `kitsu_startDate2` TEXT, `kitsu_endDate2` TEXT, `kitsu_posterId` TEXT, `kitsu_coverId` TEXT, `kitsu_type` TEXT, `kitsu_titleEnJp` TEXT, `kitsu_titleEn` TEXT, `kitsu_titleJaJp` TEXT, `livechart_malid` INTEGER, `livechart_time` INTEGER, `livechart_episode` INTEGER, PRIMARY KEY(`malid`, `episodeNumber`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `nsfwshows` (`nsfw_animeid` INTEGER NOT NULL, PRIMARY KEY(`nsfw_animeid`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS `waifus` (`waifu_id` INTEGER NOT NULL, `parent_anime_id` INTEGER NOT NULL, `waifu_name` TEXT, `waifu_image_url` TEXT, `date_created` INTEGER NOT NULL, PRIMARY KEY(`waifu_id`))");
            m6Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            m6Var.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a198120aa89e45f0972b3033dfef9f6f')");
        }

        public void b(m6 m6Var) {
            m6Var.execSQL("DROP TABLE IF EXISTS `animes`");
            m6Var.execSQL("DROP TABLE IF EXISTS `characters`");
            m6Var.execSQL("DROP TABLE IF EXISTS `AnimeJikanInfoR2`");
            m6Var.execSQL("DROP TABLE IF EXISTS `animerecommendations`");
            m6Var.execSQL("DROP TABLE IF EXISTS `releasedays`");
            m6Var.execSQL("DROP TABLE IF EXISTS `MinimalAnimeInfo`");
            m6Var.execSQL("DROP TABLE IF EXISTS `minimal_kitsu_info`");
            m6Var.execSQL("DROP TABLE IF EXISTS `CalendarEntry`");
            m6Var.execSQL("DROP TABLE IF EXISTS `related_animes`");
            m6Var.execSQL("DROP TABLE IF EXISTS `AnimeDownloadEntry`");
            m6Var.execSQL("DROP TABLE IF EXISTS `nsfwshows`");
            m6Var.execSQL("DROP TABLE IF EXISTS `waifus`");
            if (AppDatabase_Impl.this.h != null) {
                int size = AppDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((l.b) AppDatabase_Impl.this.h.get(i)).b(m6Var);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void c(m6 m6Var) {
            if (AppDatabase_Impl.this.h != null) {
                int size = AppDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((l.b) AppDatabase_Impl.this.h.get(i)).a(m6Var);
                }
            }
        }

        public void d(m6 m6Var) {
            m6 unused = AppDatabase_Impl.this.a = m6Var;
            AppDatabase_Impl.this.q(m6Var);
            if (AppDatabase_Impl.this.h != null) {
                int size = AppDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((l.b) AppDatabase_Impl.this.h.get(i)).c(m6Var);
                }
            }
        }

        public void e(m6 m6Var) {
        }

        public void f(m6 m6Var) {
            h6.a(m6Var);
        }

        /* access modifiers changed from: protected */
        public n.b g(m6 m6Var) {
            m6 m6Var2 = m6Var;
            HashMap hashMap = new HashMap(23);
            hashMap.put("series_animedb_id", new k6.a("series_animedb_id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("series_title", new k6.a("series_title", "TEXT", true, 0, (String) null, 1));
            hashMap.put("series_type", new k6.a("series_type", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("series_episodes", new k6.a("series_episodes", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("series_status", new k6.a("series_status", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("series_image", new k6.a("series_image", "TEXT", true, 0, (String) null, 1));
            hashMap.put("my_watched_episodes", new k6.a("my_watched_episodes", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("my_score", new k6.a("my_score", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("my_status", new k6.a("my_status", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("my_order", new k6.a("my_order", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("kitsu_malId", new k6.a("kitsu_malId", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("kitsu_kitsuId", new k6.a("kitsu_kitsuId", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("kitsu_startDate2", new k6.a("kitsu_startDate2", "TEXT", false, 0, (String) null, 1));
            Object obj = "kitsu_startDate2";
            hashMap.put("kitsu_endDate2", new k6.a("kitsu_endDate2", "TEXT", false, 0, (String) null, 1));
            Object obj2 = "kitsu_endDate2";
            hashMap.put("kitsu_posterId", new k6.a("kitsu_posterId", "TEXT", false, 0, (String) null, 1));
            Object obj3 = "kitsu_posterId";
            hashMap.put("kitsu_coverId", new k6.a("kitsu_coverId", "TEXT", false, 0, (String) null, 1));
            Object obj4 = "kitsu_coverId";
            hashMap.put("kitsu_type", new k6.a("kitsu_type", "TEXT", false, 0, (String) null, 1));
            Object obj5 = "kitsu_type";
            hashMap.put("kitsu_titleEnJp", new k6.a("kitsu_titleEnJp", "TEXT", false, 0, (String) null, 1));
            Object obj6 = "kitsu_titleEnJp";
            hashMap.put("kitsu_titleEn", new k6.a("kitsu_titleEn", "TEXT", false, 0, (String) null, 1));
            hashMap.put("kitsu_titleJaJp", new k6.a("kitsu_titleJaJp", "TEXT", false, 0, (String) null, 1));
            hashMap.put("livechart_malid", new k6.a("livechart_malid", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("livechart_time", new k6.a("livechart_time", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("livechart_episode", new k6.a("livechart_episode", "INTEGER", false, 0, (String) null, 1));
            Object obj7 = "kitsu_kitsuId";
            Object obj8 = "kitsu_malId";
            k6 k6Var = new k6("animes", hashMap, new HashSet(0), new HashSet(0));
            k6 a = k6.a(m6Var2, "animes");
            if (!k6Var.equals(a)) {
                return new n.b(false, "animes(com.zunjae.myanimelist.models.AnimeR3).\n Expected:\n" + k6Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("name", new k6.a("name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("characterURL", new k6.a("characterURL", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("imageURL", new k6.a("imageURL", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("animeId", new k6.a("animeId", "INTEGER", true, 0, (String) null, 1));
            Object obj9 = "my_order";
            k6 k6Var2 = new k6("characters", hashMap2, new HashSet(0), new HashSet(0));
            k6 a2 = k6.a(m6Var2, "characters");
            if (!k6Var2.equals(a2)) {
                return new n.b(false, "characters(com.zunjae.anyme.features.anime.character.CharacterR2).\n Expected:\n" + k6Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(24);
            hashMap3.put("malId", new k6.a("malId", "INTEGER", false, 1, (String) null, 1));
            hashMap3.put("title", new k6.a("title", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("title_english", new k6.a("title_english", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("image_url", new k6.a("image_url", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("type", new k6.a("type", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("source", new k6.a("source", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("episodes", new k6.a("episodes", "INTEGER", false, 0, (String) null, 1));
            hashMap3.put("status", new k6.a("status", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("duration", new k6.a("duration", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("rating", new k6.a("rating", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("popularity", new k6.a("popularity", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("score", new k6.a("score", "REAL", false, 0, (String) null, 1));
            hashMap3.put("rank", new k6.a("rank", "INTEGER", false, 0, (String) null, 1));
            hashMap3.put("trailer_url", new k6.a("trailer_url", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("synopsis", new k6.a("synopsis", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("broadcast", new k6.a("broadcast", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("studio", new k6.a("studio", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("genre", new k6.a("genre", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("opening_theme", new k6.a("opening_theme", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("ending_theme", new k6.a("ending_theme", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("expirationDate", new k6.a("expirationDate", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("jikanRelated", new k6.a("jikanRelated", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("synonyms", new k6.a("synonyms", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("airedInfo", new k6.a("airedInfo", "TEXT", false, 0, (String) null, 1));
            Object obj10 = "my_status";
            Object obj11 = "my_score";
            k6 k6Var3 = new k6("AnimeJikanInfoR2", hashMap3, new HashSet(0), new HashSet(0));
            k6 a3 = k6.a(m6Var2, "AnimeJikanInfoR2");
            if (!k6Var3.equals(a3)) {
                return new n.b(false, "AnimeJikanInfoR2(com.zunjae.jikanrest.models.AnimeJikanInfoR2).\n Expected:\n" + k6Var3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(6);
            hashMap4.put("animeId", new k6.a("animeId", "INTEGER", true, 1, (String) null, 1));
            hashMap4.put("parentAnimeId", new k6.a("parentAnimeId", "INTEGER", true, 2, (String) null, 1));
            hashMap4.put("title", new k6.a("title", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("image", new k6.a("image", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("priority", new k6.a("priority", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("expirationDate", new k6.a("expirationDate", "INTEGER", true, 0, (String) null, 1));
            k6 k6Var4 = new k6("animerecommendations", hashMap4, new HashSet(0), new HashSet(0));
            k6 a4 = k6.a(m6Var2, "animerecommendations");
            if (!k6Var4.equals(a4)) {
                return new n.b(false, "animerecommendations(com.zunjae.kanon.recommendations.AnimeRecommendationR2).\n Expected:\n" + k6Var4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("day", new k6.a("day", "TEXT", false, 0, (String) null, 1));
            hashMap5.put("anime_id", new k6.a("anime_id", "INTEGER", true, 1, (String) null, 1));
            k6 k6Var5 = new k6("releasedays", hashMap5, new HashSet(0), new HashSet(0));
            k6 a5 = k6.a(m6Var2, "releasedays");
            if (!k6Var5.equals(a5)) {
                return new n.b(false, "releasedays(com.zunjae.myanimelist.calendar.ReleaseDay).\n Expected:\n" + k6Var5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(3);
            hashMap6.put("series_animedb_id", new k6.a("series_animedb_id", "INTEGER", true, 1, (String) null, 1));
            hashMap6.put("series_title", new k6.a("series_title", "TEXT", false, 0, (String) null, 1));
            hashMap6.put("series_image", new k6.a("series_image", "TEXT", false, 0, (String) null, 1));
            k6 k6Var6 = new k6("MinimalAnimeInfo", hashMap6, new HashSet(0), new HashSet(0));
            k6 a6 = k6.a(m6Var2, "MinimalAnimeInfo");
            if (!k6Var6.equals(a6)) {
                return new n.b(false, "MinimalAnimeInfo(com.zunjae.myanimelist.models.MinimalAnimeInfo).\n Expected:\n" + k6Var6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(10);
            hashMap7.put("malId", new k6.a("malId", "INTEGER", true, 1, (String) null, 1));
            hashMap7.put("kitsuId", new k6.a("kitsuId", "INTEGER", true, 0, (String) null, 1));
            hashMap7.put("startDate2", new k6.a("startDate2", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("endDate2", new k6.a("endDate2", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("posterId", new k6.a("posterId", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("coverId", new k6.a("coverId", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("type", new k6.a("type", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("titleEnJp", new k6.a("titleEnJp", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("titleEn", new k6.a("titleEn", "TEXT", false, 0, (String) null, 1));
            hashMap7.put("titleJaJp", new k6.a("titleJaJp", "TEXT", false, 0, (String) null, 1));
            k6 k6Var7 = new k6("minimal_kitsu_info", hashMap7, new HashSet(0), new HashSet(0));
            k6 a7 = k6.a(m6Var2, "minimal_kitsu_info");
            if (!k6Var7.equals(a7)) {
                return new n.b(false, "minimal_kitsu_info(com.zunjae.myanimelist.models.MinimalKitsuInfo).\n Expected:\n" + k6Var7 + "\n Found:\n" + a7);
            }
            HashMap hashMap8 = new HashMap(7);
            hashMap8.put("malid", new k6.a("malid", "INTEGER", false, 1, (String) null, 1));
            hashMap8.put("time", new k6.a("time", "INTEGER", true, 0, (String) null, 1));
            hashMap8.put("series_cover", new k6.a("series_cover", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("tags", new k6.a("tags", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("title", new k6.a("title", "TEXT", false, 0, (String) null, 1));
            hashMap8.put("episode", new k6.a("episode", "INTEGER", true, 0, (String) null, 1));
            hashMap8.put("dayOfWeek", new k6.a("dayOfWeek", "INTEGER", true, 0, (String) null, 1));
            k6 k6Var8 = new k6("CalendarEntry", hashMap8, new HashSet(0), new HashSet(0));
            k6 a8 = k6.a(m6Var2, "CalendarEntry");
            if (!k6Var8.equals(a8)) {
                return new n.b(false, "CalendarEntry(com.zunjae.anyme.features.calendar.CalendarEntry).\n Expected:\n" + k6Var8 + "\n Found:\n" + a8);
            }
            HashMap hashMap9 = new HashMap(7);
            hashMap9.put("parent_anime_id", new k6.a("parent_anime_id", "INTEGER", true, 1, (String) null, 1));
            hashMap9.put("series_id", new k6.a("series_id", "INTEGER", true, 2, (String) null, 1));
            hashMap9.put("title", new k6.a("title", "TEXT", false, 0, (String) null, 1));
            hashMap9.put("type", new k6.a("type", "TEXT", false, 0, (String) null, 1));
            hashMap9.put("episodes", new k6.a("episodes", "INTEGER", false, 0, (String) null, 1));
            hashMap9.put("picture", new k6.a("picture", "TEXT", false, 0, (String) null, 1));
            hashMap9.put("expiration_date", new k6.a("expiration_date", "INTEGER", true, 0, (String) null, 1));
            k6 k6Var9 = new k6("related_animes", hashMap9, new HashSet(0), new HashSet(0));
            k6 a9 = k6.a(m6Var2, "related_animes");
            if (!k6Var9.equals(a9)) {
                return new n.b(false, "related_animes(com.zunjae.myanimelist.models.RelatedAnimeR2).\n Expected:\n" + k6Var9 + "\n Found:\n" + a9);
            }
            HashMap hashMap10 = new HashMap(27);
            hashMap10.put("fileDownloadId", new k6.a("fileDownloadId", "INTEGER", true, 0, (String) null, 1));
            hashMap10.put("malid", new k6.a("malid", "INTEGER", true, 1, (String) null, 1));
            hashMap10.put("seriesTitle", new k6.a("seriesTitle", "TEXT", true, 0, (String) null, 1));
            hashMap10.put("episodeNumber", new k6.a("episodeNumber", "INTEGER", true, 2, (String) null, 1));
            hashMap10.put("series_animedb_id", new k6.a("series_animedb_id", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put("series_title", new k6.a("series_title", "TEXT", false, 0, (String) null, 1));
            hashMap10.put("series_type", new k6.a("series_type", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put("series_episodes", new k6.a("series_episodes", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put("series_status", new k6.a("series_status", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put("series_image", new k6.a("series_image", "TEXT", false, 0, (String) null, 1));
            hashMap10.put("my_watched_episodes", new k6.a("my_watched_episodes", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put(obj11, new k6.a("my_score", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put(obj10, new k6.a("my_status", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put(obj9, new k6.a("my_order", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put(obj8, new k6.a("kitsu_malId", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put(obj7, new k6.a("kitsu_kitsuId", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put(obj, new k6.a("kitsu_startDate2", "TEXT", false, 0, (String) null, 1));
            hashMap10.put(obj2, new k6.a("kitsu_endDate2", "TEXT", false, 0, (String) null, 1));
            hashMap10.put(obj3, new k6.a("kitsu_posterId", "TEXT", false, 0, (String) null, 1));
            hashMap10.put(obj4, new k6.a("kitsu_coverId", "TEXT", false, 0, (String) null, 1));
            hashMap10.put(obj5, new k6.a("kitsu_type", "TEXT", false, 0, (String) null, 1));
            hashMap10.put(obj6, new k6.a("kitsu_titleEnJp", "TEXT", false, 0, (String) null, 1));
            hashMap10.put("kitsu_titleEn", new k6.a("kitsu_titleEn", "TEXT", false, 0, (String) null, 1));
            hashMap10.put("kitsu_titleJaJp", new k6.a("kitsu_titleJaJp", "TEXT", false, 0, (String) null, 1));
            hashMap10.put("livechart_malid", new k6.a("livechart_malid", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put("livechart_time", new k6.a("livechart_time", "INTEGER", false, 0, (String) null, 1));
            hashMap10.put("livechart_episode", new k6.a("livechart_episode", "INTEGER", false, 0, (String) null, 1));
            k6 k6Var10 = new k6("AnimeDownloadEntry", hashMap10, new HashSet(0), new HashSet(0));
            k6 a10 = k6.a(m6Var2, "AnimeDownloadEntry");
            if (!k6Var10.equals(a10)) {
                return new n.b(false, "AnimeDownloadEntry(com.zunjae.downloader.AnimeDownloadEntry).\n Expected:\n" + k6Var10 + "\n Found:\n" + a10);
            }
            HashMap hashMap11 = new HashMap(1);
            hashMap11.put("nsfw_animeid", new k6.a("nsfw_animeid", "INTEGER", true, 1, (String) null, 1));
            k6 k6Var11 = new k6("nsfwshows", hashMap11, new HashSet(0), new HashSet(0));
            k6 a11 = k6.a(m6Var2, "nsfwshows");
            if (!k6Var11.equals(a11)) {
                return new n.b(false, "nsfwshows(com.zunjae.myanimelist.models.NSFWShows).\n Expected:\n" + k6Var11 + "\n Found:\n" + a11);
            }
            HashMap hashMap12 = new HashMap(5);
            hashMap12.put("waifu_id", new k6.a("waifu_id", "INTEGER", true, 1, (String) null, 1));
            hashMap12.put("parent_anime_id", new k6.a("parent_anime_id", "INTEGER", true, 0, (String) null, 1));
            hashMap12.put("waifu_name", new k6.a("waifu_name", "TEXT", false, 0, (String) null, 1));
            hashMap12.put("waifu_image_url", new k6.a("waifu_image_url", "TEXT", false, 0, (String) null, 1));
            hashMap12.put("date_created", new k6.a("date_created", "INTEGER", true, 0, (String) null, 1));
            k6 k6Var12 = new k6("waifus", hashMap12, new HashSet(0), new HashSet(0));
            k6 a12 = k6.a(m6Var2, "waifus");
            if (k6Var12.equals(a12)) {
                return new n.b(true, (String) null);
            }
            return new n.b(false, "waifus(com.zunjae.anyme.features.waifus.KanonWaifu).\n Expected:\n" + k6Var12 + "\n Found:\n" + a12);
        }
    }

    public void d() {
        super.a();
        m6 b = super.l().b();
        try {
            super.c();
            b.execSQL("DELETE FROM `animes`");
            b.execSQL("DELETE FROM `characters`");
            b.execSQL("DELETE FROM `AnimeJikanInfoR2`");
            b.execSQL("DELETE FROM `animerecommendations`");
            b.execSQL("DELETE FROM `releasedays`");
            b.execSQL("DELETE FROM `MinimalAnimeInfo`");
            b.execSQL("DELETE FROM `minimal_kitsu_info`");
            b.execSQL("DELETE FROM `CalendarEntry`");
            b.execSQL("DELETE FROM `related_animes`");
            b.execSQL("DELETE FROM `AnimeDownloadEntry`");
            b.execSQL("DELETE FROM `nsfwshows`");
            b.execSQL("DELETE FROM `waifus`");
            super.v();
        } finally {
            super.h();
            b.R("PRAGMA wal_checkpoint(FULL)").close();
            if (!b.inTransaction()) {
                b.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public i f() {
        return new i(this, new HashMap(0), new HashMap(0), "animes", "characters", "AnimeJikanInfoR2", "animerecommendations", "releasedays", "MinimalAnimeInfo", "minimal_kitsu_info", "CalendarEntry", "related_animes", "AnimeDownloadEntry", "nsfwshows", "waifus");
    }

    /* access modifiers changed from: protected */
    public n6 g(c cVar) {
        n nVar = new n(cVar, new a(82), "a198120aa89e45f0972b3033dfef9f6f", "6a5d5163caf541f33f295bf298dffc5b");
        n6.b.a a2 = n6.b.a(cVar.b);
        a2.c(cVar.c);
        a2.b(nVar);
        return cVar.a.a(a2.a());
    }

    public a w() {
        a aVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new b(this);
            }
            aVar = this.m;
        }
        return aVar;
    }

    public c x() {
        c cVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new d(this);
            }
            cVar = this.n;
        }
        return cVar;
    }

    public e z() {
        e eVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new f(this);
            }
            eVar = this.o;
        }
        return eVar;
    }
}
