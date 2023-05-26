# Developer Selection

## Task

A prestigious company is looking for developers for a new project proposed 
during the last board of directors. N people applied for the vacancy, of which 
the company will only consider those who meet the minimum skills. These competencies 
are represented by non-zero positive integers. The company has a list of M 
competencies that its developers must meet. They may also consider developers 
with additional skills, as long as they meet the minimum required competencies. 
How many applicants meet the company's conditions?

## Constraints

- 1 <= N <= 10^3
- 1 <= M <= 10^3

## Input Format

The test case starts with a line with an integer M
that representing the number of skills required by the
company. The second line contains M numbers separated 
by spaces that list the qualities sought. Then follows 
a line with a number M representing the number of people 
who applied for the job. Finally, N lines follow, each one 
with numbers separated by spaces that represent the competences 
of each of the people.

## Output Format

It should be printed according to the description, that is, 
how many people meet the conditions of the company?

## Sample Input

### Sample Input 1
```java {.highlight .highlight-source-java .bg-black}
5
1 2 3 4 5
4
1 2 3 4 5 6
5 1
1 2 3 4
5 4 3 2 1
```

## Sample Output

### Sample Output 1
```java {.highlight .highlight-source-java .bg-black}
2
```