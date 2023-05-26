# Distribution of Appliances

## Task

You are the sales manager of a home appliance distribution company. 
The finished products slide down a belt to be shipped as explained 
below. As they arrive, they must organize themselves into groups, 
one group for each store. The products that go to the same store must 
be stacked in the order in which they arrive, for their subsequent 
distribution.


Household appliances must be distributed in the following order: first, 
the products for store 1 are stacked up to complete the order number of 
this store; then, the electrical appliances that go to store 2 must be 
stacked, until completing the order number of said store; in this way, 
the product organization process must continue, store by store, until the 
orders are completed.


A program must be developed that reads through the console the order in which 
the different electrical appliances arrive and the number of them that must be 
sent to each one of the stores; then organize the groups of electrical appliances 
for each store and print how each of the batteries turned out.

## Constraints

- 1 <= N <= 10^3
- 1 <= M <= 10^3

## Input Format

The first line must contain an integer C, which represents the number of "cases" 
that are processed in a single run. That is, the number of times that, as a manager, 
you must distribute your production band among a given number of stores (Note: Each 
case works separately, if there are leftover appliances in an iteration, they are 
thrown away or donated to charity).


The next line must contain an integer N, which represents the number of appliances 
that must be distributed among the stores;


In the next line, N character strings (strings) must be read, which represent the 
names of all the products that must be processed; the first string in this input 
line represents the product located in the first part of the production line (and 
therefore should be the first to process) and the last string the product that is 
in the back of the belt (and therefore should be the last to process). For your 
implementation use a queue.


The next line should read an integer T, indicating the number of stores to which 
the products should be shipped;


Then follows a line with T integers (T_{1}, T_{2}, ... T_{x}...) which represent 
the number of products that must be shipped to each of the T stores, separated by 
a space as shown: T_{1} is the number of products to ship to store 1, T_{2} the 
number of products to ship to store 2, and so on.


Very important: In the event that a stack of products in a certain store is empty, 
"[]" must be printed (without the quotes).


1 <= C <= 10^{3}

1 <= N <= 10^{6}

1 <= T <= 10^{6}

1 <= T_{i} <= 10^{6}

## Output Format

The output should consist of L lines like this:


the first line, L 1 , contains the items from the product backlog to 
send to store 1;

the second line, L 2 , contains the items of the product stack to 
be sent to store 2;

the ith line, L_{ith}, contains the items of the product backlog to 
send to the ith store.

## Sample Input

### Sample Input 1
```java {.highlight .highlight-source-java .bg-black}
2
11
Licuadora1 Lavaplatos1 Sanduchera1 Tostadora1 Tostadora2 Ducha1 Lavaplatos2 Secadora1 Sanduchera2 Secadora2 Licuadora2
3
3 2 4
5
Lavaplatos1 Sanduchera2 Licuadora2 Tostadora2 Sanduchera2
3
2 3 2
```

## Sample Output

### Sample Output 1
```java {.highlight .highlight-source-java .bg-black}
[Licuadora1 Lavaplatos1 Sanduchera1]
[Tostadora1 Tostadora2]
[Ducha1 Lavaplatos2 Secadora1 Sanduchera2]
[Lavaplatos1 Sanduchera2]
[Licuadora2 Tostadora2 Sanduchera2]
[]
```