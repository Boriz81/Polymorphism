package basderclass;

public class DerivedClass extends BaseClass{

    @Override
    public void print() {
        System.out.println("The first one is Derived class");
        super.print();
    }

}
