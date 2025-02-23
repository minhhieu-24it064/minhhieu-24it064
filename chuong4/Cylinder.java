package chuong4;

public class Cylinder {
	 private double height = 1.0;

	    public Cylinder() {}

	    public Cylinder(double radius) {
	        super();
	    }

	    public Cylinder(double radius, double height) {
	        super();
	        this.height = height;
	    }

	    public Cylinder(double radius, double height, String color) {
	        super();
	        this.height = height;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public double getVolume() {
	        return getArea() * height;
	    }

	    private double getArea() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
	    public String toString() {
	        return "Cylinder[radius=" + getRadius() + ", height=" + height + ", color=" + getColor() + "]";
	    }

		private String getRadius() {
			// TODO Auto-generated method stub
			return null;
		}

		private String getColor() {
			// TODO Auto-generated method stub
			return null;
		}
	}

