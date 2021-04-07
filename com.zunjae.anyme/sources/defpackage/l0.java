package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: l0  reason: default package */
public class l0 {
    static l0 b = new l0();
    public static String[] c = {"standard", "accelerate", "decelerate", "linear"};
    String a = "identity";

    /* renamed from: l0$a */
    static class a extends l0 {
        private static double h = 0.01d;
        private static double i = 1.0E-4d;
        double d;
        double e;
        double f;
        double g;

        a(String str) {
            this.a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i2);
            this.e = Double.parseDouble(str.substring(i2, indexOf3).trim());
            int i3 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i3);
            this.f = Double.parseDouble(str.substring(i3, indexOf4).trim());
            int i4 = indexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        private double d(double d2) {
            double d3 = 1.0d - d2;
            double d4 = 3.0d * d3;
            return (this.d * d3 * d4 * d2) + (this.f * d4 * d2 * d2) + (d2 * d2 * d2);
        }

        private double e(double d2) {
            double d3 = 1.0d - d2;
            double d4 = 3.0d * d3;
            return (this.e * d3 * d4 * d2) + (this.g * d4 * d2 * d2) + (d2 * d2 * d2);
        }

        public double a(double d2) {
            if (d2 <= Utils.DOUBLE_EPSILON) {
                return Utils.DOUBLE_EPSILON;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double d3 = 0.5d;
            double d4 = 0.5d;
            while (d3 > h) {
                d3 *= 0.5d;
                d4 = d(d4) < d2 ? d4 + d3 : d4 - d3;
            }
            double d5 = d4 - d3;
            double d6 = d(d5);
            double d7 = d4 + d3;
            double d8 = d(d7);
            double e2 = e(d5);
            return (((e(d7) - e2) * (d2 - d6)) / (d8 - d6)) + e2;
        }

        public double b(double d2) {
            double d3 = 0.5d;
            double d4 = 0.5d;
            while (d3 > i) {
                d3 *= 0.5d;
                d4 = d(d4) < d2 ? d4 + d3 : d4 - d3;
            }
            double d5 = d4 - d3;
            double d6 = d4 + d3;
            return (e(d6) - e(d5)) / (d(d6) - d(d5));
        }
    }

    public static l0 c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 0;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return new a("cubic(0.4, 0.0, 0.2, 1)");
        }
        if (c2 == 1) {
            return new a("cubic(0.4, 0.05, 0.8, 0.7)");
        }
        if (c2 == 2) {
            return new a("cubic(0.0, 0.0, 0.2, 0.95)");
        }
        if (c2 == 3) {
            return new a("cubic(1, 1, 0, 0)");
        }
        "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(c);
        return b;
    }

    public double a(double d) {
        return d;
    }

    public double b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.a;
    }
}
