public class ConcatenationInLoops {
    public static void main(String[] args) {
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += "Garbage";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create String using + operator : " + (endTime - startTime) + " ms");
        StringBuffer sb = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("Garbage");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to create String using StringBuffer : " + (endTime - startTime) + " ms");
        StringBuilder sb1 = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb1.append("Garbage");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to create String using StringBuilder : " + (endTime - startTime) + " ms");
    }
}