# This solution handles a special case where the tree provided is too large for the recursive approach to work within memory constraints. To handle deep trees, we can employ iteration using a queue. 

from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Lab4:
    def __init__(self):
        pass

    def invertTree(self, root):
        if not root:
            return None
        queue = deque()
        queue.append(root)
        
        while queue:
            current = queue.popleft()
            current.left, current.right = current.right, current.left
            
            if current.left:
                queue.append(current.left)
            if current.right:
                queue.append(current.right)
        
        return root
