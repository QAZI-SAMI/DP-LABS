package iterator;

public interface Iterator {
    public boolean hasNext();
    public Object next();
    public Student previous();

    public void MoveToFirst();



    void MoveToLast();
}