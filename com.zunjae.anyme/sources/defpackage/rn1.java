package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.R$layout;
import com.mikepenz.materialdrawer.c;
import defpackage.rn1;
import java.util.List;

/* renamed from: rn1  reason: default package */
public abstract class rn1<Item extends rn1> extends sn1<Item, c> {
    private boolean B = true;
    /* access modifiers changed from: private */
    public boolean C = false;
    private on1 D = null;
    /* access modifiers changed from: private */
    public CompoundButton.OnCheckedChangeListener E = new b();

    /* renamed from: rn1$a */
    class a implements c.a {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        public boolean a(View view, int i, go1 go1) {
            if (rn1.this.b()) {
                return false;
            }
            rn1 rn1 = rn1.this;
            boolean unused = rn1.C = !rn1.C;
            this.a.B.setChecked(rn1.this.C);
            return false;
        }
    }

    /* renamed from: rn1$b */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (rn1.this.isEnabled()) {
                boolean unused = rn1.this.C = z;
                if (rn1.this.m0() != null) {
                    rn1.this.m0().a(rn1.this, compoundButton, z);
                    return;
                }
                return;
            }
            compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            compoundButton.setChecked(!z);
            compoundButton.setOnCheckedChangeListener(rn1.this.E);
        }
    }

    /* renamed from: rn1$c */
    public static class c extends un1 {
        /* access modifiers changed from: private */
        public SwitchCompat B;

        private c(View view) {
            super(view);
            this.B = (SwitchCompat) view.findViewById(R$id.material_drawer_switch);
        }

        /* synthetic */ c(View view, a aVar) {
            this(view);
        }
    }

    public int d() {
        return R$id.material_drawer_item_primary_switch;
    }

    public int h() {
        return R$layout.material_drawer_item_switch;
    }

    /* renamed from: l0 */
    public void q(c cVar, List list) {
        super.q(cVar, list);
        d0(cVar);
        cVar.B.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        cVar.B.setChecked(this.C);
        cVar.B.setOnCheckedChangeListener(this.E);
        cVar.B.setEnabled(this.B);
        C(new a(cVar));
        A(this, cVar.e);
    }

    public on1 m0() {
        return this.D;
    }

    /* renamed from: n0 */
    public c y(View view) {
        return new c(view, (a) null);
    }

    public Item o0(boolean z) {
        this.C = z;
        return this;
    }

    public Item p0(on1 on1) {
        this.D = on1;
        return this;
    }
}
