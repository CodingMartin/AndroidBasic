/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.martin.basic.library.app

/**
 * Created by 44269 on 2017/10/9.
 * Hello World
 */
abstract class AppMvpActivity<out VM : IViewModel> : AppMobileActivity(), IView {
    private lateinit var mViewModel: VM
    override fun afterBindContentView() {
        super.afterBindContentView()
        mViewModel = bindViewModel()
        mViewModel.onAttach()
    }

    abstract fun bindViewModel(): VM


    override fun onDestroy() {
        mViewModel.onDeAttach()
        super.onDestroy()
    }
}