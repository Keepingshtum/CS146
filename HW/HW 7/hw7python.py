from typing import List
import heapq
class Main:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        min_heap = []
        for interval in intervals:
            start_time, end_time = interval
            if min_heap and min_heap[0] <= start_time:
                heapq.heappop(min_heap)
            heapq.heappush(min_heap, end_time)
        return len(min_heap)
mmr = Main()
print(mmr.minMeetingRooms([[0, 30], [5, 10], [15, 20]]))
print(mmr.minMeetingRooms([[0, 5], [6, 10], [11, 15]]))
print(mmr.minMeetingRooms([]))
