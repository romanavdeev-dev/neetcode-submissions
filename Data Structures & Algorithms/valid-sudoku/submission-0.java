record Coordinates(int i, int j) {}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Coordinates, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (
                    rows.getOrDefault(i, new HashSet<>()).contains(board[i][j]) ||
                    columns.getOrDefault(j, new HashSet<>()).contains(board[i][j]) ||
                    squares.getOrDefault(new Coordinates(i / 3, j / 3), new HashSet<>()).contains(board[i][j])
                ) {
                    return false;
                }
                rows.computeIfAbsent(i, k -> new HashSet<>()).add(board[i][j]);
                columns.computeIfAbsent(j, k -> new HashSet<>()).add(board[i][j]);
                squares.computeIfAbsent(new Coordinates(i / 3, j / 3), k -> new HashSet<>()).add(board[i][j]);
            }
        }

        return true;
    }
}
