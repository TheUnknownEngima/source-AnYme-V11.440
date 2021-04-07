package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

public final class b extends m80 {
    public static final Parcelable.Creator<b> CREATOR = new l();
    public static final b i = new b(0);
    private final int e;
    private final int f;
    private final PendingIntent g;
    private final String h;

    public b(int i2) {
        this(i2, (PendingIntent) null, (String) null);
    }

    b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.e = i2;
        this.f = i3;
        this.g = pendingIntent;
        this.h = str;
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, (String) null);
    }

    public b(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    static String n(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f == bVar.f && q.a(this.g, bVar.g) && q.a(this.h, bVar.h);
    }

    public final int hashCode() {
        return q.b(Integer.valueOf(this.f), this.g, this.h);
    }

    public final int i() {
        return this.f;
    }

    public final String j() {
        return this.h;
    }

    public final PendingIntent k() {
        return this.g;
    }

    public final boolean l() {
        return (this.f == 0 || this.g == null) ? false : true;
    }

    public final boolean m() {
        return this.f == 0;
    }

    public final String toString() {
        q.a c = q.c(this);
        c.a("statusCode", n(this.f));
        c.a("resolution", this.g);
        c.a("message", this.h);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.l(parcel, 2, i());
        o80.r(parcel, 3, k(), i2, false);
        o80.s(parcel, 4, j(), false);
        o80.b(parcel, a);
    }
}
