package com.company;

public class DeskSenderStart {
    public static void main(String[] args) {
        System.out.println("Сервер встал");
        DeskSender deskSender = new DeskSender();
        try {
            deskSender.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
