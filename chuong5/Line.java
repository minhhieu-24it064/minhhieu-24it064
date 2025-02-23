package chuong5;
public class Line {
 private Point start;
 private Point end;

 public Line(Point start, Point end) {
     this.start = start;
     this.end = end;
 }

 public Line(int i, int j, int k, int l) {
	// TODO Auto-generated constructor stub
}

public Point getStart() {
     return start;
 }

 public Point getEnd() {
     return end;
 }

 public double length() {
     return start.distanceTo(end);
 }

 @Override
 public String toString() {
     return "Line from " + start + " to " + end;
 }
}
