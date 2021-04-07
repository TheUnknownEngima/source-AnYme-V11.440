package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class m extends m80 {
    public static final Parcelable.Creator<m> CREATOR = new f1();
    private int e;
    private String f;
    private List<l> g;
    private List<k80> h;
    private double i;

    public static class a {
        private final m a = new m();

        public m a() {
            return new m();
        }

        public final a b(JSONObject jSONObject) {
            this.a.i(jSONObject);
            return this;
        }
    }

    private m() {
        clear();
    }

    m(int i2, String str, List<l> list, List<k80> list2, double d) {
        this.e = i2;
        this.f = str;
        this.g = list;
        this.h = list2;
        this.i = d;
    }

    private m(m mVar) {
        this.e = mVar.e;
        this.f = mVar.f;
        this.g = mVar.g;
        this.h = mVar.h;
        this.i = mVar.i;
    }

    private final void clear() {
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = Utils.DOUBLE_EPSILON;
    }

    /* access modifiers changed from: private */
    public final void i(JSONObject jSONObject) {
        clear();
        if (jSONObject != null) {
            String optString = jSONObject.optString("containerType", "");
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != 6924225) {
                if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                    c = 0;
                }
            } else if (optString.equals("AUDIOBOOK_CONTAINER")) {
                c = 1;
            }
            if (c == 0) {
                this.e = 0;
            } else if (c == 1) {
                this.e = 1;
            }
            this.f = jSONObject.optString("title", (String) null);
            JSONArray optJSONArray = jSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                this.g = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        l lVar = new l();
                        lVar.j(optJSONObject);
                        this.g.add(lVar);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                ArrayList arrayList = new ArrayList();
                this.h = arrayList;
                w60.a(arrayList, optJSONArray2);
            }
            this.i = jSONObject.optDouble("containerDuration", this.i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.e == mVar.e && TextUtils.equals(this.f, mVar.f) && q.a(this.g, mVar.g) && q.a(this.h, mVar.h) && this.i == mVar.i;
    }

    public int hashCode() {
        return q.b(Integer.valueOf(this.e), this.f, this.g, this.h, Double.valueOf(this.i));
    }

    public double j() {
        return this.i;
    }

    public List<k80> k() {
        List<k80> list = this.h;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int l() {
        return this.e;
    }

    public List<l> m() {
        List<l> list = this.g;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String n() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = o80.a(parcel);
        o80.l(parcel, 2, l());
        o80.s(parcel, 3, n(), false);
        o80.w(parcel, 4, m(), false);
        o80.w(parcel, 5, k(), false);
        o80.g(parcel, 6, j());
        o80.b(parcel, a2);
    }
}
