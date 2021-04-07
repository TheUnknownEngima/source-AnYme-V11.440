package defpackage;

/* renamed from: zr1  reason: default package */
public enum zr1 {
    All("All", 100),
    MyShow("My Shows", 101),
    Monday("Monday", 102),
    Tuesday("Tuesday", 103),
    Wednesday("Wednesday", 104),
    Thursday("Thursday", 105),
    Friday("Friday", 106),
    Saturday("Saturday", 107),
    Sunday("Sunday", 108);
    
    private final int contentType;
    private final String title;

    private zr1(String str, int i) {
        this.title = str;
        this.contentType = i;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final String getTitle() {
        return this.title;
    }
}
