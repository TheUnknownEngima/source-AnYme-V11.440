package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.content.a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.github.mikephil.charting.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public int a = -1;
    Object b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    PorterDuff.Mode h = j;
    public String i = null;

    public IconCompat() {
    }

    private IconCompat(int i2) {
        this.a = i2;
    }

    static Bitmap c(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, Utils.FLOAT_EPSILON, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat e(Context context, int i2) {
        if (context != null) {
            return f(context.getResources(), context.getPackageName(), i2);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat f(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i2;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static int h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    private static String j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Resources k(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", new Object[]{str});
            return null;
        }
    }

    private static int m(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (InvocationTargetException unused2) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        } catch (NoSuchMethodException unused3) {
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            sb.toString();
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable o(android.content.Context r7) {
        /*
            r6 = this;
            int r0 = r6.a
            r1 = 1
            if (r0 == r1) goto L_0x00cc
            r2 = 0
            r3 = 0
            r4 = 2
            if (r0 == r4) goto L_0x009b
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 4
            if (r0 == r1) goto L_0x0027
            r1 = 5
            if (r0 == r1) goto L_0x0015
            goto L_0x00cb
        L_0x0015:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap r1 = c(r1, r2)
            r0.<init>(r7, r1)
            return r0
        L_0x0027:
            java.lang.Object r0 = r6.b
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x005b
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0044
            goto L_0x005b
        L_0x0044:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0053 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.Object r4 = r6.b     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0053 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0053 }
            goto L_0x0075
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from path: "
            goto L_0x006b
        L_0x005b:
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x0064 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0075
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from URI: "
        L_0x006b:
            r1.append(r2)
            r1.append(r0)
            r1.toString()
            r1 = r3
        L_0x0075:
            if (r1 == 0) goto L_0x00cb
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)
            r0.<init>(r7, r1)
            return r0
        L_0x0085:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.b
            byte[] r1 = (byte[]) r1
            int r2 = r6.e
            int r3 = r6.f
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
            r0.<init>(r7, r1)
            return r0
        L_0x009b:
            java.lang.String r0 = r6.i()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x00a9
            java.lang.String r0 = r7.getPackageName()
        L_0x00a9:
            android.content.res.Resources r0 = k(r7, r0)
            int r5 = r6.e     // Catch:{ RuntimeException -> 0x00b8 }
            android.content.res.Resources$Theme r7 = r7.getTheme()     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.drawable.Drawable r7 = defpackage.h2.b(r0, r5, r7)     // Catch:{ RuntimeException -> 0x00b8 }
            return r7
        L_0x00b8:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r0 = r6.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r2] = r0
            java.lang.Object r0 = r6.b
            r7[r1] = r0
            java.lang.String r0 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String.format(r0, r7)
        L_0x00cb:
            return r3
        L_0x00cc:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object r1 = r6.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.o(android.content.Context):android.graphics.drawable.Drawable");
    }

    private static String t(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    public void a(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmap;
        b(context);
        int i2 = this.a;
        if (i2 == 1) {
            bitmap = (Bitmap) this.b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i2 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(i(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.e));
                    return;
                }
                Drawable f2 = a.f(createPackageContext, this.e);
                if (f2.getIntrinsicWidth() > 0) {
                    if (f2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(f2.getIntrinsicWidth(), f2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        f2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        f2.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                f2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                f2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException("Can't find package " + this.b, e2);
            }
        } else if (i2 == 5) {
            bitmap = c((Bitmap) this.b, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    public void b(Context context) {
        if (this.a == 2) {
            String str = (String) this.b;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                int identifier = k(context, str5).getIdentifier(str4, str3, str5);
                if (this.e != identifier) {
                    "Id has changed for " + str5 + "/" + str4;
                    this.e = identifier;
                }
            }
        }
    }

    public int g() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return h((Icon) this.b);
        }
        if (this.a == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String i() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.b);
        }
        if (this.a == 2) {
            return ((String) this.b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int l() {
        return (this.a != -1 || Build.VERSION.SDK_INT < 23) ? this.a : m((Icon) this.b);
    }

    public Drawable n(Context context) {
        b(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return s().loadDrawable(context);
        }
        Drawable o = o(context);
        if (!(o == null || (this.g == null && this.h == j))) {
            o.mutate();
            a.o(o, this.g);
            a.p(o, this.h);
        }
        return o;
    }

    public void p() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        int i2 = this.a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.b = this.c;
                        return;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            return;
                        }
                    }
                }
                this.b = new String(this.c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.d;
            if (parcelable == null) {
                byte[] bArr = this.c;
                this.b = bArr;
                this.a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            }
        } else {
            parcelable = this.d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.b = parcelable;
    }

    public void q(boolean z) {
        this.i = this.h.name();
        int i2 = this.a;
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 == 3) {
                    this.c = (byte[]) this.b;
                    return;
                } else if (i2 == 4) {
                    this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i2 != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.d = (Parcelable) this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle r() {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r4.a
            r2 = -1
            java.lang.String r3 = "obj"
            if (r1 == r2) goto L_0x0039
            r2 = 1
            if (r1 == r2) goto L_0x0034
            r2 = 2
            if (r1 == r2) goto L_0x002c
            r2 = 3
            if (r1 == r2) goto L_0x0024
            r2 = 4
            if (r1 == r2) goto L_0x002c
            r2 = 5
            if (r1 != r2) goto L_0x001c
            goto L_0x0034
        L_0x001c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            java.lang.Object r1 = r4.b
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r3, r1)
            goto L_0x0040
        L_0x002c:
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r3, r1)
            goto L_0x0040
        L_0x0034:
            java.lang.Object r1 = r4.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L_0x003d
        L_0x0039:
            java.lang.Object r1 = r4.b
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L_0x003d:
            r0.putParcelable(r3, r1)
        L_0x0040:
            int r1 = r4.a
            java.lang.String r2 = "type"
            r0.putInt(r2, r1)
            int r1 = r4.e
            java.lang.String r2 = "int1"
            r0.putInt(r2, r1)
            int r1 = r4.f
            java.lang.String r2 = "int2"
            r0.putInt(r2, r1)
            android.content.res.ColorStateList r1 = r4.g
            if (r1 == 0) goto L_0x005e
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L_0x005e:
            android.graphics.PorterDuff$Mode r1 = r4.h
            android.graphics.PorterDuff$Mode r2 = j
            if (r1 == r2) goto L_0x006d
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.r():android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon s() {
        /*
            r3 = this;
            int r0 = r3.a
            r1 = -1
            if (r0 == r1) goto L_0x006f
            r1 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 2
            if (r0 == r1) goto L_0x004b
            r1 = 3
            if (r0 == r1) goto L_0x003e
            r1 = 4
            if (r0 == r1) goto L_0x0035
            r1 = 5
            if (r0 != r1) goto L_0x002d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0023
            java.lang.Object r0 = r3.b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            goto L_0x005e
        L_0x0023:
            java.lang.Object r0 = r3.b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = 0
            android.graphics.Bitmap r0 = c(r0, r1)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown type"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r0 = r3.b
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x005e
        L_0x003e:
            java.lang.Object r0 = r3.b
            byte[] r0 = (byte[]) r0
            int r1 = r3.e
            int r2 = r3.f
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithData(r0, r1, r2)
            goto L_0x005e
        L_0x004b:
            java.lang.String r0 = r3.i()
            int r1 = r3.e
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r0, r1)
            goto L_0x005e
        L_0x0056:
            java.lang.Object r0 = r3.b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x005a:
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x005e:
            android.content.res.ColorStateList r1 = r3.g
            if (r1 == 0) goto L_0x0065
            r0.setTintList(r1)
        L_0x0065:
            android.graphics.PorterDuff$Mode r1 = r3.h
            android.graphics.PorterDuff$Mode r2 = j
            if (r1 == r2) goto L_0x006e
            r0.setTintMode(r1)
        L_0x006e:
            return r0
        L_0x006f:
            java.lang.Object r0 = r3.b
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.s():android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.a
            java.lang.String r1 = t(r1)
            r0.append(r1)
            int r1 = r4.a
            r2 = 1
            if (r1 == r2) goto L_0x0077
            r3 = 2
            if (r1 == r3) goto L_0x004f
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x0077
            goto L_0x0097
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.b
            r0.append(r1)
            goto L_0x0097
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.e
            r0.append(r1)
            int r1 = r4.f
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f
            goto L_0x0094
        L_0x004f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.i()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.g()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0097
        L_0x0077:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0094:
            r0.append(r1)
        L_0x0097:
            android.content.res.ColorStateList r1 = r4.g
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.g
            r0.append(r1)
        L_0x00a5:
            android.graphics.PorterDuff$Mode r1 = r4.h
            android.graphics.PorterDuff$Mode r2 = j
            if (r1 == r2) goto L_0x00b5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.h
            r0.append(r1)
        L_0x00b5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
