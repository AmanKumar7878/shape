

public class shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }


    public static void main(String[] args) {
        shape obj = new shape();
        obj.draw();
        obj.erase();

    }

}