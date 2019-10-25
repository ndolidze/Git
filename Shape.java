public class Shape {
    private double width;
    private double height;
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double square(){
        return width*height;
    }
    public void print(){
        System.out.println("Width="+width+"  Height="+height+" Square="+square());
    }

}
