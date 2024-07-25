'''

Ques: The program is supposed to calculate the sum of  distance between three points from each other.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2

'''


import math

def calculate_distance(x1, y1, x2, y2):
    return math.sqrt(math.pow(x2 - x1, 2) + math.pow(y2 - y1, 2))

def total_distance(x1, y1, x2, y2, x3, y3):
    first_diff = calculate_distance(x1, y1, x2, y2)
    second_diff = calculate_distance(x2, y2, x3, y3)
    third_diff = calculate_distance(x1, y1, x3, y3)
    
    return round(first_diff, 2), round(second_diff, 2), round(third_diff, 2)

def main():
    x1, y1 = map(float, input("Enter coordinates for point 1 (x1 y1): ").split())
    x2, y2 = map(float, input("Enter coordinates for point 2 (x2 y2): ").split())
    x3, y3 = map(float, input("Enter coordinates for point 3 (x3 y3): ").split())
    
    first_diff, second_diff, third_diff = total_distance(x1, y1, x2, y2, x3, y3)
    print("Distances:")
    print(f"Between point 1 and point 2: {first_diff}")
    print(f"Between point 2 and point 3: {second_diff}")
    print(f"Between point 1 and point 3: {third_diff}")

if __name__ == "__main__":
    main()
