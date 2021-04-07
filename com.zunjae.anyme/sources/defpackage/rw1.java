package defpackage;

import android.view.View;
import android.widget.TextView;
import com.zunjae.anyme.C0275R$id;

/* renamed from: rw1  reason: default package */
public final class rw1 {

    /* renamed from: rw1$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ o52 e;

        a(o52 o52) {
            this.e = o52;
        }

        public final void onClick(View view) {
            this.e.invoke();
        }
    }

    public static final void a(View view) {
        v62.e(view, "$this$gone");
        view.setVisibility(8);
    }

    public static final void b(View view) {
        v62.e(view, "$this$invisible");
        view.setVisibility(4);
    }

    public static final void c(View view, String str, String str2, o52<u22> o52) {
        v62.e(view, "$this$messageWithButton");
        v62.e(str, "message");
        v62.e(str2, "retryButtonText");
        v62.e(o52, "onClick");
        View b = com.tripl3dev.prettystates.a.b(view, fw1.f.c());
        TextView textView = (TextView) b.findViewById(2131296834);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) b.findViewById(C0275R$id.retry);
        v62.d(textView2, "button");
        textView2.setVisibility(0);
        textView2.setText(str2);
        textView2.setOnClickListener(new a(o52));
    }

    public static /* synthetic */ void d(View view, String str, String str2, o52 o52, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "Retry";
        }
        c(view, str, str2, o52);
    }

    public static final void e(View view, String str) {
        v62.e(view, "$this$noContentFound");
        v62.e(str, "message");
        TextView textView = (TextView) com.tripl3dev.prettystates.a.b(view, fw1.f.b()).findViewById(2131296834);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public static final void f(TextView textView) {
        v62.e(textView, "$this$setEmpty");
        textView.setText("");
    }

    public static final void g(View view) {
        v62.e(view, "$this$showContent");
        com.tripl3dev.prettystates.a.b(view, -2431992);
    }

    public static final void h(View view) {
        v62.e(view, "$this$showLoading");
        com.tripl3dev.prettystates.a.b(view, -2731992);
    }

    public static final void i(View view) {
        v62.e(view, "$this$visible");
        view.setVisibility(0);
    }
}
