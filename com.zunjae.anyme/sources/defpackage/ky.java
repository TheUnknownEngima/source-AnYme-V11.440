package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ky  reason: default package */
public final class ky implements ay {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder a = Charset.forName("UTF-8").newDecoder();
    private final CharsetDecoder b = Charset.forName("ISO-8859-1").newDecoder();

    private String b(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.a.decode(byteBuffer).toString();
            charsetDecoder = this.a;
        } catch (CharacterCodingException unused) {
            this.a.reset();
            byteBuffer.rewind();
            try {
                str = this.b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.b;
        } catch (Throwable th2) {
            this.a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }

    public yx a(cy cyVar) {
        ByteBuffer byteBuffer = cyVar.f;
        q40.e(byteBuffer);
        ByteBuffer byteBuffer2 = byteBuffer;
        String b2 = b(byteBuffer2);
        byte[] bArr = new byte[byteBuffer2.limit()];
        byteBuffer2.get(bArr);
        String str = null;
        if (b2 == null) {
            return new yx(new my(bArr, (String) null, (String) null));
        }
        Matcher matcher = c.matcher(b2);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String G0 = v50.G0(matcher.group(1));
            String group = matcher.group(2);
            char c2 = 65535;
            int hashCode = G0.hashCode();
            if (hashCode != -315603473) {
                if (hashCode == 1646559960 && G0.equals("streamtitle")) {
                    c2 = 0;
                }
            } else if (G0.equals("streamurl")) {
                c2 = 1;
            }
            if (c2 == 0) {
                str = group;
            } else if (c2 == 1) {
                str2 = group;
            }
        }
        return new yx(new my(bArr, str, str2));
    }
}
