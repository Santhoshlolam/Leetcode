class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        '''arr=nums
        nums.sort()
        i=0
        j=len(nums)-1
        while i<=j:
            if nums[i]+nums[j]==target:
                temp1=nums[i]
                temp2=nums[j]
            elif nums[i]+nums[j]>target:
                j=j-1
            else:
                i=i+1
        ind1=arr.index(temp1)
        ind2=arr.index(temp2)
        return [ind1,ind2]'''
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    return [i,j]
                