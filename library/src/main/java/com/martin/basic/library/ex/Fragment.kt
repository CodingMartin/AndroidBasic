package com.martin.basic.library.ex

import android.app.Activity
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import com.martin.basic.library.R
import com.martin.basic.library.util.PageRouter

/**
 * Created by Martin on 2017/8/6.
 * Hello World
 */

/**V4包下的Fragment*/
fun Fragment.fragment(fragment: Fragment, @IdRes contentId: Int = R.id.fragment_content, tag: String = fragment.tag) {
    PageRouter.addFragment(this, fragment, contentId, tag)
}

fun Fragment.routerTo(clazz: Class<out Activity>) {
    PageRouter.toActivity(this, clazz)
}