package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k80  reason: default package */
public final class k80 extends m80 {
    public static final Parcelable.Creator<k80> CREATOR = new l80();
    private final int e;
    private final Uri f;
    private final int g;
    private final int h;

    k80(int i, Uri uri, int i2, int i3) {
        this.e = i;
        this.f = uri;
        this.g = i2;
        this.h = i3;
    }

    public k80(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public k80(JSONObject jSONObject) {
        this(k(jSONObject), jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    private static Uri k(JSONObject jSONObject) {
        if (jSONObject.has("url")) {
            try {
                return Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k80)) {
            k80 k80 = (k80) obj;
            return q.a(this.f, k80.f) && this.g == k80.g && this.h == k80.h;
        }
    }

    public final int getHeight() {
        return this.h;
    }

    public final int getWidth() {
        return this.g;
    }

    public final int hashCode() {
        return q.b(this.f, Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    public final Uri i() {
        return this.f;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f.toString());
            jSONObject.put("width", this.g);
            jSONObject.put("height", this.h);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.h), this.f.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.r(parcel, 2, i(), i, false);
        o80.l(parcel, 3, getWidth());
        o80.l(parcel, 4, getHeight());
        o80.b(parcel, a);
    }
}
