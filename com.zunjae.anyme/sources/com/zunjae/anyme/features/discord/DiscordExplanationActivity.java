package com.zunjae.anyme.features.discord;

import android.os.Bundle;
import android.view.View;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.HashMap;
import mehdi.sakout.fancybuttons.FancyButton;

public final class DiscordExplanationActivity extends AbstractActivity {
    private HashMap D;

    static final class a implements View.OnClickListener {
        final /* synthetic */ DiscordExplanationActivity e;

        a(DiscordExplanationActivity discordExplanationActivity) {
            this.e = discordExplanationActivity;
        }

        public final void onClick(View view) {
            this.e.g0("https://anyme.app/invite");
        }
    }

    public View l0(int i) {
        if (this.D == null) {
            this.D = new HashMap();
        }
        View view = (View) this.D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.D.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_discord);
        ((FancyButton) l0(C0275R$id.joinButton)).setOnClickListener(new a(this));
    }
}
