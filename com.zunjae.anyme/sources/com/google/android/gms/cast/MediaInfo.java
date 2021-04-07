package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaInfo extends m80 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new b1();
    private String e;
    private int f;
    private String g;
    private l h;
    private long i;
    private List<MediaTrack> j;
    private r k;
    private String l;
    /* access modifiers changed from: private */
    public List<b> m;
    private List<a> n;
    private String o;
    private s p;
    private long q;
    private String r;
    private String s;
    private JSONObject t;
    private final a u;

    public class a {
        public a() {
        }

        public void a(List<b> list) {
            List unused = MediaInfo.this.m = list;
        }
    }

    MediaInfo(String str, int i2, String str2, l lVar, long j2, List<MediaTrack> list, r rVar, String str3, List<b> list2, List<a> list3, String str4, s sVar, long j3, String str5, String str6) {
        String str7 = str3;
        this.u = new a();
        this.e = str;
        this.f = i2;
        this.g = str2;
        this.h = lVar;
        this.i = j2;
        this.j = list;
        this.k = rVar;
        this.l = str7;
        if (str7 != null) {
            try {
                this.t = new JSONObject(this.l);
            } catch (JSONException unused) {
                this.t = null;
                this.l = null;
            }
        } else {
            this.t = null;
        }
        this.m = list2;
        this.n = list3;
        this.o = str4;
        this.p = sVar;
        this.q = j3;
        this.r = str5;
        this.s = str6;
    }

    MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, (String) null, (l) null, -1, (List<MediaTrack>) null, (r) null, (String) null, (List<b>) null, (List<a>) null, (String) null, (s) null, -1, (String) null, (String) null);
        MediaInfo mediaInfo;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f = 0;
        } else {
            mediaInfo = this;
            mediaInfo.f = "BUFFERED".equals(optString) ? 1 : "LIVE".equals(optString) ? 2 : -1;
        }
        mediaInfo.g = jSONObject2.optString("contentType", (String) null);
        if (jSONObject2.has("metadata")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("metadata");
            l lVar = new l(jSONObject3.getInt("metadataType"));
            mediaInfo.h = lVar;
            lVar.j(jSONObject3);
        }
        mediaInfo.i = -1;
        if (jSONObject2.has("duration") && !jSONObject2.isNull("duration")) {
            double optDouble = jSONObject2.optDouble("duration", Utils.DOUBLE_EPSILON);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.i = t60.c(optDouble);
            }
        }
        if (jSONObject2.has("tracks")) {
            mediaInfo.j = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray("tracks");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                mediaInfo.j.add(MediaTrack.y(jSONArray.getJSONObject(i2)));
            }
        } else {
            mediaInfo.j = null;
        }
        if (jSONObject2.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("textTrackStyle");
            r rVar = new r();
            rVar.i(jSONObject4);
            mediaInfo.k = rVar;
        } else {
            mediaInfo.k = null;
        }
        N(jSONObject);
        mediaInfo.t = jSONObject2.optJSONObject("customData");
        mediaInfo.o = jSONObject2.optString("entity", (String) null);
        mediaInfo.r = jSONObject2.optString("atvEntity", (String) null);
        mediaInfo.p = s.i(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (jSONObject2.has("startAbsoluteTime") && !jSONObject2.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject2.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= Utils.DOUBLE_EPSILON) {
                mediaInfo.q = t60.c(optDouble2);
            }
        }
        if (jSONObject2.has("contentUrl")) {
            mediaInfo.s = jSONObject2.optString("contentUrl");
        }
    }

    public r D() {
        return this.k;
    }

    public s E() {
        return this.p;
    }

    public a F() {
        return this.u;
    }

    public final JSONObject J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.e);
            jSONObject.putOpt("contentUrl", this.s);
            int i2 = this.f;
            jSONObject.put("streamType", i2 != 1 ? i2 != 2 ? "NONE" : "LIVE" : "BUFFERED");
            if (this.g != null) {
                jSONObject.put("contentType", this.g);
            }
            if (this.h != null) {
                jSONObject.put("metadata", this.h.u());
            }
            if (this.i <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", t60.b(this.i));
            }
            if (this.j != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack u2 : this.j) {
                    jSONArray.put(u2.u());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.k != null) {
                jSONObject.put("textTrackStyle", this.k.E());
            }
            if (this.t != null) {
                jSONObject.put("customData", this.t);
            }
            if (this.o != null) {
                jSONObject.put("entity", this.o);
            }
            if (this.m != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (b o2 : this.m) {
                    jSONArray2.put(o2.o());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.n != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (a D : this.n) {
                    jSONArray3.put(D.D());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            if (this.p != null) {
                jSONObject.put("vmapAdsRequest", this.p.l());
            }
            if (this.q != -1) {
                jSONObject.put("startAbsoluteTime", t60.b(this.q));
            }
            jSONObject.putOpt("atvEntity", this.r);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final void N(JSONObject jSONObject) {
        int i2 = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            this.m = new ArrayList(jSONArray.length());
            int i3 = 0;
            while (true) {
                if (i3 < jSONArray.length()) {
                    b p2 = b.p(jSONArray.getJSONObject(i3));
                    if (p2 == null) {
                        this.m.clear();
                        break;
                    } else {
                        this.m.add(p2);
                        i3++;
                    }
                } else {
                    break;
                }
            }
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            this.n = new ArrayList(jSONArray2.length());
            while (i2 < jSONArray2.length()) {
                a E = a.E(jSONArray2.getJSONObject(i2));
                if (E != null) {
                    this.n.add(E);
                    i2++;
                } else {
                    this.n.clear();
                    return;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.t == null) != (mediaInfo.t == null)) {
            return false;
        }
        JSONObject jSONObject2 = this.t;
        return (jSONObject2 == null || (jSONObject = mediaInfo.t) == null || l.a(jSONObject2, jSONObject)) && t60.f(this.e, mediaInfo.e) && this.f == mediaInfo.f && t60.f(this.g, mediaInfo.g) && t60.f(this.h, mediaInfo.h) && this.i == mediaInfo.i && t60.f(this.j, mediaInfo.j) && t60.f(this.k, mediaInfo.k) && t60.f(this.m, mediaInfo.m) && t60.f(this.n, mediaInfo.n) && t60.f(this.o, mediaInfo.o) && t60.f(this.p, mediaInfo.p) && this.q == mediaInfo.q && t60.f(this.r, mediaInfo.r) && t60.f(this.s, mediaInfo.s);
    }

    public int hashCode() {
        return q.b(this.e, Integer.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), String.valueOf(this.t), this.j, this.k, this.m, this.n, this.o, this.p, Long.valueOf(this.q), this.r);
    }

    public List<a> i() {
        List<a> list = this.n;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<b> j() {
        List<b> list = this.m;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String k() {
        return this.e;
    }

    public String l() {
        return this.g;
    }

    public String m() {
        return this.s;
    }

    public String n() {
        return this.o;
    }

    public List<MediaTrack> o() {
        return this.j;
    }

    public l p() {
        return this.h;
    }

    public long u() {
        return this.q;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.t;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int a2 = o80.a(parcel);
        o80.s(parcel, 2, k(), false);
        o80.l(parcel, 3, z());
        o80.s(parcel, 4, l(), false);
        o80.r(parcel, 5, p(), i2, false);
        o80.o(parcel, 6, y());
        o80.w(parcel, 7, o(), false);
        o80.r(parcel, 8, D(), i2, false);
        o80.s(parcel, 9, this.l, false);
        o80.w(parcel, 10, j(), false);
        o80.w(parcel, 11, i(), false);
        o80.s(parcel, 12, n(), false);
        o80.r(parcel, 13, E(), i2, false);
        o80.o(parcel, 14, u());
        o80.s(parcel, 15, this.r, false);
        o80.s(parcel, 16, m(), false);
        o80.b(parcel, a2);
    }

    public long y() {
        return this.i;
    }

    public int z() {
        return this.f;
    }
}
