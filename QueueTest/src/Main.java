import java.util.LinkedList;
import java.util.Queue;

class Message{
    public String command;
    public String to;

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }
}

public class Main {
    public static void main(String[] args) {

        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("sendMail", "홍길동"));
        Message m2 = new Message("sendSMS", "이순신");
        queue.offer(m2);
        queue.offer(new Message("sendKakaotalk", "홍두께"));

//        for(Message m : queue)

        while(!queue.isEmpty()){
            Message message = queue.poll();
            switch(message.command){
                case "sendMail":
                    System.out.println(message.to + "에게 메일 보내기");
                    break;
                case "sendSMS":
                    System.out.println(message.to+"에게 SMS 보내기");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to+"에게 카톡 보내기");
                    break;
                default :
                    break;
            }
        }

    }
}