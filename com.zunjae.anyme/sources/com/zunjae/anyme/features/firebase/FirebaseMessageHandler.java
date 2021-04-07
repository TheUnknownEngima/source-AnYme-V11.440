package com.zunjae.anyme.features.firebase;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.r;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.HomeActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList;
import com.zunjae.anyme.features.kanon.generic_anime_list.c;
import defpackage.a12;

public final class FirebaseMessageHandler extends FirebaseMessagingService {
    public static final a k = new a((r62) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            if (r3.equals("Discover") != false) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
            if (r3.equals("Calendar") != false) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return com.zunjae.anyme.HomeActivity.L.a(r4, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
            if (r3.equals("Bookmark") != false) goto L_0x006d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.content.Intent a(android.content.Intent r3, android.content.Context r4) {
            /*
                r2 = this;
                java.lang.String r0 = "Destination"
                java.lang.String r3 = r3.getStringExtra(r0)
                if (r3 != 0) goto L_0x000a
                goto L_0x0084
            L_0x000a:
                int r0 = r3.hashCode()
                switch(r0) {
                    case -190113873: goto L_0x0074;
                    case -113680546: goto L_0x0065;
                    case 337828873: goto L_0x005c;
                    case 373921003: goto L_0x004c;
                    case 658180477: goto L_0x003c;
                    case 955496102: goto L_0x002c;
                    case 1474981818: goto L_0x001c;
                    case 2070022486: goto L_0x0013;
                    default: goto L_0x0011;
                }
            L_0x0011:
                goto L_0x0084
            L_0x0013:
                java.lang.String r0 = "Bookmark"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0084
                goto L_0x006d
            L_0x001c:
                java.lang.String r0 = "Recommendations"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0084
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.zunjae.anyme.features.recommendations.UserRecsActivity> r0 = com.zunjae.anyme.features.recommendations.UserRecsActivity.class
                r3.<init>(r4, r0)
                goto L_0x008b
            L_0x002c:
                java.lang.String r0 = "SeasonalAnime"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0084
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.zunjae.anyme.features.discover.seasonal.SeasonalAnimeActivity> r0 = com.zunjae.anyme.features.discover.seasonal.SeasonalAnimeActivity.class
                r3.<init>(r4, r0)
                goto L_0x008b
            L_0x003c:
                java.lang.String r0 = "BulkDelete"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0084
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.zunjae.anyme.features.niche.bulk_delete.BulkDeleteActivity> r0 = com.zunjae.anyme.features.niche.bulk_delete.BulkDeleteActivity.class
                r3.<init>(r4, r0)
                goto L_0x008b
            L_0x004c:
                java.lang.String r0 = "GenreSearch"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0084
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.zunjae.anyme.features.discover.advanced_search_v3.AdvancedSearchV3Activity> r0 = com.zunjae.anyme.features.discover.advanced_search_v3.AdvancedSearchV3Activity.class
                r3.<init>(r4, r0)
                goto L_0x008b
            L_0x005c:
                java.lang.String r0 = "Discover"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0084
                goto L_0x006d
            L_0x0065:
                java.lang.String r0 = "Calendar"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0084
            L_0x006d:
                com.zunjae.anyme.HomeActivity$c r0 = com.zunjae.anyme.HomeActivity.L
                android.content.Intent r3 = r0.a(r4, r3)
                goto L_0x008b
            L_0x0074:
                java.lang.String r0 = "Support"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0084
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.zunjae.anyme.features.niche.donate.SupportActivity> r0 = com.zunjae.anyme.features.niche.donate.SupportActivity.class
                r3.<init>(r4, r0)
                goto L_0x008b
            L_0x0084:
                r3 = 0
                r0 = 2
                r1 = 0
                android.content.Intent r3 = g(r2, r4, r3, r0, r1)
            L_0x008b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.firebase.FirebaseMessageHandler.a.a(android.content.Intent, android.content.Context):android.content.Intent");
        }

        private final Intent b(Intent intent, Context context) {
            String str;
            String str2;
            if (intent == null || (str = intent.getStringExtra("AnimeId")) == null) {
                str = "-1";
            }
            v62.d(str, "dataIntent?.getStringExtra(\"AnimeId\") ?: \"-1\"");
            if (intent == null || (str2 = intent.getStringExtra("SeriesTitle")) == null) {
                str2 = "Anime";
            }
            v62.d(str2, "dataIntent?.getStringExt…\"SeriesTitle\") ?: \"Anime\"");
            Integer g = e92.g(str);
            int intValue = g != null ? g.intValue() : 0;
            if (intValue <= 0) {
                return f(context, true);
            }
            return AnimeInfoActivity.M.b(context, new xy1((long) intValue, str2, ""));
        }

        private final Intent d(Intent intent, Context context) {
            try {
                c.a aVar = com.zunjae.anyme.features.kanon.generic_anime_list.c.Companion;
                String stringExtra = intent.getStringExtra("ListType");
                com.zunjae.anyme.features.kanon.generic_anime_list.c a = aVar.a(stringExtra != null ? Integer.parseInt(stringExtra) : -1);
                String stringExtra2 = intent.getStringExtra("Identifier");
                int parseInt = stringExtra2 != null ? Integer.parseInt(stringExtra2) : 0;
                String stringExtra3 = intent.getStringExtra("Title");
                if (stringExtra3 == null) {
                    stringExtra3 = "AnYme";
                }
                String str = stringExtra3;
                v62.d(str, "dataIntent.getStringExtra(\"Title\") ?: \"AnYme\"");
                return parseInt == -1337 ? f(context, true) : GenericItemList.M.a(context, a, parseInt, intent.getStringExtra("Query"), str);
            } catch (Exception e) {
                uj2.d(e);
                return f(context, true);
            }
        }

        private final Intent e(Intent intent, Context context) {
            try {
                String stringExtra = intent.getStringExtra("Endpoint");
                if (stringExtra == null) {
                    return g(this, context, false, 2, (Object) null);
                }
                v62.d(stringExtra, "endpoint");
                if (!f92.s(stringExtra, "https://", false, 2, (Object) null)) {
                    return FirebaseMessageHandler.k.f(context, true);
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                intent2.setFlags(268435456);
                return intent2;
            } catch (Exception unused) {
                return f(context, true);
            }
        }

        private final Intent f(Context context, boolean z) {
            Intent intent = new Intent(context, HomeActivity.class);
            if (z) {
                intent.putExtra("apology", true);
            }
            return intent;
        }

        static /* synthetic */ Intent g(a aVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.f(context, z);
        }

        public final Intent c(Intent intent, Context context) {
            v62.e(context, "applicationContext");
            String stringExtra = intent != null ? intent.getStringExtra("StartupAction") : null;
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -1591322833:
                        if (stringExtra.equals("Activity")) {
                            return a(intent, context);
                        }
                        break;
                    case -1170071774:
                        if (stringExtra.equals("AnimeInfo")) {
                            return b(intent, context);
                        }
                        break;
                    case 2368538:
                        if (stringExtra.equals("Link")) {
                            return e(intent, context);
                        }
                        break;
                    case 1256728277:
                        if (stringExtra.equals("KanonList")) {
                            return d(intent, context);
                        }
                        break;
                }
            }
            return g(this, context, false, 2, (Object) null);
        }
    }

    static final class b extends w62 implements z52<c12, u22> {
        final /* synthetic */ FirebaseMessageHandler f;
        final /* synthetic */ Intent g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FirebaseMessageHandler firebaseMessageHandler, Intent intent) {
            super(1);
            this.f = firebaseMessageHandler;
            this.g = intent;
        }

        public final void a(c12 c12) {
            v62.e(c12, "$receiver");
            c12.i(PendingIntent.getActivity(this.f, (int) (System.currentTimeMillis() / ((long) 1000)), this.g, 0));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((c12) obj);
            return u22.a;
        }
    }

    static final class c extends w62 implements z52<a12.c, u22> {
        final /* synthetic */ String f;
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(1);
            this.f = str;
            this.g = str2;
        }

        public final void a(a12.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.d(this.f);
            cVar.c(this.g);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((a12.c) obj);
            return u22.a;
        }
    }

    static final class d extends w62 implements z52<a12.a, u22> {
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ FirebaseMessageHandler h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, FirebaseMessageHandler firebaseMessageHandler) {
            super(1);
            this.f = str;
            this.g = str2;
            this.h = firebaseMessageHandler;
        }

        public final void a(a12.a aVar) {
            v62.e(aVar, "$receiver");
            aVar.h(this.f);
            aVar.g("Hi there~");
            aVar.e(this.g);
            aVar.f(BitmapFactory.decodeResource(this.h.getResources(), C0274R$drawable.rsz_appicon));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((a12.a) obj);
            return u22.a;
        }
    }

    static final class e extends w62 implements z52<a12.b, u22> {
        final /* synthetic */ String f;
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, String str2) {
            super(1);
            this.f = str;
            this.g = str2;
        }

        public final void a(a12.b bVar) {
            v62.e(bVar, "$receiver");
            bVar.h(this.f);
            bVar.g("AnYme");
            bVar.e(this.g);
            bVar.f("AnYme");
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((a12.b) obj);
            return u22.a;
        }
    }

    private final void w(String str, String str2, Intent intent, e eVar) {
        io.karn.notify.b bVar;
        intent.setFlags(268435456);
        try {
            int i = d.a[eVar.ordinal()];
            if (i == 1) {
                bVar = io.karn.notify.a.c.b(this);
                bVar.d(new c(str, str2));
            } else if (i == 2) {
                bVar = io.karn.notify.a.c.b(this);
                bVar.a(new d(str, str2, this));
            } else if (i == 3) {
                bVar = io.karn.notify.a.c.b(this);
                bVar.b(new e(str, str2));
            } else {
                throw new j22();
            }
            bVar.e(new b(this, intent));
            io.karn.notify.b.g(bVar, (Integer) null, 1, (Object) null);
        } catch (Exception e2) {
            uj2.d(e2);
        }
    }

    public void r(r rVar) {
        v62.e(rVar, "remoteMessage");
        Intent j = rVar.j();
        r.b i = rVar.i();
        if (i != null) {
            v62.d(i, "remoteMessage.notification ?: return");
            a aVar = k;
            Context applicationContext = getApplicationContext();
            v62.d(applicationContext, "applicationContext");
            w(i.c(), i.a(), aVar.c(j, applicationContext), e.Companion.a(j.getStringExtra("NotificationType")));
        }
    }
}
