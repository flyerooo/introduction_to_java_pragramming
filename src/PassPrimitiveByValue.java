public class PassPrimitiveByValue {
    public static void main(String[] args) {
        int x =3;
        passMethod(x);
        System.out.println("After invoking passMathod, x = "+x);
    }

    public static void passMethod(int p){
        p=10;
    }
}
