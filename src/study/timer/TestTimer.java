package study.timer;

import study.timer.task.PopTask;

import java.util.Date;
import java.util.Timer;

/**
 * Created by root on 17-12-13.
 */
public class TestTimer {
    public static void main(String[] args) throws InterruptedException {
//================================        4个schedule方法例子     =========================================================//
        Timer testTimer1 = new Timer();
        /**
         * 在delay时间以后执行一次任务,以后每隔period时间执行一次任务
         *
         *参数1:TimeTask task 传入一个继承了TimerTask并实现了run方法的实例对象
         *参数2:long delay  第一次执行这个任务（Task）前延迟的时间
         *参数3:long period 以后每次执行此任务（Task）的与下一次执行此任务（Task）的间隔时间
         */
        testTimer1.schedule(new PopTask("001"),3*1000,5*1000);

        Timer testTimer2 = new Timer();
        /**
         * 在delay时间以后执行一次任务,只执行一次
         *
         *参数1:TimeTask task 传入一个继承了TimerTask并实现了run方法的实例对象
         *参数2:long delay  第一次执行这个任务（Task）前延迟的时间
         */
        testTimer2.schedule(new PopTask("002"),3*1000);

        Timer testTimer3 = new Timer();
        /**
         * 在日期达到Date时开始执行此任务,以后每隔period时间执行一次任务
         *
         *参数1:TimeTask task 传入一个继承了TimerTask并实现了run方法的实例对象
         *参数2:Date firstTime  第一次执行这个任务（Task）日期
         *参数3:long period 以后每次执行此任务（Task）的与下一次执行此任务（Task）的间隔时间
         */
        testTimer3.schedule(new PopTask("003"),new Date(new Date().getTime()+5000),6*1000);

        Timer testTimer4 = new Timer();
        /**
         * 在日期达到Date时开始执行此任务,只执行一次
         *
         *参数1:TimeTask task 传入一个继承了TimerTask并实现了run方法的实例对象
         *参数2:Date firstTime  第一次执行这个任务（Task）日期
         */
        testTimer4.schedule(new PopTask("004"),new Date(new Date().getTime()+5000));

//===============================     cancel方法例子      ==========================================================//
        //向testTimer1的任务队列中添加一个新任务,这时testTimer1有两个任务
        testTimer1.schedule(new PopTask("005"),4*1000,6*1000);
        //在20秒后关闭testTimer1
        Thread.sleep(20*1000);

        //关闭Timer
        testTimer1.cancel();
    }
}
