package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class g {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r80(str));
    }

    static ExecutorService b() {
        return sp0.a().a(new r80("Firebase-Messaging-Intent-Handle"), xp0.a);
    }

    static ExecutorService c() {
        return Executors.newSingleThreadExecutor(new r80("Firebase-Messaging-Network-Io"));
    }

    static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new r80("Firebase-Messaging-Topics-Io"));
    }

    static Executor e() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
