package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: mx1  reason: default package */
public class mx1 {
    @SerializedName("url")
    public String a;
    @SerializedName("name")
    public String b;

    public int a() {
        try {
            return Integer.parseInt(this.a.split("/")[5]);
        } catch (Exception unused) {
            return -1;
        }
    }
}
