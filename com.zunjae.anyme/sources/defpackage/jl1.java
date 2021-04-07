package defpackage;

/* renamed from: jl1  reason: default package */
final class jl1 {

    /* renamed from: jl1$a */
    static class a implements b {
        final /* synthetic */ ej1 a;

        a(ej1 ej1) {
            this.a = ej1;
        }

        public byte a(int i) {
            return this.a.a(i);
        }

        public int size() {
            return this.a.size();
        }
    }

    /* renamed from: jl1$b */
    private interface b {
        byte a(int i);

        int size();
    }

    static String a(ej1 ej1) {
        return b(new a(ej1));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            int a2 = bVar.a(i);
            if (a2 == 34) {
                str = "\\\"";
            } else if (a2 == 39) {
                str = "\\'";
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            a2 = (a2 & 7) + 48;
                        }
                        sb.append((char) a2);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(ej1.i(str));
    }
}
