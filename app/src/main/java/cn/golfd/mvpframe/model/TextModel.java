package cn.golfd.mvpframe.model;


import cn.golfd.mvpframe.presenter.listener.OnGetTextListener;

/**
 * Created by LiangXu on 2017-09-11.
 */

public class TextModel {

    public void getText(final OnGetTextListener listener){
        /*
        在此执行网络请求，或者读取本地数据库文件
        此处只用线程阻塞模拟下网络请求
         */
        try {
            Thread.sleep(2000);
            listener.onGetTextSuccess("MVP入门框架搭建");
        }catch (InterruptedException  e){
            //出现异常，标示失败，调用失败的回调方法
            listener.onFetTextFail(e.getMessage());
        }
    }

}
