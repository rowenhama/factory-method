import notifications.Notification;
import notifications.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification smsNotification = factory.createNotification("sms");
        smsNotification.notifyUser();

//        Notification emailNotification = factory.createNotification("EMAIL");
//        emailNotification.notifyUser();
//
        Notification pushNotification = factory.createNotification("pUsH");
        pushNotification.notifyUser();
    }
}