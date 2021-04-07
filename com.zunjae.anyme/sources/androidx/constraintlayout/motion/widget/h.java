package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class h {
    static HashMap<String, Constructor<? extends c>> b;
    private HashMap<Integer, ArrayList<c>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends c>> hashMap = new HashMap<>();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", d.class.getConstructor(new Class[0]));
            b.put("KeyPosition", i.class.getConstructor(new Class[0]));
            b.put("KeyCycle", f.class.getConstructor(new Class[0]));
            b.put("KeyTimeCycle", k.class.getConstructor(new Class[0]));
            b.put("KeyTrigger", l.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public h(Context context, XmlPullParser xmlPullParser) {
        c cVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (b.containsKey(name)) {
                        try {
                            c cVar2 = (c) b.get(name).newInstance(new Object[0]);
                            try {
                                cVar2.c(context, Xml.asAttributeSet(xmlPullParser));
                                b(cVar2);
                            } catch (Exception unused) {
                            }
                            cVar = cVar2;
                        } catch (Exception unused2) {
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || cVar == null || cVar.d == null)) {
                        a.g(context, xmlPullParser, cVar.d);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private void b(c cVar) {
        if (!this.a.containsKey(Integer.valueOf(cVar.b))) {
            this.a.put(Integer.valueOf(cVar.b), new ArrayList());
        }
        this.a.get(Integer.valueOf(cVar.b)).add(cVar);
    }

    public void a(n nVar) {
        ArrayList arrayList = this.a.get(Integer.valueOf(nVar.b));
        if (arrayList != null) {
            nVar.b(arrayList);
        }
        ArrayList arrayList2 = this.a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.d(((ConstraintLayout.LayoutParams) nVar.a.getLayoutParams()).U)) {
                    nVar.a(cVar);
                }
            }
        }
    }
}
