package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.v;
import defpackage.ns;
import defpackage.tt;
import defpackage.vt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: ou  reason: default package */
public class ou implements ht {
    private static final byte[] b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final byte[] c0 = v50.Z("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */
    public static final UUID e0 = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private long B;
    private c50 C;
    private c50 D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;
    private final nu a;
    private jt a0;
    private final qu b;
    private final SparseArray<c> c;
    private final boolean d;
    private final i50 e;
    private final i50 f;
    private final i50 g;
    private final i50 h;
    private final i50 i;
    private final i50 j;
    private final i50 k;
    private final i50 l;
    private final i50 m;
    private final i50 n;
    private ByteBuffer o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private c u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z;

    /* renamed from: ou$b */
    private final class b implements mu {
        private b() {
        }

        public void a(int i) {
            ou.this.k(i);
        }

        public int b(int i) {
            return ou.this.p(i);
        }

        public boolean c(int i) {
            return ou.this.t(i);
        }

        public void d(int i, int i2, it itVar) {
            ou.this.e(i, i2, itVar);
        }

        public void e(int i, String str) {
            ou.this.B(i, str);
        }

        public void f(int i, double d) {
            ou.this.n(i, d);
        }

        public void g(int i, long j, long j2) {
            ou.this.A(i, j, j2);
        }

        public void h(int i, long j) {
            ou.this.r(i, j);
        }
    }

    /* renamed from: ou$c */
    private static final class c {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public long P;
        public long Q;
        public d R;
        public boolean S;
        public boolean T;
        /* access modifiers changed from: private */
        public String U;
        public vt V;
        public int W;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public byte[] h;
        public vt.a i;
        public byte[] j;
        public ns k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public float r;
        public float s;
        public float t;
        public byte[] u;
        public int v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        private c() {
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = -1;
            this.r = Utils.FLOAT_EPSILON;
            this.s = Utils.FLOAT_EPSILON;
            this.t = Utils.FLOAT_EPSILON;
            this.u = null;
            this.v = -1;
            this.w = false;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 1;
            this.N = -1;
            this.O = 8000;
            this.P = 0;
            this.Q = 0;
            this.T = true;
            this.U = "eng";
        }

        private byte[] b() {
            if (this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.C * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.K + 0.5f)));
            order.putShort((short) ((int) (this.L + 0.5f)));
            order.putShort((short) this.A);
            order.putShort((short) this.B);
            return bArr;
        }

        private static Pair<String, List<byte[]>> e(i50 i50) {
            try {
                i50.N(16);
                long p2 = i50.p();
                if (p2 == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (p2 == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (p2 == 826496599) {
                    byte[] bArr = i50.a;
                    for (int c2 = i50.c() + 20; c2 < bArr.length - 4; c2++) {
                        if (bArr[c2] == 0 && bArr[c2 + 1] == 0 && bArr[c2 + 2] == 1 && bArr[c2 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, c2, bArr.length)));
                        }
                    }
                    throw new m0("Failed to find FourCC VC1 initialization data");
                }
                b50.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new m0("Error parsing FourCC private data");
            }
        }

        private static boolean f(i50 i50) {
            try {
                int r2 = i50.r();
                if (r2 == 1) {
                    return true;
                }
                if (r2 != 65534) {
                    return false;
                }
                i50.M(24);
                return i50.s() == ou.e0.getMostSignificantBits() && i50.s() == ou.e0.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new m0("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> g(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i2 = 1;
                    int i3 = 0;
                    while (bArr[i2] == -1) {
                        i3 += 255;
                        i2++;
                    }
                    int i4 = i2 + 1;
                    int i5 = i3 + bArr[i2];
                    int i6 = 0;
                    while (bArr[i4] == -1) {
                        i6 += 255;
                        i4++;
                    }
                    int i7 = i4 + 1;
                    int i8 = i6 + bArr[i4];
                    if (bArr[i7] == 1) {
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(bArr, i7, bArr2, 0, i5);
                        int i9 = i7 + i5;
                        if (bArr[i9] == 3) {
                            int i10 = i9 + i8;
                            if (bArr[i10] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i10)];
                                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new m0("Error parsing vorbis codec private");
                        }
                        throw new m0("Error parsing vorbis codec private");
                    }
                    throw new m0("Error parsing vorbis codec private");
                }
                throw new m0("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new m0("Error parsing vorbis codec private");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cf, code lost:
            r5.append("Unsupported PCM bit depth: ");
            r5.append(r1);
            r5.append(". Setting mimeType to ");
            r5.append(r4);
            r1 = r5.toString();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01df, code lost:
            defpackage.b50.h("MatroskaExtractor", r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e4, code lost:
            r26 = r1;
            r4 = "audio/raw";
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x024d, code lost:
            r4 = r16;
            r1 = null;
            r26 = -1;
            r31 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f9, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fa, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0316, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0318, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x031a, code lost:
            r26 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x031c, code lost:
            r31 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x031e, code lost:
            r2 = r0.T | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0323, code lost:
            if (r0.S == false) goto L_0x0327;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0325, code lost:
            r3 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0327, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0328, code lost:
            r2 = r2 | r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x032d, code lost:
            if (defpackage.e50.l(r4) == false) goto L_0x0356;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x032f, code lost:
            r1 = com.google.android.exoplayer2.f0.o(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r31, r0.M, r0.O, r26, r1, r0.k, r2, r0.U);
            r5 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x035a, code lost:
            if (defpackage.e50.n(r4) == false) goto L_0x045c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x035e, code lost:
            if (r0.p != 0) goto L_0x0372;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0360, code lost:
            r2 = r0.n;
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0363, code lost:
            if (r2 != -1) goto L_0x0367;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0365, code lost:
            r2 = r0.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0367, code lost:
            r0.n = r2;
            r2 = r0.o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x036b, code lost:
            if (r2 != -1) goto L_0x036f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x036d, code lost:
            r2 = r0.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x036f, code lost:
            r0.o = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0372, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0373, code lost:
            r5 = r0.n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0377, code lost:
            if (r5 == r3) goto L_0x038b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0379, code lost:
            r8 = r0.o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x037b, code lost:
            if (r8 == r3) goto L_0x038b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x037d, code lost:
            r37 = ((float) (r0.m * r5)) / ((float) (r0.l * r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x038b, code lost:
            r37 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x038f, code lost:
            if (r0.w == false) goto L_0x03a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x0391, code lost:
            r40 = new com.google.android.exoplayer2.video.i(r0.x, r0.z, r0.y, b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a3, code lost:
            r40 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x03af, code lost:
            if ("htc_video_rotA-000".equals(r0.a) == false) goto L_0x03b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03b1, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03bb, code lost:
            if ("htc_video_rotA-090".equals(r0.a) == false) goto L_0x03c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03bd, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x03c8, code lost:
            if ("htc_video_rotA-180".equals(r0.a) == false) goto L_0x03cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ca, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03d5, code lost:
            if ("htc_video_rotA-270".equals(r0.a) == false) goto L_0x03da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d7, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03da, code lost:
            r9 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03dd, code lost:
            if (r0.q != 0) goto L_0x0431;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03e6, code lost:
            if (java.lang.Float.compare(r0.r, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) != 0) goto L_0x0431;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x03ee, code lost:
            if (java.lang.Float.compare(r0.s, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) != 0) goto L_0x0431;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x03f6, code lost:
            if (java.lang.Float.compare(r0.t, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) != 0) goto L_0x03fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x03f8, code lost:
            r36 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0403, code lost:
            if (java.lang.Float.compare(r0.s, 90.0f) != 0) goto L_0x0408;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0405, code lost:
            r36 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0410, code lost:
            if (java.lang.Float.compare(r0.s, -180.0f) == 0) goto L_0x042c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x041a, code lost:
            if (java.lang.Float.compare(r0.s, 180.0f) != 0) goto L_0x041d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0425, code lost:
            if (java.lang.Float.compare(r0.s, -90.0f) != 0) goto L_0x0431;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0427, code lost:
            r36 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x042c, code lost:
            r36 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0431, code lost:
            r36 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0433, code lost:
            r1 = com.google.android.exoplayer2.f0.I(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r31, r0.l, r0.m, -1.0f, r1, r36, r37, r0.u, r0.v, r40, r0.k);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0460, code lost:
            if ("application/x-subrip".equals(r4) == false) goto L_0x0471;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0462, code lost:
            r1 = com.google.android.exoplayer2.f0.z(java.lang.Integer.toString(r44), r4, r2, r0.U, r0.k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x046e, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0475, code lost:
            if ("text/x-ssa".equals(r4) == false) goto L_0x04aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0477, code lost:
            r1 = new java.util.ArrayList(2);
            r1.add(defpackage.ou.b());
            r1.add(r0.j);
            r1 = com.google.android.exoplayer2.f0.D(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r2, r0.U, -1, r0.k, Long.MAX_VALUE, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ae, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x04b4, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x04ba, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x04bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x04c4, code lost:
            throw new com.google.android.exoplayer2.m0("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x04c5, code lost:
            r1 = com.google.android.exoplayer2.f0.s(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r2, r1, r0.U, r0.k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x04e0, code lost:
            r2 = r43.a(r0.c, r5);
            r0.V = r2;
            r2.d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x04ed, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(defpackage.jt r43, int r44) {
            /*
                r42 = this;
                r0 = r42
                java.lang.String r1 = r0.b
                int r2 = r1.hashCode()
                r3 = 4
                r5 = 1
                r6 = 2
                r7 = 0
                r8 = 3
                switch(r2) {
                    case -2095576542: goto L_0x015f;
                    case -2095575984: goto L_0x0155;
                    case -1985379776: goto L_0x014a;
                    case -1784763192: goto L_0x013f;
                    case -1730367663: goto L_0x0134;
                    case -1482641358: goto L_0x0129;
                    case -1482641357: goto L_0x011e;
                    case -1373388978: goto L_0x0113;
                    case -933872740: goto L_0x0108;
                    case -538363189: goto L_0x00fd;
                    case -538363109: goto L_0x00f2;
                    case -425012669: goto L_0x00e6;
                    case -356037306: goto L_0x00da;
                    case 62923557: goto L_0x00ce;
                    case 62923603: goto L_0x00c2;
                    case 62927045: goto L_0x00b6;
                    case 82318131: goto L_0x00ab;
                    case 82338133: goto L_0x00a0;
                    case 82338134: goto L_0x0095;
                    case 99146302: goto L_0x0089;
                    case 444813526: goto L_0x007d;
                    case 542569478: goto L_0x0071;
                    case 725957860: goto L_0x0065;
                    case 738597099: goto L_0x0059;
                    case 855502857: goto L_0x004d;
                    case 1422270023: goto L_0x0041;
                    case 1809237540: goto L_0x0036;
                    case 1950749482: goto L_0x002a;
                    case 1950789798: goto L_0x001e;
                    case 1951062397: goto L_0x0012;
                    default: goto L_0x0010;
                }
            L_0x0010:
                goto L_0x0169
            L_0x0012:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 12
                goto L_0x016a
            L_0x001e:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 22
                goto L_0x016a
            L_0x002a:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 17
                goto L_0x016a
            L_0x0036:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 3
                goto L_0x016a
            L_0x0041:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 25
                goto L_0x016a
            L_0x004d:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 8
                goto L_0x016a
            L_0x0059:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 26
                goto L_0x016a
            L_0x0065:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 24
                goto L_0x016a
            L_0x0071:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 20
                goto L_0x016a
            L_0x007d:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 10
                goto L_0x016a
            L_0x0089:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 28
                goto L_0x016a
            L_0x0095:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 1
                goto L_0x016a
            L_0x00a0:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 0
                goto L_0x016a
            L_0x00ab:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 2
                goto L_0x016a
            L_0x00b6:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 19
                goto L_0x016a
            L_0x00c2:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 16
                goto L_0x016a
            L_0x00ce:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 13
                goto L_0x016a
            L_0x00da:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 21
                goto L_0x016a
            L_0x00e6:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 27
                goto L_0x016a
            L_0x00f2:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 7
                goto L_0x016a
            L_0x00fd:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 5
                goto L_0x016a
            L_0x0108:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 29
                goto L_0x016a
            L_0x0113:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 9
                goto L_0x016a
            L_0x011e:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 15
                goto L_0x016a
            L_0x0129:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 14
                goto L_0x016a
            L_0x0134:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 11
                goto L_0x016a
            L_0x013f:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 18
                goto L_0x016a
            L_0x014a:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 23
                goto L_0x016a
            L_0x0155:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 4
                goto L_0x016a
            L_0x015f:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0169
                r1 = 6
                goto L_0x016a
            L_0x0169:
                r1 = -1
            L_0x016a:
                java.lang.String r2 = ". Setting mimeType to "
                java.lang.String r10 = "Unsupported PCM bit depth: "
                java.lang.String r11 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/x-ssa"
                java.lang.String r15 = "application/x-subrip"
                java.lang.String r16 = "audio/raw"
                r17 = 4096(0x1000, float:5.74E-42)
                java.lang.String r9 = "MatroskaExtractor"
                java.lang.String r4 = "audio/x-unknown"
                r18 = 0
                switch(r1) {
                    case 0: goto L_0x0314;
                    case 1: goto L_0x0311;
                    case 2: goto L_0x030e;
                    case 3: goto L_0x030b;
                    case 4: goto L_0x02fd;
                    case 5: goto L_0x02fd;
                    case 6: goto L_0x02fd;
                    case 7: goto L_0x02e6;
                    case 8: goto L_0x02d2;
                    case 9: goto L_0x02bc;
                    case 10: goto L_0x02b9;
                    case 11: goto L_0x02a7;
                    case 12: goto L_0x0261;
                    case 13: goto L_0x0257;
                    case 14: goto L_0x024b;
                    case 15: goto L_0x0248;
                    case 16: goto L_0x0244;
                    case 17: goto L_0x0240;
                    case 18: goto L_0x0235;
                    case 19: goto L_0x0231;
                    case 20: goto L_0x0231;
                    case 21: goto L_0x022d;
                    case 22: goto L_0x0223;
                    case 23: goto L_0x01ec;
                    case 24: goto L_0x01ba;
                    case 25: goto L_0x01b7;
                    case 26: goto L_0x01b4;
                    case 27: goto L_0x01ab;
                    case 28: goto L_0x01a8;
                    case 29: goto L_0x018d;
                    default: goto L_0x0185;
                }
            L_0x0185:
                com.google.android.exoplayer2.m0 r1 = new com.google.android.exoplayer2.m0
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x018d:
                byte[] r1 = new byte[r3]
                byte[] r2 = r0.j
                byte r3 = r2[r7]
                r1[r7] = r3
                byte r3 = r2[r5]
                r1[r5] = r3
                byte r3 = r2[r6]
                r1[r6] = r3
                byte r2 = r2[r8]
                r1[r8] = r2
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r4 = r11
                goto L_0x031a
            L_0x01a8:
                r4 = r12
                goto L_0x0318
            L_0x01ab:
                byte[] r1 = r0.j
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r4 = r13
                goto L_0x031a
            L_0x01b4:
                r4 = r14
                goto L_0x0318
            L_0x01b7:
                r4 = r15
                goto L_0x0318
            L_0x01ba:
                int r1 = r0.N
                int r1 = defpackage.v50.P(r1)
                if (r1 != 0) goto L_0x01e4
                int r1 = r0.N
                int r3 = r4.length()
                int r3 = r3 + 60
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
            L_0x01cf:
                r5.append(r10)
                r5.append(r1)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r1 = r5.toString()
            L_0x01df:
                defpackage.b50.h(r9, r1)
                goto L_0x0318
            L_0x01e4:
                r26 = r1
                r4 = r16
                r1 = r18
                goto L_0x031c
            L_0x01ec:
                i50 r1 = new i50
                byte[] r3 = r0.j
                r1.<init>((byte[]) r3)
                boolean r1 = f(r1)
                if (r1 == 0) goto L_0x020f
                int r1 = r0.N
                int r1 = defpackage.v50.P(r1)
                if (r1 != 0) goto L_0x01e4
                int r1 = r0.N
                int r3 = r4.length()
                int r3 = r3 + 60
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
                goto L_0x01cf
            L_0x020f:
                java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                int r2 = r4.length()
                if (r2 == 0) goto L_0x021c
                java.lang.String r1 = r1.concat(r4)
                goto L_0x01df
            L_0x021c:
                java.lang.String r2 = new java.lang.String
                r2.<init>(r1)
                r1 = r2
                goto L_0x01df
            L_0x0223:
                byte[] r1 = r0.j
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x02fa
            L_0x022d:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0316
            L_0x0231:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0316
            L_0x0235:
                ou$d r1 = new ou$d
                r1.<init>()
                r0.R = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0316
            L_0x0240:
                java.lang.String r16 = "audio/eac3"
                goto L_0x0316
            L_0x0244:
                java.lang.String r16 = "audio/ac3"
                goto L_0x0316
            L_0x0248:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x024d
            L_0x024b:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x024d:
                r4 = r16
                r1 = r18
                r26 = -1
                r31 = 4096(0x1000, float:5.74E-42)
                goto L_0x031e
            L_0x0257:
                byte[] r1 = r0.j
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x02fa
            L_0x0261:
                r17 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                byte[] r2 = r0.j
                r1.add(r2)
                r2 = 8
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.P
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r3 = r0.Q
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                r4 = r16
                r26 = -1
                r31 = 5760(0x1680, float:8.071E-42)
                goto L_0x031e
            L_0x02a7:
                r17 = 8192(0x2000, float:1.14794E-41)
                byte[] r1 = r0.j
                java.util.List r1 = g(r1)
                java.lang.String r16 = "audio/vorbis"
                r4 = r16
                r26 = -1
                r31 = 8192(0x2000, float:1.14794E-41)
                goto L_0x031e
            L_0x02b9:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x0316
            L_0x02bc:
                i50 r1 = new i50
                byte[] r2 = r0.j
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = e(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x02fa
            L_0x02d2:
                i50 r1 = new i50
                byte[] r2 = r0.j
                r1.<init>((byte[]) r2)
                com.google.android.exoplayer2.video.l r1 = com.google.android.exoplayer2.video.l.a(r1)
                java.util.List<byte[]> r2 = r1.a
                int r1 = r1.b
                r0.W = r1
                java.lang.String r16 = "video/hevc"
                goto L_0x02f9
            L_0x02e6:
                i50 r1 = new i50
                byte[] r2 = r0.j
                r1.<init>((byte[]) r2)
                com.google.android.exoplayer2.video.h r1 = com.google.android.exoplayer2.video.h.b(r1)
                java.util.List<byte[]> r2 = r1.a
                int r1 = r1.b
                r0.W = r1
                java.lang.String r16 = "video/avc"
            L_0x02f9:
                r1 = r2
            L_0x02fa:
                r4 = r16
                goto L_0x031a
            L_0x02fd:
                byte[] r1 = r0.j
                if (r1 != 0) goto L_0x0304
                r1 = r18
                goto L_0x0308
            L_0x0304:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0308:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x02fa
            L_0x030b:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0316
            L_0x030e:
                java.lang.String r16 = "video/av01"
                goto L_0x0316
            L_0x0311:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0316
            L_0x0314:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0316:
                r4 = r16
            L_0x0318:
                r1 = r18
            L_0x031a:
                r26 = -1
            L_0x031c:
                r31 = -1
            L_0x031e:
                boolean r2 = r0.T
                r2 = r2 | r7
                boolean r3 = r0.S
                if (r3 == 0) goto L_0x0327
                r3 = 2
                goto L_0x0328
            L_0x0327:
                r3 = 0
            L_0x0328:
                r2 = r2 | r3
                boolean r3 = defpackage.e50.l(r4)
                if (r3 == 0) goto L_0x0356
                java.lang.String r19 = java.lang.Integer.toString(r44)
                r21 = 0
                r22 = -1
                int r3 = r0.M
                int r5 = r0.O
                ns r6 = r0.k
                java.lang.String r7 = r0.U
                r20 = r4
                r23 = r31
                r24 = r3
                r25 = r5
                r27 = r1
                r28 = r6
                r29 = r2
                r30 = r7
                com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.o(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                r5 = 1
                goto L_0x04e0
            L_0x0356:
                boolean r3 = defpackage.e50.n(r4)
                if (r3 == 0) goto L_0x045c
                int r2 = r0.p
                if (r2 != 0) goto L_0x0372
                int r2 = r0.n
                r3 = -1
                if (r2 != r3) goto L_0x0367
                int r2 = r0.l
            L_0x0367:
                r0.n = r2
                int r2 = r0.o
                if (r2 != r3) goto L_0x036f
                int r2 = r0.m
            L_0x036f:
                r0.o = r2
                goto L_0x0373
            L_0x0372:
                r3 = -1
            L_0x0373:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = r0.n
                if (r5 == r3) goto L_0x038b
                int r8 = r0.o
                if (r8 == r3) goto L_0x038b
                int r2 = r0.m
                int r2 = r2 * r5
                float r2 = (float) r2
                int r5 = r0.l
                int r5 = r5 * r8
                float r5 = (float) r5
                float r2 = r2 / r5
                r37 = r2
                goto L_0x038d
            L_0x038b:
                r37 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x038d:
                boolean r2 = r0.w
                if (r2 == 0) goto L_0x03a3
                byte[] r2 = r42.b()
                com.google.android.exoplayer2.video.i r5 = new com.google.android.exoplayer2.video.i
                int r8 = r0.x
                int r9 = r0.z
                int r10 = r0.y
                r5.<init>(r8, r9, r10, r2)
                r40 = r5
                goto L_0x03a5
            L_0x03a3:
                r40 = r18
            L_0x03a5:
                java.lang.String r2 = r0.a
                java.lang.String r5 = "htc_video_rotA-000"
                boolean r2 = r5.equals(r2)
                r5 = 90
                if (r2 == 0) goto L_0x03b3
                r9 = 0
                goto L_0x03db
            L_0x03b3:
                java.lang.String r2 = r0.a
                java.lang.String r8 = "htc_video_rotA-090"
                boolean r2 = r8.equals(r2)
                if (r2 == 0) goto L_0x03c0
                r9 = 90
                goto L_0x03db
            L_0x03c0:
                java.lang.String r2 = r0.a
                java.lang.String r8 = "htc_video_rotA-180"
                boolean r2 = r8.equals(r2)
                if (r2 == 0) goto L_0x03cd
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x03db
            L_0x03cd:
                java.lang.String r2 = r0.a
                java.lang.String r8 = "htc_video_rotA-270"
                boolean r2 = r8.equals(r2)
                if (r2 == 0) goto L_0x03da
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x03db
            L_0x03da:
                r9 = -1
            L_0x03db:
                int r2 = r0.q
                if (r2 != 0) goto L_0x0431
                float r2 = r0.r
                r3 = 0
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0431
                float r2 = r0.s
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0431
                float r2 = r0.t
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x03fb
                r36 = 0
                goto L_0x0433
            L_0x03fb:
                float r2 = r0.s
                r3 = 1119092736(0x42b40000, float:90.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0408
                r36 = 90
                goto L_0x0433
            L_0x0408:
                float r2 = r0.s
                r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 == 0) goto L_0x042c
                float r2 = r0.s
                r3 = 1127481344(0x43340000, float:180.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x041d
                goto L_0x042c
            L_0x041d:
                float r2 = r0.s
                r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0431
                r7 = 270(0x10e, float:3.78E-43)
                r36 = 270(0x10e, float:3.78E-43)
                goto L_0x0433
            L_0x042c:
                r7 = 180(0xb4, float:2.52E-43)
                r36 = 180(0xb4, float:2.52E-43)
                goto L_0x0433
            L_0x0431:
                r36 = r9
            L_0x0433:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                int r2 = r0.l
                int r3 = r0.m
                r34 = -1082130432(0xffffffffbf800000, float:-1.0)
                byte[] r5 = r0.u
                int r7 = r0.v
                ns r8 = r0.k
                r28 = r4
                r32 = r2
                r33 = r3
                r35 = r1
                r38 = r5
                r39 = r7
                r41 = r8
                com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.I(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
                r5 = 2
                goto L_0x04e0
            L_0x045c:
                boolean r3 = r15.equals(r4)
                if (r3 == 0) goto L_0x0471
                java.lang.String r1 = java.lang.Integer.toString(r44)
                java.lang.String r3 = r0.U
                ns r5 = r0.k
                com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.z(r1, r4, r2, r3, r5)
            L_0x046e:
                r5 = 3
                goto L_0x04e0
            L_0x0471:
                boolean r3 = r14.equals(r4)
                if (r3 == 0) goto L_0x04aa
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                byte[] r3 = defpackage.ou.c0
                r1.add(r3)
                byte[] r3 = r0.j
                r1.add(r3)
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.U
                r33 = -1
                ns r5 = r0.k
                r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r28 = r4
                r31 = r2
                r32 = r3
                r34 = r5
                r37 = r1
                com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.D(r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
                goto L_0x046e
            L_0x04aa:
                boolean r3 = r13.equals(r4)
                if (r3 != 0) goto L_0x04c5
                boolean r3 = r12.equals(r4)
                if (r3 != 0) goto L_0x04c5
                boolean r3 = r11.equals(r4)
                if (r3 == 0) goto L_0x04bd
                goto L_0x04c5
            L_0x04bd:
                com.google.android.exoplayer2.m0 r1 = new com.google.android.exoplayer2.m0
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x04c5:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.U
                ns r5 = r0.k
                r28 = r4
                r31 = r2
                r32 = r1
                r33 = r3
                r34 = r5
                com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.s(r27, r28, r29, r30, r31, r32, r33, r34)
                goto L_0x046e
            L_0x04e0:
                int r2 = r0.c
                r3 = r43
                vt r2 = r3.a(r2, r5)
                r0.V = r2
                r2.d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ou.c.c(jt, int):void");
        }

        public void d() {
            d dVar = this.R;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void h() {
            d dVar = this.R;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* renamed from: ou$d */
    private static final class d {
        private final byte[] a = new byte[10];
        private boolean b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;

        public void a(c cVar) {
            if (this.c > 0) {
                cVar.V.c(this.d, this.e, this.f, this.g, cVar.i);
                this.c = 0;
            }
        }

        public void b() {
            this.b = false;
            this.c = 0;
        }

        public void c(c cVar, long j, int i, int i2, int i3) {
            if (this.b) {
                int i4 = this.c;
                this.c = i4 + 1;
                if (i4 == 0) {
                    this.d = j;
                    this.e = i;
                    this.f = 0;
                }
                this.f += i2;
                this.g = i3;
                if (this.c >= 16) {
                    a(cVar);
                }
            }
        }

        public void d(it itVar) {
            if (!this.b) {
                itVar.l(this.a, 0, 10);
                itVar.i();
                if (zq.i(this.a) != 0) {
                    this.b = true;
                }
            }
        }
    }

    static {
        ku kuVar = ku.a;
    }

    public ou() {
        this(0);
    }

    public ou(int i2) {
        this(new lu(), i2);
    }

    ou(nu nuVar, int i2) {
        this.q = -1;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1;
        this.A = -1;
        this.B = -9223372036854775807L;
        this.a = nuVar;
        nuVar.c(new b());
        this.d = (i2 & 1) != 0 ? false : true;
        this.b = new qu();
        this.c = new SparseArray<>();
        this.g = new i50(4);
        this.h = new i50(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new i50(4);
        this.e = new i50(f50.a);
        this.f = new i50(4);
        this.j = new i50();
        this.k = new i50();
        this.l = new i50(8);
        this.m = new i50();
        this.n = new i50();
    }

    private int C(it itVar, c cVar, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            D(itVar, b0, i2);
        } else if ("S_TEXT/ASS".equals(cVar.b)) {
            D(itVar, d0, i2);
        } else {
            vt vtVar = cVar.V;
            boolean z2 = true;
            if (!this.U) {
                if (cVar.g) {
                    this.O &= -1073741825;
                    int i4 = 128;
                    if (!this.V) {
                        itVar.readFully(this.g.a, 0, 1);
                        this.R++;
                        byte[] bArr = this.g.a;
                        if ((bArr[0] & 128) != 128) {
                            this.Y = bArr[0];
                            this.V = true;
                        } else {
                            throw new m0("Extension bit is set in signal byte");
                        }
                    }
                    if ((this.Y & 1) == 1) {
                        boolean z3 = (this.Y & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            itVar.readFully(this.l.a, 0, 8);
                            this.R += 8;
                            this.Z = true;
                            byte[] bArr2 = this.g.a;
                            if (!z3) {
                                i4 = 0;
                            }
                            bArr2[0] = (byte) (i4 | 8);
                            this.g.M(0);
                            vtVar.b(this.g, 1);
                            this.S++;
                            this.l.M(0);
                            vtVar.b(this.l, 8);
                            this.S += 8;
                        }
                        if (z3) {
                            if (!this.W) {
                                itVar.readFully(this.g.a, 0, 1);
                                this.R++;
                                this.g.M(0);
                                this.X = this.g.z();
                                this.W = true;
                            }
                            int i5 = this.X * 4;
                            this.g.I(i5);
                            itVar.readFully(this.g.a, 0, i5);
                            this.R += i5;
                            short s2 = (short) ((this.X / 2) + 1);
                            int i6 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.o = ByteBuffer.allocate(i6);
                            }
                            this.o.position(0);
                            this.o.putShort(s2);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i3 = this.X;
                                if (i7 >= i3) {
                                    break;
                                }
                                int D2 = this.g.D();
                                if (i7 % 2 == 0) {
                                    this.o.putShort((short) (D2 - i8));
                                } else {
                                    this.o.putInt(D2 - i8);
                                }
                                i7++;
                                i8 = D2;
                            }
                            int i9 = (i2 - this.R) - i8;
                            int i10 = i3 % 2;
                            ByteBuffer byteBuffer2 = this.o;
                            if (i10 == 1) {
                                byteBuffer2.putInt(i9);
                            } else {
                                byteBuffer2.putShort((short) i9);
                                this.o.putInt(0);
                            }
                            this.m.K(this.o.array(), i6);
                            vtVar.b(this.m, i6);
                            this.S += i6;
                        }
                    }
                } else {
                    byte[] bArr3 = cVar.h;
                    if (bArr3 != null) {
                        this.j.K(bArr3, bArr3.length);
                    }
                }
                if (cVar.f > 0) {
                    this.O |= 268435456;
                    this.n.H();
                    this.g.I(4);
                    i50 i50 = this.g;
                    byte[] bArr4 = i50.a;
                    bArr4[0] = (byte) ((i2 >> 24) & 255);
                    bArr4[1] = (byte) ((i2 >> 16) & 255);
                    bArr4[2] = (byte) ((i2 >> 8) & 255);
                    bArr4[3] = (byte) (i2 & 255);
                    vtVar.b(i50, 4);
                    this.S += 4;
                }
                this.U = true;
            }
            int d2 = i2 + this.j.d();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
                if (cVar.R != null) {
                    if (this.j.d() != 0) {
                        z2 = false;
                    }
                    q40.f(z2);
                    cVar.R.d(itVar);
                }
                while (true) {
                    int i11 = this.R;
                    if (i11 >= d2) {
                        break;
                    }
                    int E2 = E(itVar, vtVar, d2 - i11);
                    this.R += E2;
                    this.S += E2;
                }
            } else {
                byte[] bArr5 = this.f.a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i12 = cVar.W;
                int i13 = 4 - i12;
                while (this.R < d2) {
                    int i14 = this.T;
                    if (i14 == 0) {
                        F(itVar, bArr5, i13, i12);
                        this.R += i12;
                        this.f.M(0);
                        this.T = this.f.D();
                        this.e.M(0);
                        vtVar.b(this.e, 4);
                        this.S += 4;
                    } else {
                        int E3 = E(itVar, vtVar, i14);
                        this.R += E3;
                        this.S += E3;
                        this.T -= E3;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.b)) {
                this.h.M(0);
                vtVar.b(this.h, 4);
                this.S += 4;
            }
            return m();
        }
        return m();
    }

    private void D(it itVar, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        if (this.k.b() < length) {
            this.k.a = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, this.k.a, 0, bArr.length);
        }
        itVar.readFully(this.k.a, bArr.length, i2);
        this.k.I(length);
    }

    private int E(it itVar, vt vtVar, int i2) {
        int a2 = this.j.a();
        if (a2 <= 0) {
            return vtVar.a(itVar, i2, false);
        }
        int min = Math.min(i2, a2);
        vtVar.b(this.j, min);
        return min;
    }

    private void F(it itVar, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, this.j.a());
        itVar.readFully(bArr, i2 + min, i3 - min);
        if (min > 0) {
            this.j.h(bArr, i2, min);
        }
    }

    private tt i() {
        c50 c50;
        c50 c502;
        int i2;
        if (this.q == -1 || this.t == -9223372036854775807L || (c50 = this.C) == null || c50.c() == 0 || (c502 = this.D) == null || c502.c() != this.C.c()) {
            this.C = null;
            this.D = null;
            return new tt.b(this.t);
        }
        int c2 = this.C.c();
        int[] iArr = new int[c2];
        long[] jArr = new long[c2];
        long[] jArr2 = new long[c2];
        long[] jArr3 = new long[c2];
        int i3 = 0;
        for (int i4 = 0; i4 < c2; i4++) {
            jArr3[i4] = this.C.b(i4);
            jArr[i4] = this.q + this.D.b(i4);
        }
        while (true) {
            i2 = c2 - 1;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            iArr[i3] = (int) (jArr[i5] - jArr[i3]);
            jArr2[i3] = jArr3[i5] - jArr3[i3];
            i3 = i5;
        }
        iArr[i2] = (int) ((this.q + this.p) - jArr[i2]);
        jArr2[i2] = this.t - jArr3[i2];
        long j2 = jArr2[i2];
        if (j2 <= 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j2);
            b50.h("MatroskaExtractor", sb.toString());
            iArr = Arrays.copyOf(iArr, i2);
            jArr = Arrays.copyOf(jArr, i2);
            jArr2 = Arrays.copyOf(jArr2, i2);
            jArr3 = Arrays.copyOf(jArr3, i2);
        }
        this.C = null;
        this.D = null;
        return new ct(iArr, jArr, jArr2, jArr3);
    }

    private void j(c cVar, long j2, int i2, int i3, int i4) {
        String str;
        d dVar = cVar.R;
        if (dVar != null) {
            dVar.c(cVar, j2, i2, i3, i4);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b)) {
                if (this.K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j3 = this.I;
                    if (j3 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        z(cVar.b, j3, this.k.a);
                        vt vtVar = cVar.V;
                        i50 i50 = this.k;
                        vtVar.b(i50, i50.d());
                        i3 += this.k.d();
                    }
                }
                b50.h("MatroskaExtractor", str);
            }
            if ((268435456 & i2) != 0) {
                if (this.K > 1) {
                    i2 &= -268435457;
                } else {
                    int d2 = this.n.d();
                    cVar.V.b(this.n, d2);
                    i3 += d2;
                }
            }
            cVar.V.c(j2, i2, i3, i4, cVar.i);
        }
        this.F = true;
    }

    private static int[] l(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    private int m() {
        int i2 = this.S;
        x();
        return i2;
    }

    private static byte[] o(long j2, String str, long j3) {
        q40.a(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return v50.Z(String.format(Locale.US, str, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3))}));
    }

    private static boolean s(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    static /* synthetic */ ht[] u() {
        return new ht[]{new ou()};
    }

    private boolean v(st stVar, long j2) {
        if (this.y) {
            this.A = j2;
            stVar.a = this.z;
            this.y = false;
            return true;
        }
        if (this.v) {
            long j3 = this.A;
            if (j3 != -1) {
                stVar.a = j3;
                this.A = -1;
                return true;
            }
        }
        return false;
    }

    private void w(it itVar, int i2) {
        if (this.g.d() < i2) {
            if (this.g.b() < i2) {
                i50 i50 = this.g;
                byte[] bArr = i50.a;
                i50.K(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i2)), this.g.d());
            }
            i50 i502 = this.g;
            itVar.readFully(i502.a, i502.d(), i2 - this.g.d());
            this.g.L(i2);
        }
    }

    private void x() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.j.H();
    }

    private long y(long j2) {
        long j3 = this.r;
        if (j3 != -9223372036854775807L) {
            return v50.w0(j2, j3, 1000);
        }
        throw new m0("Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void z(java.lang.String r4, long r5, byte[] r7) {
        /*
            int r0 = r4.hashCode()
            r1 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = -1
        L_0x0026:
            if (r4 == 0) goto L_0x003b
            if (r4 != r3) goto L_0x0035
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r4 = o(r5, r4, r0)
            r5 = 21
            goto L_0x0045
        L_0x0035:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L_0x003b:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "%02d:%02d:%02d,%03d"
            byte[] r4 = o(r5, r4, r0)
            r5 = 19
        L_0x0045:
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r2, r7, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou.z(java.lang.String, long, byte[]):void");
    }

    /* access modifiers changed from: protected */
    public void A(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.Q = false;
        } else if (i2 == 174) {
            this.u = new c();
        } else if (i2 == 187) {
            this.E = false;
        } else if (i2 == 19899) {
            this.w = -1;
            this.x = -1;
        } else if (i2 == 20533) {
            this.u.g = true;
        } else if (i2 == 21968) {
            this.u.w = true;
        } else if (i2 == 408125543) {
            long j4 = this.q;
            if (j4 == -1 || j4 == j2) {
                this.q = j2;
                this.p = j3;
                return;
            }
            throw new m0("Multiple Segment elements not supported");
        } else if (i2 == 475249515) {
            this.C = new c50();
            this.D = new c50();
        } else if (i2 != 524531317 || this.v) {
        } else {
            if (!this.d || this.z == -1) {
                this.a0.f(new tt.b(this.t));
                this.v = true;
                return;
            }
            this.y = true;
        }
    }

    /* access modifiers changed from: protected */
    public void B(int i2, String str) {
        if (i2 == 134) {
            this.u.b = str;
        } else if (i2 != 17026) {
            if (i2 == 21358) {
                this.u.a = str;
            } else if (i2 == 2274716) {
                String unused = this.u.U = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new m0(sb.toString());
        }
    }

    public final void a() {
    }

    public final boolean d(it itVar) {
        return new pu().b(itVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0206, code lost:
        throw new com.google.android.exoplayer2.m0("EBML lacing sample size out of range.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r22, int r23, defpackage.it r24) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            r1 = r23
            r8 = r24
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 2
            r9 = 0
            r10 = 1
            if (r0 == r2) goto L_0x00ab
            if (r0 == r3) goto L_0x00ab
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x0095
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x008a
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x007a
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x005a
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x004f
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0036
            ou$c r0 = r7.u
            byte[] r2 = new byte[r1]
            r0.u = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02c0
        L_0x0036:
            com.google.android.exoplayer2.m0 r1 = new com.google.android.exoplayer2.m0
            r2 = 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected id: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x004f:
            ou$c r0 = r7.u
            byte[] r2 = new byte[r1]
            r0.j = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02c0
        L_0x005a:
            i50 r0 = r7.i
            byte[] r0 = r0.a
            java.util.Arrays.fill(r0, r9)
            i50 r0 = r7.i
            byte[] r0 = r0.a
            int r2 = 4 - r1
            r8.readFully(r0, r2, r1)
            i50 r0 = r7.i
            r0.M(r9)
            i50 r0 = r7.i
            long r0 = r0.B()
            int r1 = (int) r0
            r7.w = r1
            goto L_0x02c0
        L_0x007a:
            byte[] r0 = new byte[r1]
            r8.readFully(r0, r9, r1)
            ou$c r1 = r7.u
            vt$a r2 = new vt$a
            r2.<init>(r10, r0, r9, r9)
            r1.i = r2
            goto L_0x02c0
        L_0x008a:
            ou$c r0 = r7.u
            byte[] r2 = new byte[r1]
            r0.h = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02c0
        L_0x0095:
            int r0 = r7.G
            if (r0 == r4) goto L_0x009a
            return
        L_0x009a:
            android.util.SparseArray<ou$c> r0 = r7.c
            int r2 = r7.M
            java.lang.Object r0 = r0.get(r2)
            ou$c r0 = (defpackage.ou.c) r0
            int r2 = r7.P
            r7.q(r0, r2, r8, r1)
            goto L_0x02c0
        L_0x00ab:
            int r2 = r7.G
            r5 = 8
            if (r2 != 0) goto L_0x00d0
            qu r2 = r7.b
            long r11 = r2.d(r8, r9, r10, r5)
            int r2 = (int) r11
            r7.M = r2
            qu r2 = r7.b
            int r2 = r2.b()
            r7.N = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.I = r11
            r7.G = r10
            i50 r2 = r7.g
            r2.H()
        L_0x00d0:
            android.util.SparseArray<ou$c> r2 = r7.c
            int r6 = r7.M
            java.lang.Object r2 = r2.get(r6)
            r11 = r2
            ou$c r11 = (defpackage.ou.c) r11
            if (r11 != 0) goto L_0x00e7
            int r0 = r7.N
            int r0 = r1 - r0
            r8.j(r0)
            r7.G = r9
            return
        L_0x00e7:
            int r2 = r7.G
            if (r2 != r10) goto L_0x027a
            r2 = 3
            r7.w(r8, r2)
            i50 r6 = r7.g
            byte[] r6 = r6.a
            byte r6 = r6[r4]
            r6 = r6 & 6
            int r6 = r6 >> r10
            r12 = 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L_0x010e
            r7.K = r10
            int[] r6 = r7.L
            int[] r6 = l(r6, r10)
            r7.L = r6
            int r13 = r7.N
            int r1 = r1 - r13
            int r1 = r1 - r2
            r6[r9] = r1
            goto L_0x0219
        L_0x010e:
            r13 = 4
            r7.w(r8, r13)
            i50 r14 = r7.g
            byte[] r14 = r14.a
            byte r14 = r14[r2]
            r14 = r14 & r12
            int r14 = r14 + r10
            r7.K = r14
            int[] r15 = r7.L
            int[] r14 = l(r15, r14)
            r7.L = r14
            if (r6 != r4) goto L_0x0132
            int r2 = r7.N
            int r1 = r1 - r2
            int r1 = r1 - r13
            int r2 = r7.K
            int r1 = r1 / r2
            java.util.Arrays.fill(r14, r9, r2, r1)
            goto L_0x0219
        L_0x0132:
            if (r6 != r10) goto L_0x0169
            r2 = 0
            r6 = 0
        L_0x0136:
            int r14 = r7.K
            int r15 = r14 + -1
            if (r2 >= r15) goto L_0x015d
            int[] r14 = r7.L
            r14[r2] = r9
        L_0x0140:
            int r13 = r13 + r10
            r7.w(r8, r13)
            i50 r14 = r7.g
            byte[] r14 = r14.a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r7.L
            r16 = r15[r2]
            int r16 = r16 + r14
            r15[r2] = r16
            if (r14 == r12) goto L_0x0140
            r14 = r15[r2]
            int r6 = r6 + r14
            int r2 = r2 + 1
            goto L_0x0136
        L_0x015d:
            int[] r2 = r7.L
            int r14 = r14 - r10
            int r15 = r7.N
            int r1 = r1 - r15
            int r1 = r1 - r13
            int r1 = r1 - r6
            r2[r14] = r1
            goto L_0x0219
        L_0x0169:
            if (r6 != r2) goto L_0x0261
            r2 = 0
            r6 = 0
        L_0x016d:
            int r14 = r7.K
            int r15 = r14 + -1
            if (r2 >= r15) goto L_0x020f
            int[] r14 = r7.L
            r14[r2] = r9
            int r13 = r13 + 1
            r7.w(r8, r13)
            i50 r14 = r7.g
            byte[] r14 = r14.a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x0207
            r16 = 0
            r14 = 0
        L_0x0189:
            if (r14 >= r5) goto L_0x01d6
            int r18 = 7 - r14
            int r3 = r10 << r18
            i50 r4 = r7.g
            byte[] r4 = r4.a
            byte r4 = r4[r15]
            r4 = r4 & r3
            if (r4 == 0) goto L_0x01d0
            int r13 = r13 + r14
            r7.w(r8, r13)
            i50 r4 = r7.g
            byte[] r4 = r4.a
            int r16 = r15 + 1
            byte r4 = r4[r15]
            r4 = r4 & r12
            int r3 = ~r3
            r3 = r3 & r4
            long r3 = (long) r3
            r19 = r3
            r3 = r16
        L_0x01ac:
            r16 = r19
            if (r3 >= r13) goto L_0x01c2
            long r15 = r16 << r5
            i50 r4 = r7.g
            byte[] r4 = r4.a
            int r17 = r3 + 1
            byte r3 = r4[r3]
            r3 = r3 & r12
            long r3 = (long) r3
            long r3 = r3 | r15
            r19 = r3
            r3 = r17
            goto L_0x01ac
        L_0x01c2:
            if (r2 <= 0) goto L_0x01d6
            int r14 = r14 * 7
            int r14 = r14 + 6
            r3 = 1
            long r14 = r3 << r14
            long r14 = r14 - r3
            long r16 = r16 - r14
            goto L_0x01d6
        L_0x01d0:
            int r14 = r14 + 1
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 2
            goto L_0x0189
        L_0x01d6:
            r3 = r16
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x01ff
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x01ff
            int r4 = (int) r3
            int[] r3 = r7.L
            if (r2 != 0) goto L_0x01ec
            goto L_0x01f1
        L_0x01ec:
            int r14 = r2 + -1
            r14 = r3[r14]
            int r4 = r4 + r14
        L_0x01f1:
            r3[r2] = r4
            int[] r3 = r7.L
            r3 = r3[r2]
            int r6 = r6 + r3
            int r2 = r2 + 1
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 2
            goto L_0x016d
        L_0x01ff:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            java.lang.String r1 = "EBML lacing sample size out of range."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0207:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            java.lang.String r1 = "No valid varint length mask found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x020f:
            int[] r2 = r7.L
            int r14 = r14 - r10
            int r3 = r7.N
            int r1 = r1 - r3
            int r1 = r1 - r13
            int r1 = r1 - r6
            r2[r14] = r1
        L_0x0219:
            i50 r1 = r7.g
            byte[] r1 = r1.a
            byte r2 = r1[r9]
            int r2 = r2 << r5
            byte r1 = r1[r10]
            r1 = r1 & r12
            r1 = r1 | r2
            long r2 = r7.B
            long r12 = (long) r1
            long r12 = r7.y(r12)
            long r2 = r2 + r12
            r7.H = r2
            i50 r1 = r7.g
            byte[] r1 = r1.a
            r2 = 2
            byte r1 = r1[r2]
            r1 = r1 & r5
            if (r1 != r5) goto L_0x023a
            r1 = 1
            goto L_0x023b
        L_0x023a:
            r1 = 0
        L_0x023b:
            int r3 = r11.d
            if (r3 == r2) goto L_0x0251
            r3 = 163(0xa3, float:2.28E-43)
            if (r0 != r3) goto L_0x024f
            i50 r3 = r7.g
            byte[] r3 = r3.a
            byte r3 = r3[r2]
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            r2 = 0
            goto L_0x0252
        L_0x0251:
            r2 = 1
        L_0x0252:
            if (r1 == 0) goto L_0x0257
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0258
        L_0x0257:
            r1 = 0
        L_0x0258:
            r1 = r1 | r2
            r7.O = r1
            r1 = 2
            r7.G = r1
            r7.J = r9
            goto L_0x027a
        L_0x0261:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            r1 = 36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unexpected lacing value: "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x027a:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02aa
        L_0x027e:
            int r0 = r7.J
            int r1 = r7.K
            if (r0 >= r1) goto L_0x02a7
            int[] r1 = r7.L
            r0 = r1[r0]
            int r5 = r7.C(r8, r11, r0)
            long r0 = r7.H
            int r2 = r7.J
            int r3 = r11.e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.O
            r6 = 0
            r0 = r21
            r1 = r11
            r0.j(r1, r2, r4, r5, r6)
            int r0 = r7.J
            int r0 = r0 + r10
            r7.J = r0
            goto L_0x027e
        L_0x02a7:
            r7.G = r9
            goto L_0x02c0
        L_0x02aa:
            int r0 = r7.J
            int r1 = r7.K
            if (r0 >= r1) goto L_0x02c0
            int[] r1 = r7.L
            r2 = r1[r0]
            int r2 = r7.C(r8, r11, r2)
            r1[r0] = r2
            int r0 = r7.J
            int r0 = r0 + r10
            r7.J = r0
            goto L_0x02aa
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou.e(int, int, it):void");
    }

    public final int f(it itVar, st stVar) {
        this.F = false;
        boolean z2 = true;
        while (z2 && !this.F) {
            z2 = this.a.b(itVar);
            if (z2 && v(stVar, itVar.m())) {
                return 1;
            }
        }
        if (z2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.valueAt(i2).d();
        }
        return -1;
    }

    public final void g(jt jtVar) {
        this.a0 = jtVar;
    }

    public void h(long j2, long j3) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.a.a();
        this.b.e();
        x();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.valueAt(i2).h();
        }
    }

    /* access modifiers changed from: protected */
    public void k(int i2) {
        if (i2 != 160) {
            if (i2 == 174) {
                if (s(this.u.b)) {
                    c cVar = this.u;
                    cVar.c(this.a0, cVar.c);
                    SparseArray<c> sparseArray = this.c;
                    c cVar2 = this.u;
                    sparseArray.put(cVar2.c, cVar2);
                }
                this.u = null;
            } else if (i2 == 19899) {
                int i3 = this.w;
                if (i3 != -1) {
                    long j2 = this.x;
                    if (j2 != -1) {
                        if (i3 == 475249515) {
                            this.z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new m0("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                c cVar3 = this.u;
                if (!cVar3.g) {
                    return;
                }
                if (cVar3.i != null) {
                    cVar3.k = new ns(new ns.b(v.a, "video/webm", this.u.i.b));
                    return;
                }
                throw new m0("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i2 == 28032) {
                c cVar4 = this.u;
                if (cVar4.g && cVar4.h != null) {
                    throw new m0("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.r == -9223372036854775807L) {
                    this.r = 1000000;
                }
                long j3 = this.s;
                if (j3 != -9223372036854775807L) {
                    this.t = y(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.v) {
                    this.a0.f(i());
                    this.v = true;
                }
            } else if (this.c.size() != 0) {
                this.a0.p();
            } else {
                throw new m0("No valid tracks were found");
            }
        } else if (this.G == 2) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.K; i5++) {
                i4 += this.L[i5];
            }
            c cVar5 = this.c.get(this.M);
            for (int i6 = 0; i6 < this.K; i6++) {
                long j4 = ((long) ((cVar5.e * i6) / 1000)) + this.H;
                int i7 = this.O;
                if (i6 == 0 && !this.Q) {
                    i7 |= 1;
                }
                int i8 = this.L[i6];
                i4 -= i8;
                j(cVar5, j4, i7, i8, i4);
            }
            this.G = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void n(int i2, double d2) {
        if (i2 == 181) {
            this.u.O = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.u.C = (float) d2;
                    return;
                case 21970:
                    this.u.D = (float) d2;
                    return;
                case 21971:
                    this.u.E = (float) d2;
                    return;
                case 21972:
                    this.u.F = (float) d2;
                    return;
                case 21973:
                    this.u.G = (float) d2;
                    return;
                case 21974:
                    this.u.H = (float) d2;
                    return;
                case 21975:
                    this.u.I = (float) d2;
                    return;
                case 21976:
                    this.u.J = (float) d2;
                    return;
                case 21977:
                    this.u.K = (float) d2;
                    return;
                case 21978:
                    this.u.L = (float) d2;
                    return;
                default:
                    switch (i2) {
                        case 30323:
                            this.u.r = (float) d2;
                            return;
                        case 30324:
                            this.u.s = (float) d2;
                            return;
                        case 30325:
                            this.u.t = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.s = (long) d2;
        }
    }

    /* access modifiers changed from: protected */
    public int p(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void q(c cVar, int i2, it itVar, int i3) {
        if (i2 != 4 || !"V_VP9".equals(cVar.b)) {
            itVar.j(i3);
            return;
        }
        this.n.I(i3);
        itVar.readFully(this.n.a, 0, i3);
    }

    /* access modifiers changed from: protected */
    public void r(int i2, long j2) {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.u.d = (int) j2;
                        return;
                    case 136:
                        c cVar = this.u;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        cVar.T = z2;
                        return;
                    case 155:
                        this.I = y(j2);
                        return;
                    case 159:
                        this.u.M = (int) j2;
                        return;
                    case 176:
                        this.u.l = (int) j2;
                        return;
                    case 179:
                        this.C.a(y(j2));
                        return;
                    case 186:
                        this.u.m = (int) j2;
                        return;
                    case 215:
                        this.u.c = (int) j2;
                        return;
                    case 231:
                        this.B = y(j2);
                        return;
                    case 238:
                        this.P = (int) j2;
                        return;
                    case 241:
                        if (!this.E) {
                            this.D.a(j2);
                            this.E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.Q = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j2);
                            sb.append(" not supported");
                            throw new m0(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j2);
                            sb2.append(" not supported");
                            throw new m0(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j2);
                            sb3.append(" not supported");
                            throw new m0(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j2);
                            sb4.append(" not supported");
                            throw new m0(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j2);
                            sb5.append(" not supported");
                            throw new m0(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.x = j2 + this.q;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.u.v = 0;
                            return;
                        } else if (i3 == 1) {
                            this.u.v = 2;
                            return;
                        } else if (i3 == 3) {
                            this.u.v = 1;
                            return;
                        } else if (i3 == 15) {
                            this.u.v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.u.n = (int) j2;
                        return;
                    case 21682:
                        this.u.p = (int) j2;
                        return;
                    case 21690:
                        this.u.o = (int) j2;
                        return;
                    case 21930:
                        c cVar2 = this.u;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        cVar2.S = z2;
                        return;
                    case 21998:
                        this.u.f = (int) j2;
                        return;
                    case 22186:
                        this.u.P = j2;
                        return;
                    case 22203:
                        this.u.Q = j2;
                        return;
                    case 25188:
                        this.u.N = (int) j2;
                        return;
                    case 30321:
                        int i4 = (int) j2;
                        if (i4 == 0) {
                            this.u.q = 0;
                            return;
                        } else if (i4 == 1) {
                            this.u.q = 1;
                            return;
                        } else if (i4 == 2) {
                            this.u.q = 2;
                            return;
                        } else if (i4 == 3) {
                            this.u.q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.u.e = (int) j2;
                        return;
                    case 2807729:
                        this.r = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i5 = (int) j2;
                                if (i5 == 1) {
                                    this.u.z = 2;
                                    return;
                                } else if (i5 == 2) {
                                    this.u.z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i6 = (int) j2;
                                if (i6 != 1) {
                                    if (i6 == 16) {
                                        this.u.y = 6;
                                        return;
                                    } else if (i6 == 18) {
                                        this.u.y = 7;
                                        return;
                                    } else if (!(i6 == 6 || i6 == 7)) {
                                        return;
                                    }
                                }
                                this.u.y = 3;
                                return;
                            case 21947:
                                c cVar3 = this.u;
                                cVar3.w = true;
                                int i7 = (int) j2;
                                if (i7 == 1) {
                                    cVar3.x = 1;
                                    return;
                                } else if (i7 == 9) {
                                    cVar3.x = 6;
                                    return;
                                } else if (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) {
                                    this.u.x = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.u.A = (int) j2;
                                return;
                            case 21949:
                                this.u.B = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new m0(sb6.toString());
            }
        } else if (j2 != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j2);
            sb7.append(" not supported");
            throw new m0(sb7.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean t(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }
}
