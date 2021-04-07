package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.l;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o extends m80 {
    public static final Parcelable.Creator<o> CREATOR = new j1();
    private MediaInfo e;
    private int f;
    private boolean g;
    private double h;
    private double i;
    private double j;
    private long[] k;
    private String l;
    private JSONObject m;

    public static class a {
        private final o a;

        public a(MediaInfo mediaInfo) {
            this.a = new o(mediaInfo);
        }

        public a(JSONObject jSONObject) {
            this.a = new o(jSONObject);
        }

        public o a() {
            this.a.y();
            return this.a;
        }
    }

    private o(MediaInfo mediaInfo) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, Utils.DOUBLE_EPSILON, (long[]) null, (String) null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    o(MediaInfo mediaInfo, int i2, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.h = Double.NaN;
        this.e = mediaInfo;
        this.f = i2;
        this.g = z;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = jArr;
        this.l = str;
        if (str != null) {
            try {
                this.m = new JSONObject(this.l);
            } catch (JSONException unused) {
                this.m = null;
                this.l = null;
            }
        } else {
            this.m = null;
        }
    }

    public o(JSONObject jSONObject) {
        this((MediaInfo) null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, Utils.DOUBLE_EPSILON, (long[]) null, (String) null);
        i(jSONObject);
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if ((this.m == null) != (oVar.m == null)) {
            return false;
        }
        JSONObject jSONObject2 = this.m;
        return (jSONObject2 == null || (jSONObject = oVar.m) == null || l.a(jSONObject2, jSONObject)) && t60.f(this.e, oVar.e) && this.f == oVar.f && this.g == oVar.g && ((Double.isNaN(this.h) && Double.isNaN(oVar.h)) || this.h == oVar.h) && this.i == oVar.i && this.j == oVar.j && Arrays.equals(this.k, oVar.k);
    }

    public int hashCode() {
        return q.b(this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), Double.valueOf(this.h), Double.valueOf(this.i), Double.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), String.valueOf(this.m));
    }

    public boolean i(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.e = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f != (i2 = jSONObject.getInt("itemId"))) {
            this.f = i2;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.g != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.g = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.h) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.h) > 1.0E-7d)) {
            this.h = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.i) > 1.0E-7d) {
                this.i = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.j) > 1.0E-7d) {
                this.j = d2;
                z = true;
            }
        }
        long[] jArr = null;
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr2[i3] = jSONArray.getLong(i3);
            }
            long[] jArr3 = this.k;
            if (jArr3 != null && jArr3.length == length) {
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        jArr = jArr2;
                        break;
                    } else if (this.k[i4] != jArr2[i4]) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            jArr = jArr2;
            z3 = true;
        }
        if (z3) {
            this.k = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.m = jSONObject.getJSONObject("customData");
        return true;
    }

    public long[] j() {
        return this.k;
    }

    public boolean k() {
        return this.g;
    }

    public int l() {
        return this.f;
    }

    public MediaInfo m() {
        return this.e;
    }

    public double n() {
        return this.i;
    }

    public double o() {
        return this.j;
    }

    public double p() {
        return this.h;
    }

    public JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.e != null) {
                jSONObject.put("media", this.e.J());
            }
            if (this.f != 0) {
                jSONObject.put("itemId", this.f);
            }
            jSONObject.put("autoplay", this.g);
            if (!Double.isNaN(this.h)) {
                jSONObject.put("startTime", this.h);
            }
            if (this.i != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", this.i);
            }
            jSONObject.put("preloadTime", this.j);
            if (this.k != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : this.k) {
                    jSONArray.put(put);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            if (this.m != null) {
                jSONObject.put("customData", this.m);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int a2 = o80.a(parcel);
        o80.r(parcel, 2, m(), i2, false);
        o80.l(parcel, 3, l());
        o80.c(parcel, 4, k());
        o80.g(parcel, 5, p());
        o80.g(parcel, 6, n());
        o80.g(parcel, 7, o());
        o80.p(parcel, 8, j(), false);
        o80.s(parcel, 9, this.l, false);
        o80.b(parcel, a2);
    }

    /* access modifiers changed from: package-private */
    public final void y() {
        if (this.e == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(this.h) && this.h < Utils.DOUBLE_EPSILON) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.i)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.j) || this.j < Utils.DOUBLE_EPSILON) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }
}
