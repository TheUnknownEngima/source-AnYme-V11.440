package com.zunjae.anyme;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;

public final class a {
    public static d a(Activity activity) {
        return (d) c.u(activity);
    }

    public static d b(Context context) {
        return (d) c.v(context);
    }

    public static d c(Fragment fragment) {
        return (d) c.w(fragment);
    }

    public static d d(FragmentActivity fragmentActivity) {
        return (d) c.x(fragmentActivity);
    }
}
