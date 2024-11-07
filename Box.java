package ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height){
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length should be positive number.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width should be positive number.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height should be positive number.");
        }
        this.height = height;
    }

    public double volume(){
        return (this.height*this.length*this.width);
    }
    public double lateralSurfaceArea(){
        return (2*this.length*this.height) + (2*this.width*this.height);
    }
    public double surfaceArea(){
        return (2*this.length*this.width) + (2*this.length*this.height) + (2*this.width*this.height);
    }
}
