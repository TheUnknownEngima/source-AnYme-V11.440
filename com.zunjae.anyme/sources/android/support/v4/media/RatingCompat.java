package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    private final int e;
    private final float f;
    private Object g;

    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f2) {
        this.e = i;
        this.f = f2;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = b(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = e(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = c(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = f(ratingStyle);
            }
            ratingCompat.g = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat b(boolean z) {
        return new RatingCompat(1, z ? 1.0f : Utils.FLOAT_EPSILON);
    }

    public static RatingCompat c(float f2) {
        if (f2 < Utils.FLOAT_EPSILON || f2 > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f2);
    }

    public static RatingCompat d(int i, float f2) {
        float f3;
        if (i == 3) {
            f3 = 3.0f;
        } else if (i == 4) {
            f3 = 4.0f;
        } else if (i != 5) {
            "Invalid rating style (" + i + ") for a star rating";
            return null;
        } else {
            f3 = 5.0f;
        }
        if (f2 < Utils.FLOAT_EPSILON || f2 > f3) {
            return null;
        }
        return new RatingCompat(i, f2);
    }

    public static RatingCompat e(boolean z) {
        return new RatingCompat(2, z ? 1.0f : Utils.FLOAT_EPSILON);
    }

    public static RatingCompat f(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public int describeContents() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.e);
        sb.append(" rating=");
        float f2 = this.f;
        sb.append(f2 < Utils.FLOAT_EPSILON ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
    }
}
