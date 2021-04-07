package defpackage;

/* renamed from: by1  reason: default package */
public enum by1 {
    Since("Kanon User Since", false),
    Waifus("Waifus Added", true),
    Notes("Notes Written", true),
    Bookmarks("Bookmarks Created", true),
    Episodes("Episodes Watched", true),
    DaysWasted("Days Wasted", false);
    
    private final boolean isClickable;
    private final String title;

    private by1(String str, boolean z) {
        this.title = str;
        this.isClickable = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isClickable() {
        return this.isClickable;
    }
}
