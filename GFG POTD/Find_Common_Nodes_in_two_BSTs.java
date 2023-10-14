class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        bst1(root1,set);
        search(root2,set,list);
        return list;
    }
    
    public static void bst1(Node root,HashSet<Integer>set){
        if(root==null) return;
        bst1(root.left,set);
        set.add(root.data);
        bst1(root.right,set);
    }
    public static void search(Node root,HashSet<Integer>set,ArrayList<Integer>list){
        if(root==null) return;
        search(root.left,set,list);
        if(set.contains(root.data)) list.add(root.data);
        search(root.right,set,list);
    }
    
}
