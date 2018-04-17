public class Test{

    public static void main(String args[])
    {
        /*Ticket ticket1 = new Ticket("customer1","account1","20180416180000","하이","0");
        Ticket ticket2 = new Ticket("account1","customer1","20180416180000","안녕","1");

        Talk talk = new Talk();
        talk.sendMessage(ticket1);
        talk.sendMessage(ticket2);*/
        User agent = new User("agent1","AGT");
        User client = new User("client1","CLI");


        Message m1 = new Message("텍스트 메시지입니다.","이미지입니다.","지식입니다.");
        Message m2 = new Message("텍스트 메시지입니다2.","이미지입니다2.","지식입니다2.");
        Message m3 = new Message("텍스트 메시지입니다3.","이미지입니다3.","지식입니다3.");
        Message m4 = new Message("텍스트 메시지입니다4.","이미지입니다4.","지식입니다4.");

        Talk talk = new Talk();
        talk.sendMessage(agent, m1);
        talk.sendMessage(client, m2);
        talk.sendMessage(agent, m3);
        talk.sendMessage(client, m4);

    }
}
