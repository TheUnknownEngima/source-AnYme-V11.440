package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f<T> {
    private final T a;
    private final c<T> b;

    private static class b implements c<Context> {
        private final Class<? extends Service> a;

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                this.a + " has no service info.";
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c<T> {
        List<String> a(T t);
    }

    f(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static f<Context> b(Context context, Class<? extends Service> cls) {
        return new f<>(context, new b(cls));
    }

    private static List<h> c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!h.class.isAssignableFrom(cls)) {
                    String.format("Class %s is not an instance of %s", new Object[]{next, "com.google.firebase.components.ComponentRegistrar"});
                } else {
                    arrayList.add((h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not an found.", new Object[]{next});
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{next});
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{next});
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{next});
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{next});
            }
        }
        return arrayList;
    }

    public List<h> a() {
        return c(this.b.a(this.a));
    }
}
