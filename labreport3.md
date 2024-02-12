# **LR3 | Bugs and Commands**

By Ren Sano

# `Part 1` 
--- 
**Bugged Code**
> In this test, the original `reverseInPlace` method implementation passes in this test as there's only one value that's expected to be reversed.
```
@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
```
* This test case can't verify the functionality of this method very well, as it only reverses one value within the array, therefore the test case would only assume that one value to be returned.
  
```
@Test
  public void REALtestReverseInPlace() {
    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2); Expected [1] but was [3]
  }
```
* Based off of the intended logic of the method `reverseInPlace`, it's evident that the coding of this method was implemented 
