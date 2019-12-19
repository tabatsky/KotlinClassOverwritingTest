package package1

import android.util.Log

class Tester1 {
    fun test() = Log.e("tester1", ClassFromPackage1().giveModuleName())
}