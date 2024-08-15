# You are given an i nt eger 'n'. Write a Python function to calculate and return the sum of the digits in 'n' after converting it to its binary representation.

# For  example, 15,  which has a  binary representation of  1111,  should 
# ret urn 4.


def SumBinary(n):
    sum = 0
    
    while n > 0:
        lastDigit = n & 1
        sum += lastDigit
        n = n >> 1
    
    return sum   
    
    
def main():
    print("Enter number: ")
    n = int(input())
    result = SumBinary(n)
    print("Sum of binary digits:", result)
        
if __name__ == "__main__":
    main()