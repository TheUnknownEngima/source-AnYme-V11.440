package defpackage;

import com.google.android.exoplayer2.f0;

/* renamed from: by  reason: default package */
public interface by {
    public static final by a = new a();

    /* renamed from: by$a */
    class a implements by {
        a() {
        }

        public ay a(f0 f0Var) {
            String str = f0Var.m;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return new uy();
                }
                if (c == 1) {
                    return new gy();
                }
                if (c == 2) {
                    return new dz();
                }
                if (c == 3) {
                    return new ky();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }

        public boolean b(f0 f0Var) {
            String str = f0Var.m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
        }
    }

    ay a(f0 f0Var);

    boolean b(f0 f0Var);
}
