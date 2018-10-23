package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<NoticeLitsener> mNotices;

    public Observer() {
        mNotices = new ArrayList<>();
    }

    public void addNotices(NoticeLitsener noticeLitsener) {
        mNotices.add(noticeLitsener);
    }

    public void broadcastNotice(String message) {
        for (NoticeLitsener noticeLitsener : mNotices) {
            noticeLitsener.notification(message);
        }
    }
}
