package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.b;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(bVar);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, bVar);
    }
}
