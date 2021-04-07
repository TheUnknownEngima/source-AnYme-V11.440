package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
    static final b0<String, Integer> h;
    private static final String[] i = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] j = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] k = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    final Bundle e;
    private MediaMetadata f;
    private MediaDescriptionCompat g;

    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    public static final class b {
        private final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.e);
            this.a = bundle;
            MediaSessionCompat.b(bundle);
        }

        public b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.a.keySet()) {
                Object obj = this.a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        b(str, e(bitmap, i));
                    }
                }
            }
        }

        private Bitmap e(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String str, Bitmap bitmap) {
            if (!MediaMetadataCompat.h.containsKey(str) || MediaMetadataCompat.h.get(str).intValue() == 2) {
                this.a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j) {
            if (!MediaMetadataCompat.h.containsKey(str) || MediaMetadataCompat.h.get(str).intValue() == 0) {
                this.a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, String str2) {
            if (!MediaMetadataCompat.h.containsKey(str) || MediaMetadataCompat.h.get(str).intValue() == 1) {
                this.a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }
    }

    static {
        b0<String, Integer> b0Var = new b0<>();
        h = b0Var;
        b0Var.put("android.media.metadata.TITLE", 1);
        h.put("android.media.metadata.ARTIST", 1);
        h.put("android.media.metadata.DURATION", 0);
        h.put("android.media.metadata.ALBUM", 1);
        h.put("android.media.metadata.AUTHOR", 1);
        h.put("android.media.metadata.WRITER", 1);
        h.put("android.media.metadata.COMPOSER", 1);
        h.put("android.media.metadata.COMPILATION", 1);
        h.put("android.media.metadata.DATE", 1);
        h.put("android.media.metadata.YEAR", 0);
        h.put("android.media.metadata.GENRE", 1);
        h.put("android.media.metadata.TRACK_NUMBER", 0);
        h.put("android.media.metadata.NUM_TRACKS", 0);
        h.put("android.media.metadata.DISC_NUMBER", 0);
        h.put("android.media.metadata.ALBUM_ARTIST", 1);
        h.put("android.media.metadata.ART", 2);
        h.put("android.media.metadata.ART_URI", 1);
        h.put("android.media.metadata.ALBUM_ART", 2);
        h.put("android.media.metadata.ALBUM_ART_URI", 1);
        h.put("android.media.metadata.USER_RATING", 3);
        h.put("android.media.metadata.RATING", 3);
        h.put("android.media.metadata.DISPLAY_TITLE", 1);
        h.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        h.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        h.put("android.media.metadata.DISPLAY_ICON", 2);
        h.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        h.put("android.media.metadata.MEDIA_ID", 1);
        h.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        h.put("android.media.metadata.MEDIA_URI", 1);
        h.put("android.media.metadata.ADVERTISEMENT", 0);
        h.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.e = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f = mediaMetadata;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.e.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.e.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.e);
    }

    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.g;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String h2 = h("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence i2 = i("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(i2)) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr = i;
                if (i4 >= strArr.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence i6 = i(strArr[i4]);
                if (!TextUtils.isEmpty(i6)) {
                    charSequenceArr[i3] = i6;
                    i3++;
                }
                i4 = i5;
            }
        } else {
            charSequenceArr[0] = i2;
            charSequenceArr[1] = i("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = i("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i7 = 0;
        while (true) {
            String[] strArr2 = j;
            uri = null;
            if (i7 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = c(strArr2[i7]);
            if (bitmap != null) {
                break;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            String[] strArr3 = k;
            if (i8 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String h3 = h(strArr3[i8]);
            if (!TextUtils.isEmpty(h3)) {
                uri2 = Uri.parse(h3);
                break;
            }
            i8++;
        }
        String h4 = h("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(h4)) {
            uri = Uri.parse(h4);
        }
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.f(h2);
        bVar.i(charSequenceArr[0]);
        bVar.h(charSequenceArr[1]);
        bVar.b(charSequenceArr[2]);
        bVar.d(bitmap);
        bVar.e(uri2);
        bVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.e.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.e.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            bVar.c(bundle);
        }
        MediaDescriptionCompat a2 = bVar.a();
        this.g = a2;
        return a2;
    }

    public long f(String str) {
        return this.e.getLong(str, 0);
    }

    public Object g() {
        if (this.f == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f;
    }

    public String h(String str) {
        CharSequence charSequence = this.e.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence i(String str) {
        return this.e.getCharSequence(str);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.e);
    }
}
