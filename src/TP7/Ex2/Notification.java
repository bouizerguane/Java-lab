package TP7.Ex2;

public interface Notification {
    void send(String recipient, String message);
    int getPriority();      // 0 = basse, 1 = normale, 2 = haute
    String getType();
}
