// cerner_2tothe5th_2022
package cerner.programmersDay.event;

public class FibonacciSeries{
    public boolean printFibonacciNumbers(int tremCount) {
        long currentTerm = 0, nextTerm = 1;
        try {
            System.out.println("Fibonacci Series till " + tremCount + " terms:");

            for (int loopCounter = 0; loopCounter < (tremCount - 1); ++loopCounter)
            {
                System.out.print(currentTerm + ", ");
                long possibleNextTerm = currentTerm + nextTerm;
                currentTerm = nextTerm;
                nextTerm = possibleNextTerm;
            }
            System.out.print(currentTerm + " ... ");
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
}
