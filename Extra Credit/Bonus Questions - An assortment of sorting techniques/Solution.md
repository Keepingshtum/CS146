
Having a stable sorting algorithm is useful in scenarios where you would want to preserve any previous sorts, say in a database of names. There can be multiple "John"s but you don't want the position of each John to randomly change each time you sort. 

The property of stability in an algorithm is useful to us in scenarios where you want to preserve any previous sorts, a database of employee names comes to mind for a real world example. 
There can be multiple employees named "John Appleseed" but you don't want the position of each "John Appleseed" to shift around each time you sort the list, you would like have a John Appleseed "-1,-2,-3,-n" for n being how many John Appleseeds you could possibly have in a database. 

![image](https://github.com/Keepingshtum/CS146/assets/143302842/14dc34a5-9e52-472c-883b-471f7b9a0905)

Above is a helpful visualization of keeping an element that appears multiple times in a list in the same spot after sorting it. You'll notice the highlighted 5 specifically stays where it is post sort, despite 5 appearing in the list a second time. 

