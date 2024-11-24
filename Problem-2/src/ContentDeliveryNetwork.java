public class ContentDeliveryNetwork {
    public String uploadContent(String content) {
    
        String contentID = "content" + content.hashCode();
        System.out.println("Content uploaded: " + contentID);
        return contentID;
    }

    public void streamContent(String contentID) {
      
        System.out.println("Streaming content: " + contentID);
    }
}