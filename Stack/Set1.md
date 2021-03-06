###1

Find missing parenthesis in a given expression – 2 * ( 3 + 5(sasdfasdfasd)

**hints**
* split string into an array
* use stack to pop out elements
* save "(" and ")" into two arrays: left and right;
* compare the length of these two arrays to decide the missing parenthesis


Solutions:

##### My Solution O(n)

O(n)

```javascript

String.prototype.missParenth = function() {
  var left = [];
  var right = [];
  for(var i = 0; i < this.length; i++) {
    if(this.charAt(i) === '(') {
      left.push(this.charAt(i));
    }  

    if(this.charAt(i) === ')') {
      right.push(this.charAt(i));
    }
  }  

  if (left.length === right.length) {
    return 'no missing parenthesis';
  }

  if (left.length > right.length) {
    return 'missing right parenthesis )';
  }

  if (left.length < right.length) {
    return 'missing left parenthesis ( '
  }
}

'-2*(3+5(sasdfasdfasd)'.missParenth();


```

#### Another Solution2 O(n)
> using stack structure

**hints**
 * **stack structure**
 * loop through the string
   * '(' push to stack
   * if ')' pop stack


```javascript
String.prototype.missParenth = function() {
  var stack = [];
  var ele;
  for (var i = 0; i < this.length; i++) {
    if (this.charAt(i) === '(') {
      stack.push(i);
    }
    if (this.charAt(i) === ')') {
      ele = stack.pop();
      if (!ele) {
        return 'missing open parenthesis';
      }
    }
  }
  if (stack.length > 0) {
    return 'missing close parenthesis';
  } else {
    return 'parenthesis is not missing';
  }
};
```


2. Evaluate an expression given only single digits and only 2 operators * and +.

#### Solution O(n)
>using stack

**hints**
* save value to stack structure
* if is multiple sign, pop out element multiply next element
* save the value into stack
* add up all the value in the stack

```
2*3+1

2+3*1
```
```javascript
String.prototype.evaluate = function() {
  // initialize variables
  var stack  = [];
  var sum = 0;

  // core code
  for (var i = 0; i < this.length; i++) {

    if (parseInt(this.charAt(i))) {
      stack.push(parseInt(this.charAt(i)));
    }

    if (this.charAt(i) === '*') {
      stack.push(stack.pop() * this.charAt(i + 1));
      i = i + 1;
    }
  }

  while (stack.length) {
    sum += stack.pop();
  }
  return sum;
};

'2*3+4'.evaluate();
```

3. Reverse a stack and put the reversed value back in the same stack. You can use only one other stack and a temp variable.

4. Given a set of time intervals in any order, merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.
 Let the intervals be represented as pairs of integers for simplicity.
For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }. The intervals {1,3} and {2,4} overlap with each other, so they should be merged and become {1, 4}.
 Similarly {5, 7} and {6, 8} should be merged and become {5, 8}

5. Given two expressions in the form of strings. The task is to compare them and check if they are similar. Expressions consist of lowercase alphabets, ‘+’, ‘-‘ and ‘( )’.

Examples:

Input  : exp1 = "-(a+b+c)"
         exp2 = "-a-b-c"
Output : Yes

Input  : exp1 = "-(c+b+a)"
         exp2 = "-c-b-a"
Output : Yes

Input  : exp1 = "a-b-(c-d)"
         exp2 = "a-b-c-d"
Output : No

It may be assumed that there are at most 26 operands from ‘a’ to ‘z’ and every operand appears only once.

6. Given a stack of integers, write a function pairWiseConsecutive() that checks whether numbers in the stack are pairwise consecutive or not.
 The pairs can be increasing or decreasing, and if the stack has an odd number of elements, the element at the top is left out of a pair.
  The function should retain the original stack content.

Only following standard operations are allowed on stack.

    push(X): Enter a element X on top of stack.
    pop(): Removes top element of the stack.
    empty(): To check if stack is empty.

    Examples:

    Input : stack = [4, 5, -2, -3, 11, 10, 5, 6, 20]
    Output : Yes
    Each of the pairs (4, 5), (-2, -3), (11, 10) and
    (5, 6) consists of consecutive numbers.

    Input : stack = [4, 6, 6, 7, 4, 3]
    Output : No
    (4, 6) are not consecutive.

