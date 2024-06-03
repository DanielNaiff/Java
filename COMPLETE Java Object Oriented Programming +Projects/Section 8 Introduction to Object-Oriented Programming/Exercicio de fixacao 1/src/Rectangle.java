public class Rectangle {
    private double width;
    private double height;

    public double area(){
        return (getWidth()*getHeight()) / 2;
    }

    public double perimeter(){
        double hipotenusa = Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth() / 2, 2));

        return getWidth() + hipotenusa + hipotenusa;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
