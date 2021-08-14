//I will be provided with an array of integers
//those integers are ordered in increasing order
public Node binaryTree(final int[] arrayOfInts, final int left, final int right){
    if(arrayOfInts == null || arrayOfInts.length == 0) return null;

    if(left > right) return null;

    final int midIndex = ((right - left)/2  + left);
    final Node root = new Node(arrayOfInts[midIndex]);
    if(root == null) return null;

    final Node left = binaryTree(arrayOfInts, left, midIndex - 1);
    root.left = left;

    final Node right = binaryTree(arrayOfInts, mid + 1, right);
    root.right = right;

    return root;
}
