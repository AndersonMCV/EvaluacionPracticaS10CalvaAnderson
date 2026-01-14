public class Main {

    public static void main(String[] args) {

        // ===== 1. Prueba de Package y Genéricos =====
        Package<String> p1 = new Package<>("PKG-01", "Laptop", PackageType.FRAGILE, 3);
        Package<String> p2 = new Package<>("PKG-02", "Libros", PackageType.STANDARD, 5);
        Package<String> p3 = new Package<>("PKG-03", "Documentos", PackageType.EXPRESS, 1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // ===== 2. Prueba RouteManager (DLL) =====
        RouteManager<Package<String>> route = new RouteManager<>();
        route.add(p1);
        route.add(p2);
        route.add(p3);

        route.moveNext();
        route.movePrev();

        route.remove(p2);
        System.out.println("Paquete PKG-02 eliminado de la ruta");

        // ===== 3. Prueba HashTable (Inventario) =====
        HashTable<String, String> inventory = new HashTable<>(10);
        inventory.put(p1.getId(), "EN TRANSITO");
        inventory.put(p2.getId(), "ENTREGADO");
        inventory.put(p3.getId(), "PENDIENTE");

        System.out.println("Estado PKG-01: " + inventory.get("PKG-01"));
        System.out.println("Estado PKG-03: " + inventory.get("PKG-03"));

        // ===== 4. Prueba Sorting =====
        Package<?>[] packages = { p1, p2, p3 };

        System.out.println("\nAntes de ordenar:");
        for (Package<?> p : packages) {
            System.out.println(p.getId() + " - prioridad " + p.getPriority());
        }

        PrioritySorter.insertionSort(packages);

        System.out.println("\nDespues de Insertion Sort:");
        for (Package<?> p : packages) {
            System.out.println(p.getId() + " - prioridad " + p.getPriority());
        }
    }
}
