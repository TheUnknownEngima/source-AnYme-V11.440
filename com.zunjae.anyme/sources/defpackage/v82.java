package defpackage;

import java.util.regex.Matcher;

/* renamed from: v82  reason: default package */
public final class v82 {
    /* access modifiers changed from: private */
    public static final s82 b(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new t82(matcher, charSequence);
    }
}
