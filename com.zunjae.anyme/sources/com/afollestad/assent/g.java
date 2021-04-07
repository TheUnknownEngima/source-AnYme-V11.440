package com.afollestad.assent;

import android.annotation.SuppressLint;

@SuppressLint({"InlinedApi"})
public enum g {
    UNKNOWN(""),
    READ_CALENDAR("android.permission.READ_CALENDAR"),
    WRITE_CALENDAR("android.permission.WRITE_CALENDAR"),
    CAMERA("android.permission.CAMERA"),
    READ_CONTACTS("android.permission.READ_CONTACTS"),
    WRITE_CONTACTS("android.permission.WRITE_CONTACTS"),
    GET_ACCOUNTS("android.permission.GET_ACCOUNTS"),
    ACCESS_FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
    ACCESS_COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
    ACCESS_BACKGROUND_LOCATION("android.permission.ACCESS_BACKGROUND_LOCATION"),
    RECORD_AUDIO("android.permission.RECORD_AUDIO"),
    READ_PHONE_STATE("android.permission.READ_PHONE_STATE"),
    CALL_PHONE("android.permission.CALL_PHONE"),
    READ_CALL_LOG("android.permission.READ_CALL_LOG"),
    WRITE_CALL_LOG("android.permission.WRITE_CALL_LOG"),
    ADD_VOICEMAIL("com.android.voicemail.permission.ADD_VOICEMAIL"),
    USE_SIP("android.permission.USE_SIP"),
    BODY_SENSORS("android.permission.BODY_SENSORS"),
    SEND_SMS("android.permission.SEND_SMS"),
    RECEIVE_SMS("android.permission.RECEIVE_SMS"),
    READ_SMS("android.permission.READ_SMS"),
    RECEIVE_WAP_PUSH("android.permission.RECEIVE_WAP_PUSH"),
    RECEIVE_MMS("android.permission.RECEIVE_MMS"),
    READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
    WRITE_EXTERNAL_STORAGE("android.permission.WRITE_EXTERNAL_STORAGE"),
    SYSTEM_ALERT_WINDOW("android.permission.SYSTEM_ALERT_WINDOW"),
    PROCESS_OUTGOING_CALLS("android.permission.PROCESS_OUTGOING_CALLS");
    
    public static final a Companion = null;
    private final String value;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final g a(String str) {
            v62.f(str, "raw");
            g[] values = g.values();
            int length = values.length;
            int i = 0;
            g gVar = null;
            g gVar2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    g gVar3 = values[i];
                    if (v62.a(gVar3.getValue(), str)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        gVar2 = gVar3;
                    }
                    i++;
                } else if (z) {
                    gVar = gVar2;
                }
            }
            return gVar != null ? gVar : g.UNKNOWN;
        }
    }

    static {
        Companion = new a((r62) null);
    }

    private g(String str) {
        this.value = str;
    }

    public static final g parse(String str) {
        return Companion.a(str);
    }

    public final String getValue() {
        return this.value;
    }
}
