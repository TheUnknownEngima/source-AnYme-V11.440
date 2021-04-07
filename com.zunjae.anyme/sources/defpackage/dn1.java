package defpackage;

import android.content.Context;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: dn1  reason: default package */
public class dn1 {
    public static char a = '{';
    public static char b = '}';

    public static void a(Context context, Spannable spannable, List<en1> list, List<CharacterStyle> list2, HashMap<String, List<CharacterStyle>> hashMap) {
        int i;
        int i2;
        int i3;
        for (en1 next : list) {
            Object obj = next.f;
            if (obj == null && (obj = next.e) == null) {
                obj = new cn1("sans-serif", next.d.getTypeface(context));
                i = next.a;
                i2 = next.b;
                i3 = 33;
            } else {
                i = next.a;
                i2 = next.b;
                i3 = next.g;
            }
            spannable.setSpan(obj, i, i2, i3);
            if (hashMap != null && hashMap.containsKey(next.c)) {
                for (CharacterStyle wrap : hashMap.get(next.c)) {
                    spannable.setSpan(CharacterStyle.wrap(wrap), next.a, next.b, next.g);
                }
            } else if (list2 != null) {
                for (CharacterStyle wrap2 : list2) {
                    spannable.setSpan(CharacterStyle.wrap(wrap2), next.a, next.b, next.g);
                }
            }
        }
    }

    public static fn1 b(Spanned spanned, HashMap<String, an1> hashMap) {
        char charValue;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (ParcelableSpan parcelableSpan : (ParcelableSpan[]) spanned.getSpans(0, spanned.length(), ParcelableSpan.class)) {
            linkedList2.add(new en1(spanned.getSpanStart(parcelableSpan), spanned.getSpanEnd(parcelableSpan), parcelableSpan, spanned.getSpanFlags(parcelableSpan)));
        }
        for (CharacterStyle characterStyle : (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class)) {
            linkedList2.add(new en1(spanned.getSpanStart(characterStyle), spanned.getSpanEnd(characterStyle), characterStyle, spanned.getSpanFlags(characterStyle)));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < spanned.length(); i2++) {
            Character valueOf = Character.valueOf(spanned.charAt(i2));
            if (valueOf.charValue() == a) {
                spannableStringBuilder.append(spannableStringBuilder2);
                spannableStringBuilder2 = new SpannableStringBuilder();
                charValue = valueOf.charValue();
            } else {
                if (valueOf.charValue() == b) {
                    spannableStringBuilder2.append(valueOf.charValue());
                    if (spannableStringBuilder2.length() > 5) {
                        en1 c = c(spannableStringBuilder, spannableStringBuilder2, hashMap);
                        if (c != null) {
                            linkedList.add(c);
                            Iterator it = linkedList2.iterator();
                            while (it.hasNext()) {
                                en1 en1 = (en1) it.next();
                                int i3 = en1.a;
                                int i4 = i2 - i;
                                if (i3 > i4) {
                                    en1.a = (i3 - spannableStringBuilder2.length()) + 1;
                                }
                                int i5 = en1.b;
                                if (i5 > i4) {
                                    en1.b = (i5 - spannableStringBuilder2.length()) + 1;
                                }
                            }
                            i += spannableStringBuilder2.length() - 1;
                        }
                    } else {
                        spannableStringBuilder.append(spannableStringBuilder2);
                    }
                    spannableStringBuilder2 = new SpannableStringBuilder();
                } else {
                    int length = spannableStringBuilder2.length();
                    charValue = valueOf.charValue();
                    if (length == 0) {
                        spannableStringBuilder.append(charValue);
                    }
                }
            }
            spannableStringBuilder2.append(charValue);
        }
        spannableStringBuilder.append(spannableStringBuilder2);
        linkedList.addAll(linkedList2);
        return new fn1(spannableStringBuilder, linkedList);
    }

    private static en1 c(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, HashMap<String, an1> hashMap) {
        StringBuilder sb;
        if (spannableStringBuilder2.length() >= 6) {
            String replace = spannableStringBuilder2.subSequence(1, spannableStringBuilder2.length() - 1).toString().replace("-", "_");
            String charSequence = spannableStringBuilder2.subSequence(1, 4).toString();
            try {
                an1 an1 = hashMap.get(charSequence);
                if (an1 != null) {
                    zm1 icon = an1.getIcon(replace);
                    if (icon != null) {
                        spannableStringBuilder.append(icon.getCharacter());
                        return new en1(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), replace, hashMap.get(charSequence));
                    }
                    String str = sm1.a;
                    sb = new StringBuilder();
                    sb.append("Wrong icon name: ");
                } else {
                    String str2 = sm1.a;
                    sb = new StringBuilder();
                    sb.append("Wrong fontId: ");
                }
                sb.append(replace);
                sb.toString();
            } catch (IllegalArgumentException unused) {
                String str3 = sm1.a;
                "Wrong icon name: " + replace;
            }
        }
        spannableStringBuilder.append(spannableStringBuilder2);
        return null;
    }
}
