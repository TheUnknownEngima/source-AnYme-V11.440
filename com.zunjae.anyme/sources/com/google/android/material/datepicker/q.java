package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

class q extends LinearLayoutManager {

    class a extends j {
        a(q qVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public void R1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.p(i);
        S1(aVar);
    }
}
