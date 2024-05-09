import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
        MeetingRooms m = new MeetingRooms();

        int[][] a = {
                        {0, 30},
                        {5, 10},
                        {15, 20}
                    };

        int[][] b = {
                        {0, 1},
                        {1, 2},
                        {2, 3}
                    };

        int[][] c = {
                        {7, 10},
                        {2, 4}
                    };

        System.out.println(m.minMeetingRooms(a));
        System.out.println(m.minMeetingRooms(b));
        System.out.println(m.minMeetingRooms(c));

    }

    public int minMeetingRooms(int[][] intervals) {
        
        // Create array to keep track of start and end
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        
        // Fill arrays with start and end time
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
        }

        for (int i = 0; i < intervals.length; i++) {
            end[i] = intervals[i][1];
        }

        // Sort arrays
        Arrays.sort(start);
        Arrays.sort(end);

        // Initialize pointers
        int s = 0, e = 0;
        int min = 0;

        
        while (s < intervals.length) {

            // if start time is less than end time, increment min by 1
            if (start[s] < end[e]) {
                s += 1;
                min += 1;
            } else {
                // otherwise if it's less than, decrement it
                e += 1;
                min -= 1;
            }
        }

        // return minimum meeting rooms required
        return min;
    }
}
