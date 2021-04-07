package mehdi.sakout.fancybuttons;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class a {
    private static Map<String, Typeface> a = new HashMap();

    public static Typeface a(Context context, String str, String str2) {
        if (str == null) {
            return Typeface.DEFAULT;
        }
        String name = new File(str).getName();
        String name2 = !TextUtils.isEmpty(str2) ? new File(str2).getName() : "";
        if (a.containsKey(name)) {
            return a.get(name);
        }
        try {
            AssetManager assets = context.getResources().getAssets();
            if (Arrays.asList(assets.list("")).contains(str)) {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), name);
                a.put(name, createFromAsset);
                return createFromAsset;
            } else if (Arrays.asList(assets.list("fonts")).contains(name)) {
                Typeface createFromAsset2 = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[]{name}));
                a.put(name, createFromAsset2);
                return createFromAsset2;
            } else if (Arrays.asList(assets.list("iconfonts")).contains(name)) {
                Typeface createFromAsset3 = Typeface.createFromAsset(context.getAssets(), String.format("iconfonts/%s", new Object[]{name}));
                a.put(name, createFromAsset3);
                return createFromAsset3;
            } else if (TextUtils.isEmpty(str2) || !Arrays.asList(assets.list("")).contains(str2)) {
                throw new Exception("Font not Found");
            } else {
                Typeface createFromAsset4 = Typeface.createFromAsset(context.getAssets(), str2);
                a.put(name2, createFromAsset4);
                return createFromAsset4;
            }
        } catch (Exception unused) {
            String str3 = FancyButton.Q;
            String.format("Unable to find %s font. Using Typeface.DEFAULT instead.", new Object[]{name});
            a.put(name, Typeface.DEFAULT);
            return Typeface.DEFAULT;
        }
    }

    public static int b(Context context, float f) {
        return Math.round(f / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int c(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().scaledDensity);
    }
}
