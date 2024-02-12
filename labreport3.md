# **LR3 | Bugs and Commands**

By Ren Sano

# `Part 1` 
--- 
**Bugged Code**
> In this test, the original `reverseInPlace` method implementation intends to take an array and return it in its reverse order of values.
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
}
```

**Faulty Test**
```
@Test 
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
  }
```
* This test case can't verify the functionality of this method very well, as it only reverses one value within the array, therefore the test case would only assume that one value to be returned.

**Effective Test**
```
@Test
  public void REALtestReverseInPlace() {
    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2); Expected [1] but was [3]
  }
```
* Based off of the intended logic of the method `reverseInPlace`, it's evident that the coding of this method was implemented wrong, as the intentional positions of the array was not the outcome when the method was called. //check symptoms

**FIXED CODE**
```
static void reverseInPlace(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
         int temp = arr[i];
         arr[i] = arr[arr.length - i - 1];
         arr[arr.length - i - 1] = temp;
    }
}
```
* The problem with the initial implementation of the `reverseInPlace` method is lies in the way elements are swapped. Instead of properly reversing the array, the code is assigning each element to its mirrored position from the end of the array. Because of this, the code overwrites all elements with the last one.
* To fix this code, you need to swap elements from the beginning and end of the array. By altering the `for` loop to go from the middle of the array, we can apply the end values of the array to the start.

# `Part 2` 
--- 
* Online, find 4 interesting command-line options or alternate ways to use the command you chose.
