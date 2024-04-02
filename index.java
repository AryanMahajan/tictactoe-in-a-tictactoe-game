import java.util.*;

public class index {
    static class BigGridelement {
        char[][] grid;
        char whoses = ' ';
        boolean checker = false;
    }

    public static void game(BigGridelement[][] grid) {

    }

    public static void print(char[][] arr) {
        for (int i = 0; i < 9; i++) {
            
        }
    }

    public static boolean smallerGrid(char[][] matrix) {

        return false;
    }

    public static void whereto(int x, int y) {

    }

    public static char finalcheck(BigGridelement bg0, BigGridelement bg1, BigGridelement bg2, BigGridelement bg3,
            BigGridelement bg4, BigGridelement bg5, BigGridelement bg6, BigGridelement bg7, BigGridelement bg8,
            char whoses) {

        // --- test
        if (((bg0.checker && bg1.checker && bg2.checker) || (bg3.checker && bg4.checker && bg5.checker)
                || (bg6.checker && bg7.checker && bg8.checker)) && whoses == 'X') {
            return 'X';
        } else if (((bg0.checker && bg1.checker && bg2.checker) || (bg3.checker && bg4.checker && bg5.checker)
                || (bg6.checker && bg7.checker && bg8.checker)) && whoses == 'O') {
            return 'O';
        }

        // ||| test
        else if (((bg0.checker && bg3.checker && bg6.checker) || (bg1.checker && bg4.checker && bg7.checker)
                || (bg2.checker && bg5.checker && bg8.checker)) && whoses == 'X') {
            return 'X';
        } else if (((bg0.checker && bg3.checker && bg6.checker) || (bg1.checker && bg4.checker && bg7.checker)
                || (bg2.checker && bg5.checker && bg8.checker)) && whoses == 'O') {
            return 'O';
        }

        // /// test
        else if ((bg3.checker && bg5.checker && bg7.checker) && whoses == 'X') {
            return 'X';
        } else if ((bg3.checker && bg5.checker && bg7.checker) && whoses == 'O') {
            return 'O';
        }

        // \\\ test
        else if ((bg0.checker && bg5.checker && bg8.checker) && whoses == 'X') {
            return 'X';
        } else if ((bg0.checker && bg5.checker && bg8.checker) && whoses == 'O') {
            return 'O';
        }

        return 'N';

    }

    public static void changewhoses(BigGridelement a, char turn) {
        if (a.whoses == ' ') {
            a.whoses = turn;
        } else {
            System.out.println("This place is already taken!");
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

        bg0.grid = new char[3][3];
        bg1.grid = new char[3][3];
        bg2.grid = new char[3][3];
        bg3.grid = new char[3][3];
        bg4.grid = new char[3][3];
        bg5.grid = new char[3][3];
        bg6.grid = new char[3][3];
        bg7.grid = new char[3][3];
        bg8.grid = new char[3][3];

        BigGridelement[][] grid = new BigGridelement[3][3];
        grid[0][0] = bg0;
        grid[0][1] = bg1;
        grid[0][2] = bg2;
        grid[1][0] = bg3;
        grid[1][1] = bg4;
        grid[1][2] = bg5;
        grid[2][0] = bg6;
        grid[2][1] = bg7;
        grid[2][2] = bg8;

        game(grid);

    }
}