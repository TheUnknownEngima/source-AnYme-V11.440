package com.zunjae.anyme.features.firebase;

enum e {
    BigPicture("3"),
    BigText("2"),
    Normal("1");
    
    public static final a Companion = null;
    private final String type;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final e a(String str) {
            e eVar;
            e[] values = e.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    eVar = null;
                    break;
                }
                eVar = values[i];
                if (v62.a(eVar.getType(), str)) {
                    break;
                }
                i++;
            }
            return eVar != null ? eVar : e.Normal;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private e(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
