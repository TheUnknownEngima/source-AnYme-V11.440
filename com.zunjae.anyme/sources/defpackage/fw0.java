package defpackage;

/* renamed from: fw0  reason: default package */
public final class fw0<K, V> extends aw0<K, V> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: rw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: dw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: pw0<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: rw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: pw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: pw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: pw0} */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r10 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cw0<K, V> a() {
        /*
            r19 = this;
            r0 = r19
            java.util.Map<K, java.util.Collection<V>> r1 = r0.a
            java.util.Set r1 = r1.entrySet()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0011
            sv0 r1 = defpackage.sv0.f
            return r1
        L_0x0011:
            yv0 r2 = new yv0
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x001f:
            boolean r5 = r1.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0119
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r8 = r5 instanceof defpackage.dw0
            r9 = 1
            if (r8 == 0) goto L_0x004b
            boolean r8 = r5 instanceof java.util.SortedSet
            if (r8 != 0) goto L_0x004b
            r8 = r5
            dw0 r8 = (defpackage.dw0) r8
            boolean r10 = r8.i()
            if (r10 != 0) goto L_0x004b
        L_0x0048:
            r3 = 0
            goto L_0x00c9
        L_0x004b:
            java.lang.Object[] r5 = r5.toArray()
            int r8 = r5.length
        L_0x0050:
            if (r8 == 0) goto L_0x00c6
            if (r8 == r9) goto L_0x00bd
            int r10 = defpackage.dw0.j(r8)
            java.lang.Object[] r14 = new java.lang.Object[r10]
            int r15 = r10 + -1
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x005f:
            if (r11 >= r8) goto L_0x008c
            r3 = r5[r11]
            defpackage.gw0.a(r3, r11)
            int r16 = r3.hashCode()
            int r17 = defpackage.rv0.a(r16)
        L_0x006e:
            r18 = r17 & r15
            r9 = r14[r18]
            if (r9 != 0) goto L_0x007e
            int r9 = r12 + 1
            r5[r12] = r3
            r14[r18] = r3
            int r13 = r13 + r16
            r12 = r9
            goto L_0x0088
        L_0x007e:
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x0088
            int r17 = r17 + 1
            r9 = 1
            goto L_0x006e
        L_0x0088:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x005f
        L_0x008c:
            java.util.Arrays.fill(r5, r12, r8, r6)
            r3 = 1
            if (r12 != r3) goto L_0x009b
            r3 = 0
            r5 = r5[r3]
            rw0 r8 = new rw0
            r8.<init>(r5, r13)
            goto L_0x0048
        L_0x009b:
            int r3 = defpackage.dw0.j(r12)
            int r10 = r10 / 2
            if (r3 >= r10) goto L_0x00a6
            r8 = r12
            r9 = 1
            goto L_0x0050
        L_0x00a6:
            int r3 = r5.length
            int r6 = r3 >> 1
            int r3 = r3 >> 2
            int r6 = r6 + r3
            if (r12 >= r6) goto L_0x00b2
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r12)
        L_0x00b2:
            pw0 r8 = new pw0
            r11 = r8
            r3 = r12
            r12 = r5
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0048
        L_0x00bd:
            r3 = 0
            r5 = r5[r3]
            rw0 r8 = new rw0
            r8.<init>(r5)
            goto L_0x00c9
        L_0x00c6:
            r3 = 0
            pw0<java.lang.Object> r8 = defpackage.pw0.l
        L_0x00c9:
            boolean r5 = r8.isEmpty()
            if (r5 != 0) goto L_0x001f
            int r5 = r2.b
            r6 = 1
            int r5 = r5 + r6
            int r5 = r5 << r6
            java.lang.Object[] r9 = r2.a
            int r10 = r9.length
            if (r5 <= r10) goto L_0x00fe
            int r10 = r9.length
            if (r5 < 0) goto L_0x00f6
            int r11 = r10 >> 1
            int r10 = r10 + r11
            int r10 = r10 + r6
            if (r10 >= r5) goto L_0x00ea
            int r5 = r5 + -1
            int r5 = java.lang.Integer.highestOneBit(r5)
            int r10 = r5 << 1
        L_0x00ea:
            if (r10 >= 0) goto L_0x00ef
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ef:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r9, r10)
            r2.a = r5
            goto L_0x00fe
        L_0x00f6:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "cannot store more than MAX_VALUE elements"
            r1.<init>(r2)
            throw r1
        L_0x00fe:
            defpackage.fv0.a(r7, r8)
            java.lang.Object[] r5 = r2.a
            int r6 = r2.b
            int r9 = r6 * 2
            r5[r9] = r7
            int r7 = r6 * 2
            r9 = 1
            int r7 = r7 + r9
            r5[r7] = r8
            int r6 = r6 + r9
            r2.b = r6
            int r5 = r8.size()
            int r4 = r4 + r5
            goto L_0x001f
        L_0x0119:
            cw0 r1 = new cw0
            int r3 = r2.b
            java.lang.Object[] r2 = r2.a
            iw0 r2 = defpackage.iw0.d(r3, r2)
            r1.<init>(r2, r4, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw0.a():cw0");
    }
}
