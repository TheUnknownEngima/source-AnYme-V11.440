package defpackage;

import java.io.IOException;

/* renamed from: yj1  reason: default package */
public class yj1 extends IOException {

    /* renamed from: yj1$a */
    public static class a extends yj1 {
        public a(String str) {
            super(str);
        }
    }

    public yj1(String str) {
        super(str);
    }

    static yj1 a() {
        return new yj1("Protocol message end-group tag did not match expected tag.");
    }

    static yj1 b() {
        return new yj1("Protocol message contained an invalid tag (zero).");
    }

    static yj1 c() {
        return new yj1("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static yj1 e() {
        return new yj1("CodedInputStream encountered a malformed varint.");
    }

    static yj1 f() {
        return new yj1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static yj1 g() {
        return new yj1("Failed to parse the message.");
    }

    static yj1 h() {
        return new yj1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static yj1 j() {
        return new yj1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static yj1 k() {
        return new yj1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public yj1 i(ok1 ok1) {
        return this;
    }
}
