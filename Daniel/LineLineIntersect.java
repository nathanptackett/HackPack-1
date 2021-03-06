// With help from Alexander Hristov at
// http://www.ahristov.com/tutorial/geometry-games.html

public class LineLineIntersect {
  public static void main(String[] args) {
    Point P = LLIntersect(1,1,5,6,3,5,6,2);
    System.out.printf("%.2f, %.2f\n", P.x, P.y);
  }

  public static Point LLIntersect(double x1, double y1, double x2, double y2, 
    double x3, double y3, double x4, double y4) {
    
    double d = (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4);
    if (d == 0) return null;
    double xi = ((x3-x4)*(x1*y2-y1*x2)-(x1-x2)*(x3*y4-y3*x4))/d;
    double yi = ((y3-y4)*(x1*y2-y1*x2)-(y1-y2)*(x3*y4-y3*x4))/d;
    return (new Point(xi, yi));
  }
}

class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
}
