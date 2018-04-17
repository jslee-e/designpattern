public class Talk
{

    public Talk()
    {
    }

    public void sendMessage(User user, Message message)
    {
        System.out.println("분류 : "+ user.getUserType());
        System.out.println("아이디 : "+ user.getId());
        System.out.println("텍스트 : "+ message.getText());
        System.out.println("이미지 : "+ message.getImage());
        if("AGT".equals(user.getUserType()))
        {
            System.out.println("KB : " + message.getKB());
        }
        else
        {
            System.out.println("고객은 지식을 사용할 수 없습니다.");
        }
    }
}
