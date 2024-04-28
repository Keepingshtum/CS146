## Making pull requests that will actually get you extra credit

When making your pull request, you should keep a few things in mind: 

1. Ensure someone else hasn't already created a duplicate pull request. You're better off saving yourself the hassle, and protecting yourself from other people stealing your ideas to create issues!

2. If you are creating new files for a Homework/Lab that isn't already on the repo, you MUST attach the problem statement that originally appeared on the Canvas Course. Yes, I'm too lazy to do it myself.

3. Ensure that you follow the naming conventions and file structure setup you see on the repository. For example, if you are submitting a Java solution for HW2, You need to create a HW2 folder under the HW folder, and then put your Java Solution there.

4. Ensure your Pull Request **title** follows the following convention: 

    {ASSIGNMENT CATEGORY}{ASSIGNMENT NAME+NUMBER} - {DESCRIPTIVE TITLE} - {YOUR NAME}  

So, if you're submitting the Java Implementation for HW1, your pull request title should look like:

[HW][HW1] - Java Bruteforce Solution - [Anant Shukla]

For an extra credit assignment, you could do something like 

[EC][Structuring Our Thoughts] - Java Bruteforce Solution - [Anant Shukla]

For a lab assignment, you could do something like 

[LABS][LAB1] - Java Bruteforce Solution - [Anant Shukla]

For notes, you could do something like 

[NOTES] - Structuring our thoughts lecture notes - [Anant Shukla]


If you do not follow these conventions, I probably won't look at your pull request, so do be careful!

### Making changes to existing files

As the Repo fills out, you probably want to shift focus to improving what we already have. Follow the same PR title conventions as above, but you want to leave a comment detailing the following:

1.> What the current version of the file does

2.> Why that is a problem

3.> How your change will fix this problem. 


Here's an example of a comment you should be leaving on a PR changing the Lab 1 Bruteforce solution:

[Start of comment]

1.> What the current version of the file does

Finds a solution in O(n^2) time, but does not have comments explaining what is going on. 

2.> Why that is a problem

The code is currently quite difficult to follow without comments. 

3.> How your change will fix this problem. 

I've added comments to help make the code a little bit easier to read. 

[End of comment]
