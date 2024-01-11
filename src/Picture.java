public class Picture
{
    private Square building;
    private Square door;
    private Triangle roof;
    private Circle sun;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square chimney;
    private Circle smoke;
    private Square garden;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        building = new Square();
        door = new Square();
        roof = new Triangle();
        sun = new Circle();
        window1 = new Square();
        window2 = new Square();
        window3 = new Square();
        chimney = new Square();
        smoke = new Circle();
        garden = new Square();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            // Building
            building.changeColor("black");
            building.moveVertical(20);
            building.changeSize(150);
            building.makeVisible();

            // Roof
            roof.changeColor("red");
            roof.changeSize(80, 200);
            roof.moveHorizontal(175);
            roof.moveVertical(-80);
            roof.makeVisible();

            // Window
            window1.changeColor("white");
            window1.moveHorizontal(50);
            window1.moveVertical(50);
            window1.changeSize(50);
            window1.makeVisible();

            // Chimney
            chimney.changeColor("red");
            chimney.moveHorizontal(105);
            chimney.moveVertical(-40);
            chimney.changeSize(20);
            chimney.makeVisible();

            // Sun
            sun.changeColor("yellow");
            sun.moveHorizontal(-100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();

            // Garden
            garden.changeColor("green");
            garden.moveVertical(160);
            garden.moveHorizontal(-350);
            garden.changeSize(600);
            garden.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    /*
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }
     */

    /**
     * Change this picture to use color display
     */
    /*
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
     */
}
