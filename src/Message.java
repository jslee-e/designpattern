public class Message
{
    String text;
    String image;
    String KB;

    public Message()
    {
    }

    public Message(String text, String image, String KB) {
        this.text = text;
        this.image = image;
        this.KB = KB;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKB() {
        return KB;
    }

    public void setKB(String KB) {
        this.KB = KB;
    }
}
