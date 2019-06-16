public class BST {		
	

	private Node root;
	private Value val;
	private Node left, right;
	private BST();				// constructor
	

	void put(int) {				// inserts a value into the BST
		root = put(root, int);
		
	}
	

	Void put(int[] a) {			// inserts an entire array "a" into the BST
		root = put(root, int[] a)
	}
		
	             
	public void put(Key key, Value val)
	{  root = put(root, key, val);  }
		
		
	public Value get(Key key)	// searches for a value in the BST and if found, return the key, and if not found, return 0 and print "Value not found" to console
	{
	   Node x = root;
	   while (x != null)
	   {
	      int cmp = key.compareTo(x.key);
	      if      (cmp  < 0) x = x.left;
	      else if (cmp  > 0) x = x.right;
	      else if (cmp == 0) return x.val;
	}
	   System.out.println("Value not found!");	// when returned 0 to the console
		return null;
	//System.out.println(cmp);		// print total number of comparisons needed (whether the key is found or not)
		
	}
		
		
		
	public int returnSize()			// returns the total number of nodes in the BST
	{  return size(root);  }
	private int size(Node x)
	{
	if(x == null) return 0;
	return x.count;
	

	}
		
		int[] a sortedTree()				//  outputs the tree in sorted order of an array , Return value corresponding to given key, or null if no such key, cost --> Number of compares = 1 + depth of n    ode.
	{
	   if (x == null) return new Node(key, val);
	   int cmp = key.compareTo(x.key);
	if (cmp < 0) x.left = put(x.left, key, val);  
		else if (cmp > 0) x.right = put(x.right, key, val);  
		else if (cmp == 0) x.val = val;
	return x; }
		
		int BST balanceTreeOne()	// balance tree --> create a new BST and insert values of sorted array such that tree height is balanced, ** linear insertion of sorted values would be the worst possible height 
		private Node put(Node x, Key key, Value val) 	// initialize subtree count to 1
		{
	   if (x == null) return new Node(key, val, 1);
	   int cmp = key.compareTo(x.key);
	   if      (cmp  < 0) x.left  = put(x.left,  key, val);
	   else if (cmp  > 0) x.right = put(x.right, key, val);
	   else if (cmp == 0) x.val = val;
	x.count = 1 + size(x.left) + size(x.right);
	return x; 
		}
		
	private Node rotateRight(Node h)		// rotates a given node h to the right and returns the new parent node after rotation. Also update code to cancel function is there are no right subchildren!
	{
	   assert isRed(h.left);
	   Node x = h.left;
	   h.left = x.right;
	   x.right = h;
	   x.color = h.color;
	   h.color = RED;
	   return x;
	}
	

	private Node rotateLeft(Node h) 	// rotates a given node h to the left and returns the new parent node after rotation. Also update code to cancel function is there are no left subchildren!
	

	{
	   assert isRed(h.right);
	   Node x = h.right;
	   h.right = x.left;
	   x.left = h;
	   x.color = h.color;
	   h.color = RED;
	   return x;
	}
	

		void transformToList()		// performs a series of right notations on the BST until BST is just a linked list oriented to the right 
	{
			
		 //private Node put(Node h, Key key, Value val)
			{
		if (h == null) return new Node(key, val, RED);
		    int cmp = key.compareTo(h.key);
		    if      (cmp  < 0) h.left  = put(h.left,  key, val);
		    else if (cmp  > 0) h.right = put(h.right, key, val);
		    else if (cmp == 0) h.val = val;
		   
		if (isRed(h.right) && !isRed(h.left))     h = rotateLeft(h);
		if (isRed(h.left)  && isRed(h.left.left)) h = rotateRight(h);
		if (isRed(h.left)  && isRed(h.right))     flipColors(h);	
	

		}
		
	

		void balanceTreeTwo()		/* restructures the bst, first, restructure the tree by calling transformToList(); to turn it into a right-leaning linked list, compute the parameter M = (N+1) -2^[log2 N]
						 from the root of the tree (now a right-leaning linked list) perform left rotations on every odd node until M odd nodes have been rotated, compute the parameter K = [log2 N] -1 , 
						 for K times --> compute left rotations on the remaining right-leaning odd nodes */
		{
			BST.transformToList();			// calling transformToList(); to turn it into a right-leaning linked list
			public Key floor(Key key) 			// floor computation 
			{ return floor(root, key, null); }
			private Key floor(Node x, Key key, Key best)  { 
			if (x == null) return best; 
			int cmp = key.compareTo(x.key);
			if (cmp < 0) return floor(x.left, key, best); else if (cmp > 0) return floor(x.right, key, x.key); else if (cmp == 0) return x.key; 
		}
			public int rank(Key key)		// check if key in left subtree, node, or right subtree 
		{  return rank(key, root);  }
		private int rank(Key key, Node x) { 			// recursive algorithm for bst restructure, with left rotations and Node x comparisons 
	   
			if (x == null) return 0;
		int cmp = key.compareTo(x.key);
		if (cmp  < 0) return rank(key, x.left);
		else if (cmp  > 0) return 1 + size(x.left) + rank(key, x.right);
		else if (cmp == 0) return size(x.left);
		}
		}
			private static final boolean RED   = true;		// boolean values for k value either greater than 1, decrement by 1, or K==1
		private static final boolean BLACK = false;
		private class Node
		{
		Key key;
		Value val;
		Node left, right;  boolean color;
	 
		}
		// color of parent link
		private boolean isRed(Node x)
		{
	   	if (x == null) return false;
	   	return x.color == RED;
	 	}
		}
	

	}
