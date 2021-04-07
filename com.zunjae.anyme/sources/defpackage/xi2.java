package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: xi2  reason: default package */
final class xi2<T> implements ei2<T, bb2> {
    private static final va2 c = va2.c("application/json; charset=UTF-8");
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson a;
    private final TypeAdapter<T> b;

    xi2(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    /* renamed from: b */
    public bb2 a(T t) {
        nd2 nd2 = new nd2();
        JsonWriter newJsonWriter = this.a.newJsonWriter(new OutputStreamWriter(nd2.K(), d));
        this.b.write(newJsonWriter, t);
        newJsonWriter.close();
        return bb2.e(c, nd2.V());
    }
}
