package com.pencilbox.netknight.presentor;

import com.pencilbox.netknight.view.IGraspBagView;
/**
 * Created by tang on 2016/6/28.
 */
public class IGraspBagImpl implements IGraspBagPresenter {

    private IGraspBagView mGraspBag;

    public IGraspBagImpl(IGraspBagView graspBag){


        mGraspBag = graspBag;
    }

    @Override
    public void startGraspingBag(long id) {

    }

    @Override
    public void stopGraspingBag(long id) {

    }

    @Override
    public void loadGraspGagData() {

        //执行相关操作
        //持续更新
    }
}