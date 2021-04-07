package com.github.mikephil.charting.utils;

import android.os.Environment;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static final String LOG = "MPChart-FileUtils";

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC, Splitter:B:18:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[SYNTHETIC, Splitter:B:24:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.github.mikephil.charting.data.BarEntry> loadBarEntriesFromAssets(android.content.res.AssetManager r4, java.lang.String r5) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0045 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0045 }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ IOException -> 0x0045 }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0045 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0045 }
        L_0x0016:
            java.lang.String r4 = r2.readLine()     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            if (r4 == 0) goto L_0x0039
            java.lang.String r5 = "#"
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            com.github.mikephil.charting.data.BarEntry r5 = new com.github.mikephil.charting.data.BarEntry     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r1 = 1
            r1 = r4[r1]     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r3 = 0
            r4 = r4[r3]     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r5.<init>((float) r1, (float) r4)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            r0.add(r5)     // Catch:{ IOException -> 0x0040, all -> 0x003d }
            goto L_0x0016
        L_0x0039:
            r2.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x003d:
            r4 = move-exception
            r1 = r2
            goto L_0x0054
        L_0x0040:
            r4 = move-exception
            r1 = r2
            goto L_0x0046
        L_0x0043:
            r4 = move-exception
            goto L_0x0054
        L_0x0045:
            r4 = move-exception
        L_0x0046:
            r4.toString()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r4 = move-exception
            r4.toString()
        L_0x0053:
            return r0
        L_0x0054:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r5 = move-exception
            r5.toString()
        L_0x005e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.utils.FileUtils.loadBarEntriesFromAssets(android.content.res.AssetManager, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A[SYNTHETIC, Splitter:B:25:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[SYNTHETIC, Splitter:B:31:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromAssets(android.content.res.AssetManager r6, java.lang.String r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0069 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0069 }
            java.io.InputStream r6 = r6.open(r7)     // Catch:{ IOException -> 0x0069 }
            java.lang.String r7 = "UTF-8"
            r3.<init>(r6, r7)     // Catch:{ IOException -> 0x0069 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0069 }
        L_0x0016:
            java.lang.String r6 = r2.readLine()     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            if (r6 == 0) goto L_0x005d
            java.lang.String r7 = "#"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r7 = r6.length     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r1 = 2
            r3 = 0
            r4 = 1
            if (r7 > r1) goto L_0x003d
            com.github.mikephil.charting.data.Entry r7 = new com.github.mikephil.charting.data.Entry     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r1 = r6[r4]     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r6 = r6[r3]     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r7.<init>(r1, r6)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
        L_0x0039:
            r0.add(r7)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            goto L_0x0016
        L_0x003d:
            int r7 = r6.length     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r7 = r7 - r4
            float[] r1 = new float[r7]     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
        L_0x0041:
            if (r3 >= r7) goto L_0x004e
            r5 = r6[r3]     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r1[r3] = r5     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r3 = r3 + 1
            goto L_0x0041
        L_0x004e:
            com.github.mikephil.charting.data.BarEntry r7 = new com.github.mikephil.charting.data.BarEntry     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r3 = r6.length     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r3 = r3 - r4
            r6 = r6[r3]     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r7.<init>((float) r6, (float[]) r1)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            goto L_0x0039
        L_0x005d:
            r2.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0077
        L_0x0061:
            r6 = move-exception
            r1 = r2
            goto L_0x0078
        L_0x0064:
            r6 = move-exception
            r1 = r2
            goto L_0x006a
        L_0x0067:
            r6 = move-exception
            goto L_0x0078
        L_0x0069:
            r6 = move-exception
        L_0x006a:
            r6.toString()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0077
            r1.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r6 = move-exception
            r6.toString()
        L_0x0077:
            return r0
        L_0x0078:
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r7 = move-exception
            r7.toString()
        L_0x0082:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.utils.FileUtils.loadEntriesFromAssets(android.content.res.AssetManager, java.lang.String):java.util.List");
    }

    public static List<Entry> loadEntriesFromFile(String str) {
        Object barEntry;
        File file = new File(Environment.getExternalStorageDirectory(), str);
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split("#");
                if (split.length <= 2) {
                    barEntry = new Entry(Float.parseFloat(split[0]), (float) Integer.parseInt(split[1]));
                } else {
                    int length = split.length - 1;
                    float[] fArr = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr[i] = Float.parseFloat(split[i]);
                    }
                    barEntry = new BarEntry((float) Integer.parseInt(split[split.length - 1]), fArr);
                }
                arrayList.add(barEntry);
            }
        } catch (IOException e) {
            e.toString();
        }
        return arrayList;
    }

    public static void saveToSdCard(List<Entry> list, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.toString();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Entry next : list) {
                bufferedWriter.append(next.getY() + "#" + next.getX());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e2) {
            e2.toString();
        }
    }
}
