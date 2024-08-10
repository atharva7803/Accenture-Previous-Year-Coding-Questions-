/*
Rearrangement Of Bits

Alex Gives You a positive Number N and wants you to rearrange the
bits of the number in its binary representation such that all set bits are in consecutive order. Your task is to find and return an integer value representing the minimum possible number that can be formed after re-arranging the bits of the number N.

Example

Input1: 10      
Output: 3
Explanation: 10 -> binary: 1010 count the set bits and arrange in consecutive order such as 0011 which in decimal is 3.

Input: 2
Output: 1
*/

#include<iostream>
using namespace std;

int rearrangement(int n){
    int count = 0;
    while(n > 0){
        if(n & 1) {
            count++;
        }
        n = n >> 1;
    }

    return (1 << count)-1;
}

int main(){
    int n;

    cout<<"Enter the number: "<<endl;
    cin>>n;

    cout<<"Output: "<<rearrangement(n)<<endl;

}