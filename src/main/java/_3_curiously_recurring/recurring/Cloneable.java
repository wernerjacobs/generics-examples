package _3_curiously_recurring.recurring;

public interface Cloneable<T extends Cloneable<T>>
{
    public T clone();
}
