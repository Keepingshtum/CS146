class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         //BFS,Kahn's algorithmn impleemtnation of lab 6, courses
         // Create an adjacency list to represent the graph

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Array to track in-degrees of nodes
        int[] inDegree = new int[numCourses];
        
        // Populate the adjacency list and in-degree array
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int preCourse = prerequisite[1];
            adjList.get(preCourse).add(course);
            inDegree[course]++;
        }
        
        // Queue for nodes with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        
        // Add nodes with in-degree 0 to the queue
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        // Number of courses that can be finished
        int finishedCourses = 0;
        
        // Process nodes with in-degree 0
        while (!queue.isEmpty()) {
            int currentCourse = queue.poll();
            finishedCourses++;
            
            // Reduce in-degree for all neighbors
            for (int nextCourse : adjList.get(currentCourse)) {
                inDegree[nextCourse]--;
                // If in-degree becomes 0, add to the queue
                if (inDegree[nextCourse] == 0) {
                    queue.add(nextCourse);
                }
            }
        }
        
        // If finishedCourses equals numCourses, return true
        return finishedCourses == numCourses;
    }
}
