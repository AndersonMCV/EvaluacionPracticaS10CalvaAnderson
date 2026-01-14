public class Package<T> {

    private String id;
    private T content;
    private PackageType type;
    private int priority;

    public Package(String id, T content, PackageType type, int priority) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Package CL: " + id + " [" + type + "]";
    }
}
