package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.yx;

/* renamed from: hv  reason: default package */
final class hv {
    static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static f0 a(int i, f0 f0Var, yx yxVar, yx yxVar2, pt ptVar) {
        if (i == 1) {
            if (ptVar.a()) {
                f0Var = f0Var.g(ptVar.a, ptVar.b);
            }
            return yxVar != null ? f0Var.k(yxVar) : f0Var;
        } else if (i != 2 || yxVar2 == null) {
            return f0Var;
        } else {
            for (int i2 = 0; i2 < yxVar2.d(); i2++) {
                yx.b c = yxVar2.c(i2);
                if (c instanceof gv) {
                    gv gvVar = (gv) c;
                    if ("com.android.capture.fps".equals(gvVar.e)) {
                        f0Var = f0Var.k(new yx(gvVar));
                    }
                }
            }
            return f0Var;
        }
    }

    private static sy b(int i, i50 i50) {
        int k = i50.k();
        if (i50.k() == 1684108385) {
            i50.N(8);
            String u = i50.u(k - 16);
            return new sy("und", u, u);
        }
        String valueOf = String.valueOf(bv.a(i));
        b50.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    private static oy c(i50 i50) {
        String str;
        int k = i50.k();
        if (i50.k() == 1684108385) {
            int b = bv.b(i50.k());
            String str2 = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str2 == null) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Unrecognized cover art flags: ");
                sb.append(b);
                str = sb.toString();
            } else {
                i50.N(4);
                int i = k - 16;
                byte[] bArr = new byte[i];
                i50.h(bArr, 0, i);
                return new oy(str2, (String) null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        b50.h("MetadataUtil", str);
        return null;
    }

    public static yx.b d(i50 i50) {
        int c = i50.c() + i50.k();
        int k = i50.k();
        int i = (k >> 24) & 255;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & k;
            if (i2 == 6516084) {
                sy b = b(k, i50);
                i50.M(c);
                return b;
            } else if (i2 == 7233901 || i2 == 7631467) {
                zy i3 = i(k, "TIT2", i50);
                i50.M(c);
                return i3;
            } else if (i2 == 6516589 || i2 == 7828084) {
                zy i4 = i(k, "TCOM", i50);
                i50.M(c);
                return i4;
            } else if (i2 == 6578553) {
                zy i5 = i(k, "TDRC", i50);
                i50.M(c);
                return i5;
            } else if (i2 == 4280916) {
                zy i6 = i(k, "TPE1", i50);
                i50.M(c);
                return i6;
            } else if (i2 == 7630703) {
                zy i7 = i(k, "TSSE", i50);
                i50.M(c);
                return i7;
            } else if (i2 == 6384738) {
                zy i8 = i(k, "TALB", i50);
                i50.M(c);
                return i8;
            } else if (i2 == 7108978) {
                zy i9 = i(k, "USLT", i50);
                i50.M(c);
                return i9;
            } else if (i2 == 6776174) {
                zy i10 = i(k, "TCON", i50);
                i50.M(c);
                return i10;
            } else if (i2 == 6779504) {
                zy i11 = i(k, "TIT1", i50);
                i50.M(c);
                return i11;
            }
        } else if (k == 1735291493) {
            try {
                return h(i50);
            } finally {
                i50.M(c);
            }
        } else if (k == 1684632427) {
            zy e = e(k, "TPOS", i50);
            i50.M(c);
            return e;
        } else if (k == 1953655662) {
            zy e2 = e(k, "TRCK", i50);
            i50.M(c);
            return e2;
        } else if (k == 1953329263) {
            vy j = j(k, "TBPM", i50, true, false);
            i50.M(c);
            return j;
        } else if (k == 1668311404) {
            vy j2 = j(k, "TCMP", i50, true, true);
            i50.M(c);
            return j2;
        } else if (k == 1668249202) {
            oy c2 = c(i50);
            i50.M(c);
            return c2;
        } else if (k == 1631670868) {
            zy i12 = i(k, "TPE2", i50);
            i50.M(c);
            return i12;
        } else if (k == 1936682605) {
            zy i13 = i(k, "TSOT", i50);
            i50.M(c);
            return i13;
        } else if (k == 1936679276) {
            zy i14 = i(k, "TSO2", i50);
            i50.M(c);
            return i14;
        } else if (k == 1936679282) {
            zy i15 = i(k, "TSOA", i50);
            i50.M(c);
            return i15;
        } else if (k == 1936679265) {
            zy i16 = i(k, "TSOP", i50);
            i50.M(c);
            return i16;
        } else if (k == 1936679791) {
            zy i17 = i(k, "TSOC", i50);
            i50.M(c);
            return i17;
        } else if (k == 1920233063) {
            vy j3 = j(k, "ITUNESADVISORY", i50, false, false);
            i50.M(c);
            return j3;
        } else if (k == 1885823344) {
            vy j4 = j(k, "ITUNESGAPLESS", i50, false, true);
            i50.M(c);
            return j4;
        } else if (k == 1936683886) {
            zy i18 = i(k, "TVSHOWSORT", i50);
            i50.M(c);
            return i18;
        } else if (k == 1953919848) {
            zy i19 = i(k, "TVSHOW", i50);
            i50.M(c);
            return i19;
        } else if (k == 757935405) {
            vy f = f(i50, c);
            i50.M(c);
            return f;
        }
        String valueOf = String.valueOf(bv.a(k));
        b50.b("MetadataUtil", valueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf) : new String("Skipped unknown metadata entry: "));
        i50.M(c);
        return null;
    }

    private static zy e(int i, String str, i50 i50) {
        int k = i50.k();
        if (i50.k() == 1684108385 && k >= 22) {
            i50.N(10);
            int F = i50.F();
            if (F > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(F);
                String sb2 = sb.toString();
                int F2 = i50.F();
                if (F2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(F2);
                    sb2 = sb3.toString();
                }
                return new zy(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(bv.a(i));
        b50.h("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static vy f(i50 i50, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (i50.c() < i) {
            int c = i50.c();
            int k = i50.k();
            int k2 = i50.k();
            i50.N(4);
            if (k2 == 1835360622) {
                str = i50.u(k - 12);
            } else if (k2 == 1851878757) {
                str2 = i50.u(k - 12);
            } else {
                if (k2 == 1684108385) {
                    i2 = c;
                    i3 = k;
                }
                i50.N(k - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        i50.M(i2);
        i50.N(16);
        return new wy(str, str2, i50.u(i3 - 16));
    }

    public static gv g(i50 i50, int i, String str) {
        while (true) {
            int c = i50.c();
            if (c >= i) {
                return null;
            }
            int k = i50.k();
            if (i50.k() == 1684108385) {
                int k2 = i50.k();
                int k3 = i50.k();
                int i2 = k - 16;
                byte[] bArr = new byte[i2];
                i50.h(bArr, 0, i2);
                return new gv(str, bArr, k3, k2);
            }
            i50.M(c + k);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.zy h(defpackage.i50 r3) {
        /*
            int r3 = k(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            zy r1 = new zy
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            defpackage.b50.h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv.h(i50):zy");
    }

    private static zy i(int i, String str, i50 i50) {
        int k = i50.k();
        if (i50.k() == 1684108385) {
            i50.N(8);
            return new zy(str, (String) null, i50.u(k - 16));
        }
        String valueOf = String.valueOf(bv.a(i));
        b50.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static vy j(int i, String str, i50 i50, boolean z, boolean z2) {
        int k = k(i50);
        if (z2) {
            k = Math.min(1, k);
        }
        if (k >= 0) {
            return z ? new zy(str, (String) null, Integer.toString(k)) : new sy("und", str, Integer.toString(k));
        }
        String valueOf = String.valueOf(bv.a(i));
        b50.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int k(i50 i50) {
        i50.N(4);
        if (i50.k() == 1684108385) {
            i50.N(8);
            return i50.z();
        }
        b50.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
