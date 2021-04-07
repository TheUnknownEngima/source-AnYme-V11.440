package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: he1  reason: default package */
public final class he1<E> implements List<E>, RandomAccess {
    private final List<E> e;

    private he1(List<E> list) {
        this.e = Collections.unmodifiableList(list);
    }

    public static <E> he1<E> a(List<E> list) {
        return new he1<>(list);
    }

    public static <E> he1<E> c(E... eArr) {
        return new he1<>(Arrays.asList(eArr));
    }

    public void add(int i, E e2) {
        this.e.add(i, e2);
    }

    public boolean add(E e2) {
        return this.e.add(e2);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.e.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.e.addAll(collection);
    }

    public void clear() {
        this.e.clear();
    }

    public boolean contains(Object obj) {
        return this.e.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.e.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.e.equals(obj);
    }

    public E get(int i) {
        return this.e.get(i);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public int indexOf(Object obj) {
        return this.e.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.e.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.e.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.e.listIterator();
    }

    public ListIterator<E> listIterator(int i) {
        return this.e.listIterator(i);
    }

    public E remove(int i) {
        return this.e.remove(i);
    }

    public boolean remove(Object obj) {
        return this.e.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.e.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.e.retainAll(collection);
    }

    public E set(int i, E e2) {
        return this.e.set(i, e2);
    }

    public int size() {
        return this.e.size();
    }

    public List<E> subList(int i, int i2) {
        return this.e.subList(i, i2);
    }

    public Object[] toArray() {
        return this.e.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.e.toArray(tArr);
    }
}
