package defpackage;

/* renamed from: i11  reason: default package */
final class i11 {
    static String a(lx0 lx0) {
        String str;
        l11 l11 = new l11(lx0);
        StringBuilder sb = new StringBuilder(l11.zza());
        for (int i = 0; i < l11.zza(); i++) {
            int f = l11.f(i);
            if (f == 34) {
                str = "\\\"";
            } else if (f == 39) {
                str = "\\'";
            } else if (f != 92) {
                switch (f) {
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
                        if (f < 32 || f > 126) {
                            sb.append('\\');
                            sb.append((char) (((f >>> 6) & 3) + 48));
                            sb.append((char) (((f >>> 3) & 7) + 48));
                            f = (f & 7) + 48;
                        }
                        sb.append((char) f);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
