package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.f0;
import java.util.Locale;

public class e implements h {
    private final Resources a;

    public e(Resources resources) {
        q40.e(resources);
        this.a = resources;
    }

    private String b(f0 f0Var) {
        Resources resources;
        int i;
        int i2 = f0Var.z;
        if (i2 == -1 || i2 < 1) {
            return "";
        }
        if (i2 == 1) {
            resources = this.a;
            i = R$string.exo_track_mono;
        } else if (i2 == 2) {
            resources = this.a;
            i = R$string.exo_track_stereo;
        } else if (i2 == 6 || i2 == 7) {
            resources = this.a;
            i = R$string.exo_track_surround_5_point_1;
        } else if (i2 != 8) {
            resources = this.a;
            i = R$string.exo_track_surround;
        } else {
            resources = this.a;
            i = R$string.exo_track_surround_7_point_1;
        }
        return resources.getString(i);
    }

    private String c(f0 f0Var) {
        int i = f0Var.i;
        if (i == -1) {
            return "";
        }
        return this.a.getString(R$string.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    private String d(f0 f0Var) {
        return TextUtils.isEmpty(f0Var.f) ? "" : f0Var.f;
    }

    private String e(f0 f0Var) {
        String j = j(f(f0Var), h(f0Var));
        return TextUtils.isEmpty(j) ? d(f0Var) : j;
    }

    private String f(f0 f0Var) {
        String str = f0Var.E;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (v50.a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    private String g(f0 f0Var) {
        int i = f0Var.r;
        int i2 = f0Var.s;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.a.getString(R$string.exo_track_resolution, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    private String h(f0 f0Var) {
        String string = (f0Var.h & 2) != 0 ? this.a.getString(R$string.exo_track_role_alternate) : "";
        if ((f0Var.h & 4) != 0) {
            string = j(string, this.a.getString(R$string.exo_track_role_supplementary));
        }
        if ((f0Var.h & 8) != 0) {
            string = j(string, this.a.getString(R$string.exo_track_role_commentary));
        }
        if ((f0Var.h & 1088) == 0) {
            return string;
        }
        return j(string, this.a.getString(R$string.exo_track_role_closed_captions));
    }

    private static int i(f0 f0Var) {
        int h = e50.h(f0Var.m);
        if (h != -1) {
            return h;
        }
        if (e50.k(f0Var.j) != null) {
            return 2;
        }
        if (e50.b(f0Var.j) != null) {
            return 1;
        }
        if (f0Var.r == -1 && f0Var.s == -1) {
            return (f0Var.z == -1 && f0Var.A == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.a.getString(R$string.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }

    public String a(f0 f0Var) {
        int i = i(f0Var);
        String j = i == 2 ? j(h(f0Var), g(f0Var), c(f0Var)) : i == 1 ? j(e(f0Var), b(f0Var), c(f0Var)) : e(f0Var);
        return j.length() == 0 ? this.a.getString(R$string.exo_track_unknown) : j;
    }
}
