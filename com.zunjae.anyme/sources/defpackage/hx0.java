package defpackage;

/* renamed from: hx0  reason: default package */
final class hx0 {
    static int a(int i, byte[] bArr, int i2, int i3, kx0 kx0) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return k(bArr, i2, kx0);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return i(bArr, i2, kx0) + kx0.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = i(bArr, i2, kx0);
                    i6 = kx0.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, kx0);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw ez0.e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw ez0.c();
            }
        } else {
            throw ez0.c();
        }
    }

    static int b(int i, byte[] bArr, int i2, int i3, bz0<?> bz0, kx0 kx0) {
        vy0 vy0 = (vy0) bz0;
        int i4 = i(bArr, i2, kx0);
        while (true) {
            vy0.g(kx0.a);
            if (i4 >= i3) {
                break;
            }
            int i5 = i(bArr, i4, kx0);
            if (i != kx0.a) {
                break;
            }
            i4 = i(bArr, i5, kx0);
        }
        return i4;
    }

    static int c(int i, byte[] bArr, int i2, int i3, p11 p11, kx0 kx0) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = k(bArr, i2, kx0);
                p11.c(i, Long.valueOf(kx0.b));
                return k;
            } else if (i4 == 1) {
                p11.c(i, Long.valueOf(l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = i(bArr, i2, kx0);
                int i6 = kx0.a;
                if (i6 < 0) {
                    throw ez0.b();
                } else if (i6 <= bArr.length - i5) {
                    p11.c(i, i6 == 0 ? lx0.f : lx0.i(bArr, i5, i6));
                    return i5 + i6;
                } else {
                    throw ez0.a();
                }
            } else if (i4 == 3) {
                p11 g = p11.g();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = i(bArr, i2, kx0);
                    int i10 = kx0.a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c = c(i8, bArr, i9, i3, g, kx0);
                    i8 = i10;
                    i2 = c;
                }
                if (i2 > i3 || i8 != i7) {
                    throw ez0.e();
                }
                p11.c(i, g);
                return i2;
            } else if (i4 == 5) {
                p11.c(i, Integer.valueOf(h(bArr, i2)));
                return i2 + 4;
            } else {
                throw ez0.c();
            }
        } else {
            throw ez0.c();
        }
    }

    static int d(int i, byte[] bArr, int i2, kx0 kx0) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                kx0.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            kx0.a = i7 | i3;
            return i8;
        }
        kx0.a = i5 | i4;
        return i6;
    }

    static int e(u01<?> u01, int i, byte[] bArr, int i2, int i3, bz0<?> bz0, kx0 kx0) {
        int g = g(u01, bArr, i2, i3, kx0);
        while (true) {
            bz0.add(kx0.c);
            if (g >= i3) {
                break;
            }
            int i4 = i(bArr, g, kx0);
            if (i != kx0.a) {
                break;
            }
            g = g(u01, bArr, i4, i3, kx0);
        }
        return g;
    }

    static int f(u01 u01, byte[] bArr, int i, int i2, int i3, kx0 kx0) {
        j01 j01 = (j01) u01;
        Object zza = j01.zza();
        int n = j01.n(zza, bArr, i, i2, i3, kx0);
        j01.c(zza);
        kx0.c = zza;
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int g(defpackage.u01 r6, byte[] r7, int r8, int r9, defpackage.kx0 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d(r8, r7, r0, r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.f(r1, r2, r3, r4, r5)
            r6.c(r9)
            r10.c = r9
            return r8
        L_0x0025:
            ez0 r6 = defpackage.ez0.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx0.g(u01, byte[], int, int, kx0):int");
    }

    static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i, kx0 kx0) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return d(b, bArr, i2, kx0);
        }
        kx0.a = b;
        return i2;
    }

    static int j(byte[] bArr, int i, bz0<?> bz0, kx0 kx0) {
        vy0 vy0 = (vy0) bz0;
        int i2 = i(bArr, i, kx0);
        int i3 = kx0.a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, kx0);
            vy0.g(kx0.a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw ez0.a();
    }

    static int k(byte[] bArr, int i, kx0 kx0) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            kx0.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        kx0.b = j2;
        return i3;
    }

    static long l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double m(byte[] bArr, int i) {
        return Double.longBitsToDouble(l(bArr, i));
    }

    static int n(byte[] bArr, int i, kx0 kx0) {
        int i2 = i(bArr, i, kx0);
        int i3 = kx0.a;
        if (i3 < 0) {
            throw ez0.b();
        } else if (i3 == 0) {
            kx0.c = "";
            return i2;
        } else {
            kx0.c = new String(bArr, i2, i3, uy0.a);
            return i2 + i3;
        }
    }

    static float o(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    static int p(byte[] bArr, int i, kx0 kx0) {
        int i2 = i(bArr, i, kx0);
        int i3 = kx0.a;
        if (i3 < 0) {
            throw ez0.b();
        } else if (i3 == 0) {
            kx0.c = "";
            return i2;
        } else {
            kx0.c = v11.k(bArr, i2, i3);
            return i2 + i3;
        }
    }

    static int q(byte[] bArr, int i, kx0 kx0) {
        int i2 = i(bArr, i, kx0);
        int i3 = kx0.a;
        if (i3 < 0) {
            throw ez0.b();
        } else if (i3 > bArr.length - i2) {
            throw ez0.a();
        } else if (i3 == 0) {
            kx0.c = lx0.f;
            return i2;
        } else {
            kx0.c = lx0.i(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
