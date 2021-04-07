package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* renamed from: da  reason: default package */
public class da implements y9<File, List<ib>> {
    private ea a;

    public da(ea eaVar) {
        this.a = eaVar;
    }

    private List<ib> e(File file) {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        ArrayList arrayList = new ArrayList();
        while (scanner.hasNextLine()) {
            try {
                ib c = this.a.a(scanner.nextLine());
                if (c != null) {
                    arrayList.add(c);
                }
            } finally {
                scanner.close();
            }
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ Object a(Object obj) {
        c((List) obj);
        throw null;
    }

    public File c(List<ib> list) {
        throw new UnsupportedOperationException("from(List<LogEntry> value) not supported");
    }

    /* renamed from: d */
    public List<ib> b(File file) {
        try {
            return e(file);
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }
}
