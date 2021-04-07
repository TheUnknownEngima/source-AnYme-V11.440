package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import java.util.Collection;

public class IndexAxisValueFormatter implements IAxisValueFormatter {
    private int mValueCount = 0;
    private String[] mValues = new String[0];

    public IndexAxisValueFormatter() {
    }

    public IndexAxisValueFormatter(Collection<String> collection) {
        if (collection != null) {
            setValues((String[]) collection.toArray(new String[collection.size()]));
        }
    }

    public IndexAxisValueFormatter(String[] strArr) {
        if (strArr != null) {
            setValues(strArr);
        }
    }

    public String getFormattedValue(float f, AxisBase axisBase) {
        int round = Math.round(f);
        return (round < 0 || round >= this.mValueCount || round != ((int) f)) ? "" : this.mValues[round];
    }

    public String[] getValues() {
        return this.mValues;
    }

    public void setValues(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.mValues = strArr;
        this.mValueCount = strArr.length;
    }
}
