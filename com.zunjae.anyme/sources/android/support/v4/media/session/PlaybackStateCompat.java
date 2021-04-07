package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    final int e;
    final long f;
    final long g;
    final float h;
    final long i;
    final int j;
    final CharSequence k;
    final long l;
    List<CustomAction> m;
    final long n;
    final Bundle o;
    private PlaybackState p;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        private final String e;
        private final CharSequence f;
        private final int g;
        private final Bundle h;
        private PlaybackState.CustomAction i;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.e = parcel.readString();
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = parcel.readInt();
            this.h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.e = str;
            this.f = charSequence;
            this.g = i2;
            this.h = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.i = customAction;
            return customAction2;
        }

        public Object b() {
            if (this.i != null || Build.VERSION.SDK_INT < 21) {
                return this.i;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.e, this.f, this.g);
            builder.setExtras(this.h);
            return builder.build();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f + ", mIcon=" + this.g + ", mExtras=" + this.h;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.f, parcel, i2);
            parcel.writeInt(this.g);
            parcel.writeBundle(this.h);
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public static final class b {
        private final List<CustomAction> a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public b() {
            this.a = new ArrayList();
            this.j = -1;
        }

        public b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.j = -1;
            this.b = playbackStateCompat.e;
            this.c = playbackStateCompat.f;
            this.e = playbackStateCompat.h;
            this.i = playbackStateCompat.l;
            this.d = playbackStateCompat.g;
            this.f = playbackStateCompat.i;
            this.g = playbackStateCompat.j;
            this.h = playbackStateCompat.k;
            List<CustomAction> list = playbackStateCompat.m;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.n;
            this.k = playbackStateCompat.o;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public b b(long j2) {
            this.f = j2;
            return this;
        }

        public b c(int i2, long j2, float f2) {
            d(i2, j2, f2, SystemClock.elapsedRealtime());
            return this;
        }

        public b d(int i2, long j2, float f2, long j3) {
            this.b = i2;
            this.c = j2;
            this.i = j3;
            this.e = f2;
            return this;
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = f2;
        this.i = j4;
        this.j = i3;
        this.k = charSequence;
        this.l = j5;
        this.m = new ArrayList(list);
        this.n = j6;
        this.o = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.h = parcel.readFloat();
        this.l = parcel.readLong();
        this.g = parcel.readLong();
        this.i = parcel.readLong();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.n = parcel.readLong();
        this.o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.j = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction a2 : customActions) {
                arrayList2.add(CustomAction.a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.p = playbackState;
        return playbackStateCompat;
    }

    public long b() {
        return this.i;
    }

    public long c() {
        return this.l;
    }

    public float d() {
        return this.h;
    }

    public int describeContents() {
        return 0;
    }

    public Object e() {
        if (this.p == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.e, this.f, this.h, this.l);
            builder.setBufferedPosition(this.g);
            builder.setActions(this.i);
            builder.setErrorMessage(this.k);
            for (CustomAction b2 : this.m) {
                builder.addCustomAction((PlaybackState.CustomAction) b2.b());
            }
            builder.setActiveQueueItemId(this.n);
            if (Build.VERSION.SDK_INT >= 22) {
                builder.setExtras(this.o);
            }
            this.p = builder.build();
        }
        return this.p;
    }

    public long f() {
        return this.f;
    }

    public int g() {
        return this.e;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.e + ", position=" + this.f + ", buffered position=" + this.g + ", speed=" + this.h + ", updated=" + this.l + ", actions=" + this.i + ", error code=" + this.j + ", error message=" + this.k + ", custom actions=" + this.m + ", active item id=" + this.n + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeFloat(this.h);
        parcel.writeLong(this.l);
        parcel.writeLong(this.g);
        parcel.writeLong(this.i);
        TextUtils.writeToParcel(this.k, parcel, i2);
        parcel.writeTypedList(this.m);
        parcel.writeLong(this.n);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.j);
    }
}
