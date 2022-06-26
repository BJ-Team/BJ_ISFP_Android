package com.example.domain

class NativeLib {

    /**
     * A native method that is implemented by the 'domain' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'domain' library on application startup.
        init {
            System.loadLibrary("domain")
        }
    }
}