package will.jvm.test;

/**
 * Vm Args:-Xss128K
 * StackOverflowError
 */
public class OverflowStackTest {

    private int stackLenght=1;

    public void test(){
        stackLenght++;
        test();
    }

    public static void main(String[] args) {
        OverflowStackTest test = new OverflowStackTest();
        try{
            test.test();
        }catch (Throwable e){
            System.out.println("stack length:"+test.stackLenght);
            e.printStackTrace();
        }
    }

}
