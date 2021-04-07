package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: sx1  reason: default package */
public final class sx1 {
    @SerializedName("mal_id")
    private int a;
    @SerializedName("title")
    private String b;
    @SerializedName("image_url")
    private String c;
    @SerializedName("type")
    private String d;
    @SerializedName("synopsis")
    private String e;
    @SerializedName("genres")
    private ArrayList<rx1> f;
    @SerializedName("score")
    private double g;
    @SerializedName("r18")
    private boolean h;
    @SerializedName("members")
    private int i;

    public final String a() {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList<rx1> arrayList2 = this.f;
            v62.c(arrayList2);
            Iterator<rx1> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            return n32.G(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null);
        } catch (Exception unused) {
            return "";
        }
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.i;
    }

    public final double e() {
        return this.g;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.d;
    }

    public final boolean i(List<ny1> list) {
        if (list == null) {
            return false;
        }
        for (ny1 next : list) {
            ArrayList<rx1> arrayList = this.f;
            v62.c(arrayList);
            Iterator<rx1> it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().b == next.a()) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean j() {
        return this.h;
    }
}
