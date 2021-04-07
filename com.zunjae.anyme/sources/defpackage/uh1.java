package defpackage;

/* renamed from: uh1  reason: default package */
public interface uh1 {

    /* renamed from: uh1$a */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        private a(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    a a(String str);
}
