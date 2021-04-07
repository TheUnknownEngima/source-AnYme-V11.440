package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class b {
    final Bundle a;
    List<String> b;
    List<IntentFilter> c;

    public static final class a {
        private final Bundle a;
        private ArrayList<String> b;
        private ArrayList<IntentFilter> c;

        public a(b bVar) {
            if (bVar != null) {
                this.a = new Bundle(bVar.a);
                if (!bVar.k().isEmpty()) {
                    this.b = new ArrayList<>(bVar.k());
                }
                if (!bVar.g().isEmpty()) {
                    this.c = new ArrayList<>(bVar.c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }

        public a(String str, String str2) {
            this.a = new Bundle();
            h(str);
            i(str2);
        }

        public a a(IntentFilter intentFilter) {
            if (intentFilter != null) {
                if (this.c == null) {
                    this.c = new ArrayList<>();
                }
                if (!this.c.contains(intentFilter)) {
                    this.c.add(intentFilter);
                }
                return this;
            }
            throw new IllegalArgumentException("filter must not be null");
        }

        public a b(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter a2 : collection) {
                        a(a2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        public b c() {
            ArrayList<IntentFilter> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.b;
            if (arrayList2 != null) {
                this.a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new b(this.a);
        }

        @Deprecated
        public a d(boolean z) {
            this.a.putBoolean("connecting", z);
            return this;
        }

        public a e(String str) {
            this.a.putString("status", str);
            return this;
        }

        public a f(int i) {
            this.a.putInt("deviceType", i);
            return this;
        }

        public a g(boolean z) {
            this.a.putBoolean("enabled", z);
            return this;
        }

        public a h(String str) {
            this.a.putString("id", str);
            return this;
        }

        public a i(String str) {
            this.a.putString("name", str);
            return this;
        }

        public a j(int i) {
            this.a.putInt("playbackStream", i);
            return this;
        }

        public a k(int i) {
            this.a.putInt("playbackType", i);
            return this;
        }

        public a l(int i) {
            this.a.putInt("presentationDisplayId", i);
            return this;
        }

        public a m(int i) {
            this.a.putInt("volume", i);
            return this;
        }

        public a n(int i) {
            this.a.putInt("volumeHandling", i);
            return this;
        }

        public a o(int i) {
            this.a.putInt("volumeMax", i);
            return this;
        }
    }

    b(Bundle bundle) {
        this.a = bundle;
    }

    public static b e(Bundle bundle) {
        if (bundle != null) {
            return new b(bundle);
        }
        return null;
    }

    public Bundle a() {
        return this.a;
    }

    public boolean b() {
        return this.a.getBoolean("canDisconnect", false);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.c == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("controlFilters");
            this.c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.c = Collections.emptyList();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
            this.b = stringArrayList;
            if (stringArrayList == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public int f() {
        return this.a.getInt("connectionState", 0);
    }

    public List<IntentFilter> g() {
        c();
        return this.c;
    }

    public String h() {
        return this.a.getString("status");
    }

    public int i() {
        return this.a.getInt("deviceType");
    }

    public Bundle j() {
        return this.a.getBundle("extras");
    }

    public List<String> k() {
        d();
        return this.b;
    }

    public Uri l() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String m() {
        return this.a.getString("id");
    }

    public int n() {
        return this.a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    public int o() {
        return this.a.getInt("minClientVersion", 1);
    }

    public String p() {
        return this.a.getString("name");
    }

    public int q() {
        return this.a.getInt("playbackStream", -1);
    }

    public int r() {
        return this.a.getInt("playbackType", 1);
    }

    public int s() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public IntentSender t() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public String toString() {
        return "MediaRouteDescriptor{ " + "id=" + m() + ", groupMemberIds=" + k() + ", name=" + p() + ", description=" + h() + ", iconUri=" + l() + ", isEnabled=" + y() + ", isConnecting=" + x() + ", connectionState=" + f() + ", controlFilters=" + Arrays.toString(g().toArray()) + ", playbackType=" + r() + ", playbackStream=" + q() + ", deviceType=" + i() + ", volume=" + u() + ", volumeMax=" + w() + ", volumeHandling=" + v() + ", presentationDisplayId=" + s() + ", extras=" + j() + ", isValid=" + z() + ", minClientVersion=" + o() + ", maxClientVersion=" + n() + " }";
    }

    public int u() {
        return this.a.getInt("volume");
    }

    public int v() {
        return this.a.getInt("volumeHandling", 0);
    }

    public int w() {
        return this.a.getInt("volumeMax");
    }

    @Deprecated
    public boolean x() {
        return this.a.getBoolean("connecting", false);
    }

    public boolean y() {
        return this.a.getBoolean("enabled", true);
    }

    public boolean z() {
        c();
        return !TextUtils.isEmpty(m()) && !TextUtils.isEmpty(p()) && !this.c.contains((Object) null);
    }
}
