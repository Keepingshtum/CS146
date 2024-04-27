Create a min heap to use as a priority queue to store end times of each server use.
Iterate through all time intervals.
for each interval, 
- if its start time is after the end time at the top of the queue,
  pop the top of the queue and push the end time of the current interval
  into the queue.
- if its start time is before the end time at the top of the queue,
  push the end time of the current interval into the queue.
After all time intervals are done, the size of the queue denotes how many
servers were used in total
