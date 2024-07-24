/*

Problem Statement               (Asked in Accenture Offcampus 2 Aug 2021, Slot 2)

You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.
Return ‘max’.
Assumption: a <b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

Example

Input:
7
12
Output:
8
Explanation:

Exponents of 2 in:

7-0

8-3

9-0

10-1

11-0

12-2

Hence maximum exponent if two is of 8.

*/


#include <iostream>
using namespace std;

int CountTwos(int n){
    int count = 0;
    while(n % 2 == 0){
        n = n/2;
        count++;
    }
    return count;
}

int MaxExponents(int a, int b){

    int maxExponent = -1;
    int result = a;

    for(int i = a; i <= b; i++){
        int exponent = CountTwos(i);
        if(exponent > maxExponent){
            maxExponent = exponent;
            result = i;
        }
        else if(exponent == maxExponent && i < result){
            result = i;
        }
    }
    return result;
}

int main()
{
	int a, b;
    cout << "Enter the range (a and b): ";
    cin >> a >> b;

    int result = MaxExponents(a, b);
    cout << "Number with maximum exponent of 2 between " << a << " and " << b << " is: " << result << endl;


	return 0;
}

