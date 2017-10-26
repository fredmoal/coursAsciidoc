package base;

// tag::contains[]
public class Methode {
    public static <T> T random(T i, T j) {
        System.out.println("pile ou face entre "
                +i.toString()+" et "+j.toString());
        // random de 0 ou 1
        int alea = (int)(Math.random() * 2);
        if (alea==0) {
            return i;
        } else {
            return j;
        }
    }
// end::contains[]

    public static void main(String... args) {
        Double d = Methode.<Double>random(0.2, 0.3);
        String s = Methode.<String>random("abc", "def");

        System.out.println(d);
        System.out.println(s);
    }
}
