import java.awt.event.KeyEvent;

public class Block{

    private static Block block = new Block();
    public static final float blocksize = Main.width/10f;

    private BlockType type;
    private int rotation = 0;
    private Position pos;

    private static final Main main = Main.main;

    private Block(){
        BlockType[] blockTypes = BlockType.values();
        type = blockTypes[(int)(Math.random()*(blockTypes.length))];
        pos = new Position();
    }

    private void drawBlock(){
        if (main.keyCode == KeyEvent.VK_LEFT) {
            pos.moveLeft();
            main.keyCode = 0;
        }else if (main.keyCode == KeyEvent.VK_RIGHT) {
            pos.moveRight();
            main.keyCode = 0;
        }
        switch (type){
            case BLOCK:
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()-blocksize/2f, blocksize);// 1 2
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()+blocksize/2f, blocksize);// 4 3
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()+blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                break;
            case ISHAPE:
                main.square(blocksize/2f + pos.getX()-blocksize/2f*3, pos.getY()-blocksize/2f, blocksize);// 1 2 3 4
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f*3, pos.getY()-blocksize/2f, blocksize);
                break;
            case TSHAPE:
                main.square(blocksize/2f + pos.getX()-blocksize/2f*3, pos.getY()-blocksize/2f, blocksize);// 1 2 3
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()-blocksize/2f, blocksize);//     4
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()+blocksize/2f, blocksize);
                break;
            case LSHAPELEFT:
                main.square(blocksize/2f + pos.getX()-blocksize/2f*3, pos.getY()-blocksize/2f, blocksize);// 1 2 3
                main.square(blocksize/2f + pos.getX()-blocksize/2f*1, pos.getY()-blocksize/2f, blocksize);//     4
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()+blocksize/2f, blocksize);
                break;
            case ZSHAPELEFT:
                main.square(blocksize/2f + pos.getX()-blocksize/2f*3, pos.getY()+blocksize/2f, blocksize);//   3 4
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()+blocksize/2f, blocksize);//   1 2
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                break;
            case LSHAPERIGHT:
                main.square(blocksize/2f + pos.getX()-blocksize/2f*3, pos.getY()+blocksize/2f, blocksize);//     4
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()+blocksize/2f, blocksize);//   1 2 3
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()+blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                break;
            case ZSHAPERIGHT:
                main.square(blocksize/2f + pos.getX()-blocksize/2f*3, pos.getY()-blocksize/2f, blocksize);// 1 3
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()+blocksize/2f, blocksize);//     2 4
                main.square(blocksize/2f + pos.getX()-blocksize/2f, pos.getY()-blocksize/2f, blocksize);
                main.square(blocksize/2f + pos.getX()+blocksize/2f, pos.getY()+blocksize/2f, blocksize);
                break;
        }
        pos.moveDown();
    }

    public static void newBlock(){ block = new Block();}

    public static void drawBlocks(){
        block.drawBlock();
    }
}
