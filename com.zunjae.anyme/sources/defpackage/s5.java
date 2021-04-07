package defpackage;

import android.content.res.AssetManager;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: s5  reason: default package */
public class s5 {
    private static final c A = new c("StripOffsets", 273, 3);
    private static final c[] B = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
    private static final c[] C = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
    private static final c[] D = {new c("AspectFrame", 4371, 3)};
    private static final c[] E;
    static final c[][] F;
    private static final c[] G = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap<Integer, c>[] H;
    private static final HashMap<String, c>[] I;
    private static final HashSet<String> J = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap<Integer, Integer> K = new HashMap<>();
    static final Charset L;
    static final byte[] M;
    public static final int[] m = {8, 8, 8};
    public static final int[] n = {8};
    static final byte[] o = {-1, -40, -1};
    private static final byte[] p = {79, 76, 89, 77, 80, 0};
    private static final byte[] q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static SimpleDateFormat r;
    static final String[] s = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] u = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final c[] v = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
    private static final c[] w = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private static final c[] x = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
    private static final c[] y = {new c("InteroperabilityIndex", 1, 2)};
    private static final c[] z = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    private final String a;
    private final AssetManager.AssetInputStream b;
    private int c;
    private final HashMap<String, b>[] d = new HashMap[F.length];
    private Set<Integer> e = new HashSet(F.length);
    private ByteOrder f = ByteOrder.BIG_ENDIAN;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    /* renamed from: s5$a */
    private static class a extends InputStream implements DataInput {
        private static final ByteOrder i = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder j = ByteOrder.BIG_ENDIAN;
        private DataInputStream e;
        private ByteOrder f;
        final int g;
        int h;

        public a(InputStream inputStream) {
            this.f = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.e = dataInputStream;
            int available = dataInputStream.available();
            this.g = available;
            this.h = 0;
            this.e.mark(available);
        }

        public a(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public int a() {
            return this.h;
        }

        public int available() {
            return this.e.available();
        }

        public long b() {
            return ((long) readInt()) & 4294967295L;
        }

        public void h(long j2) {
            int i2 = this.h;
            if (((long) i2) > j2) {
                this.h = 0;
                this.e.reset();
                this.e.mark(this.g);
            } else {
                j2 -= (long) i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void i(ByteOrder byteOrder) {
            this.f = byteOrder;
        }

        public int read() {
            this.h++;
            return this.e.read();
        }

        public int read(byte[] bArr, int i2, int i3) {
            int read = this.e.read(bArr, i2, i3);
            this.h += read;
            return read;
        }

        public boolean readBoolean() {
            this.h++;
            return this.e.readBoolean();
        }

        public byte readByte() {
            int i2 = this.h + 1;
            this.h = i2;
            if (i2 <= this.g) {
                int read = this.e.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.h += 2;
            return this.e.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            int length = this.h + bArr.length;
            this.h = length;
            if (length > this.g) {
                throw new EOFException();
            } else if (this.e.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i2, int i3) {
            int i4 = this.h + i3;
            this.h = i4;
            if (i4 > this.g) {
                throw new EOFException();
            } else if (this.e.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i2 = this.h + 4;
            this.h = i2;
            if (i2 <= this.g) {
                int read = this.e.read();
                int read2 = this.e.read();
                int read3 = this.e.read();
                int read4 = this.e.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f;
                    if (byteOrder == i) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == j) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            return null;
        }

        public long readLong() {
            int i2 = this.h + 8;
            this.h = i2;
            if (i2 <= this.g) {
                int read = this.e.read();
                int read2 = this.e.read();
                int read3 = this.e.read();
                int read4 = this.e.read();
                int read5 = this.e.read();
                int read6 = this.e.read();
                int read7 = this.e.read();
                int read8 = this.e.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f;
                    if (byteOrder == i) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i3 = read2;
                    if (byteOrder == j) {
                        return (((long) read) << 56) + (((long) i3) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i2 = this.h + 2;
            this.h = i2;
            if (i2 <= this.g) {
                int read = this.e.read();
                int read2 = this.e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f;
                    if (byteOrder == i) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == j) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.h += 2;
            return this.e.readUTF();
        }

        public int readUnsignedByte() {
            this.h++;
            return this.e.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int i2 = this.h + 2;
            this.h = i2;
            if (i2 <= this.g) {
                int read = this.e.read();
                int read2 = this.e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f;
                    if (byteOrder == i) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == j) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i2) {
            int min = Math.min(i2, this.g - this.h);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.e.skipBytes(min - i3);
            }
            this.h += i3;
            return i3;
        }
    }

    /* renamed from: s5$b */
    private static class b {
        public final int a;
        public final int b;
        public final byte[] c;

        b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + 0).getBytes(s5.L);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static b c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(s5.t[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b d(d dVar, ByteOrder byteOrder) {
            return e(new d[]{dVar}, byteOrder);
        }

        public static b e(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(s5.t[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public static b f(int i, ByteOrder byteOrder) {
            return g(new int[]{i}, byteOrder);
        }

        public static b g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(s5.t[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof d[]) {
                    d[] dVarArr = (d[]) k;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int i(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String j(ByteOrder byteOrder) {
            Object k = k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) k;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].a);
                    sb.append('/');
                    sb.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0157 A[SYNTHETIC, Splitter:B:140:0x0157] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x015e A[SYNTHETIC, Splitter:B:148:0x015e] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object k(java.nio.ByteOrder r9) {
            /*
                r8 = this;
                r0 = 0
                s5$a r1 = new s5$a     // Catch:{ IOException -> 0x015b, all -> 0x0154 }
                byte[] r2 = r8.c     // Catch:{ IOException -> 0x015b, all -> 0x0154 }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x015b, all -> 0x0154 }
                r1.i(r9)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r9 = r8.a     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2 = 1
                r3 = 0
                switch(r9) {
                    case 1: goto L_0x011b;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a7;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x011b;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x0074;
                    case 9: goto L_0x005f;
                    case 10: goto L_0x003f;
                    case 11: goto L_0x0029;
                    case 12: goto L_0x0014;
                    default: goto L_0x0012;
                }     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0012:
                goto L_0x014d
            L_0x0014:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0018:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0025
                double r4 = r1.readDouble()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0018
            L_0x0025:
                r1.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r9
            L_0x0029:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x002d:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x003b
                float r2 = r1.readFloat()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                double r4 = (double) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x002d
            L_0x003b:
                r1.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                return r9
            L_0x003f:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                s5$d[] r9 = new defpackage.s5.d[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0043:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x005b
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long r4 = (long) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long r6 = (long) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                s5$d r2 = new s5$d     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2.<init>(r4, r6)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0043
            L_0x005b:
                r1.close()     // Catch:{ IOException -> 0x005e }
            L_0x005e:
                return r9
            L_0x005f:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0063:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0070
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0063
            L_0x0070:
                r1.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                return r9
            L_0x0074:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0078:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0085
                short r2 = r1.readShort()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0078
            L_0x0085:
                r1.close()     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                return r9
            L_0x0089:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                s5$d[] r9 = new defpackage.s5.d[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x008d:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x00a3
                long r4 = r1.b()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long r6 = r1.b()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                s5$d r2 = new s5$d     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2.<init>(r4, r6)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x008d
            L_0x00a3:
                r1.close()     // Catch:{ IOException -> 0x00a6 }
            L_0x00a6:
                return r9
            L_0x00a7:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long[] r9 = new long[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00ab:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x00b8
                long r4 = r1.b()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x00ab
            L_0x00b8:
                r1.close()     // Catch:{ IOException -> 0x00bb }
            L_0x00bb:
                return r9
            L_0x00bc:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00c0:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x00cd
                int r2 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x00c0
            L_0x00cd:
                r1.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                return r9
            L_0x00d1:
                int r9 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r4 = defpackage.s5.u     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r4 = r4.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 < r4) goto L_0x00f2
                r9 = 0
            L_0x00d9:
                byte[] r4 = defpackage.s5.u     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r4 = r4.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 >= r4) goto L_0x00ed
                byte[] r4 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r4 = r4[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r5 = defpackage.s5.u     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r5 = r5[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r4 == r5) goto L_0x00ea
                r2 = 0
                goto L_0x00ed
            L_0x00ea:
                int r9 = r9 + 1
                goto L_0x00d9
            L_0x00ed:
                if (r2 == 0) goto L_0x00f2
                byte[] r9 = defpackage.s5.u     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r9.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00f2:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.<init>()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00f7:
                int r2 = r8.b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0113
                byte[] r2 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r2 = r2[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r2 != 0) goto L_0x0102
                goto L_0x0113
            L_0x0102:
                r4 = 32
                if (r2 < r4) goto L_0x010b
                char r2 = (char) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.append(r2)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                goto L_0x0110
            L_0x010b:
                r2 = 63
                r9.append(r2)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0110:
                int r3 = r3 + 1
                goto L_0x00f7
            L_0x0113:
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r1.close()     // Catch:{ IOException -> 0x011a }
            L_0x011a:
                return r9
            L_0x011b:
                byte[] r9 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r9 = r9.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 != r2) goto L_0x0140
                byte[] r9 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r9 = r9[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 < 0) goto L_0x0140
                byte[] r9 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r9 = r9[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 > r2) goto L_0x0140
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                char[] r2 = new char[r2]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r4 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r4 = r4[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r4 = r4 + 48
                char r4 = (char) r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.<init>(r2)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r1.close()     // Catch:{ IOException -> 0x013f }
            L_0x013f:
                return r9
            L_0x0140:
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r2 = r8.c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                java.nio.charset.Charset r3 = defpackage.s5.L     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.<init>(r2, r3)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r1.close()     // Catch:{ IOException -> 0x014c }
            L_0x014c:
                return r9
            L_0x014d:
                r1.close()     // Catch:{ IOException -> 0x0150 }
            L_0x0150:
                return r0
            L_0x0151:
                r9 = move-exception
                r0 = r1
                goto L_0x0155
            L_0x0154:
                r9 = move-exception
            L_0x0155:
                if (r0 == 0) goto L_0x015a
                r0.close()     // Catch:{ IOException -> 0x015a }
            L_0x015a:
                throw r9
            L_0x015b:
                r1 = r0
            L_0x015c:
                if (r1 == 0) goto L_0x0161
                r1.close()     // Catch:{ IOException -> 0x0161 }
            L_0x0161:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s5.b.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + s5.s[this.a] + ", data length:" + this.c.length + ")";
        }
    }

    /* renamed from: s5$c */
    static class c {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        c(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.c == 9 || this.d == 9) && i == 8) {
                return true;
            }
            return (this.c == 12 || this.d == 12) && i == 11;
        }
    }

    /* renamed from: s5$d */
    private static class d {
        public final long a;
        public final long b;

        d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public double a() {
            return ((double) this.a) / ((double) this.b);
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        c[] cVarArr = {new c("ColorSpace", 55, 3)};
        E = cVarArr;
        c[] cVarArr2 = v;
        F = new c[][]{cVarArr2, w, x, y, z, cVarArr2, B, C, D, cVarArr};
        c[][] cVarArr3 = F;
        H = new HashMap[cVarArr3.length];
        I = new HashMap[cVarArr3.length];
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i2 = 0; i2 < F.length; i2++) {
            H[i2] = new HashMap<>();
            I[i2] = new HashMap<>();
            for (c cVar : F[i2]) {
                H[i2].put(Integer.valueOf(cVar.a), cVar);
                I[i2].put(cVar.b, cVar);
            }
        }
        K.put(Integer.valueOf(G[0].a), 5);
        K.put(Integer.valueOf(G[1].a), 1);
        K.put(Integer.valueOf(G[2].a), 2);
        K.put(Integer.valueOf(G[3].a), 3);
        K.put(Integer.valueOf(G[4].a), 7);
        K.put(Integer.valueOf(G[5].a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public s5(InputStream inputStream) {
        if (inputStream != null) {
            AssetManager.AssetInputStream assetInputStream = null;
            this.a = null;
            this.b = inputStream instanceof AssetManager.AssetInputStream ? (AssetManager.AssetInputStream) inputStream : assetInputStream;
            t(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    private void A(int i2, int i3) {
        if (!this.d[i2].isEmpty() && !this.d[i3].isEmpty()) {
            b bVar = this.d[i2].get("ImageLength");
            b bVar2 = this.d[i2].get("ImageWidth");
            b bVar3 = this.d[i3].get("ImageLength");
            b bVar4 = this.d[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int i4 = bVar.i(this.f);
                int i5 = bVar2.i(this.f);
                int i6 = bVar3.i(this.f);
                int i7 = bVar4.i(this.f);
                if (i4 < i6 && i5 < i7) {
                    HashMap<String, b>[] hashMapArr = this.d;
                    HashMap<String, b> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    private void B(a aVar, int i2) {
        b bVar;
        b bVar2;
        StringBuilder sb;
        String arrays;
        b bVar3 = this.d[i2].get("DefaultCropSize");
        b bVar4 = this.d[i2].get("SensorTopBorder");
        b bVar5 = this.d[i2].get("SensorLeftBorder");
        b bVar6 = this.d[i2].get("SensorBottomBorder");
        b bVar7 = this.d[i2].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.a == 5) {
                d[] dVarArr = (d[]) bVar3.k(this.f);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(dVarArr);
                } else {
                    bVar2 = b.d(dVarArr[0], this.f);
                    bVar = b.d(dVarArr[1], this.f);
                    this.d[i2].put("ImageWidth", bVar2);
                    this.d[i2].put("ImageLength", bVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) bVar3.k(this.f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    bVar2 = b.f(iArr[0], this.f);
                    bVar = b.f(iArr[1], this.f);
                    this.d[i2].put("ImageWidth", bVar2);
                    this.d[i2].put("ImageLength", bVar);
                    return;
                }
            }
            sb.append(arrays);
            sb.toString();
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            y(aVar, i2);
        } else {
            int i3 = bVar4.i(this.f);
            int i4 = bVar6.i(this.f);
            int i5 = bVar7.i(this.f);
            int i6 = bVar5.i(this.f);
            if (i4 > i3 && i5 > i6) {
                b f2 = b.f(i4 - i3, this.f);
                b f3 = b.f(i5 - i6, this.f);
                this.d[i2].put("ImageLength", f2);
                this.d[i2].put("ImageWidth", f3);
            }
        }
    }

    private void C(InputStream inputStream) {
        A(0, 5);
        A(0, 4);
        A(5, 4);
        b bVar = this.d[1].get("PixelXDimension");
        b bVar2 = this.d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.d[0].put("ImageWidth", bVar);
            this.d[0].put("ImageLength", bVar2);
        }
        if (this.d[4].isEmpty() && s(this.d[5])) {
            HashMap<String, b>[] hashMapArr = this.d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        boolean s2 = s(this.d[4]);
    }

    private void a() {
        String c2 = c("DateTimeOriginal");
        if (c2 != null && c("DateTime") == null) {
            this.d[0].put("DateTime", b.a(c2));
        }
        if (c("ImageWidth") == null) {
            this.d[0].put("ImageWidth", b.b(0, this.f));
        }
        if (c("ImageLength") == null) {
            this.d[0].put("ImageLength", b.b(0, this.f));
        }
        if (c("Orientation") == null) {
            this.d[0].put("Orientation", b.b(0, this.f));
        }
        if (c("LightSource") == null) {
            this.d[1].put("LightSource", b.b(0, this.f));
        }
    }

    private static long[] b(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private b e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < F.length; i2++) {
            b bVar = this.d[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(defpackage.s5.a r10, int r11, int r12) {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.i(r0)
            long r0 = (long) r11
            r10.h(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, s5$b>[] r0 = r9.d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f
            s5$b r5 = defpackage.s5.b.b(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, s5$b>[] r0 = r9.d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f
            s5$b r5 = defpackage.s5.b.b(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.c(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, s5$b>[] r5 = r9.d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = L
            r7.<init>(r0, r8)
            s5$b r0 = defpackage.s5.b.a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = M
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.h = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.w(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f
            r10.i(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5.f(s5$a, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (n(bArr)) {
            return 4;
        }
        if (p(bArr)) {
            return 9;
        }
        if (o(bArr)) {
            return 7;
        }
        return q(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(defpackage.s5.a r7) {
        /*
            r6 = this;
            r6.j(r7)
            java.util.HashMap<java.lang.String, s5$b>[] r7 = r6.d
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            s5$b r7 = (defpackage.s5.b) r7
            if (r7 == 0) goto L_0x00f3
            s5$a r1 = new s5$a
            byte[] r7 = r7.c
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f
            r1.i(r7)
            byte[] r7 = p
            int r7 = r7.length
            byte[] r7 = new byte[r7]
            r1.readFully(r7)
            r2 = 0
            r1.h(r2)
            byte[] r2 = q
            int r2 = r2.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            byte[] r3 = p
            boolean r7 = java.util.Arrays.equals(r7, r3)
            if (r7 == 0) goto L_0x0041
            r2 = 8
        L_0x003d:
            r1.h(r2)
            goto L_0x004c
        L_0x0041:
            byte[] r7 = q
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x004c
            r2 = 12
            goto L_0x003d
        L_0x004c:
            r7 = 6
            r6.x(r1, r7)
            java.util.HashMap<java.lang.String, s5$b>[] r7 = r6.d
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            s5$b r7 = (defpackage.s5.b) r7
            java.util.HashMap<java.lang.String, s5$b>[] r2 = r6.d
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            s5$b r1 = (defpackage.s5.b) r1
            if (r7 == 0) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            java.util.HashMap<java.lang.String, s5$b>[] r2 = r6.d
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, s5$b>[] r7 = r6.d
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x0080:
            java.util.HashMap<java.lang.String, s5$b>[] r7 = r6.d
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            s5$b r7 = (defpackage.s5.b) r7
            if (r7 == 0) goto L_0x00f3
            java.nio.ByteOrder r1 = r6.f
            java.lang.Object r7 = r7.k(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00df
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009f
            goto L_0x00df
        L_0x009f:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f3
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f3
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00c0
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00c0:
            java.nio.ByteOrder r7 = r6.f
            s5$b r7 = defpackage.s5.b.f(r1, r7)
            java.nio.ByteOrder r0 = r6.f
            s5$b r0 = defpackage.s5.b.f(r2, r0)
            java.util.HashMap<java.lang.String, s5$b>[] r1 = r6.d
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, s5$b>[] r7 = r6.d
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f3
        L_0x00df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            r0.toString()
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5.h(s5$a):void");
    }

    private void i(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        f(aVar, i2, 5);
        aVar.h((long) i3);
        aVar.i(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == A.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b f2 = b.f(readShort, this.f);
                b f3 = b.f(readShort2, this.f);
                this.d[0].put("ImageLength", f2);
                this.d[0].put("ImageWidth", f3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    private void j(a aVar) {
        b bVar;
        u(aVar, aVar.available());
        x(aVar, 0);
        B(aVar, 0);
        B(aVar, 5);
        B(aVar, 4);
        C(aVar);
        if (this.c == 8 && (bVar = this.d[1].get("MakerNote")) != null) {
            a aVar2 = new a(bVar.c);
            aVar2.i(this.f);
            aVar2.h(6);
            x(aVar2, 9);
            b bVar2 = this.d[9].get("ColorSpace");
            if (bVar2 != null) {
                this.d[1].put("ColorSpace", bVar2);
            }
        }
    }

    private void k(a aVar) {
        j(aVar);
        if (this.d[0].get("JpgFromRaw") != null) {
            f(aVar, this.l, 5);
        }
        b bVar = this.d[0].get("ISO");
        b bVar2 = this.d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.d[1].put("PhotographicSensitivity", bVar);
        }
    }

    private void l(a aVar, HashMap hashMap) {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int i3 = bVar.i(this.f);
            int min = Math.min(bVar2.i(this.f), aVar.available() - i3);
            int i4 = this.c;
            if (i4 == 4 || i4 == 9 || i4 == 10) {
                i2 = this.h;
            } else {
                if (i4 == 7) {
                    i2 = this.i;
                }
                if (i3 > 0 && min > 0 && this.a == null && this.b == null) {
                    aVar.h((long) i3);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            i3 += i2;
            if (i3 > 0) {
            }
        }
    }

    private void m(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (bVar != null && bVar2 != null) {
            long[] b2 = b(bVar.k(this.f));
            long[] b3 = b(bVar2.k(this.f));
            if (b2 != null && b3 != null) {
                long j2 = 0;
                for (long j3 : b3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[((int) j2)];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < b2.length; i4++) {
                    int i5 = (int) b2[i4];
                    int i6 = (int) b3[i4];
                    int i7 = i5 - i2;
                    aVar.h((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    aVar.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
            }
        }
    }

    private static boolean n(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = o;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean o(byte[] bArr) {
        a aVar = new a(bArr);
        ByteOrder v2 = v(aVar);
        this.f = v2;
        aVar.i(v2);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean p(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean q(byte[] bArr) {
        a aVar = new a(bArr);
        ByteOrder v2 = v(aVar);
        this.f = v2;
        aVar.i(v2);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    private boolean r(HashMap hashMap) {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.k(this.f);
        if (Arrays.equals(m, iArr)) {
            return true;
        }
        if (this.c != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i2 = bVar.i(this.f);
        return (i2 == 1 && Arrays.equals(iArr, n)) || (i2 == 6 && Arrays.equals(iArr, m));
    }

    private boolean s(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.i(this.f) <= 512 && bVar2.i(this.f) <= 512;
    }

    private void t(InputStream inputStream) {
        int i2 = 0;
        while (i2 < F.length) {
            try {
                this.d[i2] = new HashMap<>();
                i2++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.c = g(bufferedInputStream);
        a aVar = new a((InputStream) bufferedInputStream);
        switch (this.c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                j(aVar);
                break;
            case 4:
                f(aVar, 0, 0);
                break;
            case 7:
                h(aVar);
                break;
            case 9:
                i(aVar);
                break;
            case 10:
                k(aVar);
                break;
        }
        z(aVar);
        a();
    }

    private void u(a aVar, int i2) {
        ByteOrder v2 = v(aVar);
        this.f = v2;
        aVar.i(v2);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.c;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException("Couldn't jump to first Ifd: " + i4);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private ByteOrder v(a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void w(byte[] bArr, int i2) {
        a aVar = new a(bArr);
        u(aVar, bArr.length);
        x(aVar, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void x(defpackage.s5.a r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.Set<java.lang.Integer> r3 = r0.e
            int r4 = r1.h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.h
            int r3 = r3 + 2
            int r4 = r1.g
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r25.readShort()
            int r4 = r1.h
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.g
            if (r4 > r5) goto L_0x02e2
            if (r3 > 0) goto L_0x002b
            goto L_0x02e2
        L_0x002b:
            r5 = 0
        L_0x002c:
            r6 = 0
            if (r5 >= r3) goto L_0x0287
            int r9 = r25.readUnsignedShort()
            int r10 = r25.readUnsignedShort()
            int r11 = r25.readInt()
            int r12 = r25.a()
            long r12 = (long) r12
            r14 = 4
            long r12 = r12 + r14
            java.util.HashMap<java.lang.Integer, s5$c>[] r16 = H
            r4 = r16[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r4.get(r8)
            s5$c r4 = (defpackage.s5.c) r4
            r8 = 7
            if (r4 != 0) goto L_0x0068
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since tag number is not defined: "
            r14.append(r15)
            r14.append(r9)
        L_0x0062:
            r14.toString()
            r19 = r9
            goto L_0x00d1
        L_0x0068:
            if (r10 <= 0) goto L_0x00bf
            int[] r14 = t
            int r14 = r14.length
            if (r10 < r14) goto L_0x0070
            goto L_0x00bf
        L_0x0070:
            boolean r14 = r4.a(r10)
            if (r14 != 0) goto L_0x0092
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since data format ("
            r14.append(r15)
            java.lang.String[] r15 = s
            r15 = r15[r10]
            r14.append(r15)
            java.lang.String r15 = ") is unexpected for tag: "
            r14.append(r15)
            java.lang.String r15 = r4.b
            r14.append(r15)
            goto L_0x0062
        L_0x0092:
            if (r10 != r8) goto L_0x0096
            int r10 = r4.c
        L_0x0096:
            long r14 = (long) r11
            int[] r19 = t
            r8 = r19[r10]
            r19 = r9
            long r8 = (long) r8
            long r14 = r14 * r8
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00ae
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r21 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r21 <= 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r8 = 1
            goto L_0x00d3
        L_0x00ae:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r11)
            r8.toString()
            goto L_0x00d2
        L_0x00bf:
            r19 = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since data format is invalid: "
            r8.append(r9)
            r8.append(r10)
            r8.toString()
        L_0x00d1:
            r14 = r6
        L_0x00d2:
            r8 = 0
        L_0x00d3:
            if (r8 != 0) goto L_0x00de
            r1.h(r12)
            r20 = r3
            r22 = r5
            goto L_0x027e
        L_0x00de:
            java.lang.String r8 = "Compression"
            r17 = 4
            int r9 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x0186
            int r9 = r25.readInt()
            int r6 = r0.c
            r7 = 7
            if (r6 != r7) goto L_0x014c
            java.lang.String r6 = r4.b
            java.lang.String r7 = "MakerNote"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00fc
            r0.i = r9
            goto L_0x0146
        L_0x00fc:
            r6 = 6
            if (r2 != r6) goto L_0x0146
            java.lang.String r7 = r4.b
            java.lang.String r6 = "ThumbnailImage"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0146
            r0.j = r9
            r0.k = r11
            java.nio.ByteOrder r6 = r0.f
            r7 = 6
            s5$b r6 = defpackage.s5.b.f(r7, r6)
            int r7 = r0.j
            r20 = r3
            long r2 = (long) r7
            java.nio.ByteOrder r7 = r0.f
            s5$b r2 = defpackage.s5.b.b(r2, r7)
            int r3 = r0.k
            r21 = r10
            r7 = r11
            long r10 = (long) r3
            java.nio.ByteOrder r3 = r0.f
            s5$b r3 = defpackage.s5.b.b(r10, r3)
            java.util.HashMap<java.lang.String, s5$b>[] r10 = r0.d
            r11 = 4
            r10 = r10[r11]
            r10.put(r8, r6)
            java.util.HashMap<java.lang.String, s5$b>[] r6 = r0.d
            r6 = r6[r11]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6.put(r10, r2)
            java.util.HashMap<java.lang.String, s5$b>[] r2 = r0.d
            r2 = r2[r11]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r2.put(r6, r3)
            goto L_0x0161
        L_0x0146:
            r20 = r3
            r21 = r10
            r7 = r11
            goto L_0x0161
        L_0x014c:
            r20 = r3
            r21 = r10
            r7 = r11
            r2 = 10
            if (r6 != r2) goto L_0x0161
            java.lang.String r2 = r4.b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0161
            r0.l = r9
        L_0x0161:
            long r2 = (long) r9
            long r10 = r2 + r14
            int r6 = r1.g
            r22 = r5
            long r5 = (long) r6
            int r23 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r23 > 0) goto L_0x0171
            r1.h(r2)
            goto L_0x018d
        L_0x0171:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r9)
        L_0x017e:
            r2.toString()
        L_0x0181:
            r1.h(r12)
            goto L_0x027e
        L_0x0186:
            r20 = r3
            r22 = r5
            r21 = r10
            r7 = r11
        L_0x018d:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r5 = 3
            if (r2 == 0) goto L_0x021a
            r6 = -1
            r10 = r21
            if (r10 == r5) goto L_0x01c3
            r4 = 4
            if (r10 == r4) goto L_0x01be
            if (r10 == r3) goto L_0x01b9
            r3 = 9
            if (r10 == r3) goto L_0x01b4
            r3 = 13
            if (r10 == r3) goto L_0x01b4
        L_0x01b1:
            r3 = 0
            goto L_0x01c9
        L_0x01b4:
            int r3 = r25.readInt()
            goto L_0x01c7
        L_0x01b9:
            short r3 = r25.readShort()
            goto L_0x01c7
        L_0x01be:
            long r6 = r25.b()
            goto L_0x01b1
        L_0x01c3:
            int r3 = r25.readUnsignedShort()
        L_0x01c7:
            long r6 = (long) r3
            goto L_0x01b1
        L_0x01c9:
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x020b
            int r3 = r1.g
            long r3 = (long) r3
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x020b
            java.util.Set<java.lang.Integer> r3 = r0.e
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x01ec
            r1.h(r6)
            int r2 = r2.intValue()
            r0.x(r1, r2)
            goto L_0x0181
        L_0x01ec:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ")"
            r3.append(r2)
            r3.toString()
            goto L_0x0181
        L_0x020b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r6)
            goto L_0x017e
        L_0x021a:
            r10 = r21
            int r2 = (int) r14
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            s5$b r6 = new s5$b
            r6.<init>(r10, r7, r2)
            java.util.HashMap<java.lang.String, s5$b>[] r2 = r0.d
            r2 = r2[r26]
            java.lang.String r7 = r4.b
            r2.put(r7, r6)
            java.lang.String r2 = r4.b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x023c
            r0.c = r5
        L_0x023c:
            java.lang.String r2 = r4.b
            java.lang.String r5 = "Make"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0250
            java.lang.String r2 = r4.b
            java.lang.String r5 = "Model"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x025e
        L_0x0250:
            java.nio.ByteOrder r2 = r0.f
            java.lang.String r2 = r6.j(r2)
            java.lang.String r5 = "PENTAX"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0271
        L_0x025e:
            java.lang.String r2 = r4.b
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0273
            java.nio.ByteOrder r2 = r0.f
            int r2 = r6.i(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x0273
        L_0x0271:
            r0.c = r3
        L_0x0273:
            int r2 = r25.a()
            long r2 = (long) r2
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x027e
            goto L_0x0181
        L_0x027e:
            int r5 = r22 + 1
            short r5 = (short) r5
            r2 = r26
            r3 = r20
            goto L_0x002c
        L_0x0287:
            int r2 = r25.a()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.g
            if (r2 > r3) goto L_0x02e2
            int r2 = r25.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02d2
            int r5 = r1.g
            if (r2 >= r5) goto L_0x02d2
            java.util.Set<java.lang.Integer> r5 = r0.e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02ca
            r1.h(r3)
            java.util.HashMap<java.lang.String, s5$b>[] r2 = r0.d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02be
        L_0x02ba:
            r0.x(r1, r3)
            goto L_0x02e2
        L_0x02be:
            java.util.HashMap<java.lang.String, s5$b>[] r2 = r0.d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02e2
            goto L_0x02ba
        L_0x02ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x02d9
        L_0x02d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x02d9:
            r1.append(r3)
            r1.append(r2)
            r1.toString()
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5.x(s5$a, int):void");
    }

    private void y(a aVar, int i2) {
        b bVar;
        b bVar2 = this.d[i2].get("ImageLength");
        b bVar3 = this.d[i2].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.d[i2].get("JPEGInterchangeFormat")) != null) {
            f(aVar, bVar.i(this.f), i2);
        }
    }

    private void z(a aVar) {
        HashMap<String, b> hashMap = this.d[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i2 = bVar.i(this.f);
            this.g = i2;
            if (i2 != 1) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        return;
                    }
                }
            }
            if (r(hashMap)) {
                m(aVar, hashMap);
                return;
            }
            return;
        }
        this.g = 6;
        l(aVar, hashMap);
    }

    public String c(String str) {
        b e2 = e(str);
        if (e2 != null) {
            if (!J.contains(str)) {
                return e2.j(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = e2.a;
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) e2.k(this.f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr);
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b)))});
                }
                "GPS Timestamp format is not rational. format=" + e2.a;
                return null;
            }
            try {
                return Double.toString(e2.h(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int d(String str, int i2) {
        b e2 = e(str);
        if (e2 == null) {
            return i2;
        }
        try {
            return e2.i(this.f);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }
}
