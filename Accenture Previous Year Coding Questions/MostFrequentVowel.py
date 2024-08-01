'''

You are a given a string str of length n. You have to find the most frequent vowel in the string str
Note: You may assume that str will always hav a unique most frequent vowel.

Sample Test Case:
Input:
6 -> string length
xyuaab

Output:
a

Explanation: As the vowel 'a' occurs the most in the string str, hence 'a' is printed in the output.

'''

def MostFrequentVowel(str):
    FreqVow = {}
    mostFreqVow = None
    maxVow = 0
    
    for ch in str:
        if ch in 'aeiou':
            FreqVow[ch] = FreqVow.get(ch,0)+1
            
            if FreqVow[ch] > maxVow:
                maxVow = FreqVow[ch]
                mostFreqVow = ch
    
    return mostFreqVow


def main():
    str = "xyuaab"
    print("Most Frequent vowel is: ", MostFrequentVowel(str))
    

if __name__ == "__main__":
    main()