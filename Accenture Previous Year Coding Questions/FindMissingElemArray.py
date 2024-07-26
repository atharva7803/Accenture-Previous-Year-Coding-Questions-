# Given an array of integers, write a function that finds the missing number.
# Input: [1,2,4,5,6]
# Output: 3

def FindMissing(arr):
    n = len(arr) + 1        # Total number of elements including the missing one
    TotalSum = n * (n+1) // 2       # Sum of the first n natural numbers
    
    ActualSum = 0
    for i in range(len(arr)):
        ActualSum += arr[i]
        
    return TotalSum - ActualSum


def main():
    arr = [1,2,4,5,6]
    print("Missing number in array is: ", FindMissing(arr))
    

if __name__ == "__main__":
    main()