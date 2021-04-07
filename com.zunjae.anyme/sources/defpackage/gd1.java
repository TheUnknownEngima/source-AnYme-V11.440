package defpackage;

import android.os.Looper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gd1  reason: default package */
public final class gd1 {
    private static final FilenameFilter a = new a();
    private static final ExecutorService b = rc1.c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: gd1$a */
    class a implements FilenameFilter {
        a() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* renamed from: gd1$b */
    class b implements x71<T, Void> {
        final /* synthetic */ f81 a;

        b(f81 f81) {
            this.a = f81;
        }

        /* renamed from: b */
        public Void a(e81<T> e81) {
            if (e81.q()) {
                this.a.e(e81.m());
                return null;
            }
            this.a.d(e81.l());
            return null;
        }
    }

    /* renamed from: gd1$c */
    class c implements Runnable {
        final /* synthetic */ Callable e;
        final /* synthetic */ f81 f;

        /* renamed from: gd1$c$a */
        class a implements x71<T, Void> {
            a() {
            }

            /* renamed from: b */
            public Void a(e81<T> e81) {
                if (e81.q()) {
                    c.this.f.c(e81.m());
                    return null;
                }
                c.this.f.b(e81.l());
                return null;
            }
        }

        c(Callable callable, f81 f81) {
            this.e = callable;
            this.f = f81;
        }

        public void run() {
            try {
                ((e81) this.e.call()).h(new a());
            } catch (Exception e2) {
                this.f.b(e2);
            }
        }
    }

    public static <T> T a(e81<T> e81) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        e81.i(b, fd1.b(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (e81.q()) {
            return e81.m();
        }
        if (e81.o()) {
            throw new CancellationException("Task is already canceled");
        } else if (e81.p()) {
            throw new IllegalStateException(e81.l());
        } else {
            throw new TimeoutException();
        }
    }

    public static <T> e81<T> b(Executor executor, Callable<e81<T>> callable) {
        f81 f81 = new f81();
        executor.execute(new c(callable, f81));
        return f81.a();
    }

    static int c(File file, int i, Comparator<File> comparator) {
        return d(file, a, i, comparator);
    }

    static int d(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return e(Arrays.asList(listFiles), i, comparator);
    }

    static int e(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            i(next);
            size--;
        }
        return size;
    }

    static int f(File file, File file2, int i, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return e(arrayList, i, comparator);
    }

    public static <T> e81<T> h(e81<T> e81, e81<T> e812) {
        f81 f81 = new f81();
        b bVar = new b(f81);
        e81.h(bVar);
        e812.h(bVar);
        return f81.a();
    }

    private static void i(File file) {
        if (file.isDirectory()) {
            for (File i : file.listFiles()) {
                i(i);
            }
        }
        file.delete();
    }
}
