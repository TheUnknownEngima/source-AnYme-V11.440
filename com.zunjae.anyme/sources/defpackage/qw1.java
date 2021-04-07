package defpackage;

import com.zunjae.anyme.C0272R$color;

/* renamed from: qw1  reason: default package */
public enum qw1 {
    Normal(C0272R$color.theme_NightBlue_accent, af2.a(-1, 200)),
    Warning(C0272R$color.theme_color_warning, af2.a(-16777216, 200)),
    Error(C0272R$color.theme_color_error, af2.a(-16777216, 200));
    
    private final int backgroundColor;
    private final int textColor;

    private qw1(int i, int i2) {
        this.backgroundColor = i;
        this.textColor = i2;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }
}
