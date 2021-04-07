package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends m80 {
    public static final Parcelable.Creator<l> CREATOR = new d1();
    private static final String[] h = {null, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    private static final a i;
    private final List<k80> e;
    final Bundle f;
    private int g;

    static class a {
        private final Map<String, String> a = new HashMap();
        private final Map<String, String> b = new HashMap();
        private final Map<String, Integer> c = new HashMap();

        public final a a(String str, String str2, int i) {
            this.a.put(str, str2);
            this.b.put(str2, str);
            this.c.put(str, Integer.valueOf(i));
            return this;
        }

        public final String b(String str) {
            return this.a.get(str);
        }

        public final String c(String str) {
            return this.b.get(str);
        }

        public final int d(String str) {
            Integer num = this.c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    static {
        a aVar = new a();
        aVar.a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        aVar.a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        aVar.a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        aVar.a("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        aVar.a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        aVar.a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        aVar.a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        aVar.a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        aVar.a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        aVar.a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        aVar.a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        aVar.a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        aVar.a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        aVar.a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        aVar.a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        aVar.a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        aVar.a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        aVar.a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        aVar.a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        i = aVar;
    }

    public l() {
        this(0);
    }

    public l(int i2) {
        this(new ArrayList(), new Bundle(), i2);
    }

    l(List<k80> list, Bundle bundle, int i2) {
        this.e = list;
        this.f = bundle;
        this.g = i2;
    }

    public static void p(String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            int d = i.d(str);
            if (d != i2 && d != 0) {
                String str2 = h[i2];
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                sb.append("Value for ");
                sb.append(str);
                sb.append(" must be a ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    private final boolean y(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !y((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        this.f.clear();
        this.e.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return y(this.f, lVar.f) && this.e.equals(lVar.e);
    }

    public int hashCode() {
        int i2 = 17;
        for (String str : this.f.keySet()) {
            i2 = (i2 * 31) + this.f.get(str).hashCode();
        }
        return (i2 * 31) + this.e.hashCode();
    }

    public boolean i(String str) {
        return this.f.containsKey(str);
    }

    public final void j(JSONObject jSONObject) {
        Bundle bundle;
        JSONObject jSONObject2 = jSONObject;
        clear();
        this.g = 0;
        try {
            this.g = jSONObject2.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            w60.a(this.e, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.g;
        if (i2 == 0) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i2 == 1) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i2 == 2) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i2 == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i2 == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i2 == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"metadataType".equals(next)) {
                    String c = i.c(next);
                    if (c == null) {
                        Object obj = jSONObject2.get(next);
                        if (obj instanceof String) {
                            this.f.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(c)) {
                        try {
                            Object obj2 = jSONObject2.get(next);
                            if (obj2 != null) {
                                int d = i.d(c);
                                if (d != 1) {
                                    if (d != 2) {
                                        if (d == 3) {
                                            double optDouble = jSONObject2.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f.putDouble(c, optDouble);
                                            }
                                        } else if (d != 4) {
                                            if (d == 5) {
                                                this.f.putLong(c, t60.c((double) jSONObject2.optLong(next)));
                                            }
                                        } else if ((obj2 instanceof String) && w60.b((String) obj2) != null) {
                                            bundle = this.f;
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f.putInt(c, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle = this.f;
                                }
                                bundle.putString(c, (String) obj2);
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public List<k80> k() {
        return this.e;
    }

    public int l() {
        return this.g;
    }

    public String m(String str) {
        p(str, 1);
        return this.f.getString(str);
    }

    public long n(String str) {
        p(str, 5);
        return this.f.getLong(str);
    }

    public boolean o() {
        List<k80> list = this.e;
        return list != null && !list.isEmpty();
    }

    public final JSONObject u() {
        String b;
        double d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.g);
        } catch (JSONException unused) {
        }
        JSONArray e2 = w60.e(this.e);
        if (!(e2 == null || e2.length() == 0)) {
            try {
                jSONObject.put("images", e2);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.g;
        if (i2 == 0) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i2 == 1) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i2 == 2) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i2 == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i2 == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i2 == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        try {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                if (this.f.containsKey(str)) {
                    int d2 = i.d(str);
                    if (d2 != 1) {
                        if (d2 != 2) {
                            if (d2 == 3) {
                                b = i.b(str);
                                d = this.f.getDouble(str);
                            } else if (d2 != 4) {
                                if (d2 == 5) {
                                    b = i.b(str);
                                    d = t60.b(this.f.getLong(str));
                                }
                            }
                            jSONObject.put(b, d);
                        } else {
                            jSONObject.put(i.b(str), this.f.getInt(str));
                        }
                    }
                    jSONObject.put(i.b(str), this.f.getString(str));
                }
            }
            for (String str2 : this.f.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj2 = this.f.get(str2);
                    if (!(obj2 instanceof String)) {
                        if (!(obj2 instanceof Integer)) {
                            if (!(obj2 instanceof Double)) {
                            }
                        }
                    }
                    jSONObject.put(str2, obj2);
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = o80.a(parcel);
        o80.w(parcel, 2, k(), false);
        o80.e(parcel, 3, this.f, false);
        o80.l(parcel, 4, l());
        o80.b(parcel, a2);
    }
}
