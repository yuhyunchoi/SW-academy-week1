import java.util.Scanner;
import java.util.Random;

public class JBDJ07044_Tictactoe {

    private String[][] grid;

    // 배열 초기화
    public JBDJ07044_Tictactoe() {
        grid = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = " ";
            }
        }
    }

    // 그리드 출력
    public void printGrid() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // 사용자 선택
    public void userChoice(int x, int y) {
        grid[x][y] = "O";
    }

    // 컴퓨터 선택
    public void computerChoice() {
        Random rd = new Random();
        while (true) {
            int x = rd.nextInt(3);
            int y = rd.nextInt(3);
            if (grid[x][y].equals(" ")) {
                grid[x][y] = "X";
                break;
            }
        }
    }

    // 게임 승자 확인
    public String gameWinner() {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0].equals(grid[i][1]) && grid[i][1].equals(grid[i][2]) && !grid[i][0].equals(" ")) {
                return grid[i][0];
            }
            if (grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i]) && !grid[0][i].equals(" ")) {
                return grid[0][i];
            }
        }

        if (grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) && !grid[0][0].equals(" ")) {
            return grid[0][0];
        }

        if (grid[0][2].equals(grid[1][1]) && grid[1][1].equals(grid[2][0]) && !grid[0][2].equals(" ")) {
            return grid[0][2];
        }

        return "";
    }

    // 게임이 가득 찼는지 확인
    public boolean gameIsFull() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        JBDJ07044_Tictactoe ttt = new JBDJ07044_Tictactoe();
        Scanner sc = new Scanner(System.in);

        boolean gameEnd = false;

        // 컴퓨터가 먼저 선택
        ttt.computerChoice();
        System.out.println("Computer's first turn:");
        ttt.printGrid();

        while (!gameEnd) {
            int yourChoiceRow = -1;
            int yourChoiceCol = -1;

            // 사용자 입력을 검증하는 루프
            while (true) {
                System.out.print("Your turn (row and column): ");
                yourChoiceRow = sc.nextInt();
                yourChoiceCol = sc.nextInt();

                if (yourChoiceRow < 0 || yourChoiceRow >= 3 || yourChoiceCol < 0 || yourChoiceCol >= 3) {
                    System.out.println("Invalid input. Please enter values between 0 and 2.");
                } else if (!ttt.grid[yourChoiceRow][yourChoiceCol].equals(" ")) {
                    System.out.println("Cell already occupied. Please choose another cell.");
                } else {
                    break;
                }
            }

            ttt.userChoice(yourChoiceRow, yourChoiceCol);
            ttt.printGrid();

            String winner = ttt.gameWinner();
            if (winner.equals("O")) {
                System.out.println("Congratulations! You win!");
                gameEnd = true;
            } else if (winner.equals("X")) {
                System.out.println("Sorry, you lose.");
                gameEnd = true;
            } else if (ttt.gameIsFull()) {
                System.out.println("Draw!");
                gameEnd = true;
            }

            if (!gameEnd) {
                ttt.computerChoice();
                System.out.println("Computer's turn:");
                ttt.printGrid();

                winner = ttt.gameWinner();
                if (winner.equals("O")) {
                    System.out.println("Congratulations! You win!");
                    gameEnd = true;
                } else if (winner.equals("X")) {
                    System.out.println("Sorry, you lose.");
                    gameEnd = true;
                } else if (ttt.gameIsFull()) {
                    System.out.println("Draw!");
                    gameEnd = true;
                }
            }
        }

        sc.close();
    }
}
