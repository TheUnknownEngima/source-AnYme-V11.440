package defpackage;

import android.os.IBinder;
import defpackage.w80;
import java.lang.reflect.Field;

/* renamed from: x80  reason: default package */
public final class x80<T> extends w80.a {
    private final T a;

    private x80(T t) {
        this.a = t;
    }

    public static <T> T r3(w80 w80) {
        if (w80 instanceof x80) {
            return ((x80) w80).a;
        }
        IBinder asBinder = w80.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    public static <T> w80 s3(T t) {
        return new x80(t);
    }
}
