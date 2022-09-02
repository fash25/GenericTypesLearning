package ru.synergy.CustomGenericTypes;

public interface Accauntable<T> {
    T getId();
    void setId(T Id);
    void setSum(int sum);
    int getSum();


}
