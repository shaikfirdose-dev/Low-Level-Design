import Models.*;

import java.util.*;

public class TicTacToa {
     Deque<Player> players;
     Board gameBoard;

    public TicTacToa(){
        initializeObjects();
    }


    public void initializeObjects(){
        players = new LinkedList();



        CrossPiece crossPiece = new CrossPiece();
        Player player1 = new Player("p1", crossPiece);

        CirclePiece circlePiece = new CirclePiece();
        Player player2 = new Player("p2", circlePiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);

    }

    public String startGame(){
        boolean noWinner = true;

        while(noWinner){
            Player playerTurn = players.removeFirst();

            //print boar
            gameBoard.printBoard();

            List<Pair> freeCells = gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            //read the user input
            System.out.println("Player :"+playerTurn.getName()+"Enter row column ");
            Scanner sc = new Scanner(System.in);
            String[] position = sc.nextLine().split(" ");

            //piece add
            boolean addedSuccessfully = gameBoard.addPiece(Integer.valueOf(position[0]), Integer.valueOf(position[1]), playerTurn.playingPiece);
            if(!addedSuccessfully){
                System.out.println("Incorrect position entered, try again!");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner =  isThereWinner(Integer.valueOf(position[0]), Integer.valueOf(position[1]), playerTurn.playingPiece.peiceType);

            if(winner){
                return playerTurn.getName();
            }



        }
        return "tie";

    }

    public boolean isThereWinner(int row, int col, PeiceType peiceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i< gameBoard.getSize();i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].peiceType!= peiceType) {
                rowMatch = false;
            }
        }

        //column match

        for(int j=0;j<gameBoard.getSize();j++){
            if(gameBoard.board[j][col]==null || gameBoard.board[j][col].peiceType!=peiceType){
                colMatch = false;
            }
        }

        //diagonal match

        for(int i=0, j=0;i<gameBoard.size;i++, j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].peiceType!=peiceType) {
                diagonalMatch = false;
            }
        }

        //anti diagonal

        for(int i=0, j=gameBoard.size-1;i<gameBoard.size;i++, j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].peiceType!=peiceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }

}
