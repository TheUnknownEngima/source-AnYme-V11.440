package defpackage;

import java.io.Writer;

/* renamed from: je2  reason: default package */
public class je2 extends ke2 {
    private final ke2[] b;

    public je2(ke2... ke2Arr) {
        this.b = (ke2[]) ge2.a(ke2Arr);
    }

    public int b(CharSequence charSequence, int i, Writer writer) {
        for (ke2 b2 : this.b) {
            int b3 = b2.b(charSequence, i, writer);
            if (b3 != 0) {
                return b3;
            }
        }
        return 0;
    }
}
