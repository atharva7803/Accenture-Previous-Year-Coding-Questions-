# Function to find the roots of a quadratic equation ax^2 + bx + c = 0
# Formula:   +X = (-b + underoot b2 - 4ac/2a)
#            -X = (-b - underoot b2 - 4ac/2a)

import math

def RootsofEquation(a, b, c):
    root1 = (-b + math.sqrt(b * b - 4 * a * c)) / (2 * a)
    root2 = (-b - math.sqrt(b * b - 4 * a * c)) / (2 * a)
    return root1, root2


# Example usage
a = 1
b = -3
c = 2
result = RootsofEquation(a, b, c)
print("Roots of the equation:", result)