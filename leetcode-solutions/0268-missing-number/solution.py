class Solution:
    def missingNumber(self, nums: List[int]) -> int:
       l=len(nums)
       for i,num in enumerate(nums):
        exp=l*(l+1)//2;
        s=sum(nums)
        return exp-s
