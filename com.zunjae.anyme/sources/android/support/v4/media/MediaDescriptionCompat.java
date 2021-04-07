package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    private final String e;
    private final CharSequence f;
    private final CharSequence g;
    private final CharSequence h;
    private final Bitmap i;
    private final Uri j;
    private final Bundle k;
    private final Uri l;
    private MediaDescription m;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static final class b {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.e = parcel.readString();
        this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.i = (Bitmap) parcel.readParcelable(classLoader);
        this.j = (Uri) parcel.readParcelable(classLoader);
        this.k = parcel.readBundle(classLoader);
        this.l = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.e = str;
        this.f = charSequence;
        this.g = charSequence2;
        this.h = charSequence3;
        this.i = bitmap;
        this.j = uri;
        this.k = bundle;
        this.l = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0082
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0082
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.f(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.i(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.h(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.b(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.d(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.e(r2)
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004c
            android.support.v4.media.session.MediaSessionCompat.b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004d
        L_0x004c:
            r4 = r0
        L_0x004d:
            if (r4 == 0) goto L_0x0065
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005f
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0065:
            r0 = r2
        L_0x0066:
            r1.c(r0)
            if (r4 == 0) goto L_0x006f
            r1.g(r4)
            goto L_0x007c
        L_0x006f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007c
            android.net.Uri r0 = r8.getMediaUri()
            r1.g(r0)
        L_0x007c:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.m = r8
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Bitmap b() {
        return this.i;
    }

    public Uri c() {
        return this.j;
    }

    public Object d() {
        if (this.m != null || Build.VERSION.SDK_INT < 21) {
            return this.m;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.e);
        builder.setTitle(this.f);
        builder.setSubtitle(this.g);
        builder.setDescription(this.h);
        builder.setIconBitmap(this.i);
        builder.setIconUri(this.j);
        Bundle bundle = this.k;
        if (Build.VERSION.SDK_INT < 23 && this.l != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.l);
        }
        builder.setExtras(bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            builder.setMediaUri(this.l);
        }
        MediaDescription build = builder.build();
        this.m = build;
        return build;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.e;
    }

    public CharSequence f() {
        return this.g;
    }

    public CharSequence g() {
        return this.f;
    }

    public String toString() {
        return this.f + ", " + this.g + ", " + this.h;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.f, parcel, i2);
            TextUtils.writeToParcel(this.g, parcel, i2);
            TextUtils.writeToParcel(this.h, parcel, i2);
            parcel.writeParcelable(this.i, i2);
            parcel.writeParcelable(this.j, i2);
            parcel.writeBundle(this.k);
            parcel.writeParcelable(this.l, i2);
            return;
        }
        ((MediaDescription) d()).writeToParcel(parcel, i2);
    }
}
