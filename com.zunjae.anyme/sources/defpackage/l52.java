package defpackage;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: l52  reason: default package */
public final class l52 {
    public static final long a(Reader reader, Writer writer, int i) {
        v62.e(reader, "$this$copyTo");
        v62.e(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return a(reader, writer, i);
    }

    public static final String c(Reader reader) {
        v62.e(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        v62.d(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
