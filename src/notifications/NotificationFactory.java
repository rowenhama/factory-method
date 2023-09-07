package notifications;

public class NotificationFactory {
    public Notification createNotification(String channel) {  //our factory method
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}
