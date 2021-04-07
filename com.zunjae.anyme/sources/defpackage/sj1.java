package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* renamed from: sj1  reason: default package */
public enum sj1 {
    DOUBLE(0, b.SCALAR, zj1.DOUBLE),
    FLOAT(1, b.SCALAR, zj1.FLOAT),
    INT64(2, b.SCALAR, zj1.LONG),
    UINT64(3, b.SCALAR, zj1.LONG),
    INT32(4, b.SCALAR, zj1.INT),
    FIXED64(5, b.SCALAR, zj1.LONG),
    FIXED32(6, b.SCALAR, zj1.INT),
    BOOL(7, b.SCALAR, zj1.BOOLEAN),
    STRING(8, b.SCALAR, zj1.STRING),
    MESSAGE(9, b.SCALAR, zj1.MESSAGE),
    BYTES(10, b.SCALAR, zj1.BYTE_STRING),
    UINT32(11, b.SCALAR, zj1.INT),
    ENUM(12, b.SCALAR, zj1.ENUM),
    SFIXED32(13, b.SCALAR, zj1.INT),
    SFIXED64(14, b.SCALAR, zj1.LONG),
    SINT32(15, b.SCALAR, zj1.INT),
    SINT64(16, b.SCALAR, zj1.LONG),
    GROUP(17, b.SCALAR, zj1.MESSAGE),
    DOUBLE_LIST(18, b.VECTOR, zj1.DOUBLE),
    FLOAT_LIST(19, b.VECTOR, zj1.FLOAT),
    INT64_LIST(20, b.VECTOR, zj1.LONG),
    UINT64_LIST(21, b.VECTOR, zj1.LONG),
    INT32_LIST(22, b.VECTOR, zj1.INT),
    FIXED64_LIST(23, b.VECTOR, zj1.LONG),
    FIXED32_LIST(24, b.VECTOR, zj1.INT),
    BOOL_LIST(25, b.VECTOR, zj1.BOOLEAN),
    STRING_LIST(26, b.VECTOR, zj1.STRING),
    MESSAGE_LIST(27, b.VECTOR, zj1.MESSAGE),
    BYTES_LIST(28, b.VECTOR, zj1.BYTE_STRING),
    UINT32_LIST(29, b.VECTOR, zj1.INT),
    ENUM_LIST(30, b.VECTOR, zj1.ENUM),
    SFIXED32_LIST(31, b.VECTOR, zj1.INT),
    SFIXED64_LIST(32, b.VECTOR, zj1.LONG),
    SINT32_LIST(33, b.VECTOR, zj1.INT),
    SINT64_LIST(34, b.VECTOR, zj1.LONG),
    DOUBLE_LIST_PACKED(35, b.PACKED_VECTOR, zj1.DOUBLE),
    FLOAT_LIST_PACKED(36, b.PACKED_VECTOR, zj1.FLOAT),
    INT64_LIST_PACKED(37, b.PACKED_VECTOR, zj1.LONG),
    UINT64_LIST_PACKED(38, b.PACKED_VECTOR, zj1.LONG),
    INT32_LIST_PACKED(39, b.PACKED_VECTOR, zj1.INT),
    FIXED64_LIST_PACKED(40, b.PACKED_VECTOR, zj1.LONG),
    FIXED32_LIST_PACKED(41, b.PACKED_VECTOR, zj1.INT),
    BOOL_LIST_PACKED(42, b.PACKED_VECTOR, zj1.BOOLEAN),
    UINT32_LIST_PACKED(43, b.PACKED_VECTOR, zj1.INT),
    ENUM_LIST_PACKED(44, b.PACKED_VECTOR, zj1.ENUM),
    SFIXED32_LIST_PACKED(45, b.PACKED_VECTOR, zj1.INT),
    SFIXED64_LIST_PACKED(46, b.PACKED_VECTOR, zj1.LONG),
    SINT32_LIST_PACKED(47, b.PACKED_VECTOR, zj1.INT),
    SINT64_LIST_PACKED(48, b.PACKED_VECTOR, zj1.LONG),
    GROUP_LIST(49, b.VECTOR, zj1.MESSAGE),
    MAP(50, b.MAP, zj1.VOID);
    
    private static final Type[] EMPTY_TYPES = null;
    private static final sj1[] VALUES = null;
    private final b collection;
    private final Class<?> elementType;
    private final int id;
    private final zj1 javaType;
    private final boolean primitiveScalar;

    /* renamed from: sj1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;
        static final /* synthetic */ int[] b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                zj1[] r0 = defpackage.zj1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                zj1 r2 = defpackage.zj1.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                zj1 r3 = defpackage.zj1.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                zj1 r4 = defpackage.zj1.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                sj1$b[] r3 = defpackage.sj1.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                sj1$b r4 = defpackage.sj1.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                sj1$b r3 = defpackage.sj1.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004d }
                sj1$b r1 = defpackage.sj1.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sj1.a.<clinit>():void");
        }
    }

    /* renamed from: sj1$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        private b(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        int i;
        EMPTY_TYPES = new Type[0];
        sj1[] values = values();
        VALUES = new sj1[values.length];
        for (sj1 sj1 : values) {
            VALUES[sj1.id] = sj1;
        }
    }

    private sj1(int i, b bVar, zj1 zj1) {
        int i2;
        this.id = i;
        this.collection = bVar;
        this.javaType = zj1;
        int i3 = a.a[bVar.ordinal()];
        boolean z = true;
        this.elementType = (i3 == 1 || i3 == 2) ? zj1.getBoxedType() : null;
        this.primitiveScalar = (bVar != b.SCALAR || (i2 = a.b[zj1.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    public static sj1 forId(int i) {
        if (i < 0) {
            return null;
        }
        sj1[] sj1Arr = VALUES;
        if (i >= sj1Arr.length) {
            return null;
        }
        return sj1Arr[i];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                if (List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                    return type;
                }
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        if (List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        Class<? super Object> cls2;
        boolean z;
        while (true) {
            int i = 0;
            Class<? super Object> cls3 = cls;
            if (cls3 != List.class) {
                Type genericSuperList = getGenericSuperList(cls3);
                if (!(genericSuperList instanceof ParameterizedType)) {
                    typeArr = EMPTY_TYPES;
                    Class<? super Object>[] interfaces = cls3.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i >= length) {
                            cls2 = cls3.getSuperclass();
                            break;
                        }
                        Class<? super Object> cls4 = interfaces[i];
                        if (List.class.isAssignableFrom(cls4)) {
                            cls2 = cls4;
                            break;
                        }
                        i++;
                    }
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable[] typeParameters = cls3.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= typeParameters.length) {
                                        z = false;
                                        break;
                                    } else if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                        z = true;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    typeArr = actualTypeArguments;
                    cls2 = (Class) parameterizedType.getRawType();
                }
                cls3 = cls2;
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public zj1 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
