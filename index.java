import java.util.*;

public class index {
    static int moves = 0;
    static boolean game = true;

    static class BigGridelement {
        char[][] grid = new char[3][3];
        char whoses = ' ';
        boolean checker = false;
        
    }

    public static void game(BigGridelement[][] board, int board_choice, char player) {
        Scanner sc= new Scanner(System.in);
        print(null);
        System.out.print("Enter the coordinates in "+board_choice+" (like x y not like x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        switch (board_choice) {
            case 1:
                playin(board[0][0], player, x, y, board_choice);
                break;
            case 2:
                playin(board[0][1], player, x, y, board_choice);
                break;
            case 3:
                playin(board[0][2], player, x, y, board_choice);
                break;
            case 4:
                playin(board[1][0], player, x, y, board_choice);
                break;
            case 5:
                playin(board[1][1], player, x, y, board_choice);
                break;
            case 6:
                playin(board[1][2], player, x, y, board_choice);
                break;
            case 7:
                playin(board[2][0], player, x, y, board_choice);
                break;
            case 8:
                playin(board[2][1], player, x, y, board_choice);
                break;
            case 9:
                playin(board[2][2], player, x, y, board_choice);
                break;
        
            default:
                break;
        }
    }

    public static void playin(BigGridelement cell,char player, int x, int y, int board_choice) {
        if(cell.grid[x][y]==' '){
            cell.grid[x][y] =player;
            moves++;
            if(moves > 18){
                gameover = haveWon(board, player);
            }
            if(gameover){
                System.out.println(player+"Have won the game");
            }else{
                player = player == 'X' ? '0' : 'X';
                if(row == 0 && col < 3){
                    mboard = col;
                }
                if (row == 1 && col < 3 ){
                    mboard = col+3;
                }
                if (row == 2 && col < 3){
                    mboard = col+6;
                }
            }
        }
        else{
            System.out.println("Invalid move");
        }
        
        board_choice = y+1;
        player = 'O';
    }

    public static void print(BigGridelement[][] board){
        
    }

    public static boolean smallerGrid(char[][] matrix) {

        return false;
    }

    public static char finalcheck(BigGridelement bg0, BigGridelement bg1, BigGridelement bg2, BigGridelement bg3,
            BigGridelement bg4, BigGridelement bg5, BigGridelement bg6, BigGridelement bg7, BigGridelement bg8,
            char player) {

        // --- test
        if (((bg0.checker && bg1.checker && bg2.checker) || (bg3.checker && bg4.checker && bg5.checker)
                || (bg6.checker && bg7.checker && bg8.checker)) && player == 'X') {
            return 'X';
        } else if (((bg0.checker && bg1.checker && bg2.checker) || (bg3.checker && bg4.checker && bg5.checker)
                || (bg6.checker && bg7.checker && bg8.checker)) && player == 'O') {
            return 'O';
        }

        // ||| test
        else if (((bg0.checker && bg3.checker && bg6.checker) || (bg1.checker && bg4.checker && bg7.checker)
                || (bg2.checker && bg5.checker && bg8.checker)) && player == 'X') {
            return 'X';
        } else if (((bg0.checker && bg3.checker && bg6.checker) || (bg1.checker && bg4.checker && bg7.checker)
                || (bg2.checker && bg5.checker && bg8.checker)) && player == 'O') {
            return 'O';
        }

        // /// test
        else if ((bg3.checker && bg5.checker && bg7.checker) && player == 'X') {
            return 'X';
        } else if ((bg3.checker && bg5.checker && bg7.checker) && player == 'O') {
            return 'O';
        }

        // \\\ test
        else if ((bg0.checker && bg5.checker && bg8.checker) && player == 'X') {
            return 'X';
        } else if ((bg0.checker && bg5.checker && bg8.checker) && player == 'O') {
            return 'O';
        }

        return 'N';

    }

    public static void changewhoses(BigGridelement a, char player) {
        if (a.whoses == ' ') {
            a.whoses = player;
        } else {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        BigGridelement bg0 = new BigGridelement();
        BigGridelement bg1 = new BigGridelement();
        BigGridelement bg2 = new BigGridelement();
        BigGridelement bg3 = new BigGridelement();
        BigGridelement bg4 = new BigGridelement();
        BigGridelement bg5 = new BigGridelement();
        BigGridelement bg6 = new BigGridelement();
        BigGridelement bg7 = new BigGridelement();
        BigGridelement bg8 = new BigGridelement(); 

        BigGridelement[][] board = new BigGridelement[3][3];
        board[0][0] = bg0;
        board[0][1] = bg1;
        board[0][2] = bg2;
        board[1][0] = bg3;
        board[1][1] = bg4;
        board[1][2] = bg5;
        board[2][0] = bg6;
        board[2][1] = bg7;
        board[2][2] = bg8;

        for(int boards = 0; boards < 3; boards++){
            for(int boards2 = 0; boards2 < 3; boards2++){
                for(int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++) {
                        board[boards][boards2].grid[i][j]= ' ';
                    }
                }
            }
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Which board do you want to start with: ");
        int board_choice = sc.nextInt();        
        sc.nextLine();
        char player = 'X';
        while(game){
            game(board,board_choice,player);
        }

    }
}
