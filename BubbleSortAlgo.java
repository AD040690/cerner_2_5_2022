// cerner_2tothe5th_2022
package cerner.programmersDay.event;

public class BubbleSortAlgo {
    public int[] bubbleSort(int[] arrayToBeSort) {
        System.out.println("Array Before Bubble Sort");
        for(int loopCounter=0; loopCounter < arrayToBeSort.length; loopCounter++){
            System.out.print(arrayToBeSort[loopCounter] + " ");
        }
        System.out.println();
        int totalNoOfElementsInArray = arrayToBeSort.length, previousElement = 0;

        for (int outerLoopCounter = 0; outerLoopCounter < totalNoOfElementsInArray; outerLoopCounter++) {
            // Last arrayToBeSort[outerLoopCounter] element is already in placed the correct position
            // So, inner loop must iterate (totalNoOfElementsInArray - outerLoopCounter) times
            for (int innerLoopCounter = 1; innerLoopCounter < (totalNoOfElementsInArray - outerLoopCounter); innerLoopCounter++) {
                if (arrayToBeSort[innerLoopCounter - 1] > arrayToBeSort[innerLoopCounter]) {
                    //swap elements
                    previousElement = arrayToBeSort[innerLoopCounter - 1];
                    arrayToBeSort[innerLoopCounter - 1] = arrayToBeSort[innerLoopCounter];
                    arrayToBeSort[innerLoopCounter] = previousElement;
                }
            }
        }
        System.out.println("Array After Bubble Sort");
        for(int loopCounter=0; loopCounter < arrayToBeSort.length; loopCounter++){
            System.out.print(arrayToBeSort[loopCounter] + " ");
        }
        return arrayToBeSort;
    }
}