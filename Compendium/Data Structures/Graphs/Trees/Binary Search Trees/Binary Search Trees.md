- Hierarchical structure that represents and organize data in a way that is easy to navigate and search. 
- It is a collection of nodes that are connected by edges and has a hierarchical relationship between the nodes.
- The topmost node of the tree is called the **root**, and the nodes below it are called the "child nodes". Each node can have multiple child nodes, and these child nodes can also have their own child nodes, forming a *recursive structure*. 
- Recursive: "recursive" means a function that solves a problem by using a smaller version of the same problem. (like sorting a huge list) It keeps breaking the problem down until it reaches a simple case it can solve directly.
- Trees are considered to be a non-linear data structure. Why?:
- The data in a tree is not stored in a sequential manner, i.e. they are not stored linearly. Instead, they are arranged on multiple levels or we can say it is a hierarchical structure. For this reason, a tree is a non-linear data structure.
- The basic terminologies of a tree:
- Parent Node: The node which is a predecessor of a node is called the parent node of that node. {B} is the parent node of {D, E}.
- Child Node: The node which is the immediate successor of a node is called the child node of that node. Examples: {D, E} are the child nodes of {B}.
- Root Node: The topmost node of a tree or the node which does not have any parent node is called the root node. {A} is the root node of the tree. A non-empty tree must contain exactly one root and exactly one path from the root to all other nodes of the tree.
- Leaf Node or External Node: The nodes which do not have any child nodes are called leaf nodes. {K,L,M,N,O,P,G} are the leaf nodes of the tree. 
- Ancestor of a Node: Any predecessor nodes on the path of the root to that node are called Ancestors of that node. {A,B} are the ancestor nodes of the node {E}.
- Descendant: A node x is a descendant of another node y if and only if y is an ancestor of x.
- Sibling: Children of the same parent node are called siblings.
- Level of a node: The count of edges on the path from the root node to that node. The root node has level 0.
- Internal node: A node with at least one child is called Internal Node.
- Subtree: Any node of the tree along with its descendant.
- A tree consists of a root node, and zero or more subtrees T1, T2, Tk such that there is an edge from the root node of the tree to the root node of each subtree. Subtree of a node X consists of all the nodes which have node X as the ancestor node.
- Representation of a Node in Tree Data Structure in Java:
```
public static class Node {
    int data;
    Node first_child;
    Node second_child;
    Node third_child;
      .
    .
    .
    Node nth_child;
}
```
So why use a tree data structure? What scenarios?
1. One reason to use trees might be because you want to store information that naturally forms a hierarchy. For example, a file system on a computer. Or, a class schedule with prerequesites, meaning a class with prereqs has an parent node and possibly ancestor nodes above it.
2. Trees (with some ordering via BST for ex.) provide moderate access/search (it is quicker than Linked Lists but slower than arrays).
3.  Like Linked Lists and unlike arrays, trees don't have an upper limit ont he number of nodes as nodes are linked using pointers.
4. Trees provide moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists)
Basic Operations of the data structure:
* Create - create a tree in the data structure.
* Insert - Inserts data in a tree.
* Search - searches specific data in a tree to check whether it is present or not.
* Traversal:
	Depth-First-Search Traversal (DFS)
		- ****Time complexity:**** O(V + E), where V is the number of vertices/nodes and E is the number of edges in the graph.
	Breadth-First-Search Traversal
		Time Complexity of BFS Algorithm: O(V + E)
		BFS explores all the vertices and edges in the graph. In the worst case, it visits every vertex/node and edge once. Therefore, the time complexity of BFS is O(V + E), where V and E are the number of vertices and edges in the given graph.

