package androidx.media;

import android.media.AudioAttributes;
import androidx.media.a;

public class AudioAttributesImplApi21 implements a {
    public AudioAttributes a;
    public int b;

    static class a implements a.C0028a {
        final AudioAttributes.Builder a = new AudioAttributes.Builder();

        a() {
        }

        public a a() {
            return new AudioAttributesImplApi21(this.a.build());
        }

        public /* bridge */ /* synthetic */ a.C0028a b(int i) {
            c(i);
            return this;
        }

        public a c(int i) {
            this.a.setLegacyStreamType(i);
            return this;
        }
    }

    AudioAttributesImplApi21() {
        this.b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.b = -1;
        this.a = audioAttributes;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
