import java.awt.*;

public class Trapecio {
    private int width;
    private int height;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Trapecio(int width, int height, int xPosition, int yPosition, String color) {
        this.width = width;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.height = height;
    }

    public void makeVisible() {
        isVisible = true;
        draw();
    }

    public void makeInvisible() {
        erase();
        isVisible = false;
    }

    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition-width/2,xPosition, xPosition+width, xPosition+width+(width/2) };
            int[] ypoints = { yPosition, yPosition - height, yPosition - height,yPosition };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 4));
            canvas.wait(10);
        }
    }

    private void erase() {
        if (isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
