public Node successor(final Node root){
    if(root == null) return null;

    Node successor = root.right;

    //Case 1.
    if(successor != null){
        if(successor.left != null) {
          while(successor.left != null) successor = successor.left;  
          return successor;
        }
        
        return successor;
    }

    Node iterNode = root;
    Node parent = iter.parent;

    //Case 2
    while(parent != null && parent.left != iterNode){
        iterNode = parent;
        parent = iterNode.parent;
    }
    

    //Case 3
    return parent;
}
