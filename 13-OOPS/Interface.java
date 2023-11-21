public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("UP, LEFT, RIGHT, DOWN, DIAGONAL");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("UP, LEFT, RIGHT, DOWN");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("UP, LEFT, RIGHT, DOWN, DIAGONAL -- by 1");
    }
}