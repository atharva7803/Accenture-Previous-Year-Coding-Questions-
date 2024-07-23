/*

Problem Statement           (Asked in Accenture Offcampus 1 Aug 2021, Slot 2)

A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

You are required to implement the following function.

Int NumberOfCarries(int num1 , int num2);

The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

Assumption: num1, num2>=0

Example:

Input
Num 1: 451
Num 2: 349
Output
2
Explanation:

Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.

Sample Input

Num 1: 23

Num 2: 563

Sample Output

0

*/


#include <iostream>
using namespace std;
int CountCarry(int no1, int no2){

    int carry = 0, count = 0, sum = 0;

    while (no1 != 0 || no2 != 0) {
        int val1 = no1 % 10;
        int val2 = no2 % 10;

        sum = carry + val1 + val2;

        if (sum > 9) {
            carry = 1;
            count++;
        } else {
            carry = 0;
        }

        no1 = no1 / 10;
        no2 = no2 / 10;
    }
    return count;
}

int main()
{
	int x, y;
	int result;

    cout<<"Enter first no: "<<endl;
	cin >> x;

    cout<<"Enter second no: "<<endl;
	cin >> y;

	result = CountCarry(x, y);
	cout <<"Result: "<<result;

	return 0;
}

