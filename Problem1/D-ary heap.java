public class DaryHeap {
		private int [] heap;		
		private int num;
		private int child;
		private int counter;
		DaryHeap(int d)			// constructor to create DaryHeap, where "d" is # of children allowed
		{
			child=d;
			heap=new int[10];
		}
		void insert(int k)		// adds an integer "k" into the DaryHeap in proper place
		{
			heap[++num] = k;
			swim(num);		
			counter++;
		}
		
		void swim(int k) 		// promotes a child further up heap structure until it is in proper order, typically done by swapping with the parent 
		{
			while(k>1 && less(k/child,k))
			{
				swap(k,k/child);
				k=k/child;
			}
		}
		
		int delMax() {			// swap the largest value in heap with the most recent child, and then delete that largest value from the heap, return the largest value to the user
			int max = heap[1];
			swap (1, num--);
			sink(1);		
			heap[num+1] = 0;
			return max;
			
		}
		
		void sink(int k)		// demotes a parent node down the designated heaph structure through swaps until it is in final order, heap strucutre preserved once method completed (max heap condition)
		{
			while(child*k<=num)
			{
				int j=child*k;
				if(j<num && less(j,j+1))
			{ j++;
			}
				if (!less (k,j)) {
					break;
				}
				swap (k,j);		// swap function
				k=j;
			}
		}
		
		void swap (int i, int j)		// use swap function for heap and temp for two int's for delMax() 
		{
			int temp = heap[i];
			heap[i] = heap[j];
			heap[j] = temp;
		}
		boolean less(int i, int j) 		// use boolean to express less than to compare the the heap of the 2 int's
		{ if(heap[i]<=heap[j])
		{
			return true;
		}
		else
			return false;
	}
		
		int[]sortArray_daryHeapSort()		// returns the contents of the heap in sorted order implementing heapsort 
		{
			int a = heap.length;
			 for (int i=a/child; i>=1; i--)
			 {
			 sink(1);
			 }
			 while (a>1)
			 {
			 
			 	swap(1,a);
			 	sink(--a);
			 }
			 	
		}
		
		void doubleArray() {			// double internal array inside the heapsort in the event that it becomes too large, do this by instantiating an array of size 2N and copying the values over 
	  private MyNode[] heapArray;
	

	  private int maxSize;			// max size of array 
	

	  private const int Size; 	// # of items in array
	

	  public Heap(int 2N) {		// instantiate array size of 2N and copy value over
	    maxSize = 2N;
	    Size = 10;			// begin with array of constant size "10"
	    heapArray >10 = new MyNode[maxSize];		// when values inserted into the heap exceed size 10
	  }
		}
	

		void print()			// prints heap length 
		{
			for(int i=0; i<heap.length; i++)
			{
				System.out.println(heap[i]);
			}
		}
	}
			
		
