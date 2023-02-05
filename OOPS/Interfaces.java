package OOPS;

interface ChessPlayer{
//    public abstract
    void moves();
}
class Queen implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all dir)");
    }
}
class Rook implements  ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right");
    }
}
//muliple inheritance
//interface Herbivore{
//
//
//}
//interface Carnivore{
//
//}
//
//class Bear implements Herbivore,Carnivore
//
//{
//
//}

public class Interfaces {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();

    }
}
