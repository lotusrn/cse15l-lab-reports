import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
   private ArrayList<String> messages = new ArrayList<>();

    public String handleRequest(URI url) {
        String user = "";
        String msg = "";

        if (url.getPath().equals("/")) {
            return "Recent Messages : " + messages;
        } else {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("&");
            
            for (String parameter : parameters) {
                String[] value = parameter.split("=");
                if (value.length == 2){
                    if (parameters[0].equals("s")) {  
                        msg = value[1];
                    } else if (value[0].equals("user")){
                        user = value[1];
                    }
                    String newMessage = String.format("%s: %s", user, msg);
                    messages.add(newMessage);
                    return String.join("\n", messages);
                }
                
            }
          }
        } return "404 Not Found!";
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
