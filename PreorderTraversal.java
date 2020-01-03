import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class PreorderTraversal {

    /**
     * Return the list of node using Pre-order Traversal.
     * @param root
     * @return list of nodes
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodeList = new ArrayList<Integer>();
        Stack<TreeNode> treeList = new Stack<TreeNode>();
        while (root != null || !treeList.empty())
        {
            if (root == null)
            {
                root = treeList.pop().right;
            }
            if (root.right != null)
            {
                treeList.push(root);
            }
            nodeList.add(root.val);
            root = root.left;
        }
        
        return nodeList;

    }


    public static void main(String[] args)
    {

    }
}