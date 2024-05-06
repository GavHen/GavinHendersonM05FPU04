package BlockBreaker;

public class Brick {
    private int x; // X-coordinate of the brick
    private int y; // Y-coordinate of the brick
    private int width; // Width of the brick
    private int height; // Height of the brick
    private boolean isBroken; // Whether the brick is broken or not

    public Brick(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isBroken = false;
    }

    // Method to break the brick
    public void breakBrick() {
        isBroken = true;
    }

    // Method to check if the brick is broken
    public boolean isBroken() {
        return isBroken;
    }
}