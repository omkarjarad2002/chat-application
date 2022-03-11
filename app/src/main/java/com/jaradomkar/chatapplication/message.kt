package com.jaradomkar.chatapplication

import android.content.IntentSender

class message {
    var message: String? = null
    var senderId: String? = null

    constructor(){}

    constructor(message: String?, senderId: String?){
        this.message = message
        this.senderId= senderId
    }
}