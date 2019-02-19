public class QuadraticEqn{

    public static void main(String[] args) {

        int a = 2, b = 4, c = 2;
        double temp1, root1, root2;
        temp1 = Math.sqrt(b * b - 4 * a * c);
        root1 = ((-b + temp1) / (2 * a));
        root2 =((-b - temp1) / (2*a));
        System.out.println("the root of the quadratic equation is" + root1);
    }
}

