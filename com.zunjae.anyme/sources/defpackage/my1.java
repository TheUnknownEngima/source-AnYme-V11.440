package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: my1  reason: default package */
public class my1 implements j02 {
    @SerializedName("id")
    private final int a;

    public my1(int i) {
        this.a = i;
    }

    public String a() {
        return "" + this.a;
    }

    public int b() {
        return this.a;
    }
}
