
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print (int array [][]){
        for (int i = 0; i < array.length; i ++){
            for(int j = 0; j < array[i].length - 1; j ++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum (int arraySum [][]){
        int sum = 0;
        for (int i = 0; i < arraySum.length; i ++){
            for (int j = 0; j < arraySum[i].length; j ++){
                sum = sum + arraySum[i][j];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average (int arrayAv [][]){
        int sum = sum (arrayAv);
        double average = 0.0;
        int num = 0;
        for(int i = 0; i < arrayAv.length; i++){
            num += arrayAv[i].length;
        }
        average = (double) sum/num;
        return average;
    }


    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum (int arrayMin [][]){
        int minimum = arrayMin[0][0];
        for (int i = 0; i < arrayMin.length; i ++){
            for (int j = 0; j < arrayMin[i].length; j ++){
                 if (minimum >= arrayMin[i][j]){
                     minimum = arrayMin[i][j];
                 }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum (int arrayMax[][]){
        int maximum = arrayMax[0][0];
        for (int i = 0; i < arrayMax.length; i ++){
            for (int j = 0; j < arrayMax[i].length; j ++){
                if (maximum <= arrayMax[i][j]){
                    maximum = arrayMax[i][j];
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard (int arrayEven[][]){
        int count  = 0;
        for (int i = 0; i < arrayEven.length; i ++){
            for (int j = 0; j < arrayEven[i].length; j ++){
                if (arrayEven[i][j] % 2 == 0){
                    count ++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced (int arrayEvenEnhanced[][]){
        int count = 0;
        for (int [] row: arrayEvenEnhanced) {
            for (int col : row) {
                if (col % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive (int arrayPos [][]){
        for(int [] row: arrayPos){
            for (int col: row){
                if (col >= 0){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums (int arrayRow [][]){
        int[] rowSums = new int[arrayRow.length];
        for(int i = 0; i < arrayRow.length; i ++){
            for(int j = 0; j < arrayRow[i].length; j ++){
                rowSums[i] = rowSums[i] + arrayRow[i][j];
            }
        }
        return rowSums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums (int array [][]){
        int[] colSums = new int[array.length];
        for(int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j ++){
                colSums[j] = colSums[j] + array[i][j];
            }
        }
        return colSums;
    }

}
