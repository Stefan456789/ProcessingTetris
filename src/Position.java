public class Position {
    private float x;
    private float y;

    public Position() {
        this.x = Main.width/2f;
        this.y = Block.blocksize/2f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void moveDown() {
        y += Block.blocksize;
    }

    public void moveLeft() {
        x -= Block.blocksize;
    }

    public void moveRight() {
        x += Block.blocksize;
    }
}
