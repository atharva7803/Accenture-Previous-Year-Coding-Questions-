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

//Java Code
# import java.util.*;

# class Main {
#   public static void main(String[] args) {
#     int[] arr = {1, 2, 2, 3, 4, 4, 5};
#     int[] ans = duplicateElem(arr);
#     System.out.println(Arrays.toString(ans));
#   }

#   public static int[] duplicateElem(int[] arr) {
#     HashSet<Integer> set = new HashSet<>();
#     for (int i : arr) set.add(i);

#     int[] res = new int[set.size()];
#     int idx = 0;
#     for (int i : set) res[idx++] = i;
#     return res;
#   }
# }
