# Given an array of integers, write a function to remove duplicate elements.
# Input: [1, 2, 2, 3, 4, 4, 5]
# Output: [1, 2, 3, 4, 5]

def RemoveDuplicate(arr):
    uniqueElem = []
    
    for elem in arr:
        if elem not in uniqueElem:
            uniqueElem.append(elem)
            
    return uniqueElem


def main():
    arr = [1, 2, 2, 3, 4, 4, 5]
    print("Unique elements are: ", RemoveDuplicate(arr))
    

if __name__ == "__main__":
    main()