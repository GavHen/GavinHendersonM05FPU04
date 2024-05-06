package BlockBreaker;

public class Ball {
    private int x = 100; // X-coordinate of the ball
    private int y = 100; // Y-coordinate of the ball
    private int diameter; // Diameter of the ball
    private int speedX; // Speed of the ball along the X-axis
    private int speedY; // Speed of the ball along the Y-axis

    public Ball(int x, int y, int diameter, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    // Method to move the ball
    public void move() {
        x += speedX;
        y += speedY;
    }

    // Method to reverse the direction of the ball on the X-axis
    public void reverseX() {
        speedX = -speedX;
    }

    // Method to reverse the direction of the ball on the Y-axis
    public void reverseY() {
        speedY = -speedY;
    }
}