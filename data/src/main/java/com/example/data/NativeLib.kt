package com.example.data

class NativeLib {

    /**
     * A native method that is implemented by the 'data' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'data' library on application startup.
        init {
            System.loadLibrary("data")
        }
    }
}