package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* renamed from: z9  reason: default package */
public class z9 implements y9<File, List<String>> {
    private List<String> e(File file) {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        ArrayList arrayList = new ArrayList();
        while (scanner.hasNextLine()) {
            try {
                String nextLine = scanner.nextLine();
                if (nextLine != null && !nextLine.isEmpty()) {
                    arrayList.add(nextLine);
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

    public File c(List<String> list) {
        throw new UnsupportedOperationException("from(List<String> value) not supported");
    }

    /* renamed from: d */
    public List<String> b(File file) {
        try {
            return e(file);
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }
}
