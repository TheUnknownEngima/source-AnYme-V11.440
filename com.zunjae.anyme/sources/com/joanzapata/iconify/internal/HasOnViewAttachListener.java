package com.joanzapata.iconify.internal;

import android.widget.TextView;

public interface HasOnViewAttachListener {

    public static class HasOnViewAttachListenerDelegate {
        private OnViewAttachListener listener;
        private final TextView view;

        public HasOnViewAttachListenerDelegate(TextView textView) {
            this.view = textView;
        }

        public void onAttachedToWindow() {
            OnViewAttachListener onViewAttachListener = this.listener;
            if (onViewAttachListener != null) {
                onViewAttachListener.onAttach();
            }
        }

        public void onDetachedFromWindow() {
            OnViewAttachListener onViewAttachListener = this.listener;
            if (onViewAttachListener != null) {
                onViewAttachListener.onDetach();
            }
        }

        public void setOnViewAttachListener(OnViewAttachListener onViewAttachListener) {
            OnViewAttachListener onViewAttachListener2 = this.listener;
            if (onViewAttachListener2 != null) {
                onViewAttachListener2.onDetach();
            }
            this.listener = onViewAttachListener;
            if (o4.N(this.view) && onViewAttachListener != null) {
                onViewAttachListener.onAttach();
            }
        }
    }

    public interface OnViewAttachListener {
        void onAttach();

        void onDetach();
    }

    void setOnViewAttachListener(OnViewAttachListener onViewAttachListener);
}
