// Input: 12
// Output: 28
// Explanation: Divisors of 12 between 1 to 12 are: 1,2,3,4,6,12  so by adding them we get 28.

#include <iostream>
using namespace std;

int SumOfDivisor(int N) {
    int sum = 0;
    for (int i = 1; i <= N; i++) {
        if (N % i == 0) {
            sum += i;
        }
    }
    return sum;
}

int main() {
    int N = 12;
    cout << "The sum of the divisors of " << N << " is " << SumOfDivisor(N) << endl;  
    return 0;
}