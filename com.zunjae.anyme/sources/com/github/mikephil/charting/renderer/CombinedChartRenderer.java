package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class CombinedChartRenderer extends DataRenderer {
    protected WeakReference<Chart> mChart;
    protected List<Highlight> mHighlightBuffer = new ArrayList();
    protected List<DataRenderer> mRenderers = new ArrayList(5);

    /* renamed from: com.github.mikephil.charting.renderer.CombinedChartRenderer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder = r0
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.CombinedChartRenderer.AnonymousClass1.<clinit>():void");
        }
    }

    public CombinedChartRenderer(CombinedChart combinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = new WeakReference<>(combinedChart);
        createRenderers();
    }

    public void createRenderers() {
        Object obj;
        List<DataRenderer> list;
        this.mRenderers.clear();
        CombinedChart combinedChart = (CombinedChart) this.mChart.get();
        if (combinedChart != null) {
            for (CombinedChart.DrawOrder ordinal : combinedChart.getDrawOrder()) {
                int i = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$CombinedChart$DrawOrder[ordinal.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5 && combinedChart.getScatterData() != null) {
                                    list = this.mRenderers;
                                    obj = new ScatterChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler);
                                }
                            } else if (combinedChart.getCandleData() != null) {
                                list = this.mRenderers;
                                obj = new CandleStickChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler);
                            }
                        } else if (combinedChart.getLineData() != null) {
                            list = this.mRenderers;
                            obj = new LineChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler);
                        }
                    } else if (combinedChart.getBubbleData() != null) {
                        list = this.mRenderers;
                        obj = new BubbleChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler);
                    }
                } else if (combinedChart.getBarData() != null) {
                    list = this.mRenderers;
                    obj = new BarChartRenderer(combinedChart, this.mAnimator, this.mViewPortHandler);
                }
                list.add(obj);
            }
        }
    }

    public void drawData(Canvas canvas) {
        for (DataRenderer drawData : this.mRenderers) {
            drawData.drawData(canvas);
        }
    }

    public void drawExtras(Canvas canvas) {
        for (DataRenderer drawExtras : this.mRenderers) {
            drawExtras.drawExtras(canvas);
        }
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        Chart chart = (Chart) this.mChart.get();
        if (chart != null) {
            for (DataRenderer next : this.mRenderers) {
                Object obj = null;
                if (next instanceof BarChartRenderer) {
                    obj = ((BarChartRenderer) next).mChart.getBarData();
                } else if (next instanceof LineChartRenderer) {
                    obj = ((LineChartRenderer) next).mChart.getLineData();
                } else if (next instanceof CandleStickChartRenderer) {
                    obj = ((CandleStickChartRenderer) next).mChart.getCandleData();
                } else if (next instanceof ScatterChartRenderer) {
                    obj = ((ScatterChartRenderer) next).mChart.getScatterData();
                } else if (next instanceof BubbleChartRenderer) {
                    obj = ((BubbleChartRenderer) next).mChart.getBubbleData();
                }
                int indexOf = obj == null ? -1 : ((CombinedData) chart.getData()).getAllData().indexOf(obj);
                this.mHighlightBuffer.clear();
                for (Highlight highlight : highlightArr) {
                    if (highlight.getDataIndex() == indexOf || highlight.getDataIndex() == -1) {
                        this.mHighlightBuffer.add(highlight);
                    }
                }
                List<Highlight> list = this.mHighlightBuffer;
                next.drawHighlighted(canvas, (Highlight[]) list.toArray(new Highlight[list.size()]));
            }
        }
    }

    public void drawValues(Canvas canvas) {
        for (DataRenderer drawValues : this.mRenderers) {
            drawValues.drawValues(canvas);
        }
    }

    public DataRenderer getSubRenderer(int i) {
        if (i >= this.mRenderers.size() || i < 0) {
            return null;
        }
        return this.mRenderers.get(i);
    }

    public List<DataRenderer> getSubRenderers() {
        return this.mRenderers;
    }

    public void initBuffers() {
        for (DataRenderer initBuffers : this.mRenderers) {
            initBuffers.initBuffers();
        }
    }

    public void setSubRenderers(List<DataRenderer> list) {
        this.mRenderers = list;
    }
}
