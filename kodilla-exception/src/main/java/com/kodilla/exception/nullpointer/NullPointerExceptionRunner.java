package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "jak sie masz?");
        } catch (MessageNotSentException e) {
            System.out.println("Messege is not send");
        }
        System.out.println("Processing other logic");
    }
}
