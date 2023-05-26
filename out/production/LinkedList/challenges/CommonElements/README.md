# Common Elements

## Task

Given the elements two different chained lists with the same length n 
where 2<=n<=10000. Both lists must be traversed at the same time: the first
list is traversed from left to right and the second from right to left.
If in some iteration two elements of both lists are found to be the same,
then that element must be removed from both lists. Finally, the elements
that remained in each list must be printed.

## Constraints

 - Length n of each list: 2<=n<=10000
 - Each element of the lists is between 0 and 9

## Input Format

Elements of the two chained lists separated by spaces. Elements in the
first list are separated from elements in the second list by a line break.

## Output Format

Result elements of the first list (separated by spaces) followed by a newline,
and then the elements of the second list (separated by spaces).

## Sample Input

### Sample Input 1
```java {.highlight .highlight-source-java .bg-black}
6 1 3 9 2 7
1 2 4 3 1 6
```
### Sample Input 2
```java {.highlight .highlight-source-java .bg-black}
1 2 3
4 5 6
```

## Sample Output

### Sample Output 1
```java {.highlight .highlight-source-java .bg-black}
9 7
1 4
```

### Sample Output 2
```java {.highlight .highlight-source-java .bg-black}
1 2 3
4 5 6
```