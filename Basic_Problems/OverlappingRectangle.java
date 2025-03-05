package Basic_Problems;

public class OverlappingRectangle {
    static class Point{
        int x, y;
    
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static boolean checkOverlappingRectangle(Point l1, Point r1, Point l2, Point r2){
        if(l1.x > r2.x || l2.x > r1.x){
            return false;
        }

        if(r2.y > l1.y || r1.y > l2.y){
            return false;
        }

        return true;
    }
    public static void main(String[] args){
        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 0);
        
        if(checkOverlappingRectangle(l1,r1,l2,r2)){
            System.out.println("The rectangles are overlapping");
        }else{
            System.out.println("The rectangles are not overlapping");
        }
    }
}
