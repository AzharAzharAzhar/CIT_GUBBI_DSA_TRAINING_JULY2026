package Day7;
class tNode{
    int data;
    tNode left;
    tNode right;
    tNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class binaryTree{
    tNode root;
    public void inOrder(tNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public void preOrder(tNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        inOrder(node.left);
        inOrder(node.right);
    }
    public void postOrder(tNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.data + " ");
    }
    public int noOfNodes(tNode root){
        if(root == null)
            return 0;
        return noOfNodes(root.left) + noOfNodes(root.right) + 1;
    }

    public int noOfLefttreeNodes(tNode root){
        if(root == null)
            return 0;
        return noOfNodes(root.left);
    }
    public int sumOfNodes(tNode root){
        if(root == null)
            return 0;
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    public int height(tNode node){
        if(node == null)
            return 0;
        int leftHeight = height(node.left) + 1;
        int rightHeight = height(node.right) + 1;

        return Math.max(leftHeight, rightHeight);
    }
}

public class D7_P4_Tree {
    public static void main(){
        binaryTree tree = new binaryTree();

        tree.root = new tNode(1);
        tree.root.left = new tNode(2);
        tree.root.right = new tNode(3);
        tree.root.left.left = new tNode(4);
        tree.root.left.right = new tNode(5);
        tree.root.right.left = new tNode(7);
        tree.root.right.right = new tNode(8);
        tree.root.left.right.left = new tNode(15);
        tree.root.left.right.right = new tNode(15);
        tree.root.left.right.right.left = new tNode(15);

        tree.inOrder(tree.root);
        System.out.print("\nNo. of Nodes: "+tree.noOfNodes(tree.root));
        System.out.print("\nNo. of Left Subtree Nodes: "+tree.noOfLefttreeNodes(tree.root));

        System.out.print("\nsum of Nodes: "+tree.sumOfNodes(tree.root));
        System.out.print("\nHeight of tree: "+tree.height(tree.root));
    }
}
