public class abstractclass {
    public static void main(String[] args) {
        y b = new y();
        b.m2();

    }
}
abstract class x{
    public void m1(){
        System.out.println("Going");
    }
    abstract public void m2();
    abstract public void m3();
    abstract public void m4();
}
class y extends x{

    @Override
    public void m2() {
        System.out.println("coming");

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

}