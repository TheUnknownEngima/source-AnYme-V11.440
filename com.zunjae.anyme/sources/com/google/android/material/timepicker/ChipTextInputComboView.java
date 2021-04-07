package com.google.android.material.timepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */
    public final Chip e;
    /* access modifiers changed from: private */
    public final TextInputLayout f;
    private final EditText g;
    private TextWatcher h;

    private class b extends l {
        private b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.c("00");
                return;
            }
            ChipTextInputComboView.this.f.getEditText().setHint((CharSequence) null);
            ChipTextInputComboView.this.e.setText(editable.toString());
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        this.e = (Chip) from.inflate(R$layout.material_time_chip, this, false);
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R$layout.material_time_input, this, false);
        this.f = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.g = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.h = bVar;
        this.g.addTextChangedListener(bVar);
        addView(this.e);
        addView(this.f);
        TextView textView = (TextView) findViewById(R$id.material_label);
    }

    public void c(CharSequence charSequence) {
        this.e.setText(charSequence);
        EditText editText = this.f.getEditText();
        if (!TextUtils.isEmpty(editText.getText())) {
            editText.removeTextChangedListener(this.h);
            editText.setText((CharSequence) null);
            editText.setHint("00");
            editText.addTextChangedListener(this.h);
        }
        editText.setHint(charSequence);
    }

    public boolean isChecked() {
        return this.e.isChecked();
    }

    public void setChecked(boolean z) {
        this.e.setChecked(z);
        int i = 0;
        this.g.setVisibility(z ? 0 : 4);
        Chip chip = this.e;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            this.g.requestFocus();
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.e.setTag(i, obj);
    }

    public void toggle() {
        this.e.toggle();
    }
}
