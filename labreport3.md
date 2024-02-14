# **LR3 | Bugs and Commands**

By Ren Sano

# `Part 1 : Bugs` 
--- 
**Original Code**
> In this test, the original `reverseInPlace` method implementation intends to take the `int[] arr` and return it in its reverse order of values witin the array.
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
* This test case can't verify the functionality of this method very well, as it only reverses one `int` value within the array and passes. Therefore the test case would only assume that one `int` value to be returned without knowing if it was ever reversed.

**Effective Test**
```
@Test
  public void REALtestReverseInPlace() {
    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2); Expected [1] but was [3]
  }
```
* Based off of the intended logic of the original code for the method `reverseInPlace`, it's evident that the implementation was incorrect, as the intentional positions of the `int` array was not the outcome when the method was called. //check symptoms

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
* The problem with the initial implementation of the `reverseInPlace` method is lies in the way elements are swapped. Instead of properly reversing the array, the code is assigning each element to its mirrored position from the end of the `int[] arr`. Because of this, the code overwrites all elements with the last one.
* To fix this code, you need to swap elements from the beginning and end of the array. By altering the `for-loop` to go from the middle of the array, we can apply the end value of the array, which is 3, and append it to the start.

# `Part 2 : Researching Commands` 
--- 
* I chose to research more about the `grep` command

> grep -w (PATTERN) (path) (Source: Inputting `man grep` into the command Terminal)

`rnesn@rahrahren MINGW64 ~/OneDrive/Desktop/kolehiyo/CSE/CSE15L/LABWEEK5/docsearch/technical (main)
$ grep -w "2005" */*.txt
911report/chapter-12.txt:  end of 2005. Many of the act's provisions are relatively noncontroversial, updating
911report/chapter-13.5.txt:  and State Appropriations Act for Fiscal Year 2005, passed by the House of
911report/chapter-3.txt: "maximum feasible capacity" in counterterrorism by 2005. Field executives told
plos/journal.pbio.0020028.txt:  to have a human clinical trial in progress in 2005. “Without a doubt, there will be an
plos/journal.pbio.0020161.txt: of Britain's national research councils (currently, just over £2 billion from its 2004–2005
plos/journal.pbio.0030056.txt: So at the start of 2005, as aDNA research enters its 21st year, the discipline is, perhaps,
plos/pmed.0020016.txt:  billion for the fight against HIV/AIDS in 2005 [2]. In 2002, on the occasion of the 14th
plos/pmed.0020016.txt:  in most urgent need—by the end of 2005. The potential epidemiologic impact of large-scale
plos/pmed.0020016.txt:  treatment by the end of 2005 is attained, and scale-up continues to reach 80% ART
plos/pmed.0020023.txt:  this amount is less than half of what is required by 2005, and only a quarter of what will
plos/pmed.0020023.txt:        antiretroviral therapy by the end of 2005 (the “3 by 5” objective) provides a yardstick for
plos/pmed.0020039.txt:  In their study in the January 2005 issue of 
plos/pmed.0020061.txt:  tests for the high-production-volume chemicals by 2005
plos/pmed.0020067.txt:  place in 2005. The
plos/pmed.0020158.txt:  publishing in June 2005; 
plos/pmed.0020158.txt:  PLoS Genetics (www.plosgenetics.org), scheduled for July 2005; and
plos/pmed.0020158.txt:  PLoS Pathogens (www.plospathogens.org), scheduled for September 2005.
plos/pmed.0020160.txt:  2005 as an international treaty aimed at controlling tobacco packaging, marketing, and use
plos/pmed.0020208.txt:  On May 15, 2005, the Public Library of Science and the Government Accountability
plos/pmed.0020209.txt:  be unduly influenced by industry, on May 15, 2005, I brought together five whistleblowers
plos/pmed.0020210.txt:  This prediction was already borne out at the April 2005 meeting, “Drug Development for
plos/pmed.0020216.txt:  Nepal are HIV-1, although HIV-2 was also recently reported [6]. As of February 2005, the
plos/pmed.0020278.txt:  The only people who don't know in 2005 that animal research is irrelevant for human
plos/pmed.0020281.txt:  D.C., on May 15th, 2005, at the invitation and support of the Public Library of Science and
plos/pmed.0020281.txt:  2005): “To leave the world a bit better, whether by a healthy child, a garden patch or a`

> grep -i (PATTERN) (path) (Source: Inputting `man grep` into the command Terminal)
`rnesn@rahrahren MINGW64 ~/OneDrive/Desktop/kolehiyo/CSE/CSE15L/LABWEEK5/docsearch/technical (main)
$ grep -i "saving" 911report/*.txt
911report/chapter-12.txt:    damage and saving lives.
911report/chapter-13.5.txt:   responded to the North Tower, where he was instrumental in saving many lives after
911report/chapter-3.txt:   Taliban, who seemed "to be looking for a face-saving way out of the Bin Ladin`

> grep -n (NUM) (path) (Source: Inputting `man grep` into the command Terminal)
`rnesn@rahrahren MINGW64 ~/OneDrive/Desktop/kolehiyo/CSE/CSE15L/LABWEEK5/docsearch/technical (main)
$ grep -n 'disease' government/Alcohol_Problems/*.txt
government/Alcohol_Problems/Session2-PDF.txt:46:disease develops. WHO defines hazardous drinking as 4 or more
government/Alcohol_Problems/Session3-PDF.txt:56:medical conditions such as liver disease or pancreatitis.
government/Alcohol_Problems/Session3-PDF.txt:358:statement "alcoholism is a treat-able disease" received a mean
government/Alcohol_Problems/Session3-PDF.txt:364:abuse/dependence is a "treatable disease," but more than 90%
government/Alcohol_Problems/Session3-PDF.txt:541:fatal disease."52 More recently, the Substance Abuse Task Force
government/Alcohol_Problems/Session3-PDF.txt:695:37. Miller WR. Alcoholism: toward a better disease model.
government/Alcohol_Problems/Session3-PDF.txt:1131:2000. National promotion and disease prevention objectives.
government/Alcohol_Problems/Session4-PDF.txt:706:of depression: effective disease management strategies to decrease
government/Alcohol_Problems/Session4-PDF.txt:874:risk factor for particular injuries or disease. In 1998, Academic
government/Alcohol_Problems/Session4-PDF.txt:931:need to be clear about the disease processes that we are interested
government/Alcohol_Problems/Session4-PDF.txt:1018:extent that they cover treatment for other diseases. There is no
government/Alcohol_Problems/Session4-PDF.txt:1031:receive necessary treatment for their disease. Instead, there is`

> grep -m
`rnesn@rahrahren MINGW64 ~/OneDrive/Desktop/kolehiyo/CSE/CSE15L/LABWEEK5/docsearch/technical (main)
$ grep -m 1 '2005' */*.txt
911report/chapter-12.txt: end of 2005. Many of the act's provisions are relatively noncontroversial, updating`
