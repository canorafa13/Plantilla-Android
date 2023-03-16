package com.plantilla.app.ui.fragments

import android.view.View
import androidx.navigation.NavArgs
import com.plantilla.app.R
import com.plantilla.app.databinding.FragmentMainBinding
import com.plantilla.app.ui.base.BaseFragment
import com.plantilla.app.utils.extensions.safeNavController

class MainFragment: BaseFragment<FragmentMainBinding, NavArgs>(R.layout.fragment_main) {

    override fun onCreateBinding(view: View): FragmentMainBinding = FragmentMainBinding.bind(view)

    override fun FragmentMainBinding.initialize() {
        this.btnGet.apply {
            setOnClickListener {
                safeNavController(
                    MainFragmentDirections.navigationMainFragmentToListFragment(
                        titulo = null
                    )
                )
            }
        }
    }

}