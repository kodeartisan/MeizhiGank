package me.chkfung.meizhigank.Base;

import android.content.Context;

/**
 * Created by Fung on 26/07/2016.
 */

public interface BaseContract {
    interface Presenter {

        /**
         * Detach View to prevent Memory Leak
         * Call it in onDestroy of all Activity
         */
        void detachView();

    }

    interface View {

        Context getContext();

    }


}
