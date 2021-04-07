package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: rs1  reason: default package */
public abstract class rs1 extends qs1 {
    public abstract void L1(Intent intent);

    public abstract int M1();

    public abstract int N1();

    public abstract void O1();

    public abstract void P1(MenuItem menuItem);

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(N1(), viewGroup, false);
    }
}
