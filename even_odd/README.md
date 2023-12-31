# Even Odd

= Problem Description
Given a range [low, high] (both inclusive), select K numbers from the range (a
number can be chosen multiple times) such that sum of those K numbers is
even.

Calculate the number of all such permutations.

As this number can be large, print it modulo (1e9 +7).

= Constraints
0 <= low <= high <= 1049

K <= 1046.

= Input

First line contains two space separated integers denoting low and high
respectively

Second line contains a single integer K.

— Output

Print a single integer denoting the number of all such permutations
+ Time Limit

1
= Examples

Example 1

Input

4 5

3

Output
4
Explanation

There are 4 valid permutations viz. {4, 4, 4}, {4, 5, 5}, {5, 4, 5} and {5, 5, 4} which
sum up to an even number

Example 2

Input

1 10

2

Output

50

Explanation

There are 50 valid permutations viz. {1,1}, {1, 3},.. {1, 9} {2,2}, {2, 4},... {2,10}...

{10, 2}, {10, 4},... {10, 10}. These 50 permutations, each sum up to an even
number.
