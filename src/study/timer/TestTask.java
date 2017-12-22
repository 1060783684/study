package study.timer;

import study.timer.task.PopTask;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by root on 17-12-22.
 */
public class TestTask {
    public static void main(String[] args){
        //===============================     TimerTask cancel例子   ========================================================//
        Timer testTimer = new Timer();
        TimerTask task = new PopTask("006");

        testTimer.schedule(task,1*1000,3*1000);

        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
        * 调用后会从Timer的队列中被删除
        */
        task.cancel();
    }
}
