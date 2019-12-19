package package2

import android.util.Log
import package1.ClassFromPackage1

class Tester2 {
    fun test() = Log.e("tester2", ClassFromPackage1().giveModuleName())
}