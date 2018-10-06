public class ShadowTest {
    public int x = 0;
    class FirstLevel{
        public int x =1;
        void methodInFirstLevel(int x){
//            x = x;
            System.out.println("x= " + x);
            System.out.println("this.x = " +this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel f1 = st.new FirstLevel();
//        f1.x = 3;
        f1.methodInFirstLevel(23);

    }
}
