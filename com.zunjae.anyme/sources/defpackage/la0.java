package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;
import java.util.Iterator;
import java.util.List;

/* renamed from: la0  reason: default package */
public final class la0 extends g60 {
    private final View b;
    private final String c;
    private final String d;

    public la0(View view, Context context) {
        this.b = view;
        this.c = context.getString(R$string.cast_closed_captions);
        this.d = context.getString(R$string.cast_closed_captions_unavailable);
        this.b.setEnabled(false);
    }

    private final void g() {
        View view;
        String str;
        boolean z;
        List<MediaTrack> o;
        i b2 = b();
        if (b2 != null && b2.o()) {
            MediaInfo j = b2.j();
            if (j != null && (o = j.o()) != null && !o.isEmpty()) {
                Iterator<MediaTrack> it = o.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaTrack next = it.next();
                    if (next.p() == 2) {
                        i++;
                        if (i > 1) {
                            break;
                        }
                    } else if (next.p() == 1) {
                        break;
                    }
                }
                z = true;
                if (z && !b2.u()) {
                    this.b.setEnabled(true);
                    view = this.b;
                    str = this.c;
                    view.setContentDescription(str);
                }
            }
            z = false;
            this.b.setEnabled(true);
            view = this.b;
            str = this.c;
            view.setContentDescription(str);
        }
        this.b.setEnabled(false);
        view = this.b;
        str = this.d;
        view.setContentDescription(str);
    }

    public final void c() {
        g();
    }

    public final void d() {
        this.b.setEnabled(false);
    }

    public final void e(c cVar) {
        super.e(cVar);
        this.b.setEnabled(true);
        g();
    }

    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
