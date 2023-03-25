package ai.circlesecurity.sampleandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ai.circlesecurity.circleaccesslock.CircleAccessLock

class MainActivity : AppCompatActivity() {

    private lateinit var circleAccessLock: CircleAccessLock

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleAccessLock = CircleAccessLock(this)
        circleAccessLock.onCreate()
    }

}
