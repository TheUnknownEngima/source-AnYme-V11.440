package defpackage;

/* renamed from: gz1  reason: default package */
public enum gz1 {
    Names("Names ASC", 0),
    NamesDesc("Names DESC", 1),
    Score("Score ASC", 2),
    ScoreDesc("Score DESC", 3),
    Episodes("Episodes ASC", 4),
    EpisodesDesc("Episodes DESC", 5),
    LastUpdated("Last Updated ASC", 6),
    LastUpdatedDesc("Last Updated DESC", 7),
    Progression("Progress ASC", 8),
    ProgressionDesc("Progress DESC", 9),
    NextRelease("Next Release ASC", 10),
    NextReleaseDesc("Next Release DESC", 11),
    StartDate("Start Date ASC", 12),
    StartDateDesc("Start Date DESC", 13);
    
    public static final a Companion = null;
    private final int code;
    private final String title;

    /* renamed from: gz1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final gz1 a(int i) {
            for (gz1 gz1 : gz1.values()) {
                if (gz1.getCode() == i) {
                    return gz1;
                }
            }
            return null;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private gz1(String str, int i) {
        this.title = str;
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title;
    }
}
