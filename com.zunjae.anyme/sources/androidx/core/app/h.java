package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.R$dimen;
import androidx.core.R$drawable;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class h {

    public static class a {
        final Bundle a;
        private IconCompat b;
        private final l[] c;
        private final l[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        /* renamed from: androidx.core.app.h$a$a  reason: collision with other inner class name */
        public static final class C0019a {
            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<l> f;
            private int g;
            private boolean h;
            private boolean i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C0019a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i2 != 0 ? IconCompat.f((Resources) null, "", i2) : null, charSequence, pendingIntent, new Bundle(), (l[]) null, true, 0, true, false);
            }

            private C0019a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, boolean z, int i2, boolean z2, boolean z3) {
                this.d = true;
                this.h = true;
                this.a = iconCompat;
                this.b = e.j(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = lVarArr == null ? null : new ArrayList<>(Arrays.asList(lVarArr));
                this.d = z;
                this.g = i2;
                this.h = z2;
                this.i = z3;
            }

            private void b() {
                if (this.i && this.c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.h.a a() {
                /*
                    r15 = this;
                    r15.b()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList<androidx.core.app.l> r2 = r15.f
                    if (r2 == 0) goto L_0x002f
                    java.util.Iterator r2 = r2.iterator()
                L_0x0015:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x002f
                    java.lang.Object r3 = r2.next()
                    androidx.core.app.l r3 = (androidx.core.app.l) r3
                    boolean r4 = r3.j()
                    if (r4 == 0) goto L_0x002b
                    r0.add(r3)
                    goto L_0x0015
                L_0x002b:
                    r1.add(r3)
                    goto L_0x0015
                L_0x002f:
                    boolean r2 = r0.isEmpty()
                    r3 = 0
                    if (r2 == 0) goto L_0x0038
                    r10 = r3
                    goto L_0x0045
                L_0x0038:
                    int r2 = r0.size()
                    androidx.core.app.l[] r2 = new androidx.core.app.l[r2]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    androidx.core.app.l[] r0 = (androidx.core.app.l[]) r0
                    r10 = r0
                L_0x0045:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L_0x004c
                    goto L_0x0059
                L_0x004c:
                    int r0 = r1.size()
                    androidx.core.app.l[] r0 = new androidx.core.app.l[r0]
                    java.lang.Object[] r0 = r1.toArray(r0)
                    r3 = r0
                    androidx.core.app.l[] r3 = (androidx.core.app.l[]) r3
                L_0x0059:
                    r9 = r3
                    androidx.core.app.h$a r0 = new androidx.core.app.h$a
                    androidx.core.graphics.drawable.IconCompat r5 = r15.a
                    java.lang.CharSequence r6 = r15.b
                    android.app.PendingIntent r7 = r15.c
                    android.os.Bundle r8 = r15.e
                    boolean r11 = r15.d
                    int r12 = r15.g
                    boolean r13 = r15.h
                    boolean r14 = r15.i
                    r4 = r0
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h.a.C0019a.a():androidx.core.app.h$a");
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.f((Resources) null, "", i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (l[]) null, (l[]) null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, l[] lVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.l() == 2) {
                this.i = iconCompat.g();
            }
            this.j = e.j(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = lVarArr;
            this.d = lVarArr2;
            this.e = z;
            this.g = i2;
            this.f = z2;
            this.h = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public l[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        @Deprecated
        public int e() {
            return this.i;
        }

        public IconCompat f() {
            int i2;
            if (this.b == null && (i2 = this.i) != 0) {
                this.b = IconCompat.f((Resources) null, "", i2);
            }
            return this.b;
        }

        public l[] g() {
            return this.c;
        }

        public int h() {
            return this.g;
        }

        public boolean i() {
            return this.f;
        }

        public CharSequence j() {
            return this.j;
        }

        public boolean k() {
            return this.h;
        }
    }

    public static class b extends i {
        private Bitmap e;
        private Bitmap f;
        private boolean g;

        public void b(g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(gVar.a()).setBigContentTitle(this.b).bigPicture(this.e);
                if (this.g) {
                    bigPicture.bigLargeIcon(this.f);
                }
                if (this.d) {
                    bigPicture.setSummaryText(this.c);
                }
            }
        }

        public b l(Bitmap bitmap) {
            this.f = bitmap;
            this.g = true;
            return this;
        }

        public b m(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public b n(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.d = true;
            return this;
        }
    }

    public static class c extends i {
        private CharSequence e;

        public void b(g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.a()).setBigContentTitle(this.b).bigText(this.e);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }

        public c l(CharSequence charSequence) {
            this.e = e.j(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata h(d dVar) {
            if (dVar == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setAutoExpandBubble(dVar.a()).setDeleteIntent(dVar.b()).setIcon(dVar.e().s()).setIntent(dVar.f()).setSuppressNotification(dVar.g());
            if (dVar.c() != 0) {
                suppressNotification.setDesiredHeight(dVar.c());
            }
            if (dVar.d() != 0) {
                suppressNotification.setDesiredHeightResId(dVar.d());
            }
            return suppressNotification.build();
        }

        public abstract boolean a();

        public abstract PendingIntent b();

        public abstract int c();

        public abstract int d();

        public abstract IconCompat e();

        public abstract PendingIntent f();

        public abstract boolean g();
    }

    public static class e {
        boolean A;
        String B;
        Bundle C;
        int D;
        int E;
        Notification F;
        RemoteViews G;
        RemoteViews H;
        RemoteViews I;
        String J;
        int K;
        String L;
        long M;
        int N;
        boolean O;
        d P;
        Notification Q;
        @Deprecated
        public ArrayList<String> R;
        public Context a;
        public ArrayList<a> b;
        ArrayList<a> c;
        CharSequence d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        boolean o;
        i p;
        CharSequence q;
        CharSequence[] r;
        int s;
        int t;
        boolean u;
        String v;
        boolean w;
        String x;
        boolean y;
        boolean z;

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }

        public e(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.m = true;
            this.y = false;
            this.D = 0;
            this.E = 0;
            this.K = 0;
            this.N = 0;
            Notification notification = new Notification();
            this.Q = notification;
            this.a = context;
            this.J = str;
            notification.when = System.currentTimeMillis();
            this.Q.audioStreamType = -1;
            this.l = 0;
            this.R = new ArrayList<>();
            this.O = true;
        }

        protected static CharSequence j(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap k(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        private void u(int i2, boolean z2) {
            Notification notification;
            int i3;
            if (z2) {
                notification = this.Q;
                i3 = i2 | notification.flags;
            } else {
                notification = this.Q;
                i3 = (~i2) & notification.flags;
            }
            notification.flags = i3;
        }

        public e A(int i2) {
            this.l = i2;
            return this;
        }

        public e B(boolean z2) {
            this.m = z2;
            return this;
        }

        public e C(int i2) {
            this.Q.icon = i2;
            return this;
        }

        public e D(Uri uri) {
            Notification notification = this.Q;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e E(i iVar) {
            if (this.p != iVar) {
                this.p = iVar;
                if (iVar != null) {
                    iVar.k(this);
                }
            }
            return this;
        }

        public e F(CharSequence charSequence) {
            this.q = j(charSequence);
            return this;
        }

        public e G(CharSequence charSequence) {
            this.Q.tickerText = j(charSequence);
            return this;
        }

        public e H(long j2) {
            this.M = j2;
            return this;
        }

        public e I(long[] jArr) {
            this.Q.vibrate = jArr;
            return this;
        }

        public e J(int i2) {
            this.E = i2;
            return this;
        }

        public e K(long j2) {
            this.Q.when = j2;
            return this;
        }

        public e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            this.b.add(aVar);
            return this;
        }

        public e c(String str) {
            this.R.add(str);
            return this;
        }

        public Notification d() {
            return new i(this).c();
        }

        public e e(f fVar) {
            fVar.a(this);
            return this;
        }

        public int f() {
            return this.D;
        }

        public Bundle g() {
            if (this.C == null) {
                this.C = new Bundle();
            }
            return this.C;
        }

        public int h() {
            return this.l;
        }

        public long i() {
            if (this.m) {
                return this.Q.when;
            }
            return 0;
        }

        public e l(boolean z2) {
            u(16, z2);
            return this;
        }

        public e m(String str) {
            this.B = str;
            return this;
        }

        public e n(String str) {
            this.J = str;
            return this;
        }

        public e o(int i2) {
            this.D = i2;
            return this;
        }

        public e p(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public e q(CharSequence charSequence) {
            this.e = j(charSequence);
            return this;
        }

        public e r(CharSequence charSequence) {
            this.d = j(charSequence);
            return this;
        }

        public e s(int i2) {
            Notification notification = this.Q;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e t(PendingIntent pendingIntent) {
            this.Q.deleteIntent = pendingIntent;
            return this;
        }

        public e v(Bitmap bitmap) {
            this.i = k(bitmap);
            return this;
        }

        public e w(int i2, int i3, int i4) {
            Notification notification = this.Q;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            int i5 = (i3 == 0 || i4 == 0) ? 0 : 1;
            Notification notification2 = this.Q;
            notification2.flags = i5 | (notification2.flags & -2);
            return this;
        }

        public e x(boolean z2) {
            this.y = z2;
            return this;
        }

        public e y(int i2) {
            this.k = i2;
            return this;
        }

        public e z(boolean z2) {
            u(2, z2);
            return this;
        }
    }

    public interface f {
        e a(e eVar);
    }

    public static class g extends i {
        private ArrayList<CharSequence> e = new ArrayList<>();

        public void b(g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(gVar.a()).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                Iterator<CharSequence> it = this.e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        public g l(CharSequence charSequence) {
            this.e.add(e.j(charSequence));
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$h  reason: collision with other inner class name */
    public static class C0020h extends i {
        private final List<a> e = new ArrayList();
        private k f;
        private CharSequence g;
        private Boolean h;

        /* renamed from: androidx.core.app.h$h$a */
        public static final class a {
            private final CharSequence a;
            private final long b;
            private final k c;
            private Bundle d = new Bundle();
            private String e;
            private Uri f;

            public a(CharSequence charSequence, long j, k kVar) {
                this.a = charSequence;
                this.b = j;
                this.c = kVar;
            }

            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).h();
                }
                return bundleArr;
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.b);
                k kVar = this.c;
                if (kVar != null) {
                    bundle.putCharSequence("sender", kVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.c.g());
                    } else {
                        bundle.putBundle("person", this.c.h());
                    }
                }
                String str = this.e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.e;
            }

            public Uri c() {
                return this.f;
            }

            public k d() {
                return this.c;
            }

            @Deprecated
            public CharSequence e() {
                k kVar = this.c;
                if (kVar == null) {
                    return null;
                }
                return kVar.c();
            }

            public CharSequence f() {
                return this.a;
            }

            public long g() {
                return this.b;
            }
        }

        @Deprecated
        public C0020h(CharSequence charSequence) {
            k.a aVar = new k.a();
            aVar.b(charSequence);
            this.f = aVar.a();
        }

        private a m() {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                a aVar = this.e.get(size);
                if (aVar.d() != null && !TextUtils.isEmpty(aVar.d().c())) {
                    return aVar;
                }
            }
            if (this.e.isEmpty()) {
                return null;
            }
            List<a> list = this.e;
            return list.get(list.size() - 1);
        }

        private boolean n() {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                a aVar = this.e.get(size);
                if (aVar.d() != null && aVar.d().c() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan p(int i) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null);
        }

        private CharSequence q(a aVar) {
            h3 c = h3.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence c2 = aVar.d() == null ? charSequence : aVar.d().c();
            if (TextUtils.isEmpty(c2)) {
                c2 = this.f.c();
                if (z && this.a.f() != 0) {
                    i = this.a.f();
                }
            }
            CharSequence h2 = c.h(c2);
            spannableStringBuilder.append(h2);
            spannableStringBuilder.setSpan(p(i), spannableStringBuilder.length() - h2.length(), spannableStringBuilder.length(), 33);
            if (aVar.f() != null) {
                charSequence = aVar.f();
            }
            spannableStringBuilder.append("  ").append(c.h(charSequence));
            return spannableStringBuilder;
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f.c());
            bundle.putBundle("android.messagingStyleUser", this.f.h());
            bundle.putCharSequence("android.hiddenConversationTitle", this.g);
            if (this.g != null && this.h.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.g);
            }
            if (!this.e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.e));
            }
            Boolean bool = this.h;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(androidx.core.app.g r11) {
            /*
                r10 = this;
                boolean r0 = r10.o()
                r10.s(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 24
                if (r0 < r2) goto L_0x00b2
                r2 = 28
                if (r0 < r2) goto L_0x001e
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                androidx.core.app.k r3 = r10.f
                android.app.Person r3 = r3.g()
                r0.<init>(r3)
                goto L_0x0029
            L_0x001e:
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                androidx.core.app.k r3 = r10.f
                java.lang.CharSequence r3 = r3.c()
                r0.<init>(r3)
            L_0x0029:
                java.lang.Boolean r3 = r10.h
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x0035
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r2) goto L_0x003a
            L_0x0035:
                java.lang.CharSequence r3 = r10.g
                r0.setConversationTitle(r3)
            L_0x003a:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r2) goto L_0x0047
                java.lang.Boolean r3 = r10.h
                boolean r3 = r3.booleanValue()
                r0.setGroupConversation(r3)
            L_0x0047:
                java.util.List<androidx.core.app.h$h$a> r3 = r10.e
                java.util.Iterator r3 = r3.iterator()
            L_0x004d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x00a9
                java.lang.Object r4 = r3.next()
                androidx.core.app.h$h$a r4 = (androidx.core.app.h.C0020h.a) r4
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L_0x0077
                androidx.core.app.k r5 = r4.d()
                android.app.Notification$MessagingStyle$Message r6 = new android.app.Notification$MessagingStyle$Message
                java.lang.CharSequence r7 = r4.f()
                long r8 = r4.g()
                if (r5 != 0) goto L_0x006f
                r5 = r1
                goto L_0x0073
            L_0x006f:
                android.app.Person r5 = r5.g()
            L_0x0073:
                r6.<init>(r7, r8, r5)
                goto L_0x0094
            L_0x0077:
                androidx.core.app.k r5 = r4.d()
                if (r5 == 0) goto L_0x0086
                androidx.core.app.k r5 = r4.d()
                java.lang.CharSequence r5 = r5.c()
                goto L_0x0087
            L_0x0086:
                r5 = r1
            L_0x0087:
                android.app.Notification$MessagingStyle$Message r6 = new android.app.Notification$MessagingStyle$Message
                java.lang.CharSequence r7 = r4.f()
                long r8 = r4.g()
                r6.<init>(r7, r8, r5)
            L_0x0094:
                java.lang.String r5 = r4.b()
                if (r5 == 0) goto L_0x00a5
                java.lang.String r5 = r4.b()
                android.net.Uri r4 = r4.c()
                r6.setData(r5, r4)
            L_0x00a5:
                r0.addMessage(r6)
                goto L_0x004d
            L_0x00a9:
                android.app.Notification$Builder r11 = r11.a()
                r0.setBuilder(r11)
                goto L_0x015b
            L_0x00b2:
                androidx.core.app.h$h$a r0 = r10.m()
                java.lang.CharSequence r2 = r10.g
                if (r2 == 0) goto L_0x00cc
                java.lang.Boolean r2 = r10.h
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x00cc
                android.app.Notification$Builder r2 = r11.a()
                java.lang.CharSequence r3 = r10.g
            L_0x00c8:
                r2.setContentTitle(r3)
                goto L_0x00ea
            L_0x00cc:
                if (r0 == 0) goto L_0x00ea
                android.app.Notification$Builder r2 = r11.a()
                java.lang.String r3 = ""
                r2.setContentTitle(r3)
                androidx.core.app.k r2 = r0.d()
                if (r2 == 0) goto L_0x00ea
                android.app.Notification$Builder r2 = r11.a()
                androidx.core.app.k r3 = r0.d()
                java.lang.CharSequence r3 = r3.c()
                goto L_0x00c8
            L_0x00ea:
                if (r0 == 0) goto L_0x0100
                android.app.Notification$Builder r2 = r11.a()
                java.lang.CharSequence r3 = r10.g
                if (r3 == 0) goto L_0x00f9
                java.lang.CharSequence r0 = r10.q(r0)
                goto L_0x00fd
            L_0x00f9:
                java.lang.CharSequence r0 = r0.f()
            L_0x00fd:
                r2.setContentText(r0)
            L_0x0100:
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 16
                if (r0 < r2) goto L_0x015b
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r2 = r10.g
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x011a
                boolean r2 = r10.n()
                if (r2 == 0) goto L_0x0118
                goto L_0x011a
            L_0x0118:
                r2 = 0
                goto L_0x011b
            L_0x011a:
                r2 = 1
            L_0x011b:
                java.util.List<androidx.core.app.h$h$a> r5 = r10.e
                int r5 = r5.size()
                int r5 = r5 - r4
            L_0x0122:
                if (r5 < 0) goto L_0x014b
                java.util.List<androidx.core.app.h$h$a> r6 = r10.e
                java.lang.Object r6 = r6.get(r5)
                androidx.core.app.h$h$a r6 = (androidx.core.app.h.C0020h.a) r6
                if (r2 == 0) goto L_0x0133
                java.lang.CharSequence r6 = r10.q(r6)
                goto L_0x0137
            L_0x0133:
                java.lang.CharSequence r6 = r6.f()
            L_0x0137:
                java.util.List<androidx.core.app.h$h$a> r7 = r10.e
                int r7 = r7.size()
                int r7 = r7 - r4
                if (r5 == r7) goto L_0x0145
                java.lang.String r7 = "\n"
                r0.insert(r3, r7)
            L_0x0145:
                r0.insert(r3, r6)
                int r5 = r5 + -1
                goto L_0x0122
            L_0x014b:
                android.app.Notification$BigTextStyle r2 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r11 = r11.a()
                r2.<init>(r11)
                android.app.Notification$BigTextStyle r11 = r2.setBigContentTitle(r1)
                r11.bigText(r0)
            L_0x015b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h.C0020h.b(androidx.core.app.g):void");
        }

        @Deprecated
        public C0020h l(CharSequence charSequence, long j, CharSequence charSequence2) {
            List<a> list = this.e;
            k.a aVar = new k.a();
            aVar.b(charSequence2);
            list.add(new a(charSequence, j, aVar.a()));
            if (this.e.size() > 25) {
                this.e.remove(0);
            }
            return this;
        }

        public boolean o() {
            e eVar = this.a;
            if (eVar != null && eVar.a.getApplicationInfo().targetSdkVersion < 28 && this.h == null) {
                return this.g != null;
            }
            Boolean bool = this.h;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public C0020h r(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public C0020h s(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }
    }

    public static abstract class i {
        protected e a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        private Bitmap e(int i, int i2, int i3) {
            return f(IconCompat.e(this.a.a, i), i2, i3);
        }

        private Bitmap f(IconCompat iconCompat, int i, int i2) {
            Drawable n = iconCompat.n(this.a.a);
            int intrinsicWidth = i2 == 0 ? n.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = n.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            n.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                n.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            n.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap g(int i, int i2, int i3, int i4) {
            int i5 = R$drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap e = e(i5, i4, i2);
            Canvas canvas = new Canvas(e);
            Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e;
        }

        public void a(Bundle bundle) {
        }

        public abstract void b(g gVar);

        /* JADX WARNING: Removed duplicated region for block: B:63:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x020e  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0210  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x021a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.core.app.h$e r0 = r12.a
                android.content.Context r0 = r0.a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.h$e r1 = r12.a
                android.content.Context r1 = r1.a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                androidx.core.app.h$e r14 = r12.a
                int r14 = r14.h()
                r1 = -1
                r8 = 1
                r9 = 0
                if (r14 >= r1) goto L_0x0022
                r14 = 1
                goto L_0x0023
            L_0x0022:
                r14 = 0
            L_0x0023:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                r10 = 16
                if (r2 < r10) goto L_0x004b
                if (r2 >= r3) goto L_0x004b
                java.lang.String r2 = "setBackgroundResource"
                if (r14 == 0) goto L_0x003d
                int r14 = androidx.core.R$id.notification_background
                int r4 = androidx.core.R$drawable.notification_bg_low
                r7.setInt(r14, r2, r4)
                int r14 = androidx.core.R$id.icon
                int r4 = androidx.core.R$drawable.notification_template_icon_low_bg
                goto L_0x0048
            L_0x003d:
                int r14 = androidx.core.R$id.notification_background
                int r4 = androidx.core.R$drawable.notification_bg
                r7.setInt(r14, r2, r4)
                int r14 = androidx.core.R$id.icon
                int r4 = androidx.core.R$drawable.notification_template_icon_bg
            L_0x0048:
                r7.setInt(r14, r2, r4)
            L_0x004b:
                androidx.core.app.h$e r14 = r12.a
                android.graphics.Bitmap r2 = r14.i
                r11 = 8
                if (r2 == 0) goto L_0x00b2
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x0066
                int r14 = androidx.core.R$id.icon
                r7.setViewVisibility(r14, r9)
                int r14 = androidx.core.R$id.icon
                androidx.core.app.h$e r2 = r12.a
                android.graphics.Bitmap r2 = r2.i
                r7.setImageViewBitmap(r14, r2)
                goto L_0x006b
            L_0x0066:
                int r14 = androidx.core.R$id.icon
                r7.setViewVisibility(r14, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00f9
                androidx.core.app.h$e r13 = r12.a
                android.app.Notification r13 = r13.Q
                int r13 = r13.icon
                if (r13 == 0) goto L_0x00f9
                int r13 = androidx.core.R$dimen.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = androidx.core.R$dimen.notification_small_icon_background_padding
                int r14 = r0.getDimensionPixelSize(r14)
                int r14 = r14 * 2
                int r14 = r13 - r14
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto L_0x009d
                androidx.core.app.h$e r1 = r12.a
                android.app.Notification r2 = r1.Q
                int r2 = r2.icon
                int r1 = r1.f()
                android.graphics.Bitmap r13 = r12.g(r2, r13, r14, r1)
                int r14 = androidx.core.R$id.right_icon
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00ac
            L_0x009d:
                int r13 = androidx.core.R$id.right_icon
                androidx.core.app.h$e r14 = r12.a
                android.app.Notification r14 = r14.Q
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.d(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00ac:
                int r13 = androidx.core.R$id.right_icon
                r7.setViewVisibility(r13, r9)
                goto L_0x00f9
            L_0x00b2:
                if (r13 == 0) goto L_0x00f9
                android.app.Notification r13 = r14.Q
                int r13 = r13.icon
                if (r13 == 0) goto L_0x00f9
                int r13 = androidx.core.R$id.icon
                r7.setViewVisibility(r13, r9)
                int r13 = android.os.Build.VERSION.SDK_INT
                if (r13 < r3) goto L_0x00ea
                int r13 = androidx.core.R$dimen.notification_large_icon_width
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = androidx.core.R$dimen.notification_big_circle_margin
                int r14 = r0.getDimensionPixelSize(r14)
                int r13 = r13 - r14
                int r14 = androidx.core.R$dimen.notification_small_icon_size_as_large
                int r14 = r0.getDimensionPixelSize(r14)
                androidx.core.app.h$e r1 = r12.a
                android.app.Notification r2 = r1.Q
                int r2 = r2.icon
                int r1 = r1.f()
                android.graphics.Bitmap r13 = r12.g(r2, r13, r14, r1)
                int r14 = androidx.core.R$id.icon
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00f9
            L_0x00ea:
                int r13 = androidx.core.R$id.icon
                androidx.core.app.h$e r14 = r12.a
                android.app.Notification r14 = r14.Q
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.d(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00f9:
                androidx.core.app.h$e r13 = r12.a
                java.lang.CharSequence r13 = r13.d
                if (r13 == 0) goto L_0x0104
                int r14 = androidx.core.R$id.title
                r7.setTextViewText(r14, r13)
            L_0x0104:
                androidx.core.app.h$e r13 = r12.a
                java.lang.CharSequence r13 = r13.e
                if (r13 == 0) goto L_0x0111
                int r14 = androidx.core.R$id.text
                r7.setTextViewText(r14, r13)
                r13 = 1
                goto L_0x0112
            L_0x0111:
                r13 = 0
            L_0x0112:
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 >= r3) goto L_0x011e
                androidx.core.app.h$e r14 = r12.a
                android.graphics.Bitmap r14 = r14.i
                if (r14 == 0) goto L_0x011e
                r14 = 1
                goto L_0x011f
            L_0x011e:
                r14 = 0
            L_0x011f:
                androidx.core.app.h$e r1 = r12.a
                java.lang.CharSequence r2 = r1.j
                if (r2 == 0) goto L_0x0132
                int r13 = androidx.core.R$id.info
                r7.setTextViewText(r13, r2)
            L_0x012a:
                int r13 = androidx.core.R$id.info
                r7.setViewVisibility(r13, r9)
                r13 = 1
                r14 = 1
                goto L_0x0166
            L_0x0132:
                int r1 = r1.k
                if (r1 <= 0) goto L_0x0161
                int r13 = androidx.core.R$integer.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                androidx.core.app.h$e r14 = r12.a
                int r14 = r14.k
                if (r14 <= r13) goto L_0x014e
                int r13 = androidx.core.R$id.info
                int r14 = androidx.core.R$string.status_bar_notification_info_overflow
                java.lang.String r14 = r0.getString(r14)
                r7.setTextViewText(r13, r14)
                goto L_0x012a
            L_0x014e:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r14 = androidx.core.R$id.info
                androidx.core.app.h$e r1 = r12.a
                int r1 = r1.k
                long r1 = (long) r1
                java.lang.String r13 = r13.format(r1)
                r7.setTextViewText(r14, r13)
                goto L_0x012a
            L_0x0161:
                int r1 = androidx.core.R$id.info
                r7.setViewVisibility(r1, r11)
            L_0x0166:
                androidx.core.app.h$e r1 = r12.a
                java.lang.CharSequence r1 = r1.q
                if (r1 == 0) goto L_0x018c
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r10) goto L_0x018c
                int r2 = androidx.core.R$id.text
                r7.setTextViewText(r2, r1)
                androidx.core.app.h$e r1 = r12.a
                java.lang.CharSequence r1 = r1.e
                if (r1 == 0) goto L_0x0187
                int r2 = androidx.core.R$id.text2
                r7.setTextViewText(r2, r1)
                int r1 = androidx.core.R$id.text2
                r7.setViewVisibility(r1, r9)
                r1 = 1
                goto L_0x018d
            L_0x0187:
                int r1 = androidx.core.R$id.text2
                r7.setViewVisibility(r1, r11)
            L_0x018c:
                r1 = 0
            L_0x018d:
                if (r1 == 0) goto L_0x01ab
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r10) goto L_0x01ab
                if (r15 == 0) goto L_0x01a1
                int r15 = androidx.core.R$dimen.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = androidx.core.R$id.text
                r7.setTextViewTextSize(r0, r9, r15)
            L_0x01a1:
                int r2 = androidx.core.R$id.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x01ab:
                androidx.core.app.h$e r15 = r12.a
                long r0 = r15.i()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0209
                androidx.core.app.h$e r14 = r12.a
                boolean r14 = r14.n
                if (r14 == 0) goto L_0x01f6
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x01f6
                int r14 = androidx.core.R$id.chronometer
                r7.setViewVisibility(r14, r9)
                int r14 = androidx.core.R$id.chronometer
                androidx.core.app.h$e r15 = r12.a
                long r0 = r15.i()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r15 = "setBase"
                r7.setLong(r14, r15, r0)
                int r14 = androidx.core.R$id.chronometer
                java.lang.String r15 = "setStarted"
                r7.setBoolean(r14, r15, r8)
                androidx.core.app.h$e r14 = r12.a
                boolean r14 = r14.o
                if (r14 == 0) goto L_0x020a
                int r15 = android.os.Build.VERSION.SDK_INT
                r0 = 24
                if (r15 < r0) goto L_0x020a
                int r15 = androidx.core.R$id.chronometer
                r7.setChronometerCountDown(r15, r14)
                goto L_0x020a
            L_0x01f6:
                int r14 = androidx.core.R$id.time
                r7.setViewVisibility(r14, r9)
                int r14 = androidx.core.R$id.time
                androidx.core.app.h$e r15 = r12.a
                long r0 = r15.i()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
                goto L_0x020a
            L_0x0209:
                r8 = r14
            L_0x020a:
                int r14 = androidx.core.R$id.right_side
                if (r8 == 0) goto L_0x0210
                r15 = 0
                goto L_0x0212
            L_0x0210:
                r15 = 8
            L_0x0212:
                r7.setViewVisibility(r14, r15)
                int r14 = androidx.core.R$id.line3
                if (r13 == 0) goto L_0x021a
                goto L_0x021c
            L_0x021a:
                r9 = 8
            L_0x021c:
                r7.setViewVisibility(r14, r9)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h.i.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Bitmap d(int i, int i2) {
            return e(i, i2, 0);
        }

        public RemoteViews h(g gVar) {
            return null;
        }

        public RemoteViews i(g gVar) {
            return null;
        }

        public RemoteViews j(g gVar) {
            return null;
        }

        public void k(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.E(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return j.c(notification);
        }
        return null;
    }
}
