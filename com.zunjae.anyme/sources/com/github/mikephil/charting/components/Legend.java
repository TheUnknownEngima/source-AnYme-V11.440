package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;

public class Legend extends ComponentBase {
    private List<Boolean> mCalculatedLabelBreakPoints;
    private List<FSize> mCalculatedLabelSizes;
    private List<FSize> mCalculatedLineSizes;
    private LegendDirection mDirection;
    private boolean mDrawInside;
    private LegendEntry[] mEntries;
    private LegendEntry[] mExtraEntries;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendOrientation mOrientation;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    /* renamed from: com.github.mikephil.charting.components.Legend$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ab */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendPosition[] r2 = com.github.mikephil.charting.components.Legend.LegendPosition.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition = r2
                com.github.mikephil.charting.components.Legend$LegendPosition r3 = com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendPosition r2 = com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_INSIDE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x004e }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x006f }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x007b }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x009f }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x00ab }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT     // Catch:{ NoSuchFieldError -> 0x00ab }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ab }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ab }
            L_0x00ab:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.github.mikephil.charting.components.Legend$LegendPosition r1 = com.github.mikephil.charting.components.Legend.LegendPosition.PIECHART_CENTER     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.AnonymousClass1.<clinit>():void");
        }
    }

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    @Deprecated
    public enum LegendPosition {
        RIGHT_OF_CHART,
        RIGHT_OF_CHART_CENTER,
        RIGHT_OF_CHART_INSIDE,
        LEFT_OF_CHART,
        LEFT_OF_CHART_CENTER,
        LEFT_OF_CHART_INSIDE,
        BELOW_CHART_LEFT,
        BELOW_CHART_RIGHT,
        BELOW_CHART_CENTER,
        ABOVE_CHART_LEFT,
        ABOVE_CHART_RIGHT,
        ABOVE_CHART_CENTER,
        PIECHART_CENTER
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.mEntries = new LegendEntry[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
        this.mOrientation = LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = Utils.FLOAT_EPSILON;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = Utils.FLOAT_EPSILON;
        this.mNeededHeight = Utils.FLOAT_EPSILON;
        this.mTextHeightMax = Utils.FLOAT_EPSILON;
        this.mTextWidthMax = Utils.FLOAT_EPSILON;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new ArrayList(16);
        this.mCalculatedLabelBreakPoints = new ArrayList(16);
        this.mCalculatedLineSizes = new ArrayList(16);
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(3.0f);
    }

    @Deprecated
    public Legend(List<Integer> list, List<String> list2) {
        this(Utils.convertIntegers(list), Utils.convertStrings(list2));
    }

    @Deprecated
    public Legend(int[] iArr, String[] strArr) {
        this();
        LegendForm legendForm;
        if (iArr == null || strArr == null) {
            throw new IllegalArgumentException("colors array or labels array is NULL");
        } else if (iArr.length == strArr.length) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Math.min(iArr.length, strArr.length); i++) {
                LegendEntry legendEntry = new LegendEntry();
                int i2 = iArr[i];
                legendEntry.formColor = i2;
                legendEntry.label = strArr[i];
                if (i2 == 1122868) {
                    legendForm = LegendForm.NONE;
                } else if (i2 == 1122867 || i2 == 0) {
                    legendForm = LegendForm.EMPTY;
                } else {
                    arrayList.add(legendEntry);
                }
                legendEntry.form = legendForm;
                arrayList.add(legendEntry);
            }
            this.mEntries = (LegendEntry[]) arrayList.toArray(new LegendEntry[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("colors array and labels array need to be of same size");
        }
    }

    public Legend(LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr != null) {
            this.mEntries = legendEntryArr;
            return;
        }
        throw new IllegalArgumentException("entries array is NULL");
    }

    public void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        float f;
        float f2;
        float f3;
        Paint paint2 = paint;
        float convertDpToPixel = Utils.convertDpToPixel(this.mFormSize);
        float convertDpToPixel2 = Utils.convertDpToPixel(this.mStackSpace);
        float convertDpToPixel3 = Utils.convertDpToPixel(this.mFormToTextSpace);
        float convertDpToPixel4 = Utils.convertDpToPixel(this.mXEntrySpace);
        float convertDpToPixel5 = Utils.convertDpToPixel(this.mYEntrySpace);
        boolean z = this.mWordWrapEnabled;
        LegendEntry[] legendEntryArr = this.mEntries;
        int length = legendEntryArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mOrientation.ordinal()];
        if (i == 1) {
            float f4 = convertDpToPixel;
            float f5 = convertDpToPixel2;
            LegendEntry[] legendEntryArr2 = legendEntryArr;
            float lineHeight = Utils.getLineHeight(paint);
            float f6 = Utils.FLOAT_EPSILON;
            float f7 = Utils.FLOAT_EPSILON;
            float f8 = Utils.FLOAT_EPSILON;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                LegendEntry legendEntry = legendEntryArr2[i2];
                boolean z3 = legendEntry.form != LegendForm.NONE;
                float convertDpToPixel6 = Float.isNaN(legendEntry.formSize) ? f4 : Utils.convertDpToPixel(legendEntry.formSize);
                String str = legendEntry.label;
                if (!z2) {
                    f8 = Utils.FLOAT_EPSILON;
                }
                if (z3) {
                    if (z2) {
                        f8 += f5;
                    }
                    f8 += convertDpToPixel6;
                }
                if (str != null) {
                    if (z3 && !z2) {
                        f8 += convertDpToPixel3;
                    } else if (z2) {
                        f6 = Math.max(f6, f8);
                        f7 += lineHeight + convertDpToPixel5;
                        f8 = Utils.FLOAT_EPSILON;
                        z2 = false;
                    }
                    f8 += (float) Utils.calcTextWidth(paint2, str);
                    if (i2 < length - 1) {
                        f7 += lineHeight + convertDpToPixel5;
                    }
                } else {
                    f8 += convertDpToPixel6;
                    if (i2 < length - 1) {
                        f8 += f5;
                    }
                    z2 = true;
                }
                f6 = Math.max(f6, f8);
            }
            this.mNeededWidth = f6;
            this.mNeededHeight = f7;
        } else if (i == 2) {
            float lineHeight2 = Utils.getLineHeight(paint);
            float lineSpacing = Utils.getLineSpacing(paint) + convertDpToPixel5;
            float contentWidth = viewPortHandler.contentWidth() * this.mMaxSizePercent;
            this.mCalculatedLabelBreakPoints.clear();
            this.mCalculatedLabelSizes.clear();
            this.mCalculatedLineSizes.clear();
            int i3 = 0;
            float f9 = Utils.FLOAT_EPSILON;
            int i4 = -1;
            float f10 = Utils.FLOAT_EPSILON;
            float f11 = Utils.FLOAT_EPSILON;
            while (i3 < length) {
                LegendEntry legendEntry2 = legendEntryArr[i3];
                float f12 = convertDpToPixel;
                float f13 = convertDpToPixel4;
                boolean z4 = legendEntry2.form != LegendForm.NONE;
                float convertDpToPixel7 = Float.isNaN(legendEntry2.formSize) ? f12 : Utils.convertDpToPixel(legendEntry2.formSize);
                String str2 = legendEntry2.label;
                LegendEntry[] legendEntryArr3 = legendEntryArr;
                float f14 = lineSpacing;
                this.mCalculatedLabelBreakPoints.add(Boolean.FALSE);
                float f15 = i4 == -1 ? Utils.FLOAT_EPSILON : f10 + convertDpToPixel2;
                if (str2 != null) {
                    f = convertDpToPixel2;
                    this.mCalculatedLabelSizes.add(Utils.calcTextSize(paint2, str2));
                    f2 = f15 + (z4 ? convertDpToPixel3 + convertDpToPixel7 : Utils.FLOAT_EPSILON) + this.mCalculatedLabelSizes.get(i3).width;
                } else {
                    f = convertDpToPixel2;
                    float f16 = convertDpToPixel7;
                    this.mCalculatedLabelSizes.add(FSize.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
                    f2 = f15 + (z4 ? f16 : Utils.FLOAT_EPSILON);
                    if (i4 == -1) {
                        i4 = i3;
                    }
                }
                if (str2 != null || i3 == length - 1) {
                    float f17 = f11;
                    int i5 = (f17 > Utils.FLOAT_EPSILON ? 1 : (f17 == Utils.FLOAT_EPSILON ? 0 : -1));
                    float f18 = i5 == 0 ? Utils.FLOAT_EPSILON : f13;
                    if (!z || i5 == 0 || contentWidth - f17 >= f18 + f2) {
                        f3 = f17 + f18 + f2;
                    } else {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f17, lineHeight2));
                        float max = Math.max(f9, f17);
                        this.mCalculatedLabelBreakPoints.set(i4 > -1 ? i4 : i3, Boolean.TRUE);
                        f9 = max;
                        f3 = f2;
                    }
                    if (i3 == length - 1) {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f3, lineHeight2));
                        f9 = Math.max(f9, f3);
                    }
                    f11 = f3;
                }
                if (str2 != null) {
                    i4 = -1;
                }
                i3++;
                convertDpToPixel2 = f;
                convertDpToPixel = f12;
                convertDpToPixel4 = f13;
                lineSpacing = f14;
                f10 = f2;
                legendEntryArr = legendEntryArr3;
            }
            float f19 = lineSpacing;
            this.mNeededWidth = f9;
            this.mNeededHeight = (lineHeight2 * ((float) this.mCalculatedLineSizes.size())) + (f19 * ((float) (this.mCalculatedLineSizes.size() == 0 ? 0 : this.mCalculatedLineSizes.size() - 1)));
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    public List<Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public List<FSize> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public List<FSize> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    @Deprecated
    public int[] getColors() {
        int[] iArr = new int[this.mEntries.length];
        int i = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mEntries;
            if (i >= legendEntryArr.length) {
                return iArr;
            }
            iArr[i] = legendEntryArr[i].form == LegendForm.NONE ? ColorTemplate.COLOR_SKIP : legendEntryArr[i].form == LegendForm.EMPTY ? ColorTemplate.COLOR_NONE : legendEntryArr[i].formColor;
            i++;
        }
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public LegendEntry[] getEntries() {
        return this.mEntries;
    }

    @Deprecated
    public int[] getExtraColors() {
        int[] iArr = new int[this.mExtraEntries.length];
        int i = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mExtraEntries;
            if (i >= legendEntryArr.length) {
                return iArr;
            }
            iArr[i] = legendEntryArr[i].form == LegendForm.NONE ? ColorTemplate.COLOR_SKIP : legendEntryArr[i].form == LegendForm.EMPTY ? ColorTemplate.COLOR_NONE : legendEntryArr[i].formColor;
            i++;
        }
    }

    public LegendEntry[] getExtraEntries() {
        return this.mExtraEntries;
    }

    @Deprecated
    public String[] getExtraLabels() {
        String[] strArr = new String[this.mExtraEntries.length];
        int i = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mExtraEntries;
            if (i >= legendEntryArr.length) {
                return strArr;
            }
            strArr[i] = legendEntryArr[i].label;
            i++;
        }
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    @Deprecated
    public String[] getLabels() {
        String[] strArr = new String[this.mEntries.length];
        int i = 0;
        while (true) {
            LegendEntry[] legendEntryArr = this.mEntries;
            if (i >= legendEntryArr.length) {
                return strArr;
            }
            strArr[i] = legendEntryArr[i].label;
            i++;
        }
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint paint) {
        float f = Utils.FLOAT_EPSILON;
        for (LegendEntry legendEntry : this.mEntries) {
            String str = legendEntry.label;
            if (str != null) {
                float calcTextHeight = (float) Utils.calcTextHeight(paint, str);
                if (calcTextHeight > f) {
                    f = calcTextHeight;
                }
            }
        }
        return f;
    }

    public float getMaximumEntryWidth(Paint paint) {
        float convertDpToPixel = Utils.convertDpToPixel(this.mFormToTextSpace);
        float f = Utils.FLOAT_EPSILON;
        float f2 = Utils.FLOAT_EPSILON;
        for (LegendEntry legendEntry : this.mEntries) {
            float convertDpToPixel2 = Utils.convertDpToPixel(Float.isNaN(legendEntry.formSize) ? this.mFormSize : legendEntry.formSize);
            if (convertDpToPixel2 > f2) {
                f2 = convertDpToPixel2;
            }
            String str = legendEntry.label;
            if (str != null) {
                float calcTextWidth = (float) Utils.calcTextWidth(paint, str);
                if (calcTextWidth > f) {
                    f = calcTextWidth;
                }
            }
        }
        return f + f2 + convertDpToPixel;
    }

    public LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    @Deprecated
    public LegendPosition getPosition() {
        if (this.mOrientation == LegendOrientation.VERTICAL && this.mHorizontalAlignment == LegendHorizontalAlignment.CENTER && this.mVerticalAlignment == LegendVerticalAlignment.CENTER) {
            return LegendPosition.PIECHART_CENTER;
        }
        if (this.mOrientation != LegendOrientation.HORIZONTAL) {
            return this.mHorizontalAlignment == LegendHorizontalAlignment.LEFT ? (this.mVerticalAlignment != LegendVerticalAlignment.TOP || !this.mDrawInside) ? this.mVerticalAlignment == LegendVerticalAlignment.CENTER ? LegendPosition.LEFT_OF_CHART_CENTER : LegendPosition.LEFT_OF_CHART : LegendPosition.LEFT_OF_CHART_INSIDE : (this.mVerticalAlignment != LegendVerticalAlignment.TOP || !this.mDrawInside) ? this.mVerticalAlignment == LegendVerticalAlignment.CENTER ? LegendPosition.RIGHT_OF_CHART_CENTER : LegendPosition.RIGHT_OF_CHART : LegendPosition.RIGHT_OF_CHART_INSIDE;
        }
        if (this.mVerticalAlignment == LegendVerticalAlignment.TOP) {
            LegendHorizontalAlignment legendHorizontalAlignment = this.mHorizontalAlignment;
            return legendHorizontalAlignment == LegendHorizontalAlignment.LEFT ? LegendPosition.ABOVE_CHART_LEFT : legendHorizontalAlignment == LegendHorizontalAlignment.RIGHT ? LegendPosition.ABOVE_CHART_RIGHT : LegendPosition.ABOVE_CHART_CENTER;
        }
        LegendHorizontalAlignment legendHorizontalAlignment2 = this.mHorizontalAlignment;
        return legendHorizontalAlignment2 == LegendHorizontalAlignment.LEFT ? LegendPosition.BELOW_CHART_LEFT : legendHorizontalAlignment2 == LegendHorizontalAlignment.RIGHT ? LegendPosition.BELOW_CHART_RIGHT : LegendPosition.BELOW_CHART_CENTER;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public void setCustom(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
        this.mIsLegendCustom = true;
    }

    public void setCustom(LegendEntry[] legendEntryArr) {
        this.mEntries = legendEntryArr;
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public void setDrawInside(boolean z) {
        this.mDrawInside = z;
    }

    public void setEntries(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    public void setExtra(List<LegendEntry> list) {
        this.mExtraEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    @Deprecated
    public void setExtra(List<Integer> list, List<String> list2) {
        setExtra(Utils.convertIntegers(list), Utils.convertStrings(list2));
    }

    public void setExtra(int[] iArr, String[] strArr) {
        LegendForm legendForm;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Math.min(iArr.length, strArr.length); i++) {
            LegendEntry legendEntry = new LegendEntry();
            int i2 = iArr[i];
            legendEntry.formColor = i2;
            legendEntry.label = strArr[i];
            if (i2 == 1122868 || i2 == 0) {
                legendForm = LegendForm.NONE;
            } else if (i2 == 1122867) {
                legendForm = LegendForm.EMPTY;
            } else {
                arrayList.add(legendEntry);
            }
            legendEntry.form = legendForm;
            arrayList.add(legendEntry);
        }
        this.mExtraEntries = (LegendEntry[]) arrayList.toArray(new LegendEntry[arrayList.size()]);
    }

    public void setExtra(LegendEntry[] legendEntryArr) {
        if (legendEntryArr == null) {
            legendEntryArr = new LegendEntry[0];
        }
        this.mExtraEntries = legendEntryArr;
    }

    public void setForm(LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f) {
        this.mFormLineWidth = f;
    }

    public void setFormSize(float f) {
        this.mFormSize = f;
    }

    public void setFormToTextSpace(float f) {
        this.mFormToTextSpace = f;
    }

    public void setHorizontalAlignment(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.mHorizontalAlignment = legendHorizontalAlignment;
    }

    public void setMaxSizePercent(float f) {
        this.mMaxSizePercent = f;
    }

    public void setOrientation(LegendOrientation legendOrientation) {
        this.mOrientation = legendOrientation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r2.mVerticalAlignment = r0;
        r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r3 == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r3 == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r2.mVerticalAlignment = r0;
        r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r2.mOrientation = r0;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPosition(com.github.mikephil.charting.components.Legend.LegendPosition r3) {
        /*
            r2 = this;
            int[] r0 = com.github.mikephil.charting.components.Legend.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0053;
                case 2: goto L_0x0053;
                case 3: goto L_0x0053;
                case 4: goto L_0x0047;
                case 5: goto L_0x0047;
                case 6: goto L_0x0047;
                case 7: goto L_0x002e;
                case 8: goto L_0x002e;
                case 9: goto L_0x002e;
                case 10: goto L_0x0019;
                case 11: goto L_0x0019;
                case 12: goto L_0x0019;
                case 13: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x005c
        L_0x000c:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
            r2.mHorizontalAlignment = r0
        L_0x0010:
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER
        L_0x0012:
            r2.mVerticalAlignment = r0
            com.github.mikephil.charting.components.Legend$LegendOrientation r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL
        L_0x0016:
            r2.mOrientation = r0
            goto L_0x005c
        L_0x0019:
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT
            if (r3 != r0) goto L_0x0020
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            goto L_0x0029
        L_0x0020:
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT
            if (r3 != r0) goto L_0x0027
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            goto L_0x0029
        L_0x0027:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
        L_0x0029:
            r2.mHorizontalAlignment = r0
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            goto L_0x0042
        L_0x002e:
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT
            if (r3 != r0) goto L_0x0035
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            goto L_0x003e
        L_0x0035:
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT
            if (r3 != r0) goto L_0x003c
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            goto L_0x003e
        L_0x003c:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER
        L_0x003e:
            r2.mHorizontalAlignment = r0
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
        L_0x0042:
            r2.mVerticalAlignment = r0
            com.github.mikephil.charting.components.Legend$LegendOrientation r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL
            goto L_0x0016
        L_0x0047:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT
            r2.mHorizontalAlignment = r0
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER
            if (r3 != r0) goto L_0x0050
        L_0x004f:
            goto L_0x0010
        L_0x0050:
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP
            goto L_0x0012
        L_0x0053:
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            r2.mHorizontalAlignment = r0
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER
            if (r3 != r0) goto L_0x0050
            goto L_0x004f
        L_0x005c:
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_INSIDE
            if (r3 == r0) goto L_0x0067
            com.github.mikephil.charting.components.Legend$LegendPosition r0 = com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE
            if (r3 != r0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r3 = 0
            goto L_0x0068
        L_0x0067:
            r3 = 1
        L_0x0068:
            r2.mDrawInside = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.setPosition(com.github.mikephil.charting.components.Legend$LegendPosition):void");
    }

    public void setStackSpace(float f) {
        this.mStackSpace = f;
    }

    public void setVerticalAlignment(LegendVerticalAlignment legendVerticalAlignment) {
        this.mVerticalAlignment = legendVerticalAlignment;
    }

    public void setWordWrapEnabled(boolean z) {
        this.mWordWrapEnabled = z;
    }

    public void setXEntrySpace(float f) {
        this.mXEntrySpace = f;
    }

    public void setYEntrySpace(float f) {
        this.mYEntrySpace = f;
    }
}
