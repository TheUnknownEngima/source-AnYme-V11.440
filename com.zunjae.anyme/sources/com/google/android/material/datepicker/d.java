package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

public interface d<S> extends Parcelable {
    void G0(long j);

    View U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    int e0(Context context);

    boolean k0();

    Collection<Long> p0();

    String r(Context context);

    Collection<q3<Long, Long>> t();

    S u0();
}
