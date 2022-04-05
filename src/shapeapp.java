public class shapeapp {
    public static void main(String[] args) {

        var shape = new shape("zaky");

        System.out.println(shape.getCorner());

        var shape1 = new rectangel("Udin");
        System.out.println(shape1.getCorner());
        System.out.println(shape1.parentGetCorner());
    }
}
