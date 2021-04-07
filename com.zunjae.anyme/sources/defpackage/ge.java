package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: ge  reason: default package */
public class ge extends ud<InputStream> {
    public ge(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
