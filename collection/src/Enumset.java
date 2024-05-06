import java.util.EnumSet;

public class Enumset {
    public static void main(String[] args) {
        EnumSet<Color> eSet = EnumSet.allOf(Color.class);
        System.out.println(eSet);
    }
}

