package jatx.kotlinclassoverwritingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import package1.Tester1
import package2.Tester2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tester1().test()
        Tester2().test()
    }
}
