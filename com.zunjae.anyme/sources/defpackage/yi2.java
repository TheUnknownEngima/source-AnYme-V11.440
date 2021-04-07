package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/* renamed from: yi2  reason: default package */
final class yi2<T> implements ei2<db2, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    yi2(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    /* renamed from: b */
    public T a(db2 db2) {
        JsonReader newJsonReader = this.a.newJsonReader(db2.a());
        try {
            T read = this.b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            db2.close();
        }
    }
}
