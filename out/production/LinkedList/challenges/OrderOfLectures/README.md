# Order of Lectures

## Task

A professor of data structures must organize the presentations of his students 
on the topics that they will see in the course. Download the list of students 
and assign the dates in the order as they appear on the list, but the student 
with the last name Cárdenas complained that his classmate with the last name 
Valencia had the exhibition until the end of the semester, while he had it within 
2 days. To avoid arguments, the teacher proposes a different mechanism for assigning 
the presentations: he will take the first on the list, then the last, then the second, 
then the penultimate, and so on until all students have a topic for the presentation. 
This semester, due to over subscriptions, the number of students n is in the range 2<=n<=10000. 
His mission is to obtain the list that has the order in which the students are going 
to present, given the original list of the class. For that he will receive an array 
of last names of the class that is in alphabetical order and must store it in a 
chained list. The process of getting the new submission list must also be done on 
a chained list.

## Constraints

- 2<=n<=10000

## Input Format

Original surname list. Each last name is separated by a space.

## Output Format

New surname list. Each last name is separated by a space.

## Sample Input

### Sample Input 1
```java {.highlight .highlight-source-java .bg-black}
Avila Bermudez Cardenas Ramos Rodriguez Valencia
```
### Sample Input 2
```java {.highlight .highlight-source-java .bg-black}
Bermudez Valencia
```

## Sample Output

### Sample Output 1
```java {.highlight .highlight-source-java .bg-black}
Avila Valencia Bermudez Rodriguez Cardenas Ramos
```
### Sample Output 2
```java {.highlight .highlight-source-java .bg-black}
Bermudez Valencia
```
