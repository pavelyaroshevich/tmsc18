package by.tms.tasks.task2;

import java.io.Serializable;

public record Generic<T extends Comparable, V extends Animals & Serializable, K extends Number>(T t, V v, K k) {
    public Generic(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void getNameClasses() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }
}

