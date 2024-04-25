You are the sysadmin for a big tech company, and you have to estimate the amount of servers you need to handle some long-running jobs.

One server can handle only one job at once. One job can only be executed by one server at once.

Once a server has finished executing its current job, it can be reassigned to a new job.

Given an array of time intervals intervals where intervals[i] = [starti, endi], representing the start and end time for a particular job that needs to be executed, return the minimum number of servers required to run all jobs.
