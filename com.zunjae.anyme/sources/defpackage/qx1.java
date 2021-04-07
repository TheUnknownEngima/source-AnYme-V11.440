package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* renamed from: qx1  reason: default package */
public final class qx1 {
    @SerializedName("Adaptation")
    private ArrayList<px1> a;
    @SerializedName("Prequel")
    private ArrayList<px1> b;
    @SerializedName("Sequel")
    private ArrayList<px1> c;
    @SerializedName("Spin-off")
    private ArrayList<px1> d;
    @SerializedName("summary")
    private ArrayList<px1> e;

    public final ArrayList<px1> a() {
        return this.a;
    }

    public final ArrayList<px1> b() {
        return this.d;
    }

    public final ArrayList<px1> c() {
        return this.b;
    }

    public final ArrayList<px1> d() {
        return this.c;
    }
}
