package cn.golfd.mvpframe.presenter.listener;

/**
 * Created by LiangXu on 2017-09-11.
 */

public interface OnGetTextListener {

    /**
     * 成功后的回调函数
     * @param string
     */
    void onGetTextSuccess(String string);

    /**
     * 失败后的回调函数
     * @param string
     */
    void onFetTextFail(String string);

}
