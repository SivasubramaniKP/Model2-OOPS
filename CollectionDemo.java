public class CollectionDemo {
    
    static <Thing> void PrintList ( Thing [] l ) {
        for ( Thing i : l ) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1,2,3,37 };
        Double[] floatArray = {1.2,32.0,2.1};
        PrintList(intArray);
    }

}
