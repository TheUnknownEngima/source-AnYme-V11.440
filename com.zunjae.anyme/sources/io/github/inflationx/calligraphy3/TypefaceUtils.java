package io.github.inflationx.calligraphy3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

public final class TypefaceUtils {
    private static final Map<String, Typeface> sCachedFonts = new HashMap();
    private static final Map<Typeface, CalligraphyTypefaceSpan> sCachedSpans = new HashMap();

    private TypefaceUtils() {
    }

    public static CalligraphyTypefaceSpan getSpan(Typeface typeface) {
        if (typeface == null) {
            return null;
        }
        synchronized (sCachedSpans) {
            if (!sCachedSpans.containsKey(typeface)) {
                CalligraphyTypefaceSpan calligraphyTypefaceSpan = new CalligraphyTypefaceSpan(typeface);
                sCachedSpans.put(typeface, calligraphyTypefaceSpan);
                return calligraphyTypefaceSpan;
            }
            CalligraphyTypefaceSpan calligraphyTypefaceSpan2 = sCachedSpans.get(typeface);
            return calligraphyTypefaceSpan2;
        }
    }

    public static boolean isLoaded(Typeface typeface) {
        return typeface != null && sCachedFonts.containsValue(typeface);
    }

    public static Typeface load(AssetManager assetManager, String str) {
        synchronized (sCachedFonts) {
            try {
                if (!sCachedFonts.containsKey(str)) {
                    Typeface createFromFile = str.startsWith("/") ? Typeface.createFromFile(str) : Typeface.createFromAsset(assetManager, str);
                    sCachedFonts.put(str, createFromFile);
                    return createFromFile;
                }
                Typeface typeface = sCachedFonts.get(str);
                return typeface;
            } catch (Exception unused) {
                "Can't create asset from " + str + ". Make sure you have passed in the correct path and file name.";
                sCachedFonts.put(str, (Object) null);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
