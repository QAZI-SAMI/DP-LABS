package Template;

public class Message {
    private String description;
    private MessageType messageType;
    private NetworkType networkType;

    public Message(String description, MessageType messageType, NetworkType networkType) {
        this.description = description;
        this.messageType = messageType;
        this.networkType = networkType;
    }

    public String getDescription() {
        return description;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public NetworkType getNetworkType() {
        return networkType;
    }
}