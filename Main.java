import BinaryTrees.*;
//Manuel A Nunes
public class Main
{
    public static void main(String[] Args)
    {
        System.out.println("Greetings Trees are Growing");
        clsBinaryTree<Integer> myTree = new clsBinaryTree<Integer>(new Integer(5));
        myTree.AddValue(3);
        myTree.AddValue(7);
        myTree.AddValue(1);
        myTree.AddValue(2);
        myTree.AddValue(4);
        myTree.AddValue(6);
        myTree.AddValue(8);
        myTree.AddValue(9);
        myTree.AddValue(10);
        //System.out.println(myTree.Contains(43));
        System.out.println("Inorder    :"+myTree.toString(clsTreeNode.Traversal.InOrder));
        System.out.println("PreOrder   :"+myTree.toString(clsTreeNode.Traversal.PreOrder));
        System.out.println("Post Order :"+myTree.toString(clsTreeNode.Traversal.PostOrder));
        myTree.InvertTree();
        System.out.println("Inorder    :"+myTree.toString(clsTreeNode.Traversal.InOrder));
    }
}
