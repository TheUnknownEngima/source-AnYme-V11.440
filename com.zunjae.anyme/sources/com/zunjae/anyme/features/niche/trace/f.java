package com.zunjae.anyme.features.niche.trace;

import com.google.gson.annotations.SerializedName;

public final class f {
    @SerializedName("image")
    private final String a;

    public f(String str) {
        v62.e(str, "image");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && v62.a(this.a, ((f) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "UploadPayload(image=" + this.a + ")";
    }
}
