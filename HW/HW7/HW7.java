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
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
        }

        for (int i = 0; i < intervals.length; i++) {
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0, e = 0;
        int min = 0;

        while (s < intervals.length) {
            if (start[s] < end[e]) {
                s += 1;
                min += 1;
            } else {
                e += 1;
                min -= 1;
            }
        }

        return min;
    }
}
