package Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        //implement logic
        if(board[row][col]!=null){
            return false;
        }
        board[row][col] = playingPiece;

        return true;
    }

    public void printBoard(){
        //implement logic
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType+"    ");
                }
                else{
                    System.out.print("    ");
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }

    public List<Pair> getFreeCell(){
        List<Pair> freeCells = new ArrayList<>();
        //implement cells
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    freeCells.add(new Pair(i,j));
                }

            }

        }

        return freeCells;
    }
}
