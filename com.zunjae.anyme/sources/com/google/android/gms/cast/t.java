package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

public final class t extends m80 {
    public static final Parcelable.Creator<t> CREATOR = new r1();
    private static final u60 h = new u60("VideoInfo");
    private int e;
    private int f;
    private int g;

    t(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    static t j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            char c = 65535;
            int hashCode = string.hashCode();
            int i = 3;
            if (hashCode != 3218) {
                if (hashCode != 103158) {
                    if (hashCode != 113729) {
                        if (hashCode == 99136405) {
                            if (string.equals("hdr10")) {
                                c = 1;
                            }
                        }
                    } else if (string.equals("sdr")) {
                        c = 3;
                    }
                } else if (string.equals("hdr")) {
                    c = 2;
                }
            } else if (string.equals("dv")) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    i = 2;
                } else if (c == 2) {
                    i = 4;
                } else if (c != 3) {
                    h.a("Unknown HDR type: %s", string);
                    i = 0;
                } else {
                    i = 1;
                }
            }
            return new t(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e2) {
            h.a("Error while creating a VideoInfo instance from JSON: %s", e2.getMessage());
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f == tVar.getHeight() && this.e == tVar.getWidth() && this.g == tVar.i();
    }

    public final int getHeight() {
        return this.f;
    }

    public final int getWidth() {
        return this.e;
    }

    public final int hashCode() {
        return q.b(Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(this.g));
    }

    public final int i() {
        return this.g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 2, getWidth());
        o80.l(parcel, 3, getHeight());
        o80.l(parcel, 4, i());
        o80.b(parcel, a);
    }
}
