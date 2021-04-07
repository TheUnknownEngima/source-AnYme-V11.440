package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.m;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends m80 {
    public static final Parcelable.Creator<n> CREATOR = new h1();
    private String e;
    private String f;
    private int g;
    private String h;
    private m i;
    private int j;
    private List<o> k;
    private int l;
    private long m;

    public static class a {
        private final n a = new n();

        public n a() {
            return new n();
        }

        public final a b(JSONObject jSONObject) {
            this.a.i(jSONObject);
            return this;
        }
    }

    private n() {
        clear();
    }

    private n(n nVar) {
        this.e = nVar.e;
        this.f = nVar.f;
        this.g = nVar.g;
        this.h = nVar.h;
        this.i = nVar.i;
        this.j = nVar.j;
        this.k = nVar.k;
        this.l = nVar.l;
        this.m = nVar.m;
    }

    n(String str, String str2, int i2, String str3, m mVar, int i3, List<o> list, int i4, long j2) {
        this.e = str;
        this.f = str2;
        this.g = i2;
        this.h = str3;
        this.i = mVar;
        this.j = i3;
        this.k = list;
        this.l = i4;
        this.m = j2;
    }

    private final void clear() {
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = null;
        this.j = 0;
        this.k = null;
        this.l = 0;
        this.m = -1;
    }

    /* access modifiers changed from: private */
    public final void i(JSONObject jSONObject) {
        clear();
        if (jSONObject != null) {
            this.e = jSONObject.optString("id", (String) null);
            this.f = jSONObject.optString("entity", (String) null);
            String optString = jSONObject.optString("queueType");
            char c = 65535;
            switch (optString.hashCode()) {
                case -1803151310:
                    if (optString.equals("PODCAST_SERIES")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1758903120:
                    if (optString.equals("RADIO_STATION")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1632865838:
                    if (optString.equals("PLAYLIST")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1319760993:
                    if (optString.equals("AUDIOBOOK")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1088524588:
                    if (optString.equals("TV_SERIES")) {
                        c = 5;
                        break;
                    }
                    break;
                case 62359119:
                    if (optString.equals("ALBUM")) {
                        c = 0;
                        break;
                    }
                    break;
                case 73549584:
                    if (optString.equals("MOVIE")) {
                        c = 8;
                        break;
                    }
                    break;
                case 393100598:
                    if (optString.equals("VIDEO_PLAYLIST")) {
                        c = 6;
                        break;
                    }
                    break;
                case 902303413:
                    if (optString.equals("LIVE_TV")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.g = 1;
                    break;
                case 1:
                    this.g = 2;
                    break;
                case 2:
                    this.g = 3;
                    break;
                case 3:
                    this.g = 4;
                    break;
                case 4:
                    this.g = 5;
                    break;
                case 5:
                    this.g = 6;
                    break;
                case 6:
                    this.g = 7;
                    break;
                case 7:
                    this.g = 8;
                    break;
                case 8:
                    this.g = 9;
                    break;
            }
            this.h = jSONObject.optString("name", (String) null);
            if (jSONObject.has("containerMetadata")) {
                m.a aVar = new m.a();
                aVar.b(jSONObject.optJSONObject("containerMetadata"));
                this.i = aVar.a();
            }
            Integer a2 = v60.a(jSONObject.optString("repeatMode"));
            if (a2 != null) {
                this.j = a2.intValue();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                this.k = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        try {
                            this.k.add(new o(optJSONObject));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            this.l = jSONObject.optInt("startIndex", this.l);
            if (jSONObject.has("startTime")) {
                this.m = t60.c(jSONObject.optDouble("startTime", (double) this.m));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return TextUtils.equals(this.e, nVar.e) && TextUtils.equals(this.f, nVar.f) && this.g == nVar.g && TextUtils.equals(this.h, nVar.h) && q.a(this.i, nVar.i) && this.j == nVar.j && q.a(this.k, nVar.k) && this.l == nVar.l && this.m == nVar.m;
    }

    public int hashCode() {
        return q.b(this.e, this.f, Integer.valueOf(this.g), this.h, this.i, Integer.valueOf(this.j), this.k, Integer.valueOf(this.l), Long.valueOf(this.m));
    }

    public m j() {
        return this.i;
    }

    public String k() {
        return this.f;
    }

    public List<o> l() {
        List<o> list = this.k;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String m() {
        return this.h;
    }

    public String n() {
        return this.e;
    }

    public int o() {
        return this.g;
    }

    public int p() {
        return this.j;
    }

    public int u() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = o80.a(parcel);
        o80.s(parcel, 2, n(), false);
        o80.s(parcel, 3, k(), false);
        o80.l(parcel, 4, o());
        o80.s(parcel, 5, m(), false);
        o80.r(parcel, 6, j(), i2, false);
        o80.l(parcel, 7, p());
        o80.w(parcel, 8, l(), false);
        o80.l(parcel, 9, u());
        o80.o(parcel, 10, y());
        o80.b(parcel, a2);
    }

    public long y() {
        return this.m;
    }
}
