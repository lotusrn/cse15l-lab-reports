# **LR2 | Servers and SSH Keys**

By Ren Sano

# `Part 1` 
---
**Chat Server Code :**

```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
   private ArrayList<String> messages = new ArrayList<>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.join("\n", messages); // joins lines
        } else {
        if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("&"); //splits msg&user
            String user = "";
            String msg = "";
            for (String parameter : parameters) {
                String[] text = parameter.split("="); // takes msg&user string
                if (text.length == 2) {
                    if (text[0].equals("s")) {
                        msg = text[1];
                    } else if (text[0].equals("user")) {
                        user = text[1];
                    }
                }
            }
            if (!user.isEmpty() && !msg.isEmpty()) { 
                String newMessage = String.format("%s: %s", user, msg);
                messages.add(newMessage);
                return "Message Added!";
            } else {
                return "Invalid request format!"; // invalid arg
            }
        } else {
            return "404 Not Found!"; // what r u tryna do bruv
        }
      }
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        ServerEngine.start(port, new Handler());
    }
}        
```

**Utilizing /add-message**
---

* In this example, the `handleRequest` and `main` methods are being called as the input that's taken is from the server url being changed by the user and the main method requests this input and returns with one of the returns from the code.  //methods as in the split and query stuff?
* The relevant arguments for these methods is the `URI` class, which takes HTTP requests. This then goes through a series of code that identifies the 's' and 'user' queries to take the user's arguments of their name and message and put it into one organized message in the format of `<user>: <message>`.
* The values of these fields change when a new user input passes and isn't thrown. The `handleRequest` method extracts the string inputs within the . When successful it will input this data into the Strings, `user` and `msg`. and displays this to the user when simply calling '/' at the end of the server url, and also adds onto the 'messages' list to display previously sent messages
