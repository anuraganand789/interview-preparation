public int heightOfBinaryTree(final TreeNode root){
    if(root == null) return 0;

    int leftSubtreeHeight = heightOfBinaryTree(root.left);
    int rightSubtreeHeight = heightOfBinaryTree(root.right);

    return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
}

public boolean isBalanced(final Node root){
    if(root == null) return true;

    final int heightOfLeftSubtree  = heightOfBinaryTree(root.left);
    final int heightOfRightSubtree = heightOfBinaryTree(root.right);
    final int heightDiff           = Math.abs(heightOfLeftSubtree - heightOfRightSubtree);
    
    return heightDiff > 1 && isBalanced(root.left) && isBalanced(root.right);
}

public int heightOfBinaryTree(final TreeNode root){

    if(root == null) return 0;

    int leftSubtreeHeight = heightOfBinaryTree(root.left);
    int rightSubtreeHeight = heightOfBinaryTree(root.right);

    Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1;


    return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
}

