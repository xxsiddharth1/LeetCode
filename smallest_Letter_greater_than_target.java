public class smallest_Letter_greater_than_target {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0, end = letters.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (letters[mid] <= target) {
                    start ++;
                }
                else {
                    end --;
                }
            }
            if (start == letters.length) {
                return letters[0];
            }
            return letters[start];
        }
}
