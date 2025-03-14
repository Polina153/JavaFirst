class Box {
    private double width;
    private double height;
    private double length;
    static int amountOfBoxes = 0;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
        amountOfBoxes++;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    void showVolume() {
        System.out.println(calculateVolume());
    }

    private double calculateVolume() {
        return height * length * width;
    }

}