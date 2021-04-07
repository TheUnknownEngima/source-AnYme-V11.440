package defpackage;

import defpackage.yx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: pt  reason: default package */
public final class pt {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public boolean c(yx yxVar) {
        for (int i = 0; i < yxVar.d(); i++) {
            yx.b c2 = yxVar.c(i);
            if (c2 instanceof sy) {
                sy syVar = (sy) c2;
                if ("iTunSMPB".equals(syVar.g) && b(syVar.h)) {
                    return true;
                }
            } else if (c2 instanceof wy) {
                wy wyVar = (wy) c2;
                if ("com.apple.iTunes".equals(wyVar.f) && "iTunSMPB".equals(wyVar.g) && b(wyVar.h)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.a = i2;
        this.b = i3;
        return true;
    }
}
