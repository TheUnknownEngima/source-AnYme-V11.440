package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: oq1  reason: default package */
final class oq1 {
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Method>> a = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Set<Method>>> b = new ConcurrentHashMap();

    static Map<Class<?>, sq1> a(Object obj) {
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) a.get(cls);
        if (map == null) {
            map = new HashMap();
            d(cls, map);
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), new sq1(obj, (Method) entry.getValue()));
            }
        }
        return hashMap;
    }

    static Map<Class<?>, Set<rq1>> b(Object obj) {
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) b.get(cls);
        if (map == null) {
            map = new HashMap();
            e(cls, map);
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                HashSet hashSet = new HashSet();
                for (Method rq1 : (Set) entry.getValue()) {
                    hashSet.add(new rq1(obj, rq1));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }

    private static void c(Class<?> cls, Map<Class<?>, Method> map, Map<Class<?>, Set<Method>> map2) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge()) {
                if (method.isAnnotationPresent(vq1.class)) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        Class cls2 = parameterTypes[0];
                        if (cls2.isInterface()) {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " which is an interface.  Subscription must be on a concrete class type.");
                        } else if ((1 & method.getModifiers()) != 0) {
                            Set set = map2.get(cls2);
                            if (set == null) {
                                set = new HashSet();
                                map2.put(cls2, set);
                            }
                            set.add(method);
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " but is not 'public'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation but requires " + parameterTypes.length + " arguments.  Methods must require a single argument.");
                    }
                } else if (method.isAnnotationPresent(uq1.class)) {
                    Class[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length != 0) {
                        throw new IllegalArgumentException("Method " + method + "has @Produce annotation but requires " + parameterTypes2.length + " arguments.  Methods must require zero arguments.");
                    } else if (method.getReturnType() != Void.class) {
                        Class<?> returnType = method.getReturnType();
                        if (returnType.isInterface()) {
                            throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " which is an interface.  Producers must return a concrete class type.");
                        } else if (returnType.equals(Void.TYPE)) {
                            throw new IllegalArgumentException("Method " + method + " has @Produce annotation but has no return type.");
                        } else if ((1 & method.getModifiers()) == 0) {
                            throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " but is not 'public'.");
                        } else if (!map.containsKey(returnType)) {
                            map.put(returnType, method);
                        } else {
                            throw new IllegalArgumentException("Producer for type " + returnType + " has already been registered.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + " has a return type of void.  Must declare a non-void type.");
                    }
                } else {
                    continue;
                }
            }
        }
        a.put(cls, map);
        b.put(cls, map2);
    }

    private static void d(Class<?> cls, Map<Class<?>, Method> map) {
        c(cls, map, new HashMap());
    }

    private static void e(Class<?> cls, Map<Class<?>, Set<Method>> map) {
        c(cls, new HashMap(), map);
    }
}
