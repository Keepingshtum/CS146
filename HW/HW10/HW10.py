import collections
from collections import deque
from typing import List, Optional
class TreeNode(object): #node implementation

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right

class HW10: #solution
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = [] 
        queue = deque([root])
        while queue:
            qLength = len(queue)
            level = []
            for i in range (qLength):
                node = queue.popleft()
                if node:
                    level.append(node.val)
                    queue.append(node.left)
                    queue.append(node.right)
            if level:
                result.append(level)
        return result

# test case code        
root = TreeNode(4)
root.left = TreeNode(3)
root.right = TreeNode(8)
root.left.left = TreeNode(1)
root.right.left = TreeNode(5)
root.right.right = TreeNode(9)


solution = HW10()
result = solution.levelOrder(root)
print(result) 
