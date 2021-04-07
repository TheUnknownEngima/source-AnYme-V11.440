package com.zunjae.anyme.features.kanon.generic_anime_list;

import java.util.NoSuchElementException;

public enum c {
    Genre(1, true, false, false, 12, (boolean) null),
    Producer(2, true, false, false, 12, (boolean) null),
    ContinueWatching(3, false, false, false, 12, (boolean) null),
    KitsuCategory(4, true, false, false, 12, (boolean) null),
    AllUserNotes(5, false, false, false, 4, (boolean) null),
    PopularityInApp(6, false, false, false, 12, (boolean) null),
    ShowByScore(7, false, false, false, 12, (boolean) null),
    AdvancedSearchV3(8, false, false, false, 12, (boolean) null),
    UserProfile(9, false, false, false, 8, (boolean) null);
    
    public static final a Companion = null;
    private final int id;
    private final boolean injectMyStats;
    private final boolean showGlobalScore;
    private final boolean supportsPagination;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final c a(int i) {
            for (c cVar : c.values()) {
                if (cVar.getId() == i) {
                    return cVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private c(int i, boolean z, boolean z2, boolean z3) {
        this.id = i;
        this.supportsPagination = z;
        this.injectMyStats = z2;
        this.showGlobalScore = z3;
    }

    public final String descriptionToDisplay(vy1 vy1) {
        v62.e(vy1, "entry");
        if (d.a[ordinal()] != 1) {
            return vy1.toString();
        }
        String b = vy1.b();
        Integer g = b != null ? e92.g(b) : null;
        if (g == null || g.intValue() == 0) {
            return "No notes";
        }
        if (g.intValue() == 1) {
            return "1 note";
        }
        return g + " notes";
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getInjectMyStats() {
        return this.injectMyStats;
    }

    public final boolean getShowGlobalScore() {
        return this.showGlobalScore;
    }

    public final boolean getSupportsPagination() {
        return this.supportsPagination;
    }
}
