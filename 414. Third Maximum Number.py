class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        set1=set(nums)
        a=max(set1)
        set1.remove(a)
        if not set1:
            return a
        b=max(set1)
        set1.remove(b)
        if not set1:
            return a
        c=max(set1)
        return c
        
