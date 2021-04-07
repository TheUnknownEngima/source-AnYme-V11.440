package com.bugfender.sdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bugfender.android.R$drawable;
import com.bugfender.android.R$id;
import com.bugfender.android.R$layout;
import java.io.Serializable;
import java.net.URL;

public class FeedbackActivity extends Activity {
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    /* access modifiers changed from: private */
    public EditText i;
    /* access modifiers changed from: private */
    public EditText j;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            FeedbackActivity.this.setResult(0);
            FeedbackActivity.this.finish();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            URL g = u9.g(FeedbackActivity.this.i.getText().toString(), FeedbackActivity.this.j.getText().toString());
            if (g != null) {
                Intent intent = new Intent();
                intent.putExtra("result.feedback.url", g.toString());
                FeedbackActivity.this.setResult(-1, intent);
            }
            FeedbackActivity.this.finish();
        }
    }

    private static class c implements Serializable {
        final String e;
        final String f;
        final String g;
        final String h;
        final String i;

        private c() {
            this.e = "Feedback";
            this.f = "Please insert your feedback here and click send";
            this.g = "Feedback subject";
            this.h = "Feedback message";
            this.i = "Send";
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private void b() {
        a aVar = getIntent().hasExtra("extra.style") ? (a) getIntent().getSerializableExtra("extra.style") : new a();
        findViewById(R$id.appbar_rl).setBackgroundResource(aVar.e);
        this.e.setColorFilter(getResources().getColor(aVar.g), PorterDuff.Mode.SRC_ATOP);
        this.f.setTextColor(getResources().getColor(aVar.f));
        this.g.setTextColor(getResources().getColor(aVar.h));
        findViewById(R$id.root_vg).setBackgroundResource(aVar.i);
        this.h.setTextColor(getResources().getColor(aVar.j));
        TextView textView = (TextView) findViewById(R$id.bugfender_tv);
        Drawable drawable = getResources().getDrawable(R$drawable.bugfender_logo);
        drawable.setColorFilter(getResources().getColor(aVar.j), PorterDuff.Mode.SRC_ATOP);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setTextColor(getResources().getColor(aVar.j));
        this.i.setTextColor(getResources().getColor(aVar.l));
        this.i.setHintTextColor(getResources().getColor(aVar.m));
        this.i.setBackgroundResource(aVar.k);
        this.j.setTextColor(getResources().getColor(aVar.l));
        this.j.setHintTextColor(getResources().getColor(aVar.m));
        this.j.setBackgroundResource(aVar.k);
    }

    private void d() {
        c cVar = getIntent().hasExtra("extra.texts") ? (c) getIntent().getSerializableExtra("extra.texts") : new c((a) null);
        this.f.setText(cVar.e);
        this.g.setText(cVar.i);
        this.h.setText(cVar.f);
        this.i.setHint(cVar.g);
        this.j.setHint(cVar.h);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.bf_feedback_screen);
        this.e = (ImageView) findViewById(R$id.close_iv);
        this.f = (TextView) findViewById(R$id.title_tv);
        this.g = (TextView) findViewById(R$id.positive_action_tv);
        this.h = (TextView) findViewById(R$id.message_tv);
        this.i = (EditText) findViewById(R$id.feedback_title_et);
        this.j = (EditText) findViewById(R$id.feedback_message_et);
        d();
        b();
        this.e.setOnClickListener(new a());
        this.g.setOnClickListener(new b());
    }
}
