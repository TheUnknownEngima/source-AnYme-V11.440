package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class e {
    public static final e c = new e((Boolean) null, (Boolean) null);
    private final Boolean a;
    private final Boolean b;

    public e(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    private static int a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static e b(String str) {
        Boolean bool;
        Boolean bool2 = null;
        if (str != null) {
            Boolean c2 = str.length() >= 3 ? c(str.charAt(2)) : null;
            if (str.length() >= 4) {
                bool2 = c(str.charAt(3));
            }
            bool = bool2;
            bool2 = c2;
        } else {
            bool = null;
        }
        return new e(bool2, bool);
    }

    private static Boolean c(char c2) {
        if (c2 == '0') {
            return Boolean.FALSE;
        }
        if (c2 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static Boolean d(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue() ? bool2 : Boolean.FALSE;
        }
        if (bool2 == null || bool2.booleanValue()) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m(string2) != null) {
            return null;
        }
        return string2;
    }

    static boolean g(int i, int i2) {
        return i <= i2;
    }

    private static char i(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static e j(Bundle bundle) {
        return bundle == null ? c : new e(m(bundle.getString("ad_storage")), m(bundle.getString("analytics_storage")));
    }

    private static Boolean m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String e() {
        return "G1" + i(this.a) + i(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return a(this.a) == a(eVar.a) && a(this.b) == a(eVar.b);
    }

    public final boolean h(e eVar) {
        Boolean bool = this.a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && eVar.a != bool2) {
            return true;
        }
        Boolean bool3 = this.b;
        Boolean bool4 = Boolean.FALSE;
        return bool3 == bool4 && eVar.b != bool4;
    }

    public final int hashCode() {
        return ((a(this.a) + 527) * 31) + a(this.b);
    }

    public final e k(e eVar) {
        return new e(d(this.a, eVar.a), d(this.b, eVar.b));
    }

    public final Boolean l() {
        return this.a;
    }

    public final e n(e eVar) {
        Boolean bool = this.a;
        if (bool == null) {
            bool = eVar.a;
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            bool2 = eVar.b;
        }
        return new e(bool, bool2);
    }

    public final boolean o() {
        Boolean bool = this.a;
        return bool == null || bool.booleanValue();
    }

    public final Boolean p() {
        return this.b;
    }

    public final boolean q() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.a;
        String str = "granted";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool.booleanValue() ? str : "denied");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (!bool2.booleanValue()) {
                str = "denied";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
