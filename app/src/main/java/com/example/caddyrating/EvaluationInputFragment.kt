//　評価入力画面

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.caddyrating.MyPageFragment
import com.example.caddyrating.R
import kotlinx.android.synthetic.main.evaluationinput.*

class EvaluationInput : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.evaluationinput, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_toMypage.setOnClickListener{
            val secondFragment = MyPageFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment_container, secondFragment)
            fragmentTransaction?.commit()
        }
    }
}