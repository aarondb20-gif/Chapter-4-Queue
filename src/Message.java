public class Message {
    private String messageId;
    private String payload;
    private int retryCount;

    public Message(String messageId, String payload, int retryCount){
        this.messageId = messageId;
        this.payload = payload;
        this.retryCount = retryCount;

    }
    @Override
    public String toString(){

        return "Message: " + messageId + payload + retryCount;
    }

}
