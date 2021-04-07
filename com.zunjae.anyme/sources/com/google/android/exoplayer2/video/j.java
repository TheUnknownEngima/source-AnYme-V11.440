package com.google.android.exoplayer2.video;

public final class j {
    public final String a;

    private j(int i, int i2, String str) {
        this.a = str;
    }

    public static j a(i50 i50) {
        String str;
        i50.N(2);
        int z = i50.z();
        int i = z >> 1;
        int z2 = ((i50.z() >> 3) & 31) | ((z & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(".0");
        sb.append(z2);
        return new j(i, z2, sb.toString());
    }
}
