public class Interface {
    public static void main(String[] args) {
        Queen sc = new Queen();
        sc.moves();
        Rook vd = new Rook();
        vd.moves();
        
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal (in all direction)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("left, right, up, down");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal (one step)");
    }
}
