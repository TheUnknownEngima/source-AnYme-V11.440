package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.g;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    int e = 0;
    final HashMap<Integer, String> f = new HashMap<>();
    final RemoteCallbackList<f> g = new a();
    private final g.a h = new b();

    class a extends RemoteCallbackList<f> {
        a() {
        }

        /* renamed from: a */
        public void onCallbackDied(f fVar, Object obj) {
            MultiInstanceInvalidationService.this.f.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends g.a {
        b() {
        }

        public int L0(f fVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.g) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.e + 1;
                multiInstanceInvalidationService.e = i;
                if (MultiInstanceInvalidationService.this.g.register(fVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.e--;
                return 0;
            }
        }

        public void S2(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.g) {
                String str = MultiInstanceInvalidationService.this.f.get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.g.beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.g.getBroadcastCookie(i2)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f.get(Integer.valueOf(intValue));
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    MultiInstanceInvalidationService.this.g.getBroadcastItem(i2).y0(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.g.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.g.finishBroadcast();
                }
            }
        }

        public void i3(f fVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.g) {
                MultiInstanceInvalidationService.this.g.unregister(fVar);
                MultiInstanceInvalidationService.this.f.remove(Integer.valueOf(i));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.h;
    }
}
