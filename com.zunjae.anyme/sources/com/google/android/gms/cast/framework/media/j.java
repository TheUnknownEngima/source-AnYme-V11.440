package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.fragment.app.c;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.R$id;
import com.google.android.gms.cast.framework.R$layout;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class j extends c {
    private boolean o0;
    private List<MediaTrack> p0;
    private List<MediaTrack> q0;
    private long[] r0;
    /* access modifiers changed from: private */
    public Dialog s0;
    private i t0;
    private MediaInfo u0;
    private long[] v0;

    public static j X1() {
        return new j();
    }

    private static int Y1(List<MediaTrack> list, long[] jArr, int i) {
        if (!(jArr == null || list == null)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                for (long j : jArr) {
                    if (j == list.get(i2).k()) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }

    private static ArrayList<MediaTrack> b2(List<MediaTrack> list, int i) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        if (list != null) {
            for (MediaTrack next : list) {
                if (next.p() == i) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void d2(z zVar, z zVar2) {
        if (!this.o0 || !this.t0.o()) {
            e2();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack a = zVar.a();
        if (!(a == null || a.k() == -1)) {
            arrayList.add(Long.valueOf(a.k()));
        }
        MediaTrack a2 = zVar2.a();
        if (a2 != null) {
            arrayList.add(Long.valueOf(a2.k()));
        }
        long[] jArr = this.r0;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            for (MediaTrack k : this.q0) {
                hashSet.add(Long.valueOf(k.k()));
            }
            for (MediaTrack k2 : this.p0) {
                hashSet.add(Long.valueOf(k2.k()));
            }
            for (long j : this.r0) {
                if (!hashSet.contains(Long.valueOf(j))) {
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr2[i] = ((Long) arrayList.get(i)).longValue();
        }
        Arrays.sort(jArr2);
        this.t0.J(jArr2);
        e2();
    }

    private final void e2() {
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.cancel();
            this.s0 = null;
        }
    }

    public Dialog P1(Bundle bundle) {
        int Y1 = Y1(this.p0, this.r0, 0);
        int Y12 = Y1(this.q0, this.r0, -1);
        z zVar = new z(n(), this.p0, Y1);
        z zVar2 = new z(n(), this.q0, Y12);
        AlertDialog.Builder builder = new AlertDialog.Builder(n());
        View inflate = n().getLayoutInflater().inflate(R$layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R$id.text_list_view);
        ListView listView2 = (ListView) inflate.findViewById(R$id.audio_list_view);
        TabHost tabHost = (TabHost) inflate.findViewById(R$id.tab_host);
        tabHost.setup();
        if (zVar.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter(zVar);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(R$id.text_list_view);
            newTabSpec.setIndicator(n().getString(R$string.cast_tracks_chooser_dialog_subtitles));
            tabHost.addTab(newTabSpec);
        }
        if (zVar2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter(zVar2);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(R$id.audio_list_view);
            newTabSpec2.setIndicator(n().getString(R$string.cast_tracks_chooser_dialog_audio));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(inflate).setPositiveButton(n().getString(R$string.cast_tracks_chooser_dialog_ok), new a0(this, zVar, zVar2)).setNegativeButton(R$string.cast_tracks_chooser_dialog_cancel, new y(this));
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.cancel();
            this.s0 = null;
        }
        AlertDialog create = builder.create();
        this.s0 = create;
        return create;
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        this.o0 = true;
        this.q0 = new ArrayList();
        this.p0 = new ArrayList();
        this.r0 = new long[0];
        com.google.android.gms.cast.framework.c c = a.d(u()).b().c();
        if (c == null || !c.c()) {
            this.o0 = false;
            return;
        }
        i p = c.p();
        this.t0 = p;
        if (p == null || !p.o() || this.t0.j() == null) {
            this.o0 = false;
            return;
        }
        long[] jArr = this.v0;
        if (jArr != null) {
            this.r0 = jArr;
        } else {
            q k = this.t0.k();
            if (k != null) {
                this.r0 = k.i();
            }
        }
        MediaInfo mediaInfo = this.u0;
        if (mediaInfo == null) {
            mediaInfo = this.t0.j();
        }
        if (mediaInfo == null) {
            this.o0 = false;
            return;
        }
        List<MediaTrack> o = mediaInfo.o();
        if (o == null) {
            this.o0 = false;
            return;
        }
        this.q0 = b2(o, 2);
        ArrayList<MediaTrack> b2 = b2(o, 1);
        this.p0 = b2;
        if (!b2.isEmpty()) {
            List<MediaTrack> list = this.p0;
            MediaTrack.a aVar = new MediaTrack.a(-1, 1);
            aVar.c(n().getString(R$string.cast_tracks_chooser_dialog_none));
            aVar.d(2);
            aVar.b("");
            list.add(0, aVar.a());
        }
    }

    public void u0() {
        if (N1() != null && J()) {
            N1().setDismissMessage((Message) null);
        }
        super.u0();
    }
}
