package chuong7;

public class Main {
    public static void main(String[] args) {
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(1, 2);
        polyline.appendPoint(4, 6);
        polyline.appendPoint(7, 8);
        
        System.out.println("Polyline: " + polyline);
        System.out.println("Total Length: " + polyline.getLength());
    }
}
