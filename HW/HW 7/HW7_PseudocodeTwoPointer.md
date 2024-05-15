### HW 7 Two Pointer Approach Pseudocode

 minMeetingRooms:
        If intervals is empty:
            Return 0  // No meetings, no rooms needed

        start_arr <- sorted list of start times from intervals
        end_arr <- sorted list of end times from intervals
        ans <- 0  
        count <- 0 
        s <- 0 
        e <- 0  

        While s is less than the length of intervals:
            If the start time at pointer s is less than the end time at pointer e:
                Increment s by 1
                Increment count by 1  // A new meeting starts, increment the room count
            Else:
                Increment e by 1
                Decrement count by 1  // A meeting ends, decrement the room count
            Update ans to be the maximum of ans and count  