package defpackage;

import com.zunjae.anyme.C0274R$drawable;

/* renamed from: ts1  reason: default package */
public enum ts1 {
    Home("Home", 0, C0274R$drawable.ic_home),
    Bookmarks("Bookmarks", 1, C0274R$drawable.outline_bookmarks_white_48dp),
    Discover("Discover", 2, C0274R$drawable.baseline_explore_white_48dp),
    Calendar("Calendar", 3, C0274R$drawable.outline_calendar_today_white_48dp),
    Kanon("Stats", 4, C0274R$drawable.baseline_insert_chart_white_48dp);
    
    public static final a Companion = null;
    private final int icon;
    private final int position;
    private final String title;

    /* renamed from: ts1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final ts1 a(int i) {
            for (ts1 ts1 : ts1.values()) {
                if (ts1.getPosition() == i) {
                    return ts1;
                }
            }
            return null;
        }

        public final ts1 b(String str) {
            v62.e(str, "title");
            for (ts1 ts1 : ts1.values()) {
                if (v62.a(ts1.getTitle(), str)) {
                    return ts1;
                }
            }
            return null;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private ts1(String str, int i, int i2) {
        this.title = str;
        this.position = i;
        this.icon = i2;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }
}
