public class Car {
    private int xLeft;
    private int yTop;

    public Car(int xLeft, int yTop) {
        this.xLeft = xLeft;
        this.yTop = yTop;
    }

    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double leftTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double rightTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
        Line2D.Double leftLine = new Line2D.Double(xLeft + 10, yTop + 10, xLeft + 20, yTop);
        Line2D.Double roof = new Line2D.Double(xLeft + 20, yTop, xLeft + 40, yTop);
        Line2D.Double rightLine = new Line2D.Double(xLeft + 40, yTop, XLeft + 50, yTop + 10);
        g2.draw(body);
        g2.draw(leftTire);
    }
}