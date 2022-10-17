# cerner_2tothe5th_2022
# *************************************Selection sort in Python******************************************

#sorting by finding min_index
def selectionSort(unsortedArray):
    arraySize = len(unsortedArray)
    for outerLoop in range(arraySize):
        min_index = outerLoop

        for innerLoop in range(outerLoop + 1, arraySize):
            # select the minimum element in every iteration
            if unsortedArray[innerLoop] < unsortedArray[min_index]:
                min_index = innerLoop
        # swapping the elements to sort the array
        (unsortedArray[outerLoop], unsortedArray[min_index]) = (unsortedArray[min_index], unsortedArray[outerLoop])


targetedArray = [-2, 45, 0, 11, -9,88,-97,-202,747]
selectionSort(targetedArray)
print('The array after sorting in Ascending Order by selection sort is:')
print(targetedArray)