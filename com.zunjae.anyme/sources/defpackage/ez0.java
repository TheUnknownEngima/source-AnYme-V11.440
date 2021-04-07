package defpackage;

import java.io.IOException;

/* renamed from: ez0  reason: default package */
public class ez0 extends IOException {
    public ez0(String str) {
        super(str);
    }

    static ez0 a() {
        return new ez0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static ez0 b() {
        return new ez0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static ez0 c() {
        return new ez0("Protocol message contained an invalid tag (zero).");
    }

    static dz0 d() {
        return new dz0("Protocol message tag had invalid wire type.");
    }

    static ez0 e() {
        return new ez0("Failed to parse the message.");
    }

    static ez0 f() {
        return new ez0("Protocol message had invalid UTF-8.");
    }
}
