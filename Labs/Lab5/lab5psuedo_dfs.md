Function isValidBST(root)
    Return isValidBSTHelper(root, -INFINITY, INFINITY)

Function isValidBSTHelper(node, minBound, maxBound)
    If node is NULL
        Return TRUE

    If node.value >= maxBound OR node.value <= minBound
        Return FALSE

    leftIsValid = isValidBSTHelper(node.left, minBound, node.value)

    rightIsValid = isValidBSTHelper(node.right, node.value, maxBound)

    Return leftIsValid AND rightIsValid