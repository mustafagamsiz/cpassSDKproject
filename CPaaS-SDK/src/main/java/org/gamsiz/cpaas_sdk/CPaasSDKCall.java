package org.gamsiz.cpaas_sdk;

import android.util.Log;

import org.gamsiz.webrtc.WebRTCCall;

/**
 * Created by mgamsiz on 05/03/2018.
 */

public class CPaasSDKCall {

    private WebRTCCall webRTCCall;

    public CPaasSDKCall() {
        this.webRTCCall = new WebRTCCall();
    }

    public void establishCall() {
        webRTCCall.establishCall();
        Log.i("CPaasSDKCall v1", "CPaasSDKCall-v1 established");
    }

    public void endCall() {
        webRTCCall.endCall();
        Log.i("CPaasSDKCall v1", "CPaasSDKCall-v1 established");
    }

}
