package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gf2  reason: default package */
public final class gf2 {
    private static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:\"|')?([^\\s,;\"']*)");
    private static final char[] b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[60000];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static String b(ByteBuffer byteBuffer, String str) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        if ((bArr[0] == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (bArr[0] == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return "UTF-32";
        }
        if ((bArr[0] == -2 && bArr[1] == -1) || (bArr[0] == -1 && bArr[1] == -2)) {
            return "UTF-16";
        }
        if (bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) {
            return str;
        }
        byteBuffer.position(3);
        return "UTF-8";
    }

    static ByteBuffer c() {
        return ByteBuffer.allocate(0);
    }

    static String d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            return h(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    static String e() {
        StringBuilder sb = new StringBuilder(32);
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = b;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static org.jsoup.nodes.f f(java.nio.ByteBuffer r8, java.lang.String r9, java.lang.String r10, defpackage.qf2 r11) {
        /*
            java.lang.String r9 = b(r8, r9)
            r0 = 0
            if (r9 != 0) goto L_0x0090
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)
            java.nio.CharBuffer r2 = r2.decode(r8)
            java.lang.String r2 = r2.toString()
            org.jsoup.nodes.f r3 = r11.d(r2, r10)
            java.lang.String r4 = "meta[http-equiv=content-type], meta[charset]"
            ag2 r4 = r3.z0(r4)
            org.jsoup.nodes.h r4 = r4.g()
            if (r4 == 0) goto L_0x0048
            java.lang.String r5 = "http-equiv"
            boolean r5 = r4.u(r5)
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = "content"
            java.lang.String r5 = r4.d(r5)
            java.lang.String r5 = d(r5)
            goto L_0x0039
        L_0x0038:
            r5 = r0
        L_0x0039:
            if (r5 != 0) goto L_0x0049
            java.lang.String r6 = "charset"
            boolean r7 = r4.u(r6)
            if (r7 == 0) goto L_0x0049
            java.lang.String r5 = r4.d(r6)
            goto L_0x0049
        L_0x0048:
            r5 = r0
        L_0x0049:
            if (r5 != 0) goto L_0x0072
            int r4 = r3.o()
            if (r4 <= 0) goto L_0x0072
            r4 = 0
            org.jsoup.nodes.k r6 = r3.n(r4)
            boolean r6 = r6 instanceof org.jsoup.nodes.m
            if (r6 == 0) goto L_0x0072
            org.jsoup.nodes.k r4 = r3.n(r4)
            org.jsoup.nodes.m r4 = (org.jsoup.nodes.m) r4
            java.lang.String r6 = r4.X()
            java.lang.String r7 = "xml"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0072
            java.lang.String r5 = "encoding"
            java.lang.String r5 = r4.d(r5)
        L_0x0072:
            java.lang.String r4 = h(r5)
            if (r4 == 0) goto L_0x008e
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x008e
            java.lang.String r9 = r4.trim()
            java.lang.String r1 = "[\"']"
            java.lang.String r2 = ""
            java.lang.String r9 = r9.replaceAll(r1, r2)
            r8.rewind()
            goto L_0x0095
        L_0x008e:
            r0 = r3
            goto L_0x00a1
        L_0x0090:
            java.lang.String r1 = "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML"
            defpackage.jf2.i(r9, r1)
        L_0x0095:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r9)
            java.nio.CharBuffer r8 = r1.decode(r8)
            java.lang.String r2 = r8.toString()
        L_0x00a1:
            if (r0 != 0) goto L_0x00ae
            org.jsoup.nodes.f r0 = r11.d(r2, r10)
            org.jsoup.nodes.f$a r8 = r0.I0()
            r8.c(r9)
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.f(java.nio.ByteBuffer, java.lang.String, java.lang.String, qf2):org.jsoup.nodes.f");
    }

    public static ByteBuffer g(InputStream inputStream, int i) {
        int read;
        boolean z = true;
        jf2.e(i >= 0, "maxSize must be 0 (unlimited) or larger");
        if (i <= 0) {
            z = false;
        }
        int i2 = 60000;
        byte[] bArr = new byte[((!z || i >= 60000) ? 60000 : i)];
        if (z) {
            i2 = i;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (true) {
            if (Thread.interrupted() || (read = inputStream.read(bArr)) == -1) {
                break;
            }
            if (z) {
                if (read > i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    private static String h(String str) {
        if (!(str == null || str.length() == 0)) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
