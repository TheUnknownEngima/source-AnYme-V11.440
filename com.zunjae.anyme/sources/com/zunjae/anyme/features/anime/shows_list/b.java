package com.zunjae.anyme.features.anime.shows_list;

public enum b {
    Watching(0, "Watching", 1),
    PTW(1, "Plan To Watch", 2),
    OnHold(2, "On Hold", 3),
    Completed(3, "Completed", 4),
    Dropped(4, "Dropped", 5),
    All(5, "All", 0);
    
    public static final a Companion = null;
    private final int tabContentType;
    private final int tabPosition;
    private final String title;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Integer a(int i) {
            b bVar;
            b[] values = b.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i2];
                if (bVar.getTabPosition() == i) {
                    break;
                }
                i2++;
            }
            if (bVar != null) {
                return Integer.valueOf(bVar.getTabContentType());
            }
            return null;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private b(int i, String str, int i2) {
        this.tabPosition = i;
        this.title = str;
        this.tabContentType = i2;
    }

    public final int getTabContentType() {
        return this.tabContentType;
    }

    public final int getTabPosition() {
        return this.tabPosition;
    }

    public final String getTitle() {
        return this.title;
    }
}
