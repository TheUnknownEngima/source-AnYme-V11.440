package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

public class ObjectPool<T extends Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int currentOwnerId = NO_OWNER;

        /* access modifiers changed from: protected */
        public abstract Poolable instantiate();
    }

    private ObjectPool(int i, T t) {
        if (i > 0) {
            this.desiredCapacity = i;
            this.objects = new Object[i];
            this.objectsPointer = 0;
            this.modelObject = t;
            this.replenishPercentage = 1.0f;
            refillPool();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public static synchronized ObjectPool create(int i, Poolable poolable) {
        ObjectPool objectPool;
        synchronized (ObjectPool.class) {
            objectPool = new ObjectPool(i, poolable);
            objectPool.poolId = ids;
            ids++;
        }
        return objectPool;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    private void refillPool(float f) {
        int i = this.desiredCapacity;
        int i2 = (int) (((float) i) * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.objects[i3] = this.modelObject.instantiate();
        }
        this.objectsPointer = i - 1;
    }

    private void resizePool() {
        int i = this.desiredCapacity;
        int i2 = i * 2;
        this.desiredCapacity = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.objects[i3];
        }
        this.objects = objArr;
    }

    public synchronized T get() {
        T t;
        if (this.objectsPointer == -1 && this.replenishPercentage > Utils.FLOAT_EPSILON) {
            refillPool();
        }
        t = (Poolable) this.objects[this.objectsPointer];
        t.currentOwnerId = Poolable.NO_OWNER;
        this.objectsPointer--;
        return t;
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    public synchronized void recycle(T t) {
        if (t.currentOwnerId == Poolable.NO_OWNER) {
            int i = this.objectsPointer + 1;
            this.objectsPointer = i;
            if (i >= this.objects.length) {
                resizePool();
            }
            t.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer] = t;
        } else if (t.currentOwnerId == this.poolId) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
        }
    }

    public synchronized void recycle(List<T> list) {
        while (list.size() + this.objectsPointer + 1 > this.desiredCapacity) {
            resizePool();
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            Poolable poolable = (Poolable) list.get(i);
            if (poolable.currentOwnerId == Poolable.NO_OWNER) {
                poolable.currentOwnerId = this.poolId;
                this.objects[this.objectsPointer + 1 + i] = poolable;
                i++;
            } else if (poolable.currentOwnerId == this.poolId) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            } else {
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + poolable.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
        }
        this.objectsPointer += size;
    }

    public void setReplenishPercentage(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < Utils.FLOAT_EPSILON) {
            f = Utils.FLOAT_EPSILON;
        }
        this.replenishPercentage = f;
    }
}
