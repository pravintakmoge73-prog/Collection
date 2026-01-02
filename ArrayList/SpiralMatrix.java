/*6. Spiral Matrix
Description:
Return all elements of a matrix in spiral order using ArrayList.
Example:
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/

import java .util.*;
public class SpiralMatrix
{
	public static void  main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		int[][] matrix = new int[3][3];
		System.out.println("Enter element in 3*3 Matrix :");
		int n=3;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("--------------------");
		
		System.out.println("Matrix is :");
		for(int i=0; i<n; i++)
		{
			System.out.print("[");
			for(int j=0; j<n; j++)
			{
				System.out.print(matrix[i][j]+", ");
			}
			System.out.print("]");
			System.out.println();
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		
		int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
		while(top<=bottom && left<=right)
		{
			 // Left → Right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Top → Bottom
            if (top <= bottom && left <= right) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            // Right → Left
            if (top <= bottom && left <= right) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom → Top
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
			}
		}
		
		System.out.println("Spiral Order :");
		System.out.println(result);
	}
}