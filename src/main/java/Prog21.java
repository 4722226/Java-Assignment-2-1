public class Prog21 {
    public static void main(String[] args) {
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        String sikiA = "x+y = ";
        String sikiB = "y/x = ";
        System.out.println("x=" + x + ",y=" + y +"とすると、");
        System.out.println(sikiA + (x+y));
        float z = x;
        float q = y;
        System.out.println(sikiB + q/z);
    }
}
