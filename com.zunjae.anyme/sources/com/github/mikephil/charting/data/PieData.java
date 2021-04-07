package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;

public class PieData extends ChartData<IPieDataSet> {
    public PieData() {
    }

    public PieData(IPieDataSet iPieDataSet) {
        super((T[]) new IPieDataSet[]{iPieDataSet});
    }

    public IPieDataSet getDataSet() {
        return (IPieDataSet) this.mDataSets.get(0);
    }

    public IPieDataSet getDataSetByIndex(int i) {
        if (i == 0) {
            return getDataSet();
        }
        return null;
    }

    public IPieDataSet getDataSetByLabel(String str, boolean z) {
        if (z) {
            if (!str.equalsIgnoreCase(((IPieDataSet) this.mDataSets.get(0)).getLabel())) {
                return null;
            }
        } else if (!str.equals(((IPieDataSet) this.mDataSets.get(0)).getLabel())) {
            return null;
        }
        return (IPieDataSet) this.mDataSets.get(0);
    }

    public Entry getEntryForHighlight(Highlight highlight) {
        return getDataSet().getEntryForIndex((int) highlight.getX());
    }

    public float getYValueSum() {
        float f = Utils.FLOAT_EPSILON;
        for (int i = 0; i < getDataSet().getEntryCount(); i++) {
            f += ((PieEntry) getDataSet().getEntryForIndex(i)).getY();
        }
        return f;
    }

    public void setDataSet(IPieDataSet iPieDataSet) {
        this.mDataSets.clear();
        this.mDataSets.add(iPieDataSet);
        notifyDataChanged();
    }
}
