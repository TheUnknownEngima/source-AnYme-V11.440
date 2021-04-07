package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bVar.r(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = bVar.p(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.x(false, false);
        bVar.H(audioAttributesImplApi26.a, 1);
        bVar.F(audioAttributesImplApi26.b, 2);
    }
}
