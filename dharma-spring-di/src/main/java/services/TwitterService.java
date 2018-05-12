package services;

public class TwitterService implements Service {

    public boolean send(String msg, String rec) {
        System.out.println("Twitter message Sent to " + rec + " with Message=" + msg);
        return true;
    }

}