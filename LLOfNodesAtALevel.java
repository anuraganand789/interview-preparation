//basically have to create a linked list of nodes.
//these just happens to be nodes in a tree.
//there is no connection between creating a linked list
//and being a part of a tree or part of anything

//These nodes are part of tree.. so that changes the way are going to able to access it


//Nodes at each level are going to be connected..
Q : How are we going to know a level has ended or we have reached a level or a level has started
A: We can put 'null' to show the end of each level.. or we can put any object to that.
   When we get that object in return, we know that the current level has ended and next one has started.

Q : We need a way to keep track of or know that all the nodes belongs to a given level
A : we can maintain a 'queue' of nodes on current level, where a poison/marker is inserted to show the end of 
    level.


class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
}

class LLNode{
    int data;
    LLNode next;
}

public List<LLNode> createLLOfAllNodesAtOneLevel(final TreeNode root){
    if(root == null){
        return ;
    }

    final Node LEVEL_ENDS = new Node();
    final Queue<TreeNode> nodesOnCurrentLevel = new ArrayDeque<>();

    nodesOnCurrentLevel.add(root);
    nodesOnCurrentLevel.add(LEVEL_ENDS);

    final List<LLNode> listOfLLs = new ArrayList<>();
    LLNode currHead = null;
    LLNode iterLL   = null;

    while(! nodesOnCurrentLevel.isEmpty()){
       final TreeNode treeNode = nodesOnCurrentLevel.remove(); 

       if(treeNode == LEVEL_ENDS) {

           if(nodesOnCurrentLevel.isEmpty()){ break; }

           nodesOnCurrentLevel.add(LEVEL_ENDS);
           continue;
       }

       final TreeNode left = treeNode.left;
       if(left != null) {
           nodesOnCurrentLevel.add(left);
       }

       final TreeNode right = treeNode.right;
       if(right != null){
           nodesOnCurrentLevel.add(right);
       }


       final LLNode llNode = new Node(treeNode.data);
       if(currHead == null){
           currHead = llNode;
           listOfLLs.add(currHead);
           iterLL = currHead;
           continue;
       }

       iterLL.next = llNode;
       iterLL = llNode;
    }

    return listOfLLs;
}
