package th.ac.su.ict.sasiwimon.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edt1 = findViewById<EditText>(R.id.edt1)
        var edt2 = findViewById<EditText>(R.id.edt2)

        var checkBox1 = findViewById<CheckBox>(R.id.checkbox1)
        var btnCal = findViewById<Button>(R.id.btnCal)

        var turesult = findViewById<TextView>(R.id.truesult)

        btnCal.setOnClickListener {

            var num1:Double = edt1.text.toString().toDouble()
            var num2:Double = edt2.text.toString().toDouble()
            var sum = 0.00
            var result = 0.00

            if (checkBox1.isChecked){

                sum = num1-((num1*num2)/100)

                result = sum+(sum*7/100)

            }else{
                result = num1-((num1*num2)/100)
            }

            turesult.setText(result.toString())

        }

    }
}
