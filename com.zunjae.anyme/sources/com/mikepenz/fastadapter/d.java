package com.mikepenz.fastadapter;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.mikepenz.fastadapter.l;
import java.util.List;
import javax.annotation.Nullable;

public interface d<Item extends l> {
    void a(int i, int i2);

    boolean b(View view, int i, b<Item> bVar, Item item);

    void c(int i, int i2);

    boolean d(View view, MotionEvent motionEvent, int i, b<Item> bVar, Item item);

    void e(@Nullable Bundle bundle, String str);

    boolean f(View view, int i, b<Item> bVar, Item item);

    d<Item> g(b<Item> bVar);

    void h(List<Item> list, boolean z);

    void i(@Nullable Bundle bundle, String str);

    void j(@Nullable CharSequence charSequence);

    void k();

    void l(int i, int i2, @Nullable Object obj);
}
