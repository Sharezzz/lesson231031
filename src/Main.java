public class Main {
    public static void main(String[] args) {
        String s = "Text";
        Point point = new Point(0, 4);
        Point point2 = new Point(3,0);
        System.out.println(point);
        System.out.println(point2);
        System.out.println("Distance: " + point.distance(point2));

        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
    }
}