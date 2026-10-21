class Solution:
    def largestGoodInteger(self, num):
        ret = ""
        for i in range(2, len(num)):
            if num[i - 2] == num[i - 1] and num[i - 2] == num[i]:
                if num[i] > ret or ret == "":
                    ret = num[i - 2:i + 1]
        
        return ret
