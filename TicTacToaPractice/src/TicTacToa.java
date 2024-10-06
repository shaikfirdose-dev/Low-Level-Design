import Models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToa {

    Deque<Player> players;
    Board gameBoard;

    public TicTacToa(){
        initializeObjects();
    }

    public void initializeObjects(){
        players = new LinkedList<>();

        PlayingPiece crossPiece = new CrossPiece();
        Player player1 = new Player("Player1",crossPiece);

        PlayingPiece circlePiece = new CirclePiece();
        Player player2 = new Player("Player2",circlePiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){

        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();

            System.out.print("Player "+ playerTurn.getName() + " Enter row and column");
            Scanner sc = new Scanner(System.in);
            String[] position = sc.nextLine().split(" ");
            int inputRow = Integer.parseInt(position[0]);
            int inputCol = Integer.parseInt(position[1]);



            boolean addPieceSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if(!addPieceSuccessfully){
                System.out.println("Incorrect row and column entered, try again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            List<Pair> isFreeCells = gameBoard.getFreeCell();
            if(isFreeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            boolean winner = isWinner(inputRow,inputCol, playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.getName();
            }
        }
        return "tie";
    }

    public boolean isWinner(int row, int col, PieceType pieceType){

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType!=pieceType){
                rowMatch = false;
            }
        }

        for(int j=0;j<gameBoard.size;j++){
            if(gameBoard.board[j][col]==null || gameBoard.board[j][col].pieceType!=pieceType){
                colMatch = false;
            }
        }

        for(int i=0,j=0;i< gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                diagonalMatch = false;
            }
        }

        for(int i=0,j= gameBoard.size-1;i< gameBoard.size;i++,j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
