package com.google.android.flexbox;

import android.view.View;
import java.util.List;

interface a {
    void b(View view, int i, int i2, c cVar);

    void c(c cVar);

    View d(int i);

    int e(int i, int i2, int i3);

    void f(int i, View view);

    View g(int i);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int h(View view, int i, int i2);

    int i(int i, int i2, int i3);

    boolean j();

    int k(View view);

    void setFlexLines(List<c> list);
}
