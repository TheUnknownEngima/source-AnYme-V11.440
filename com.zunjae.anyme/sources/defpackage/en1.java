package defpackage;

import android.text.ParcelableSpan;
import android.text.style.CharacterStyle;

/* renamed from: en1  reason: default package */
public class en1 {
    public int a;
    public int b;
    public String c;
    public an1 d;
    public ParcelableSpan e;
    public CharacterStyle f;
    public int g = 33;

    public en1(int i, int i2, ParcelableSpan parcelableSpan, int i3) {
        this.a = i;
        this.b = i2;
        this.e = parcelableSpan;
        this.g = i3;
    }

    public en1(int i, int i2, CharacterStyle characterStyle, int i3) {
        this.a = i;
        this.b = i2;
        this.f = characterStyle;
        this.g = i3;
    }

    public en1(int i, int i2, String str, an1 an1) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = an1;
    }
}
