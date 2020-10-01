/**
 * 
 */
package test.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Ramad
 *
 */
public class BFSGraph {
	
	private int vertices;
	
	private LinkedList<Integer> adj[];
	
	BFSGraph(int vertices)
	{
		this.vertices=vertices;
		adj = new LinkedList[vertices]; 
		for(int i=0;i<vertices;i++)
		{
			adj[i] = new LinkedList<>(); 
		}
	}
	
	public void addEdges(int vertices,int edge)
	{
		adj[vertices].add(edge); 
	}
	
	void BFS(int s)
	{
		boolean visited[] = new boolean[vertices]; 
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[s]=true;
		
		queue.add(s);
		
		while(queue.size() != 0)
		{
			s = queue.poll(); 
            System.out.print(s+" "); 
            
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BFSGraph g = new BFSGraph(4); 
		  
        g.addEdges(0, 1); 
        g.addEdges(0, 2); 
        g.addEdges(1, 2); 
        g.addEdges(2, 0); 
        g.addEdges(2, 3); 
        g.addEdges(3, 3); 
  
        g.BFS(2); 

	}

}
