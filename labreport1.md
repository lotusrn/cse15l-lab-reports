# **LR1 | Remote Access and FileSystem**

By Ren Sano


# **Command With NO Arguments**

# `cd`

  ![Image](images/cdnoarg.png)
 > As we are currently working in the `/home/lecture1` directory, calling `cd` without any arguments *does not* run into an error, as it instead indicates that the user wants the terminal to change directories back `/home`, indicating in the terminal's brackets. returning back to `~`. 


# `ls`

 ![Image](images/noarg.png)
> By calling `ls` without any arguments *also* does not run into an error. Just like the `cd` commend with arguments, it informs the terminal to show what files are accessible on the current directory you're in, which this example we are being shown what accessible files and directories are in the working `/home` directory.


# `cat`

![Image](images/catnoarg.png)
> By calling `cat` in the terminal with no arguments, it waits for user input from the terminal as this command requires at least one or two inputs that are accessible within the working directory of `/home` in the command line to concatenate. By typing a message into the terminal and pressing enter, it will return and display that input instead. If done nothing, it will return nothing and be left blank, you can terminate this command by pressing `Ctrl+C` to back to normal.


# **Command With Path to a Directory**

# `cd`

  ![Image](images/direct.png)
> Calling `cd lecture1/` from the working directory of `/home`, changes the directory from `/home`, to `./lecture`, our argument input being `lecture1` for the command cd. This makes the absolute path of the new working directory as `/home/lecture1`.


# `ls`

 ![Image](images/lsdirect.png)
> This example we are working in the `/home` directory, and by calling `ls lecture1/messages` translates to the terminal taking the first part of the path by accessing the `./lecture1` directory, and then `./messages` directory. Then, the `ls` command then extracts the data within the `./messages` directory to access and display the files within that directory. Through this, we can still stay working in the `/home` directory but somehow access what information and files can be within the `messages` directory through the `/home/lecture1/messages` path and calling `ls`.


# `cat`

  ![Image](images/catdirect.png)
> By working in the `./lecture1` directory, we can utilize `messages/fl-ph.txt` as an input for the `cat` command to quickly access the `./messages` directory, and display the contents within the requested file, `fl-ph.txt`, onto the terminal. This let's us stay working in the `/home` directory but somehow access what information and files can be within the `./messages` directory through the `/home/lecture1/messages` path and calling `ls`.


# **Command With Path to a File**

# `cd`

  ![Image](images/cdpath.png)
> Working in the `./lecture1` directory, we try to call the `cd` command to access the `en-us.txt` file through the `./messages` directory by using `messages/en-us.txt` as the input arguement. This instead gives back an *error* due to the fact that the `cd` command only `changes` to `directories`, *not* text files such as `en-us.txt`.


# `ls`

  ![Image](images/lspath.png)
> Also working in the `./lecture1 directory`, we use the `ls` command with the argument of `messages/en-us.txt` to try and list any information about the file, `en-us.txt`. The command first accesses the `./messages` directory to get to the `en-us.txt`, then trying to extract any files and directories within this text file. Because of this, the terminal returns with the path the user inputted into the termial, `messages/en-us.txt`, as there are no files or directories within the
`en-us.txt` file.


# `cat`

  ![Image](images/catpath.png)
> Utilizing the `cat` command as we're working in the `/home` directory, inputting `lecture1/messages/fl-ph.txt` instructs the terminal to traverse through the `./lecture` and `./messages` directories and ultimately print the contents of the `fl-ph.txt` file onto the terminal. This ends with the output "Kamusta Mundo!" from the calling the path, `/home/lecutre1/messages/fl-ph.txt` to utilize the `cat` command.

