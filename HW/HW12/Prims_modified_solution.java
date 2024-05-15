package hw12;

import java.util.ArrayList;

public class HW12 {
	public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
	       // Your code here
		ArrayList<Integer> visited=new ArrayList<Integer>();
		int cost=0;
		while(visited.size()<n) {
			int minWellCost=Integer.MAX_VALUE;
			Integer minWell = null;
			for(int i=0; i<n; i++) {
				if(!visited.contains(i+1) && wells[i]<minWellCost) {
					minWellCost=wells[i];
					minWell=i+1;
				}
			}
			int minPipeCost=Integer.MAX_VALUE;
			Integer minHouse=null;
			for(int i:visited) {
				for(int[] j:pipes) {
					if(j[0]==i && j[1]!=i && !visited.contains(j[1])){
						if(j[2]<minPipeCost) {
							minPipeCost=j[2];
							minHouse=j[1];
						}
					}
					else if(j[0]!=i && j[1]==i&& !visited.contains(j[0])) {
						if(j[2]<minPipeCost) {
							minPipeCost=j[2];
							minHouse=j[0];
						}
					}
				}
			}
			
			if(minWell!=null && minWellCost<=minPipeCost) {
				visited.add(minWell);
				cost+=minWellCost;
			}
			if(minHouse!=null && minWellCost>minPipeCost) {
				visited.add(minHouse);
				cost+=minPipeCost;
			}
				}
		return cost;
	}
	
	public static void main(String []args) {
		HW12 test=new HW12();
		int[]wells= {1,1, 3, 4, 1};
		int[][]pipes= {{1,2,1},{1,2,2},{2,3,3},{3,4,1},{4,5,2},{5,4,4}};
		System.out.println(test.minCostToSupplyWater(wells.length, wells, pipes));
	}
}
