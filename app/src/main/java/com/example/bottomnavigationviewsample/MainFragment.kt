package com.example.bottomnavigationviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    val args: MainFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text.text = when (args.screenType) {
            ScreenType.HOME -> getString(R.string.hello_home_fragment)
            ScreenType.SAVED -> getString(R.string.hello_saved_fragment)
        }
    }

}
