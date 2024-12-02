package org.aoc.service;

import org.aoc.utils.FileReader;
import org.apache.commons.lang3.tuple.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day1 {

    private final FileReader reader;

    public Day1() {
        // Initialize day1 here
        this.reader = new FileReader();
    }

    public void calculateDifference(String path) {
        String something = reader.readFile(path);
        Pair<int[],int[]> cleanedInput = cleanData(something);
        var leftColumn = cleanedInput.getLeft();
        var rightColumn = cleanedInput.getRight();



    }

    private Pair<int[], int[]> cleanData (String dirtyData) {
        String[] lines = dirtyData.split("\\n");
        // Lists to store column data
        List<Integer> leftColumn = new ArrayList<>();
        List<Integer> rightColumn = new ArrayList<>();
        // Iterate through each line
        for (String line : lines) {
            // Split the line into two parts using whitespace
            String[] parts = line.trim().split("\\s+");
            // Parse the numbers and add them to the respective lists
            leftColumn.add(Integer.parseInt(parts[0]));
            rightColumn.add(Integer.parseInt(parts[1]));
        }
        // Convert lists to arrays
        int[] leftArray = leftColumn.stream().mapToInt(Integer::intValue).toArray();
        int[] rightArray = rightColumn.stream().mapToInt(Integer::intValue).toArray();
        return Pair.of(leftArray, rightArray);
    }
}
