/**9. Longest Increasing Subsequence
Description:
Return length of LIS using ArrayList and binary search.
Example:
Input: [10,9,2,5,3,7,101,18]
Output: 4
*/

import java.util.*;
class longSubSequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter size of ArrayList :");
        int n = sc.nextInt();
        System.out.println("Enter elements in ArrayList :");
        for(int i=0; i<n; i++)
        {
            al.add(sc.nextInt());
        }

        System.out.println("ArrayList is : "+al);

        ArrayList<Integer> temp = new ArrayList<>();

        for(int num : al)
        {
            // FIXED here
            if(temp.isEmpty() || num > temp.get(temp.size() - 1))
            {
                temp.add(num);
            }
            else
            {
               int pos = Collections.binarySearch(temp, num);
                if (pos < 0) {
                pos = -(pos + 1);
				}

				// If pos is equal to size, num is larger than all elements, so append
				if (pos == temp.size()) {
					temp.add(num);
				} else {
					// Otherwise, replace the element at pos to maintain the smallest possible tail
					temp.set(pos, num);
				}
            }
        }

        System.out.println("Size of Longest Increasing Subsequence is :" + temp.size());
    }
}
