import java.util.*;

public class HW7 {
    public static void main (String[] args) {
        int[][] k = {{0,1},{1,2},{2,3}};
        minMeetingRooms(k);
    }

    public static int minMeetingRooms(int[][] intervals) {
        int servers = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        ArrayList<Integer> starts = new ArrayList<>();
        ArrayList<Integer> ends = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            starts.add(intervals[i][0]);
            ends.add(intervals[i][1]);
        }

        for (int j = 0; j < ends.getLast(); j++) {
            if (starts.contains(j)) {
                servers += 1;
            }
            if (ends.contains(j)) {
                servers -= 1;
            }
        }

        System.out.println(servers);
        return servers;
    }
}
