package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.cast.framework.g;
import org.json.JSONObject;

@Keep
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static void zza(c cVar, long j) {
        i zzi;
        if (j != 0 && (zzi = zzi(cVar)) != null && !zzi.q() && !zzi.u()) {
            zzi.G(zzi.g() + j);
        }
    }

    private static void zzh(c cVar) {
        i zzi = zzi(cVar);
        if (zzi != null) {
            zzi.L();
        }
    }

    private static i zzi(c cVar) {
        if (cVar == null || !cVar.c()) {
            return null;
        }
        return cVar.p();
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            g b = a.d(context).b();
            char c = 65535;
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(ACTION_REWIND)) {
                        c = 4;
                        break;
                    }
                    break;
                case -945151566:
                    if (action.equals(ACTION_SKIP_NEXT)) {
                        c = 1;
                        break;
                    }
                    break;
                case -945080078:
                    if (action.equals(ACTION_SKIP_PREV)) {
                        c = 2;
                        break;
                    }
                    break;
                case -668151673:
                    if (action.equals(ACTION_STOP_CASTING)) {
                        c = 5;
                        break;
                    }
                    break;
                case -124479363:
                    if (action.equals(ACTION_DISCONNECT)) {
                        c = 6;
                        break;
                    }
                    break;
                case 235550565:
                    if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1362116196:
                    if (action.equals(ACTION_FORWARD)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    onReceiveActionTogglePlayback(b.d());
                    return;
                case 1:
                    onReceiveActionSkipNext(b.d());
                    return;
                case 2:
                    onReceiveActionSkipPrev(b.d());
                    return;
                case 3:
                    onReceiveActionForward(b.d(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0));
                    return;
                case 4:
                    onReceiveActionRewind(b.d(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0));
                    return;
                case 5:
                    b.b(true);
                    return;
                case 6:
                    b.b(false);
                    return;
                case 7:
                    onReceiveActionMediaButton(b.d(), intent);
                    return;
                default:
                    onReceiveOtherAction(context, action, intent);
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionForward(f fVar, long j) {
        if (fVar instanceof c) {
            zza((c) fVar, j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionMediaButton(f fVar, Intent intent) {
        KeyEvent keyEvent;
        if ((fVar instanceof c) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            zzh((c) fVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionRewind(f fVar, long j) {
        if (fVar instanceof c) {
            zza((c) fVar, -j);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipNext(f fVar) {
        i zzi;
        if ((fVar instanceof c) && (zzi = zzi((c) fVar)) != null && !zzi.u()) {
            zzi.A((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionSkipPrev(f fVar) {
        i zzi;
        if ((fVar instanceof c) && (zzi = zzi((c) fVar)) != null && !zzi.u()) {
            zzi.B((JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveActionTogglePlayback(f fVar) {
        if (fVar instanceof c) {
            zzh((c) fVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction((Context) null, str, intent);
    }
}
