package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R$id;

/* renamed from: un1  reason: default package */
public class un1 extends RecyclerView.c0 {
    protected TextView A;
    protected View x;
    protected ImageView y;
    protected TextView z;

    public un1(View view) {
        super(view);
        this.x = view;
        this.y = (ImageView) view.findViewById(R$id.material_drawer_icon);
        this.z = (TextView) view.findViewById(R$id.material_drawer_name);
        this.A = (TextView) view.findViewById(R$id.material_drawer_description);
    }
}
