package com.zplesac.connectifty.interfaces;

import com.zplesac.connectifty.models.ConnectifyEvent;

/**
 * Created by Željko Plesac on 01/09/15.
 */
public interface ConnectivityChangeListener {

    void onConnectionChange(ConnectifyEvent event);
}
