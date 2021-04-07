package defpackage;

/* renamed from: ns1  reason: default package */
public final class ns1 {
    private final String a;
    private final int b;
    private final int c;

    public ns1(String str, int i, int i2) {
        v62.e(str, "host");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns1(String str, int i, int i2, int i3, r62 r62) {
        this((i3 & 1) != 0 ? "239.255.255.250" : str, (i3 & 2) != 0 ? 1900 : i, (i3 & 4) != 0 ? 1000 : i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ls1 a() {
        /*
            r14 = this;
            java.lang.String r0 = "packet.address"
            java.lang.String r1 = "\r\n"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String r4 = r14.a     // Catch:{ Exception -> 0x0128 }
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            r5.<init>()     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "M-SEARCH * HTTP/1.1\r\n"
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "HOST: "
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = r14.a     // Catch:{ Exception -> 0x0128 }
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            r6 = 58
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            int r6 = r14.b     // Catch:{ Exception -> 0x0128 }
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            r5.append(r1)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "MAN: \"ssdp:discover\"\r\n"
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "MX: 1\r\n"
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "ST: urn:schemas-upnp-org:service:AVTransport:1\r\n"
            r5.append(r6)     // Catch:{ Exception -> 0x0128 }
            r5.append(r1)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0128 }
            java.net.DatagramSocket r5 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0128 }
            int r6 = r14.b     // Catch:{ Exception -> 0x0128 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0128 }
            r6 = 1
            r5.setReuseAddress(r6)     // Catch:{ Exception -> 0x0128 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
        L_0x0056:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            long r9 = r9 - r7
            int r3 = r14.c     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            long r11 = (long) r3     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x010e
            java.net.DatagramPacket r3 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.nio.charset.Charset r9 = defpackage.q82.a     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r1 == 0) goto L_0x0106
            byte[] r9 = r1.getBytes(r9)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r10 = "(this as java.lang.String).getBytes(charset)"
            defpackage.v62.d(r9, r10)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r10 = r1.length()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r11 = r14.b     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.<init>(r9, r10, r4, r11)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r5.send(r3)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.net.DatagramPacket r3 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r9 = 12
            byte[] r10 = new byte[r9]     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.<init>(r10, r9)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r5.receive(r3)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            byte[] r9 = r3.getData()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r10 = "packet.data"
            defpackage.v62.d(r9, r10)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r10 = r3.getLength()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.nio.charset.Charset r12 = defpackage.q82.a     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r13 = 0
            r11.<init>(r9, r13, r10, r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r9 = r11.toUpperCase()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r10 = "(this as java.lang.String).toUpperCase()"
            defpackage.v62.d(r9, r10)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r10 = "HTTP/1.1 200"
            boolean r9 = defpackage.v62.a(r9, r10)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r9 == 0) goto L_0x0056
            boolean r9 = r2.isEmpty()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r9 == 0) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            java.util.Iterator r9 = r2.iterator()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
        L_0x00ba:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r10 == 0) goto L_0x00d6
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            ms1 r10 = (defpackage.ms1) r10     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r10 = r10.b()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r11 = r3.getPort()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r10 != r11) goto L_0x00d2
            r10 = 1
            goto L_0x00d3
        L_0x00d2:
            r10 = 0
        L_0x00d3:
            if (r10 == 0) goto L_0x00ba
            r13 = 1
        L_0x00d6:
            if (r13 != 0) goto L_0x0056
            ms1 r9 = new ms1     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.net.InetAddress r10 = r3.getAddress()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            defpackage.v62.d(r10, r0)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r10 = r10.getCanonicalHostName()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r11 = "packet.address.canonicalHostName"
            defpackage.v62.d(r10, r11)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.net.InetAddress r11 = r3.getAddress()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            defpackage.v62.d(r11, r0)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r11 = r11.getHostAddress()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r12 = "packet.address.hostAddress"
            defpackage.v62.d(r11, r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r3 = r3.getPort()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r9.<init>(r10, r11, r3)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r2.add(r9)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            goto L_0x0056
        L_0x0106:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            throw r0     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
        L_0x010e:
            r5.close()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x011a
            ls1$b r0 = defpackage.ls1.b.a
            goto L_0x011f
        L_0x011a:
            ls1$c r0 = new ls1$c
            r0.<init>(r2)
        L_0x011f:
            return r0
        L_0x0120:
            r0 = move-exception
            r3 = r5
            goto L_0x0137
        L_0x0123:
            r0 = move-exception
            r3 = r5
            goto L_0x0129
        L_0x0126:
            r0 = move-exception
            goto L_0x0137
        L_0x0128:
            r0 = move-exception
        L_0x0129:
            defpackage.uj2.d(r0)     // Catch:{ all -> 0x0126 }
            ls1$a r1 = new ls1$a     // Catch:{ all -> 0x0126 }
            r1.<init>(r0)     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x0136
            r3.close()
        L_0x0136:
            return r1
        L_0x0137:
            if (r3 == 0) goto L_0x013c
            r3.close()
        L_0x013c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns1.a():ls1");
    }
}
