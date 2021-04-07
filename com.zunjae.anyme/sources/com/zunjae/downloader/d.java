package com.zunjae.downloader;

public enum d {
    AnYme("0"),
    ADM("1");
    
    public static final a Companion = null;
    private final String code;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final d a(String str) {
            d dVar;
            v62.e(str, "code");
            d[] values = d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i];
                if (v62.a(dVar.getCode(), str)) {
                    break;
                }
                i++;
            }
            return dVar != null ? dVar : d.AnYme;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private d(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
