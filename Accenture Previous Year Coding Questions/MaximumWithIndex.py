# Given an array of integers, write a function that finds the maximum element and its index.
# Input: [1,8,4,9,6]
# Output: (9,3)

def MaximumIndex(arr):
    max = arr[0]
    maxIndex = 0
    
    for i in range(1, len(arr)):
        if arr[i] > max:
            max = arr[i]
            maxIndex = i
        
    return (max, maxIndex)


def main():
    arr = [1,8,4,9,6]
    print("Maximum number with its index is: ", MaximumIndex(arr))
    

if __name__ == "__main__":
    main()