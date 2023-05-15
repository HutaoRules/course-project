public class GarbageCreator {
    public void createGarbage() {

        while (true) {
            Object garbage = new String();
            System.gc();
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        GarbageCreator gc = new GarbageCreator();
        gc.createGarbage();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create garbage : " + (endTime - startTime) + " ms");
    }
}
