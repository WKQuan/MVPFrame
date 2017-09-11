package cn.golfd.mvpframe.presenter;

import cn.golfd.mvpframe.model.TextModel;
import cn.golfd.mvpframe.presenter.listener.OnGetTextListener;

/**
 * Created by LiangXu on 2017-09-11.
 */

public class TextPresenter {

    private TextModel model;
    private OnGetTextListener listener;

    /*
    初始化实例，将view中的listener传递过来，方便回调函数获取数据
     */
    public TextPresenter (OnGetTextListener listener){
        model = new TextModel();
        this.listener = listener;
    }

    public void onGetText(){
        model.getText(listener);
    }

}
