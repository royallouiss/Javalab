class Base {
    public int number;

    public void getData(int n) {
        number = n;
    }

    public void display() {
        System.out.println("Number = " + number);
    }
}

class Derived extends Base {

}

public class Main {
    public static void main(String[] args) {

        Derived obj = new Derived();

        obj.getData(25);
        obj.display();
    }
}