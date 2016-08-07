package com.jess.wideeyes.mvp.ui.common;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.mvp.BasePresenter;
import com.jess.wideeyes.app.WEApplication;
import com.jess.wideeyes.di.component.AppComponent;

/**
 * Created by jess on 8/5/16 14:11
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEFragment<P extends BasePresenter> extends BaseFragment<P> {
    protected WEApplication mWeApplication;
    @Override
    protected void ComponentInject() {
        mWeApplication = (WEApplication)mActivity.getApplication();
        setupFragmentComponent(mWeApplication.getAppComponent());
    }

    protected abstract void setupFragmentComponent(AppComponent appComponent);
}
