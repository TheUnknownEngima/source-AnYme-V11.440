package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class n implements Iterable<Intent> {
    private final ArrayList<Intent> e = new ArrayList<>();
    private final Context f;

    public interface a {
        Intent g();
    }

    private n(Context context) {
        this.f = context;
    }

    public static n g(Context context) {
        return new n(context);
    }

    public n a(Intent intent) {
        this.e.add(intent);
        return this;
    }

    public n c(Activity activity) {
        Intent g = activity instanceof a ? ((a) activity).g() : null;
        if (g == null) {
            g = f.a(activity);
        }
        if (g != null) {
            ComponentName component = g.getComponent();
            if (component == null) {
                component = g.resolveActivity(this.f.getPackageManager());
            }
            d(component);
            a(g);
        }
        return this;
    }

    public n d(ComponentName componentName) {
        int size = this.e.size();
        try {
            Context context = this.f;
            while (true) {
                Intent b = f.b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.e.add(size, b);
                context = this.f;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public PendingIntent h(int i, int i2) {
        return i(i, i2, (Bundle) null);
    }

    public PendingIntent i(int i, int i2, Bundle bundle) {
        if (!this.e.isEmpty()) {
            ArrayList<Intent> arrayList = this.e;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return Build.VERSION.SDK_INT >= 16 ? PendingIntent.getActivities(this.f, i, intentArr, i2, bundle) : PendingIntent.getActivities(this.f, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.e.iterator();
    }

    public void j() {
        k((Bundle) null);
    }

    public void k(Bundle bundle) {
        if (!this.e.isEmpty()) {
            ArrayList<Intent> arrayList = this.e;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.k(this.f, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
