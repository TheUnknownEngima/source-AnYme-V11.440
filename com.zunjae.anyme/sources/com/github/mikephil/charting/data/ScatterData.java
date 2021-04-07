package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public class ScatterData extends BarLineScatterCandleBubbleData<IScatterDataSet> {
    public ScatterData() {
    }

    public ScatterData(List<IScatterDataSet> list) {
        super(list);
    }

    public ScatterData(IScatterDataSet... iScatterDataSetArr) {
        super((T[]) iScatterDataSetArr);
    }

    public float getGreatestShapeSize() {
        float f = Utils.FLOAT_EPSILON;
        for (T scatterShapeSize : this.mDataSets) {
            float scatterShapeSize2 = scatterShapeSize.getScatterShapeSize();
            if (scatterShapeSize2 > f) {
                f = scatterShapeSize2;
            }
        }
        return f;
    }
}
