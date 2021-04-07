package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.R$styleable;

class i implements LayoutInflater.Factory2 {
    private final k e;

    i(k kVar) {
        this.e = kVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.e);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R$styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(R$styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.e.Y(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.e.Z(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.e.Y(id);
        }
        if (k.s0(2)) {
            "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment;
        }
        if (fragment == null) {
            fragment = this.e.h0().a(context.getClassLoader(), attributeValue);
            fragment.q = true;
            fragment.z = resourceId != 0 ? resourceId : id;
            fragment.A = id;
            fragment.B = string;
            fragment.r = true;
            k kVar = this.e;
            fragment.v = kVar;
            h<?> hVar = kVar.o;
            fragment.w = hVar;
            fragment.z0(hVar.g(), attributeSet, fragment.f);
            this.e.d(fragment);
            this.e.D0(fragment);
        } else if (!fragment.r) {
            fragment.r = true;
            h<?> hVar2 = this.e.o;
            fragment.w = hVar2;
            fragment.z0(hVar2.g(), attributeSet, fragment.f);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        k kVar2 = this.e;
        if (kVar2.n >= 1 || !fragment.q) {
            this.e.D0(fragment);
        } else {
            kVar2.E0(fragment, 1);
        }
        View view2 = fragment.K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.K.getTag() == null) {
                fragment.K.setTag(string);
            }
            return fragment.K;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
