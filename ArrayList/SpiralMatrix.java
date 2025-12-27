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

		ArrayList<int[]> matrix = new ArrayList<>();

		System.out.println("Enter element in 3*3 Matrix :");
		for(int i=0; i<3; i++)
		{
			int[] row=new int[3];
			for(int j=0; j<3; j++)
			{
				row[j] = sc.nextInt();
			}
			matrix.add(row);
		}
		System.out.println("Matrix Element :");
		for(int[] row : matrix)
		{
			System.out.println(Arrays.toString(row));
		}

		System.out.println("Spiral Matrix :");
		for(int i=0; i<matrix.size(); i++)
		{
			while(i<matrix.size())
			{
				System.out.println(Arrays.toString(matrix.get(i)));
			}
		}
	}
}