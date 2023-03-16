package com.plantilla.app.ui.fragments

import android.os.Bundle
import android.view.View
import com.plantilla.app.R
import com.plantilla.app.databinding.FragmentListBinding
import com.plantilla.app.ui.base.BaseFragment
import com.plantilla.app.utils.extensions.logInfo

class ListFragment: BaseFragment<FragmentListBinding, ListFragmentArgs>(R.layout.fragment_list) {

    override fun onCreateBinding(view: View): FragmentListBinding = FragmentListBinding.bind(view)

    override fun argsFromBundle(args: Bundle): ListFragmentArgs = ListFragmentArgs.fromBundle(args)

    override fun setupFragment() {
        args?.titulo?.run {
            this.logInfo()
        } ?: kotlin.run {
            "No hay argumentos".logInfo()
        }
    }


}