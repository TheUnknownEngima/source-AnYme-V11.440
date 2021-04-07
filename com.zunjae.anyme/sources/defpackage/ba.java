package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* renamed from: ba  reason: default package */
public class ba implements y9<File, List<gb>> {
    private final ca a;

    public ba(ca caVar) {
        this.a = caVar;
    }

    private List<gb> e(File file) {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        ArrayList arrayList = new ArrayList();
        while (scanner.hasNextLine()) {
            try {
                gb c = this.a.a(scanner.nextLine());
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

    public File c(List<gb> list) {
        throw new UnsupportedOperationException("from(List<Issue> value) not supported");
    }

    /* renamed from: d */
    public List<gb> b(File file) {
        try {
            return e(file);
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }
}
