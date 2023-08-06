package Recusrion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllSubsequences(arr);
    }

    public static void printAllSubsequences(int[] arr) {
        List<Integer> currentSubsequence = new ArrayList<>();
        generateSubsequences(arr, 0, currentSubsequence);
    }

    private static void generateSubsequences(int[] arr, int currentIndex, List<Integer> currentSubsequence) {
        if (currentIndex == arr.length) {
            // Base case: The end of the array is reached
            printSubsequence(currentSubsequence);
            return;
        }

        // Recursive call without including the current element in the subsequence
        generateSubsequences(arr, currentIndex + 1, currentSubsequence);

        // Recursive call including the current element in the subsequence
        currentSubsequence.add(arr[currentIndex]);
        generateSubsequences(arr, currentIndex + 1, currentSubsequence);

        // Backtrack to remove the last added element before returning to the previous level
        currentSubsequence.remove(currentSubsequence.size() - 1);
    }

    private static void printSubsequence(List<Integer> subsequence) {
        for (int num : subsequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
