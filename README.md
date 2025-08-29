# Day24 : A Tech Number is a number with an even number of digits such that: Split the number into two equal halves. Add the two halves. If the square of the sum is equal to the original number, then the number is a Tech Number

**TestCases**
1. Input: 2025   Output: Tech Number
2. Input: 3025   Output: Tech Number

**Intuition**
1. The definition tells us the key check is:
2. Number must have even digits.
3. Break the number into two halves.
4. Compute their sum.
5. Square the sum and compare with the original number.

**Algorithm Flow**
1. Read the input number n.
2. Convert the number to string s to count digits.
3. If length of s is odd → directly print "Not Tech Number".
4. Otherwise, split the string into two equal halves.
5. Convert both halves to integers and add them.
6. Square the sum.
7. If result equals the original number → "Tech Number". Else → "Not Tech Number".

**Complexity Analysis**
Time Complexity:𝑂(𝑑),where  d is the number of digits.
Space Complexity: O(d)
