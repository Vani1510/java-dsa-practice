class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int countBlank = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                countL++;
            } else if (c == 'R') {
                countR++;
            } else {
                countBlank++;
            }
        }

        // Maximizing the distance by sending all '_' in the dominant direction
        return Math.abs(countL - countR) + countBlank;
    }
}