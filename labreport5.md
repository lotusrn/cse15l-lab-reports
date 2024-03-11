# **LR5 | Putting it All Together**

By Ren Sano

# `Debugging Scenario` 

- In this scenario, we are debugging the ChatServer from Week 2

> ## Lab Report 2 User and Message Bug
> 
> **Anonymous Badger**
> 
> Hello! I'm working on the code for Lab Report 2, but it seems my code implementation for dividing the `User` and `Message` is wrong. Whenever I try to add a message using the `add-message?s=<MESSAGE>&user=<NAME>` endpoint, it only returns the message. Below is a screenshot of the output when I try to add a message.
> 
> ![Image](images/debug_output.png)

---
# 1 ANSWER

> **Silly TA**
> 
> Hi there,
>
> Looking at the photo, you might've misunderstood on how to separate the `<user>` and `<message>` inputs when coding the URL parameters. We might need more information about your code to help out with the issue, but please first try understanding what inputs are being properly retrieved by printing them out, then work from there on what arguments might've been parsed incorrectly. Any screenshots or copy/pastes of the terminal will be extremely helpful.

> **Anonymous Badger**
>
> Yes of course. Here's my updated URL Path code and what happens when I try to print out the user and message by itself.
> 
> ![Image](images/bugged_code.png)
> ![Image](images/bugged_output.png)
> 
> I'm still lost on what number arguement I'm supposed to retrieve once I split the use and message.
---
> **Silly TA**
>
> Thank you for providing the updated code. You're on the right track when parsing the `s=` and `user=` parameters, but let's take a closer look on what values you're taking.
> 
> When splitting the URL parameters using `String[] parameters = url.getQuery().split("&");`, each parameter should be split into key-value pairs separated by the equals sign (=). For example, for the URL `add-message?s=Hello!&user=ren`, the array parameters would contain two elements: `s=Hello!` and `user=ren`.
> 
> Next, when splitting each parameter further using `String[] value = parameter.split("=");`, the resulting array value would contain two elements: the key (e.g., s or user) and the corresponding value.
> 
> In your code, you correctly identify the value associated with the key `user` using `value[0].equals("user")`, which retrieves the user input. However, there's an issue with how you're retrieving the message input.
>
> In the line `msg = value[1];`, you're attempting to retrieve the message input. However, since the message parameter key is `s`, you should be checking for `s` instead of `user` in the conditional statement. Look carefully on what value arguments need ot be changed to retrieve the `s`. Let me know if you have any mroe questions!


# `Reflection`

> This course has taught me the most about the application of coding in the real world, as well as very easy introductions about specific coding concepts that I look forward into seeing if I ever end up in that field. The use of BASH shortcuts, JDB, and VIM have been crucial for me to understand and grasp a sense of muscle memory to utilize, and I realized how useful it could be so efficient when we practiced with large data bases like Blue Sky. During lab, it was really useful to spend time with other peers and yourself to take time to practice.

In a couple of sentences, describe something you learned from your lab experience in the second half of this quarter that you didn't know before. It could be a technical topic we addressed specifically, something cool you found out on your own building on labs, something you learned from a tutor or classmate, and so on. It doesn't have to be specifically related to a lab writeup, we just want to hear about cool things you learned!
