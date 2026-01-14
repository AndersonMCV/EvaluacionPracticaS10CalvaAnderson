public interface IContainer<T> {
    void add(T element);
    boolean remove(T element);
    T get(String id);
}
