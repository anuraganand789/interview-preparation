public boolean isValid(final Node root, final int minValue, final int maxValue){
    if(root == null) return true;

    final int rootData = root.data;
    if(rootData < minValue || rootData > maxValue) return false;
    
    final Node left = root.left;
    if(left != null && rootData < left.data) return false;

    final Node right = root.right;
    if(right != null && rootData > right.data) return false;

    return isValid(left, minValue, rootData) && isValid(right, rootData, maxValue);
}
