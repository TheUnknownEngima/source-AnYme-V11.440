package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: kd  reason: default package */
public class kd {
    public ba a(ca caVar) {
        return new ba(caVar);
    }

    public ca b() {
        return new ca();
    }

    public da c(ea eaVar) {
        return new da(eaVar);
    }

    public fa d(ga gaVar) {
        return new fa(gaVar);
    }

    public ua e(Context context, hd hdVar, SharedPreferences sharedPreferences) {
        return new fd(context, hdVar, sharedPreferences);
    }

    public ab<String> f(Context context) {
        return new bb(context);
    }

    public ac g(Context context, ea eaVar, da daVar, ga gaVar, fa faVar, ca caVar, ba baVar) {
        return new jd(context, gaVar, faVar, eaVar, daVar, caVar, baVar);
    }

    public id h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "https://dashboard.bugfender.com";
        }
        return new id(str, str2);
    }

    public ea i() {
        return new ea();
    }

    public hd j(Context context) {
        return new hd(context);
    }

    public xa k(Context context) {
        return new ed(context);
    }

    public cd l() {
        return new dd();
    }

    public SharedPreferences m(Context context) {
        return context.getSharedPreferences("bugfender.preferences", 0);
    }

    public ga n() {
        return new ga();
    }
}
