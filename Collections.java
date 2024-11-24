import java.util.ArrayList;

public class Collections {
    
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("absda");
        food.add("asdasdasd");
        for ( int i = 0; i < food.size(); i++ ) {
            System.out.println(food.get(i));
        }
    }
}
