package study.timer.task;

import java.util.TimerTask;

/**
 * Created by root on 17-12-13.
 */
public class PopTask extends TimerTask {
    private String id;

    public PopTask(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("POP id : " + id + " POP !!!");
    }
}
