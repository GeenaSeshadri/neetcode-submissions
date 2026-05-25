class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = {}
        ls = []
        for i in strs:
            key = tuple(sorted(i))
            if key in mp:
                mp[key].append(i)
            else:
                mp[key] = [i]
        for key,value in mp.items():
            ls.append(value)
        return ls

# from typing import List

# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         mp = {}
#         ls = []

#         for i in strs:
#             key = tuple(sorted(i))
#             if key in mp:
#                 mp[key].append(i)
#             else:
#                 mp[key] = [i]

#         for key, value in mp.items():
#             ls.append(value)

#         return ls


        