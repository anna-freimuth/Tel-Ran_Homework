class Picture extends Shape {
    private Shape[] shapes;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        Line frameLine = new Line(symbol, 30);
        frameLine.draw();

        System.out.println();

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }

        frameLine.draw();
    }
}
