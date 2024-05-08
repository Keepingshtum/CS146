from typing import List

class hw7:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        if not intervals:
            return 0  # No intervals means no rooms needed.

        #extracting start & end times, sorting them
        start_arr = sorted(i[0] for i in intervals)
        end_arr = sorted(i[1] for i in intervals)

        #initlization, of answer, and the count of the rooms needed
        ans, count = 0,0
        #initialization of the pointers
        s,e = 0,0

        while s < len(intervals):
            #position at start array less than position at end array
            if start_arr[s] < end_arr[e]:
                s+=1
                #increment pointer ,incremenet count
                count+=1
            #if they're greater than (or equal)
            else:
                e+=1
                count-=1
            #return answer , minimum meeting rooms needed
            ans = max(ans,count)
        return ans
    
#announced test cases
intervals1 = [[0,30],[5,10],[15,20]] #expeted output 2
intervals2 = [[0,1],[1,2],[2,3]] #expected output 1
##end of announced test cases
intervals0 = []
print(hw7().minMeetingRooms(intervals1))
print(hw7().minMeetingRooms(intervals2))
print(hw7().minMeetingRooms(intervals0))