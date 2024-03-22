class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        s=-1
        if needle in haystack : 
            s= haystack.index(needle)
        return s
        