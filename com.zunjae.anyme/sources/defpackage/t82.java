package defpackage;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: t82  reason: default package */
final class t82 implements s82 {
    private final Matcher a;

    public t82(Matcher matcher, CharSequence charSequence) {
        v62.e(matcher, "matcher");
        v62.e(charSequence, "input");
        this.a = matcher;
    }

    private final MatchResult a() {
        return this.a;
    }

    public String getValue() {
        String group = a().group();
        v62.d(group, "matchResult.group()");
        return group;
    }
}
