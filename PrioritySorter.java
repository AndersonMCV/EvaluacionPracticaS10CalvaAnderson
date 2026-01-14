public class PrioritySorter {

    // Insertion Sort
    public static void insertionSort(Package<?>[] packages) {
        for (int i = 1; i < packages.length; i++) {
            Package<?> key = packages[i];
            int j = i - 1;

            while (j >= 0 && packages[j].getPriority() > key.getPriority()) {
                packages[j + 1] = packages[j];
                j--;
            }
            packages[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(Package<?>[] packages) {
        for (int i = 0; i < packages.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < packages.length; j++) {
                if (packages[j].getPriority() < packages[minIndex].getPriority()) {
                    minIndex = j;
                }
            }

            Package<?> temp = packages[minIndex];
            packages[minIndex] = packages[i];
            packages[i] = temp;
        }
    }
}
