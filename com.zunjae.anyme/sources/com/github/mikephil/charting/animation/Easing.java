package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;
import com.github.mikephil.charting.utils.Utils;

public class Easing {
    private static final float DOUBLE_PI = 6.2831855f;
    public static final EasingFunction EaseInBack = new EasingFunction() {
        public float getInterpolation(float f) {
            return f * f * ((f * 2.70158f) - 1.70158f);
        }
    };
    public static final EasingFunction EaseInBounce = new EasingFunction() {
        public float getInterpolation(float f) {
            return 1.0f - Easing.EaseOutBounce.getInterpolation(1.0f - f);
        }
    };
    public static final EasingFunction EaseInCirc = new EasingFunction() {
        public float getInterpolation(float f) {
            return -(((float) Math.sqrt((double) (1.0f - (f * f)))) - 1.0f);
        }
    };
    public static final EasingFunction EaseInCubic = new EasingFunction() {
        public float getInterpolation(float f) {
            return (float) Math.pow((double) f, 3.0d);
        }
    };
    public static final EasingFunction EaseInElastic = new EasingFunction() {
        public float getInterpolation(float f) {
            if (f == Utils.FLOAT_EPSILON) {
                return Utils.FLOAT_EPSILON;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f - 1.0f;
            return -(((float) Math.pow(2.0d, (double) (10.0f * f2))) * ((float) Math.sin((double) (((f2 - (0.047746483f * ((float) Math.asin(1.0d)))) * Easing.DOUBLE_PI) / 0.3f))));
        }
    };
    public static final EasingFunction EaseInExpo = new EasingFunction() {
        public float getInterpolation(float f) {
            return f == Utils.FLOAT_EPSILON ? Utils.FLOAT_EPSILON : (float) Math.pow(2.0d, (double) ((f - 1.0f) * 10.0f));
        }
    };
    public static final EasingFunction EaseInOutBack = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return f2 * f2 * ((3.5949094f * f2) - 2.5949094f) * 0.5f;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * ((3.5949094f * f3) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInOutBounce = new EasingFunction() {
        public float getInterpolation(float f) {
            return f < 0.5f ? Easing.EaseInBounce.getInterpolation(f * 2.0f) * 0.5f : (Easing.EaseOutBounce.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    };
    public static final EasingFunction EaseInOutCirc = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return (((float) Math.sqrt((double) (1.0f - (f2 * f2)))) - 1.0f) * -0.5f;
            }
            float f3 = f2 - 2.0f;
            return (((float) Math.sqrt((double) (1.0f - (f3 * f3)))) + 1.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInOutCubic = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            return (f2 < 1.0f ? (float) Math.pow((double) f2, 3.0d) : ((float) Math.pow((double) (f2 - 2.0f), 3.0d)) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInOutElastic = new EasingFunction() {
        public float getInterpolation(float f) {
            if (f == Utils.FLOAT_EPSILON) {
                return Utils.FLOAT_EPSILON;
            }
            float f2 = f * 2.0f;
            if (f2 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f2 < 1.0f) {
                float f3 = f2 - 1.0f;
                return ((float) Math.pow(2.0d, (double) (10.0f * f3))) * ((float) Math.sin((double) (((f3 * 1.0f) - asin) * Easing.DOUBLE_PI * 2.2222223f))) * -0.5f;
            }
            float f4 = f2 - 1.0f;
            return (((float) Math.pow(2.0d, (double) (-10.0f * f4))) * 0.5f * ((float) Math.sin((double) (((f4 * 1.0f) - asin) * Easing.DOUBLE_PI * 2.2222223f)))) + 1.0f;
        }
    };
    public static final EasingFunction EaseInOutExpo = new EasingFunction() {
        public float getInterpolation(float f) {
            if (f == Utils.FLOAT_EPSILON) {
                return Utils.FLOAT_EPSILON;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f * 2.0f;
            return (f2 < 1.0f ? (float) Math.pow(2.0d, (double) ((f2 - 1.0f) * 10.0f)) : (-((float) Math.pow(2.0d, (double) ((f2 - 1.0f) * -10.0f)))) + 2.0f) * 0.5f;
        }
    };
    public static final EasingFunction EaseInOutQuad = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * -0.5f;
        }
    };
    public static final EasingFunction EaseInOutQuart = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f * 2.0f;
            return f2 < 1.0f ? ((float) Math.pow((double) f2, 4.0d)) * 0.5f : (((float) Math.pow((double) (f2 - 2.0f), 4.0d)) - 2.0f) * -0.5f;
        }
    };
    public static final EasingFunction EaseInOutSine = new EasingFunction() {
        public float getInterpolation(float f) {
            return (((float) Math.cos(((double) f) * 3.141592653589793d)) - 1.0f) * -0.5f;
        }
    };
    public static final EasingFunction EaseInQuad = new EasingFunction() {
        public float getInterpolation(float f) {
            return f * f;
        }
    };
    public static final EasingFunction EaseInQuart = new EasingFunction() {
        public float getInterpolation(float f) {
            return (float) Math.pow((double) f, 4.0d);
        }
    };
    public static final EasingFunction EaseInSine = new EasingFunction() {
        public float getInterpolation(float f) {
            return (-((float) Math.cos(((double) f) * 1.5707963267948966d))) + 1.0f;
        }
    };
    public static final EasingFunction EaseOutBack = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    };
    public static final EasingFunction EaseOutBounce = new EasingFunction() {
        public float getInterpolation(float f) {
            if (f < 0.36363637f) {
                return 7.5625f * f * f;
            }
            if (f < 0.72727275f) {
                float f2 = f - 0.54545456f;
                return (7.5625f * f2 * f2) + 0.75f;
            } else if (f < 0.90909094f) {
                float f3 = f - 0.8181818f;
                return (7.5625f * f3 * f3) + 0.9375f;
            } else {
                float f4 = f - 0.95454544f;
                return (7.5625f * f4 * f4) + 0.984375f;
            }
        }
    };
    public static final EasingFunction EaseOutCirc = new EasingFunction() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt((double) (1.0f - (f2 * f2)));
        }
    };
    public static final EasingFunction EaseOutCubic = new EasingFunction() {
        public float getInterpolation(float f) {
            return ((float) Math.pow((double) (f - 1.0f), 3.0d)) + 1.0f;
        }
    };
    public static final EasingFunction EaseOutElastic = new EasingFunction() {
        public float getInterpolation(float f) {
            if (f == Utils.FLOAT_EPSILON) {
                return Utils.FLOAT_EPSILON;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (double) (-10.0f * f))) * ((float) Math.sin((double) (((f - (0.047746483f * ((float) Math.asin(1.0d)))) * Easing.DOUBLE_PI) / 0.3f)))) + 1.0f;
        }
    };
    public static final EasingFunction EaseOutExpo = new EasingFunction() {
        public float getInterpolation(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (double) ((f + 1.0f) * -10.0f)));
        }
    };
    public static final EasingFunction EaseOutQuad = new EasingFunction() {
        public float getInterpolation(float f) {
            return (-f) * (f - 2.0f);
        }
    };
    public static final EasingFunction EaseOutQuart = new EasingFunction() {
        public float getInterpolation(float f) {
            return -(((float) Math.pow((double) (f - 1.0f), 4.0d)) - 1.0f);
        }
    };
    public static final EasingFunction EaseOutSine = new EasingFunction() {
        public float getInterpolation(float f) {
            return (float) Math.sin(((double) f) * 1.5707963267948966d);
        }
    };
    public static final EasingFunction Linear = new EasingFunction() {
        public float getInterpolation(float f) {
            return f;
        }
    };

    /* renamed from: com.github.mikephil.charting.animation.Easing$29  reason: invalid class name */
    static /* synthetic */ class AnonymousClass29 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption;

        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|(3:55|56|58)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|58) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.github.mikephil.charting.animation.Easing$EasingOption[] r0 = com.github.mikephil.charting.animation.Easing.EasingOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption = r0
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.Linear     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInQuad     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutQuad     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutQuad     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInCubic     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutCubic     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutCubic     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInQuart     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x006c }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutQuart     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutQuart     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInSine     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutSine     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x009c }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutSine     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInExpo     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutExpo     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutExpo     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInCirc     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutCirc     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutCirc     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInElastic     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutElastic     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutElastic     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInBack     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBack     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x012c }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutBack     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInBounce     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseOutBounce     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption     // Catch:{ NoSuchFieldError -> 0x0150 }
                com.github.mikephil.charting.animation.Easing$EasingOption r1 = com.github.mikephil.charting.animation.Easing.EasingOption.EaseInOutBounce     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.animation.Easing.AnonymousClass29.<clinit>():void");
        }
    }

    public interface EasingFunction extends TimeInterpolator {
        float getInterpolation(float f);
    }

    @Deprecated
    public enum EasingOption {
        Linear,
        EaseInQuad,
        EaseOutQuad,
        EaseInOutQuad,
        EaseInCubic,
        EaseOutCubic,
        EaseInOutCubic,
        EaseInQuart,
        EaseOutQuart,
        EaseInOutQuart,
        EaseInSine,
        EaseOutSine,
        EaseInOutSine,
        EaseInExpo,
        EaseOutExpo,
        EaseInOutExpo,
        EaseInCirc,
        EaseOutCirc,
        EaseInOutCirc,
        EaseInElastic,
        EaseOutElastic,
        EaseInOutElastic,
        EaseInBack,
        EaseOutBack,
        EaseInOutBack,
        EaseInBounce,
        EaseOutBounce,
        EaseInOutBounce
    }

    @Deprecated
    public static EasingFunction getEasingFunctionFromOption(EasingOption easingOption) {
        switch (AnonymousClass29.$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[easingOption.ordinal()]) {
            case 2:
                return EaseInQuad;
            case 3:
                return EaseOutQuad;
            case 4:
                return EaseInOutQuad;
            case 5:
                return EaseInCubic;
            case 6:
                return EaseOutCubic;
            case 7:
                return EaseInOutCubic;
            case 8:
                return EaseInQuart;
            case 9:
                return EaseOutQuart;
            case 10:
                return EaseInOutQuart;
            case 11:
                return EaseInSine;
            case 12:
                return EaseOutSine;
            case 13:
                return EaseInOutSine;
            case 14:
                return EaseInExpo;
            case 15:
                return EaseOutExpo;
            case 16:
                return EaseInOutExpo;
            case 17:
                return EaseInCirc;
            case 18:
                return EaseOutCirc;
            case 19:
                return EaseInOutCirc;
            case 20:
                return EaseInElastic;
            case 21:
                return EaseOutElastic;
            case 22:
                return EaseInOutElastic;
            case 23:
                return EaseInBack;
            case 24:
                return EaseOutBack;
            case 25:
                return EaseInOutBack;
            case 26:
                return EaseInBounce;
            case 27:
                return EaseOutBounce;
            case 28:
                return EaseInOutBounce;
            default:
                return Linear;
        }
    }
}
