package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends g {
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e g : list) {
            hashMap.putAll(g.g());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
