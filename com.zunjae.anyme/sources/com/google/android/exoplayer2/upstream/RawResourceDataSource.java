package com.google.android.exoplayer2.upstream;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource extends g {
    private final Resources e;
    private Uri f;
    private AssetFileDescriptor g;
    private InputStream h;
    private long i;
    private boolean j;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str) {
            super(str);
        }
    }

    public static Uri buildRawResourceUri(int i2) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i2);
        return Uri.parse(sb.toString());
    }

    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, (long) i3);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        InputStream inputStream = this.h;
        v50.g(inputStream);
        int read = inputStream.read(bArr, i2, i3);
        if (read != -1) {
            long j3 = this.i;
            if (j3 != -1) {
                this.i = j3 - ((long) read);
            }
            f(read);
            return read;
        } else if (this.i == -1) {
            return -1;
        } else {
            throw new a((IOException) new EOFException());
        }
    }

    public long c(l lVar) {
        try {
            Uri uri = lVar.a;
            this.f = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                String lastPathSegment = uri.getLastPathSegment();
                q40.e(lastPathSegment);
                int parseInt = Integer.parseInt(lastPathSegment);
                h(lVar);
                AssetFileDescriptor openRawResourceFd = this.e.openRawResourceFd(parseInt);
                this.g = openRawResourceFd;
                if (openRawResourceFd != null) {
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.h = fileInputStream;
                    fileInputStream.skip(openRawResourceFd.getStartOffset());
                    if (fileInputStream.skip(lVar.f) >= lVar.f) {
                        long j2 = -1;
                        if (lVar.g != -1) {
                            this.i = lVar.g;
                        } else {
                            long length = openRawResourceFd.getLength();
                            if (length != -1) {
                                j2 = length - lVar.f;
                            }
                            this.i = j2;
                        }
                        this.j = true;
                        i(lVar);
                        return this.i;
                    }
                    throw new EOFException();
                }
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Resource is compressed: ");
                sb.append(valueOf);
                throw new a(sb.toString());
            }
            throw new a("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.");
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public void close() {
        this.f = null;
        try {
            if (this.h != null) {
                this.h.close();
            }
            this.h = null;
            try {
                if (this.g != null) {
                    this.g.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
            } catch (IOException e2) {
                throw new a(e2);
            } catch (Throwable th) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new a(e3);
        } catch (Throwable th2) {
            this.h = null;
            try {
                if (this.g != null) {
                    this.g.close();
                }
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
                throw th2;
            } catch (IOException e4) {
                throw new a(e4);
            } catch (Throwable th3) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
                throw th3;
            }
        }
    }

    public Uri e() {
        return this.f;
    }
}
