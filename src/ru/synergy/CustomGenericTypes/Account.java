package ru.synergy.CustomGenericTypes;

public class Account<T> implements Accauntable<T> {
    private T id;
    private int sum;
    private Object sath;

    <S> Account(T id,int sum, S sath) {
        this(id, sum );
        this.sath = sath;

    }

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
