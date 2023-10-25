class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        num3 = []
        c = 0
        len1, len2 = len(num1), len(num2)
        maxlen = max(len1, len2)

        num1 = '0' * (maxlen - len1) + num1
        num2 = '0' * (maxlen - len2) + num2

        temp = maxlen - 1
        while temp >= 0:
            digit1 = int(num1[temp])
            digit2 = int(num2[temp)

            _sum = digit1 + digit2 + c
            c = _sum // 10
            _sum %= 10

            num3.insert(0, str(_sum))
            temp -= 1

        if c > 0:
            num3.insert(0, str(c))

        return ''.join(num3)
