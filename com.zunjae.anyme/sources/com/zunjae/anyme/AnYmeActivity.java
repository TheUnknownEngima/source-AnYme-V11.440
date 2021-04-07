package com.zunjae.anyme;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.zunjae.anyme.features.firebase.FirebaseMessageHandler;
import com.zunjae.anyme.features.login.WelcomeActivity;

public final class AnYmeActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Intent c;
        super.onCreate(bundle);
        if (!isTaskRoot()) {
            finish();
            return;
        }
        v62.a("beta", "debug");
        if (fz1.a.h()) {
            c = new Intent(this, WelcomeActivity.class);
        } else {
            FirebaseMessageHandler.a aVar = FirebaseMessageHandler.k;
            Intent intent = getIntent();
            Context applicationContext = getApplicationContext();
            v62.d(applicationContext, "applicationContext");
            c = aVar.c(intent, applicationContext);
        }
        startActivity(c);
        finish();
    }
}
