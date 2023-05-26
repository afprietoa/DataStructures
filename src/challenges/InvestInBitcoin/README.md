# Bitcoin Investment

## Task

Juan is thinking of investing all his savings in Bitcoin, but first 
he wants to do a little stock market analysis with some historical 
data on the price of this cryptocurrency in dollars. For that it will 
take a list P of prices with each price p with 1 <= p <= 65000 of the 
last n days with 2 <= n <= 10000 and for each day P[n] it must be discovered 
how many days to wait to be able to buy at one price and then be able to 
sell at a higher price.

### Explanation about the first scenario
If you buy on the first day at $2,000, you only need to wait one day 
to sell at $2,500. If you buy the second day at $2,500, you have to wait 
2 days to be able to sell at a higher price of $3,000. If you buy on the 
third day at $2,542, you wait a single day to sell at $3,000. Finally, 
since there is no more data after day 4, it cannot be sold at a price higher 
than $3,000.

## Constraints

- 1 <= p <= 65000
- 2 <= n <= 10000

## Input Format

List of prices of the last n days separating each 
price with a space.

## Output Format

Days to wait to buy at a price and then be able to 
sell at a higher price, separating each price with a space.

## Sample Input

### Sample Input 1
```java {.highlight .highlight-source-java .bg-black}
2000 2500 2452 3000
```
### Sample Input 2
```java {.highlight .highlight-source-java .bg-black}
60000 35000 23452 50000
```

## Sample Output

### Sample Output 1
```java {.highlight .highlight-source-java .bg-black}
1 2 1 0
```
### Sample Output 2
```java {.highlight .highlight-source-java .bg-black}
0 2 1 0
```