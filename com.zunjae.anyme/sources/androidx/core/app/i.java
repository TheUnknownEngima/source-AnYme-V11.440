package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.h;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class i implements g {
    private final Notification.Builder a;
    private final h.e b;
    private RemoteViews c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    i(h.e eVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.b = eVar;
        this.a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(eVar.a, eVar.J) : new Notification.Builder(eVar.a);
        Notification notification = eVar.Q;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.d).setContentText(eVar.e).setContentInfo(eVar.j).setContentIntent(eVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.g, (notification.flags & 128) != 0).setLargeIcon(eVar.i).setNumber(eVar.k).setProgress(eVar.s, eVar.t, eVar.u);
        if (Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSubText(eVar.q).setUsesChronometer(eVar.n).setPriority(eVar.l);
            Iterator<h.a> it = eVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = eVar.C;
            if (bundle2 != null) {
                this.f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.y) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.v;
                if (str2 != null) {
                    this.f.putString("android.support.groupKey", str2);
                    if (eVar.w) {
                        bundle = this.f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.x;
                if (str3 != null) {
                    this.f.putString("android.support.sortKey", str3);
                }
            }
            this.c = eVar.G;
            this.d = eVar.H;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setShowWhen(eVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = eVar.R) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = eVar.R;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(eVar.y).setGroup(eVar.v).setGroupSummary(eVar.w).setSortKey(eVar.x);
            this.g = eVar.N;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(eVar.B).setColor(eVar.D).setVisibility(eVar.E).setPublicVersion(eVar.F).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = eVar.R.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next());
            }
            this.h = eVar.I;
            if (eVar.c.size() > 0) {
                Bundle bundle4 = eVar.g().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < eVar.c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), j.b(eVar.c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.g().putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(eVar.C).setRemoteInputHistory(eVar.r);
            RemoteViews remoteViews = eVar.G;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.H;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.I;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(eVar.K).setShortcutId(eVar.L).setTimeoutAfter(eVar.M).setGroupAlertBehavior(eVar.N);
            if (eVar.A) {
                this.a.setColorized(eVar.z);
            }
            if (!TextUtils.isEmpty(eVar.J)) {
                this.a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(eVar.O);
            this.a.setBubbleMetadata(h.d.h(eVar.P));
        }
    }

    private void b(h.a aVar) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if (i >= 23) {
                IconCompat f2 = aVar.f();
                builder = new Notification.Action.Builder(f2 == null ? null : f2.s(), aVar.j(), aVar.a());
            } else {
                builder = new Notification.Action.Builder(aVar.e(), aVar.j(), aVar.a());
            }
            if (aVar.g() != null) {
                for (RemoteInput addRemoteInput : l.b(aVar.g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.h());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.h());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
        } else if (i >= 16) {
            this.e.add(j.f(this.a, aVar));
        }
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    public Notification.Builder a() {
        return this.a;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews j;
        RemoteViews h2;
        h.i iVar = this.b.p;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews i = iVar != null ? iVar.i(this) : null;
        Notification d2 = d();
        if (!(i == null && (i = this.b.G) == null)) {
            d2.contentView = i;
        }
        if (!(Build.VERSION.SDK_INT < 16 || iVar == null || (h2 = iVar.h(this)) == null)) {
            d2.bigContentView = h2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || iVar == null || (j = this.b.p.j(this)) == null)) {
            d2.headsUpContentView = j;
        }
        if (!(Build.VERSION.SDK_INT < 16 || iVar == null || (a2 = h.a(d2)) == null)) {
            iVar.a(a2);
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.a.build();
        }
        if (i >= 24) {
            Notification build = this.a.build();
            if (this.g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.g != 2)) {
                    e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    e(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.a.setExtras(this.f);
            Notification build2 = this.a.build();
            RemoteViews remoteViews = this.c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.g != 2)) {
                    e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.g == 1) {
                    e(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.a.setExtras(this.f);
            Notification build3 = this.a.build();
            RemoteViews remoteViews4 = this.c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.g != 2)) {
                    e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.g == 1) {
                    e(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = j.a(this.e);
            if (a2 != null) {
                this.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.a.setExtras(this.f);
            Notification build4 = this.a.build();
            RemoteViews remoteViews6 = this.c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.a.getNotification();
        } else {
            Notification build5 = this.a.build();
            Bundle a3 = h.a(build5);
            Bundle bundle = new Bundle(this.f);
            for (String str : this.f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = j.a(this.e);
            if (a4 != null) {
                h.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
