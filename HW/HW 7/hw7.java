import java.util.Arrays;

public class hw7 {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null){
            return 0;
        }

        int len = intervals.length;
        int[] start_arr = new int[len];
        int[] end_arr = new int[len];
        int index = 0;
        for(int[] interval: intervals){
            start_arr[index] = interval[0];
            end_arr[index++] = interval[1];
        }
        Arrays.sort(start_arr);
        Arrays.sort(end_arr);

        int ans = 0, count = 0;
        int s = 0, e = 0;

        while(s < len){
            if(start_arr[s] < end_arr[e]){
                s++;
                count++;
            }else{
                e++;
                count--;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        hw7 test = new hw7();
        //given test cases
        int[][] intervals1 = {{0,30},{5,10},{15,20} }; //expected output 2
        int[][] intervals2 = {{0,1},{1,2},{2,3} }; //expected output 1
        //end of given test cases
        //what if we had a meeting that ended and started @ the same time? or empty intervals
        int[][] intervals3 = {{0,30},{5,10},{10,20} };
        int[][] intervals0 = {};
        System.out.println(test.minMeetingRooms(intervals1));
        System.out.println(test.minMeetingRooms(intervals2));
        System.out.println(test.minMeetingRooms(intervals3));
        System.out.println(test.minMeetingRooms(intervals0));

    }
}
