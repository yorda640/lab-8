package lab8;


    import java.util.function.BiPredicate;

public class Prob3 {
        int x;
        String y;

        public Prob3 (int x, String y) {
            this.x = x;
            this.y = y;
        }

        // Testing method to check equality using method reference
        public void myMethod(Prob3 cl) {
            BiPredicate<Prob3, Prob3> equalsPredicate = Prob3::equals;
            System.out.println(equalsPredicate.test(this, cl));
        }

        @Override
        public boolean equals(Object ob) {
            if (ob == null) return false;
            if (ob.getClass() != getClass()) return false;
            Prob3 mc = (Prob3) ob;
            return mc.x == x && mc.y.equals(y);
        }

        public static void main(String[] args) {
            Prob3 myclass = new Prob3(1, "A");
            Prob3 myclass1 = new Prob3(1, "B");
            myclass.myMethod(myclass);
            myclass.myMethod(myclass1);
        }
    }


