public class NoGarbage {
    //?????? not really understand this
    public void noGarbage() {
        String s = "";
        while (true) {
            s = "No Garbage";
            break;
        }
        System.out.println("These is no " + s + " created");

    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        NoGarbage gc = new NoGarbage();
        gc.noGarbage();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create garbage : " + (endTime - startTime) + " ms");
    }
}
