package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.g;
import androidx.core.app.h;
import androidx.media.R$id;
import androidx.media.R$integer;
import androidx.media.R$layout;

/* renamed from: a6  reason: default package */
public class a6 extends h.i {
    int[] e = null;
    MediaSessionCompat.Token f;
    boolean g;
    PendingIntent h;

    private RemoteViews o(h.a aVar) {
        boolean z = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), R$layout.notification_media_action);
        remoteViews.setImageViewResource(R$id.action0, aVar.e());
        if (!z) {
            remoteViews.setOnClickPendingIntent(R$id.action0, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(R$id.action0, aVar.j());
        }
        return remoteViews;
    }

    public void b(g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            Notification.Builder a = gVar.a();
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            l(mediaStyle);
            a.setStyle(mediaStyle);
        } else if (this.g) {
            gVar.a().setOngoing(true);
        }
    }

    public RemoteViews h(g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return m();
    }

    public RemoteViews i(g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return n();
    }

    /* access modifiers changed from: package-private */
    public Notification.MediaStyle l(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.e());
        }
        return mediaStyle;
    }

    /* access modifiers changed from: package-private */
    public RemoteViews m() {
        int min = Math.min(this.a.b.size(), 5);
        RemoteViews c = c(false, p(min), false);
        c.removeAllViews(R$id.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(R$id.media_actions, o(this.a.b.get(i)));
            }
        }
        if (this.g) {
            c.setViewVisibility(R$id.cancel_action, 0);
            c.setInt(R$id.cancel_action, "setAlpha", this.a.a.getResources().getInteger(R$integer.cancel_button_image_alpha));
            c.setOnClickPendingIntent(R$id.cancel_action, this.h);
        } else {
            c.setViewVisibility(R$id.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    public RemoteViews n() {
        RemoteViews c = c(false, q(), true);
        int size = this.a.b.size();
        int[] iArr = this.e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c.removeAllViews(R$id.media_actions);
        if (min > 0) {
            int i = 0;
            while (i < min) {
                if (i < size) {
                    c.addView(R$id.media_actions, o(this.a.b.get(this.e[i])));
                    i++;
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                }
            }
        }
        if (this.g) {
            c.setViewVisibility(R$id.end_padder, 8);
            c.setViewVisibility(R$id.cancel_action, 0);
            c.setOnClickPendingIntent(R$id.cancel_action, this.h);
            c.setInt(R$id.cancel_action, "setAlpha", this.a.a.getResources().getInteger(R$integer.cancel_button_image_alpha));
        } else {
            c.setViewVisibility(R$id.end_padder, 0);
            c.setViewVisibility(R$id.cancel_action, 8);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    public int p(int i) {
        return i <= 3 ? R$layout.notification_template_big_media_narrow : R$layout.notification_template_big_media;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return R$layout.notification_template_media;
    }

    public a6 r(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public a6 s(int... iArr) {
        this.e = iArr;
        return this;
    }
}
