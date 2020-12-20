package com.example.caddyrating

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
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
        back_button.setOnClickListener{
            Log.d(TAG, "BackButton pressed!")
            fragmentManager?.popBackStack()
        }
        opinionsGolfCourseButton.setOnClickListener{
//            // Fragmentを生成するためのFragmentTransactionの準備をして
//            val firstFragment = EvaluationInput()
//            // FirstFragment.javaのonCreateView()がスタート
//            val fragmentTransaction = supportFragmentManager.beginTransaction()
//            // add()でフラグメントの追加、 add()の第一引数には、Fragmentの表示を行う場所のid、第二引数は表示したいFragmentを指定
//            fragmentTransaction.add(R.id.fragment_container, firstFragment)
//            // commit()で反映を行う
//            fragmentTransaction.commit()
        }
        logoutButton.setOnClickListener{}
    }
}