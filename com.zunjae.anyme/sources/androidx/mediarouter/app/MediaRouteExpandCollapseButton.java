package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.mediarouter.R$drawable;
import androidx.mediarouter.R$string;

class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    final AnimationDrawable g;
    final AnimationDrawable h;
    final String i;
    final String j;
    boolean k;
    View.OnClickListener l;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            String str;
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton;
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton2.k;
            mediaRouteExpandCollapseButton2.k = z;
            if (z) {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.g);
                MediaRouteExpandCollapseButton.this.g.start();
                mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                str = mediaRouteExpandCollapseButton.j;
            } else {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.h);
                MediaRouteExpandCollapseButton.this.h.start();
                mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                str = mediaRouteExpandCollapseButton.i;
            }
            mediaRouteExpandCollapseButton.setContentDescription(str);
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.l;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = (AnimationDrawable) androidx.core.content.a.f(context, R$drawable.mr_group_expand);
        this.h = (AnimationDrawable) androidx.core.content.a.f(context, R$drawable.mr_group_collapse);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i.f(context, i2), PorterDuff.Mode.SRC_IN);
        this.g.setColorFilter(porterDuffColorFilter);
        this.h.setColorFilter(porterDuffColorFilter);
        this.i = context.getString(R$string.mr_controller_expand_group);
        this.j = context.getString(R$string.mr_controller_collapse_group);
        setImageDrawable(this.g.getFrame(0));
        setContentDescription(this.i);
        super.setOnClickListener(new a());
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }
}
