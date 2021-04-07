package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: hn0  reason: default package */
final class hn0 extends in0<FieldDescriptorType, Object> {
    hn0(int i) {
        super(i, (hn0) null);
    }

    public final void l() {
        if (!a()) {
            for (int i = 0; i < m(); i++) {
                Map.Entry h = h(i);
                if (((yk0) h.getKey()).i0()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : n()) {
                if (((yk0) entry.getKey()).i0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.l();
    }
}
