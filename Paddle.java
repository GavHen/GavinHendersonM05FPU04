package BlockBreaker;

public class Paddle {
    private int x; // X-coordinate of the paddle
    private int y; // Y-coordinate of the paddle
    private int width; // Width of the paddle
    private int height; // Height of the paddle
    private int speed; // Speed of the paddle

    public Paddle(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    // Method to move the paddle left
    public void moveLeft() {
        x -= speed;
    }

    // Method to move the paddle right
    public void moveRight() {
        x += speed;
    }
}