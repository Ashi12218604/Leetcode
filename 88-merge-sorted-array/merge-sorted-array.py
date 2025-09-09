class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        mid=m-1
        nid=n-1
        r=m+n-1
        while nid>=0:
            if mid>=0 and nums1[mid]>nums2[nid]:
                nums1[r]=nums1[mid]
                mid-=1
            else:
                nums1[r]=nums2[nid]
                nid-=1
            r-=1
        """
        Do not return anything, modify nums1 in-place instead.
        """
        