class Problem_1 {
    // Time complexity- O(n^2)
    public static boolean isValidSudoku(char[][] board) {
        boolean[][] m = new boolean[9][9];
        boolean[][] m2 = new boolean[9][9];
        boolean[][] m3 = new boolean[9][9];

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int k = i / 3 * 3 + j / 3;

                    if (m[i][num] || m2[j][num] || m3[k][num])
                        return false;

                    m[i][num] = m2[j][num] = m3[k][num] = true;
                }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        boolean k = isValidSudoku(board);
        System.out.println(k);
    }
}