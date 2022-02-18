package BinaryTrees;
//Manuel A Nunes
public class clsTreeNode<T extends Comparable>
{
    public static enum Traversal
    {
        InOrder,
        PreOrder,
        PostOrder
    }
    public T Value;
    public int Count;
    public clsTreeNode<T> LC,RC;
    public clsTreeNode()
    {
        this(null);
    }
    public clsTreeNode(T Value)
    {
        this.Value = Value;
        LC = null;
        RC = null;
        Count++;
    }
    public boolean Contains(T Value)
    {
        if (this.Value == null)
            return false;
        if (this.Value.compareTo(Value)== 0)
            return true;
        else if (this.Value.compareTo(Value) >= 1)
            return RC.Contains(Value);
        else 
            return LC.Contains(Value);
    }
    public void AddValue(T Value)
    {
        if (this.Value.compareTo(Value) >= 1)
        {
            if (RC == null)
                RC = new clsTreeNode<T>(Value);
            else
                RC.AddValue(Value);
        }
        else if (this.Value.compareTo(Value) == 0)
            this.Count++;
        else
            if (LC == null)
                LC = new clsTreeNode<T>(Value);
            else
                LC.AddValue(Value);
    }
    public String toString()
    {
        return this.Value.toString();
    }
    public String GetLCToString(Traversal Format)
    {
        String Out = "";
        String Temp = "";
        if (LC != null)
        {
            Temp = String.format("%s",LC.toString(Format));
            if (Temp.charAt(Temp.length()-1) != ';')
            {
                Temp += ";";
                
            }
            Out +=Temp;
        }
        return Out;
    }
    public String GetTVToString(Traversal Format)
    {
        String Out = "";
        String Temp = "";
        if (this.Value != null)
        {
            Temp = String.format("%s",this.Value.toString());
            if (Temp.charAt(Temp.length()-1) != ';')
            {
                Temp += ";";
                
            }
            Out +=Temp;
        }
        return Out;
    }
    public String GetRCToString(Traversal Format)
    {
        String Out = "";
        String Temp = "";
        if (RC != null)
        {
            Temp = String.format("%s",RC.toString(Format));
            if (Temp.charAt(Temp.length()-1) != ';')
            {
                Temp += ";";
            }
            Out +=Temp;
        }
        return Out;
    }
    public String toString(Traversal Format)
    {
        String Out = "";
        if (this.Value != null)
        switch(Format)
        {
            case InOrder:Out +=GetRCToString(Format)+GetTVToString(Format)+GetLCToString(Format);
                break;
            case PostOrder: Out +=GetRCToString(Format)+GetLCToString(Format)+GetTVToString(Format);
                break;
            case PreOrder: Out +=GetTVToString(Format)+GetRCToString(Format)+GetLCToString(Format);
                break;
        }
        return Out;
    }
    public void Invert()
    {
        if (LC != null)
            LC.Invert();
        if (RC != null)
            RC.Invert();
        
        clsTreeNode<T> Temp = LC;
        LC = RC;
        RC = Temp;
    }
}
