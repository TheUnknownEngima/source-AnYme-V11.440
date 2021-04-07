package com.zunjae.anyme.features.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.shows_list.AnimeLightCardViewAdapter;
import java.util.HashMap;
import java.util.List;

public final class CustomizeActivity extends AbstractActivity {
    /* access modifiers changed from: private */
    public final int D = 2;
    /* access modifiers changed from: private */
    public final int E = 200;
    private AnimeLightCardViewAdapter F;
    private final d22 G = g22.b(new a(this, (oh2) null, (o52) null));
    private HashMap H;

    public static final class a extends w62 implements o52<nu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return lg2.b(this.f, f72.b(nu1.class), this.g, this.h);
        }
    }

    public static final class b implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ CustomizeActivity a;

        b(CustomizeActivity customizeActivity) {
            this.a = customizeActivity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            v62.e(seekBar, "seekBar");
            int o0 = i + this.a.D;
            TextView textView = (TextView) this.a.l0(C0275R$id.seekBarColumnsValue);
            v62.d(textView, "seekBarColumnsValue");
            textView.setText("" + o0);
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(this.a.T(), (RecyclerView) this.a.l0(C0275R$id.recyclerView), CustomizeActivity.m0(this.a));
            cVar.b(o0);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.a();
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            v62.e(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            v62.e(seekBar, "seekBar");
        }
    }

    public static final class c implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ CustomizeActivity a;

        c(CustomizeActivity customizeActivity) {
            this.a = customizeActivity;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            v62.e(seekBar, "seekBar");
            int p0 = i + this.a.E;
            TextView textView = (TextView) this.a.l0(C0275R$id.seekBarImageHeightValue);
            v62.d(textView, "seekBarImageHeightValue");
            textView.setText("" + p0);
            CustomizeActivity.m0(this.a).K(p0);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            v62.e(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            v62.e(seekBar, "seekBar");
        }
    }

    static final class d<T> implements u<List<? extends sy1>> {
        final /* synthetic */ CustomizeActivity a;

        d(CustomizeActivity customizeActivity) {
            this.a = customizeActivity;
        }

        /* renamed from: b */
        public final void a(List<sy1> list) {
            CustomizeActivity.m0(this.a).J(list);
        }
    }

    static final class e implements View.OnClickListener {
        final /* synthetic */ CustomizeActivity e;

        e(CustomizeActivity customizeActivity) {
            this.e = customizeActivity;
        }

        public final void onClick(View view) {
            this.e.t0();
        }
    }

    static final class f implements View.OnClickListener {
        final /* synthetic */ CustomizeActivity e;

        f(CustomizeActivity customizeActivity) {
            this.e = customizeActivity;
        }

        public final void onClick(View view) {
            this.e.u0();
        }
    }

    private final nu1 S() {
        return (nu1) this.G.getValue();
    }

    public static final /* synthetic */ AnimeLightCardViewAdapter m0(CustomizeActivity customizeActivity) {
        AnimeLightCardViewAdapter animeLightCardViewAdapter = customizeActivity.F;
        if (animeLightCardViewAdapter != null) {
            return animeLightCardViewAdapter;
        }
        v62.p("adapter");
        throw null;
    }

    private final void s0() {
        ((SeekBar) l0(C0275R$id.seekBarColumns)).setOnSeekBarChangeListener(new b(this));
        ((SeekBar) l0(C0275R$id.seekBarImageHeight)).setOnSeekBarChangeListener(new c(this));
        int a2 = xu1.i.a();
        int b2 = xu1.i.b(true);
        SeekBar seekBar = (SeekBar) l0(C0275R$id.seekBarColumns);
        v62.d(seekBar, "seekBarColumns");
        seekBar.setProgress(a2 - this.D);
        TextView textView = (TextView) l0(C0275R$id.seekBarColumnsValue);
        v62.d(textView, "seekBarColumnsValue");
        textView.setText("" + a2);
        SeekBar seekBar2 = (SeekBar) l0(C0275R$id.seekBarImageHeight);
        v62.d(seekBar2, "seekBarImageHeight");
        seekBar2.setProgress(b2 - this.E);
        TextView textView2 = (TextView) l0(C0275R$id.seekBarImageHeightValue);
        v62.d(textView2, "seekBarImageHeightValue");
        textView2.setText("" + b2);
    }

    /* access modifiers changed from: private */
    public final void t0() {
        xu1.i.j();
        xu1.i.k();
        w0(this.E);
        TextView textView = (TextView) l0(C0275R$id.seekBarColumnsValue);
        v62.d(textView, "seekBarColumnsValue");
        textView.setText("" + this.D);
        TextView textView2 = (TextView) l0(C0275R$id.seekBarImageHeightValue);
        v62.d(textView2, "seekBarImageHeightValue");
        textView2.setText("" + this.E);
        SeekBar seekBar = (SeekBar) l0(C0275R$id.seekBarColumns);
        v62.d(seekBar, "seekBarColumns");
        seekBar.setProgress(0);
        SeekBar seekBar2 = (SeekBar) l0(C0275R$id.seekBarImageHeight);
        v62.d(seekBar2, "seekBarImageHeight");
        seekBar2.setProgress(0);
        Toast.makeText(T(), "Settings reset!", 0).show();
        setResult(lv1.f.d());
        finish();
    }

    /* access modifiers changed from: private */
    public final void u0() {
        TextView textView = (TextView) l0(C0275R$id.seekBarColumnsValue);
        v62.d(textView, "seekBarColumnsValue");
        int parseInt = Integer.parseInt(textView.getText().toString());
        TextView textView2 = (TextView) l0(C0275R$id.seekBarImageHeightValue);
        v62.d(textView2, "seekBarImageHeightValue");
        int parseInt2 = Integer.parseInt(textView2.getText().toString());
        xu1.i.l(parseInt);
        xu1.i.m(parseInt2);
        Toast.makeText(T(), "Settings saved!", 0).show();
        setResult(lv1.f.d());
        finish();
    }

    private final void v0() {
        ((Button) l0(C0275R$id.resetButton)).setOnClickListener(new e(this));
        ((Button) l0(C0275R$id.saveButton)).setOnClickListener(new f(this));
    }

    private final void w0(int i) {
        AnimeLightCardViewAdapter animeLightCardViewAdapter = this.F;
        if (animeLightCardViewAdapter != null) {
            animeLightCardViewAdapter.K(i);
        } else {
            v62.p("adapter");
            throw null;
        }
    }

    public View l0(int i) {
        if (this.H == null) {
            this.H = new HashMap();
        }
        View view = (View) this.H.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.H.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_customize_activity);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        int a2 = xu1.i.a();
        this.F = new AnimeLightCardViewAdapter(this);
        Context T = T();
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        AnimeLightCardViewAdapter animeLightCardViewAdapter = this.F;
        if (animeLightCardViewAdapter != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(T, recyclerView, animeLightCardViewAdapter);
            cVar.b(a2);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.a();
            S().m().g(this, new d(this));
            s0();
            v0();
            return;
        }
        v62.p("adapter");
        throw null;
    }
}
