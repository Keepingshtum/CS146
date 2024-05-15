package lab6;

import java.util.ArrayList;

public class Lab6 {
	public boolean findCycle(int original, int current, int[][] prerequisites, ArrayList<Integer> visited) {
		for(int[] j:prerequisites) {
			if(j[0]==current) {
				if(visited.contains(j[1])) return false;
				visited.add(j[1]);
				return findCycle(original, j[1], prerequisites, visited);
			}
		}
		return true;
	}
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		for(int i=0; i<numCourses; i++) {
			ArrayList<Integer> visited=new ArrayList<Integer>();
			visited.add(i);
			if(findCycle(i, i, prerequisites, visited)==false) return false;
		}
		return true;
    }
	
	public static void main(String args[]) {
		int[][] pre= {{0,1},{1,2},{2,3},{3,4}};
		Lab6 test=new Lab6();
		System.out.println(test.canFinish(4, pre));
		int[][] pre2={{0,1},{1,2},{2,3},{3,1}};
		System.out.println(test.canFinish(3, pre2));
	}

}
