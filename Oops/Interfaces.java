public class UseInterfaces {

  // Here we are using the Oops Concept Interfaces
  
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();                                  // here we are using the interfaces                                                      // 
        r.moves();                                            // calling the obhject for the interfaces 

    }

}

interface ChessPlayer {
    void moves;
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up , Down , left , right , diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up , Down , Left ,Right");
    }
}
