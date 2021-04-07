package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class m {
    private UUID a;
    private a b;
    private e c;
    private Set<String> d;

    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public m(UUID uuid, a aVar, e eVar, List<String> list) {
        this.a = uuid;
        this.b = aVar;
        this.c = eVar;
        this.d = new HashSet(list);
    }

    public a a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        UUID uuid = this.a;
        if (uuid == null ? mVar.a != null : !uuid.equals(mVar.a)) {
            return false;
        }
        if (this.b != mVar.b) {
            return false;
        }
        e eVar = this.c;
        if (eVar == null ? mVar.c != null : !eVar.equals(mVar.c)) {
            return false;
        }
        Set<String> set = this.d;
        Set<String> set2 = mVar.d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        UUID uuid = this.a;
        int i = 0;
        int hashCode = (uuid != null ? uuid.hashCode() : 0) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        e eVar = this.c;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Set<String> set = this.d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.a + '\'' + ", mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + '}';
    }
}
