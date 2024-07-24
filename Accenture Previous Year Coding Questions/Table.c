/*

Problem: Write a program in C to display the table of a number and print the sum of all the multiples in it.

Test Cases:

Test Case 1:
Input:
5
Expected Result Value:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
275

Test Case 2:
Input:
12
Expected Result Value:
12, 24, 36, 48, 60, 72, 84, 96, 108, 120
660

*/


#include<stdio.h>
int main ()
{
    int n, i, value = 0, sum = 0;

    printf ("Enter the number for which you want to know the table : ");
    scanf ("%d", &n);

    for (i = 1; i <= 10; ++i){
        value = n * i;
        printf ("%d ", value);
        sum = sum + value;
    }

    printf ("\nSum is %d", sum);

    return 0;
}