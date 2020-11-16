public class AppleAndOrange {

//    Given the value of d for m apples and n oranges,
//    determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s, t])?
//
//For example, Sam's house is between S = 7 and T = 10. The apple tree is located at A = 4 and the orange at B = 12.
// There are M = 3 apples and N = 3 oranges. Apples are thrown APPLES = [2, 3 -4] units distance from A, and
// ORANGES = [3, -2, -4] units distance. Adding each apple distance to the position of the tree, they land at
// [4+2, 4+3, 4+-4] = [6, 7, 0]. Oranges land at [12+3, 12+-2, 12+-4] = [15, 10, 8].
// One apple and two oranges land in the inclusive range  so we print
//    | 1 |
//    | 2 |

//    Function Description
//
//    Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.
//
//    countApplesAndOranges has the following parameter(s):
//
//    s: integer, starting point of Sam's house location.
//    t: integer, ending location of Sam's house location.
//    a: integer, location of the Apple tree.
//    b: integer, location of the Orange tree.
//    apples: integer array, distances at which each apple falls from the tree.
//    oranges: integer array, distances at which each orange falls from the tree.

//    Input Format
//
//The first line contains two space-separated integers denoting the respective values of S and T.
//The second line contains two space-separated integers denoting the respective values of A and B.
//The third line contains two space-separated integers denoting the respective values of M and N.
//The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point A.
//The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point B.
//
//Constraints
//  1 <= S, T, A, B, M, N <= 10^5
//  -10^5 <= D <= 10^5
//  A < S < T < B
//Output Format
//
//Print two integers on two different lines:
//
//The first integer: the number of apples that fall on Sam's house.
//The second integer: the number of oranges that fall on Sam's house.
//Sample Input 0
//
//7 11
//5 15
//3 2
//-2 2 1
//5 -6
//Sample Output 0
//
//1
//1
//Explanation 0
//
//The first apple falls at position 5 - 2 = 3.
//The second apple falls at position 5 + 2 = 7.
//The third apple falls at position 5 + 1 = 6.
//The first orange falls at position 15 + 5 = 20.
//The second orange falls at position 15 - 6 = 9.
//Only one fruit (the second apple) falls within the region between 7 and 11, so we print 1 as our first line of output.
//Only the second orange falls within the region between 7 and 11, so we print 1 as our second line of output.

    public static void main(String[] args) {
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int totalApples = 0;
        int totalOranges = 0;

        for(int i = 0; i < apples.length; i++){
            apples[i] = apples[i] + a;
            if (apples[i] >= s && apples[i] <= t){
                totalApples++;
            }
        }

        for(int i = 0; i < oranges.length; i++){
            oranges[i] = oranges[i] + b;
            if (oranges[i] >= s && oranges[i] <= t){
                totalOranges++;
            }
        }

        System.out.println(String.format("%d \n%d", totalApples, totalOranges));

    }



}
