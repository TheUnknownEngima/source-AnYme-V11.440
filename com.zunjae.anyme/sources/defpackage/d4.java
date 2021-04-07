package defpackage;

import android.view.MotionEvent;

/* renamed from: d4  reason: default package */
public final class d4 {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
