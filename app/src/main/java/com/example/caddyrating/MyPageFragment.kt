package com.example.caddyrating

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_mypage.*


class MyPageFragment : Fragment() {

    companion object {
        private const val TAG = "SecondFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        back_button.setOnClickListener {
            Log.d(TAG, "BackButton pressed!")
            fragmentManager?.popBackStack()
        }
        opinionsGolfCourseButton.setOnClickListener {
            val sendOpinionFragment = SendOpinionFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment_container, sendOpinionFragment)
            fragmentTransaction?.commit()
        }
        logoutButton.setOnClickListener {}
    }
}