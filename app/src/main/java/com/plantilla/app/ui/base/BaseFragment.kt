package com.plantilla.app.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.navigation.NavArgs
import androidx.viewbinding.ViewBinding




abstract class BaseFragment<Binding: ViewBinding, NavArg: NavArgs>(@LayoutRes private val layoutResId: Int): Fragment() {

    lateinit var binding: Binding
    var args: NavArg? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = onCreateBinding(inflater.inflate(layoutResId, container, false))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            args = argsFromBundle(it)
        }
        binding.initialize()
        setupFragment()
    }

    open fun argsFromBundle(args: Bundle): NavArg? = null

    abstract fun onCreateBinding(view: View): Binding

    open fun setupFragment() {}

    open fun Binding.initialize() {}

}