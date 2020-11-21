public class Box {
    private double length;
    private double width;
    private double height;
    private double weight;
    private double volume;


    public Box(double length, double width, double height, double weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.volume = length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }
}
