package com.mabud;

public class NotificationService {
    private MessageSender sender;

    NotificationService(MessageSender sender){
        this.sender=sender;
    }
    public String notify(String message){
        return sender.send(message);
    }
}
