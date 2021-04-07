package defpackage;

import android.content.Context;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import java.util.HashMap;

/* renamed from: fu1  reason: default package */
public final class fu1 extends com.zunjae.anyme.features.settings.a {
    public static final a n0 = new a((r62) null);
    private final int k0 = C0285R$xml.settings_misc2;
    private final String l0 = "Misc";
    private HashMap m0;

    /* renamed from: fu1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final boolean a(Context context) {
            v62.e(context, "context");
            return l02.e(context.getString(C0283R$string.preference_key_update_on_downloader_mode), false);
        }
    }

    public void a2() {
        HashMap hashMap = this.m0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public int b2() {
        return this.k0;
    }

    public String c2() {
        return this.l0;
    }

    public void f2() {
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
