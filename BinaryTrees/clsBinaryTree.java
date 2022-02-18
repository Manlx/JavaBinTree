package BinaryTrees;
//Manuel A Nunes
public class clsBinaryTree<T extends Comparable>
{
    public clsTreeNode<T> Root;
    public clsBinaryTree()
    {
        this(null);
    }
    public clsBinaryTree(T Value)
    {
        Root = new clsTreeNode<T>(Value);
    }
    public void AddValue(T Value)
    {
        if (Root.Value == null)
        {
            Root = new clsTreeNode<T>(Value);
            return;   
        }
        Root.AddValue(Value);
    }
    public boolean Contains(T Value)
    {
        return Root.Contains(Value);
    }
    public String toString()
    {
        return "";
    }
    public String toString(clsTreeNode.Traversal TraverStyle)
    {
        return Root.toString(TraverStyle);
    }
    public void InvertTree()
    {
        Root.Invert();
    }
}
