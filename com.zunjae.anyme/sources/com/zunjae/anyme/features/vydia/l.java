package com.zunjae.anyme.features.vydia;

public enum l {
    High("2"),
    Medium("1"),
    Low("0");
    
    public static final a Companion = null;
    private final String code;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final l a(String str) {
            l lVar;
            v62.e(str, "code");
            l[] values = l.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    lVar = null;
                    break;
                }
                lVar = values[i];
                if (v62.a(lVar.getCode(), str)) {
                    break;
                }
                i++;
            }
            return lVar != null ? lVar : l.Medium;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private l(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
