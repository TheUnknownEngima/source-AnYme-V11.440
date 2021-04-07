package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: mn1  reason: default package */
public class mn1 implements an1 {
    private static Typeface a;

    /* renamed from: mn1$a */
    public enum a implements zm1 {
        mdf_arrow_drop_down(58821),
        mdf_arrow_drop_up(58823),
        mdf_expand_less(58830),
        mdf_expand_more(58831),
        mdf_person(59389);
        
        private static an1 typeface;
        char character;

        private a(char c) {
            this.character = c;
        }

        public char getCharacter() {
            return this.character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public String getName() {
            return name();
        }

        public an1 getTypeface() {
            if (typeface == null) {
                typeface = new mn1();
            }
            return typeface;
        }
    }

    public zm1 getIcon(String str) {
        return a.valueOf(str);
    }

    public String getMappingPrefix() {
        return "mdf";
    }

    public Typeface getTypeface(Context context) {
        if (a == null) {
            try {
                a = Typeface.createFromAsset(context.getAssets(), "fonts/materialdrawerfont-font-v5.0.0.ttf");
            } catch (Exception unused) {
                return null;
            }
        }
        return a;
    }
}
