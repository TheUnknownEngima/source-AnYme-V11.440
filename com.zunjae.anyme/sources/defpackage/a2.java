package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* renamed from: a2  reason: default package */
public class a2 {
    Context a;
    String b;
    Intent[] c;
    ComponentName d;
    CharSequence e;
    CharSequence f;
    CharSequence g;
    IconCompat h;
    boolean i;
    k[] j;
    Set<String> k;
    boolean l;
    int m;

    /* renamed from: a2$a */
    public static class a {
        private final a2 a;

        public a(Context context, String str) {
            a2 a2Var = new a2();
            this.a = a2Var;
            a2Var.a = context;
            a2Var.b = str;
        }

        public a2 a() {
            if (!TextUtils.isEmpty(this.a.e)) {
                a2 a2Var = this.a;
                Intent[] intentArr = a2Var.c;
                if (intentArr != null && intentArr.length != 0) {
                    return a2Var;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public a b(IconCompat iconCompat) {
            this.a.h = iconCompat;
            return this;
        }

        public a c(Intent intent) {
            d(new Intent[]{intent});
            return this;
        }

        public a d(Intent[] intentArr) {
            this.a.c = intentArr;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.a.e = charSequence;
            return this;
        }
    }

    a2() {
    }

    private PersistableBundle b() {
        PersistableBundle persistableBundle = new PersistableBundle();
        k[] kVarArr = this.j;
        if (kVarArr != null && kVarArr.length > 0) {
            persistableBundle.putInt("extraPersonCount", kVarArr.length);
            int i2 = 0;
            while (i2 < this.j.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                persistableBundle.putPersistableBundle(sb.toString(), this.j[i2].i());
                i2 = i3;
            }
        }
        persistableBundle.putBoolean("extraLongLived", this.l);
        return persistableBundle;
    }

    /* access modifiers changed from: package-private */
    public Intent a(Intent intent) {
        Intent[] intentArr = this.c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.e.toString());
        if (this.h != null) {
            Drawable drawable = null;
            if (this.i) {
                PackageManager packageManager = this.a.getPackageManager();
                ComponentName componentName = this.d;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.h.a(intent, drawable, this.a);
        }
        return intent;
    }

    public ShortcutInfo c() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.s());
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        if (Build.VERSION.SDK_INT >= 29) {
            k[] kVarArr = this.j;
            if (kVarArr != null && kVarArr.length > 0) {
                int length = kVarArr.length;
                Person[] personArr = new Person[length];
                for (int i2 = 0; i2 < length; i2++) {
                    personArr[i2] = this.j[i2].g();
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(this.l);
        } else {
            intents.setExtras(b());
        }
        return intents.build();
    }
}
