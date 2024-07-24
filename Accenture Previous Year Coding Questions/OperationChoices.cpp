/*
Problem Statement

You are required to implement the following function.

Int OperationChoices(int c, int n, int a , int b )

The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.

( a+ b ) , if c=1
( a – b ) , if c=2
( a * b ) ,  if c=3
(a / b) ,  if c =4
Assumption : All operations will result in integer output.

Example:

Input
c :1
a:12
b:16

Output:
Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.

Sample Input:
 c : 2
 a : 16
 b : 20

Sample Output:
-4

*/


#include <iostream>
using namespace std;
int operationChoices(int c, int a, int b)
{
	if (c == 1) {
    	return a + b;
	}
	else if (c == 2) {
    	return a - b;
	}
	else if (c == 3) {
    	return a * b;
	}
	else if (c == 4) {
    	return a / b;
	}
	return 0;
}

int main()
{
	int x, y, z;
	int result;

    cout<<"Enter value of c: "<<endl;
	cin >> x;

    cout<<"Enter value of a: "<<endl;
	cin >> y;

    cout<<"Enter value of b: "<<endl;
	cin >> z;

	result = operationChoices(x, y, z);
	cout <<"Result: "<<result;

	return 0;
}

