package kr.ac.kumoh.ce.s20200838.s24w0201counter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kr.ac.kumoh.ce.s20200838.s24w0201counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    default가 public 이라
//    초기화를 잘 해줘야 함
//    lateinit var: 아근데 내가 나중에 꼭 초기화 할게
//   private var count: init = 0 해도 됨
    private lateinit var main: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        inflate은 메모리에다 view를 막 만드는 것
        main = ActivityMainBinding.inflate(layoutInflater)

//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)

//        main은 activity_main임
        setContentView(main.root)
        main.btnAdd.setOnClickListener {
            main.txtCount.text = "${++count}"
//            위랑 같은 의미: main.txtCount.text = "" + ++count
//            main.txtCount.text = (++count).toString
        }
        main.btnSub.setOnClickListener {
            if (count > 0)
                main.txtCount.text = "${--count}"
        }
        main.btnReset.setOnClickListener {
            if (count != 0)
                main.txtCount.text = "0"
        }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}