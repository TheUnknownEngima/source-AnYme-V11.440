package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends m80 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();
    private static e r = h.d();
    private final int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Uri j;
    private String k;
    private long l;
    private String m;
    private List<Scope> n;
    private String o;
    private String p;
    private Set<Scope> q = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = uri;
        this.k = str5;
        this.l = j2;
        this.m = str6;
        this.n = list;
        this.o = str7;
        this.p = str8;
    }

    private static GoogleSignInAccount D(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(r.c() / 1000) : l2).longValue();
        r.f(str7);
        r.j(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount z(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount D = D(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        D.k = jSONObject.optString("serverAuthCode", (String) null);
        return D;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.m.equals(this.m) && googleSignInAccount.u().equals(u());
    }

    public int hashCode() {
        return ((this.m.hashCode() + 527) * 31) + u().hashCode();
    }

    public Account i() {
        if (this.h == null) {
            return null;
        }
        return new Account(this.h, "com.google");
    }

    public String j() {
        return this.i;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.p;
    }

    public String m() {
        return this.o;
    }

    public String n() {
        return this.f;
    }

    public String o() {
        return this.g;
    }

    public Uri p() {
        return this.j;
    }

    public Set<Scope> u() {
        HashSet hashSet = new HashSet(this.n);
        hashSet.addAll(this.q);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.s(parcel, 2, n(), false);
        o80.s(parcel, 3, o(), false);
        o80.s(parcel, 4, k(), false);
        o80.s(parcel, 5, j(), false);
        o80.r(parcel, 6, p(), i2, false);
        o80.s(parcel, 7, y(), false);
        o80.o(parcel, 8, this.l);
        o80.s(parcel, 9, this.m, false);
        o80.w(parcel, 10, this.n, false);
        o80.s(parcel, 11, m(), false);
        o80.s(parcel, 12, l(), false);
        o80.b(parcel, a);
    }

    public String y() {
        return this.k;
    }
}
