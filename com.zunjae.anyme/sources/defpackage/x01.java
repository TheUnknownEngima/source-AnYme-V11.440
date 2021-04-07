package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: x01  reason: default package */
final class x01 extends z01<FieldDescriptorType, Object> {
    x01(int i) {
        super(i, (x01) null);
    }

    public final void e() {
        if (!i()) {
            for (int i = 0; i < j(); i++) {
                Map.Entry h = h(i);
                if (((ny0) h.getKey()).d()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((ny0) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}
