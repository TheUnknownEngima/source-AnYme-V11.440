package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.google.android.gms.cast.framework.R$id;

@Keep
public class HelpTextView extends LinearLayout {
    private TextView zzpf;
    private TextView zzpg;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Keep
    public View asView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R$id.cast_featurehighlight_help_text_header_view);
        pb0.a(textView);
        this.zzpf = textView;
        TextView textView2 = (TextView) findViewById(R$id.cast_featurehighlight_help_text_body_view);
        pb0.a(textView2);
        this.zzpg = textView2;
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zzpf, charSequence);
        zza(this.zzpg, charSequence2);
    }
}
