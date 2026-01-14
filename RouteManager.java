public class RouteManager<T> implements IContainer<T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;

    public RouteManager() {
        head = null;
        tail = null;
        current = null;
    }

    // Insertar al final O(1)
    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Eliminar por valor O(n)
    @Override
    public boolean remove(T element) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(element)) {

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }

                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Navegación O(1)
    public void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void movePrev() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    @Override
    public T get(String id) {
        return null; 
    }
}
