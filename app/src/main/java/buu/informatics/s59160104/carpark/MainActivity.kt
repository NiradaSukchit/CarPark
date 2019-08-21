package buu.informatics.s59160104.carpark

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

var license1 = ""
var brand1 = ""
var name1 = ""

var license2 = ""
var brand2 = ""
var name2 = ""

var license3 = ""
var brand3 = ""
var name3 = ""

var parkNumber = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.first_button).setOnClickListener{
            park1(it)
            parkNumber = 1
        }
        findViewById<Button>(R.id.second_button).setOnClickListener{
            park2(it)
            parkNumber = 2
        }
        findViewById<Button>(R.id.third_button).setOnClickListener{
            park3(it)
            parkNumber = 3
        }
        findViewById<Button>(R.id.close_button).setOnClickListener{
            cancel(it)
        }
        findViewById<Button>(R.id.done_button).setOnClickListener{
            done(it)
        }
        findViewById<Button>(R.id.reset_button).setOnClickListener{
            reset(it)
        }
    }

    private fun park1 (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text1)
        val name = findViewById<EditText>(R.id.name_text)

        license.visibility = View.VISIBLE
        brand.visibility = View.VISIBLE
        name.visibility = View.VISIBLE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.reset_button)
        val cancel = findViewById<Button>(R.id.close_button)
        done.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE

    }
    private fun park3 (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text1)
        val name = findViewById<EditText>(R.id.name_text)

        license.visibility = View.VISIBLE
        brand.visibility = View.VISIBLE
        name.visibility = View.VISIBLE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.reset_button)
        val cancel = findViewById<Button>(R.id.close_button)
        done.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE

    }
    private fun park2 (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text1)
        val name = findViewById<EditText>(R.id.name_text)

        license.visibility = View.VISIBLE
        brand.visibility = View.VISIBLE
        name.visibility = View.VISIBLE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.reset_button)
        val cancel = findViewById<Button>(R.id.close_button)
        done.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE

    }

    private fun cancel (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text1)
        val name = findViewById<EditText>(R.id.name_text)
        license.visibility = View.GONE
        brand.visibility = View.GONE
        name.visibility = View.GONE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.reset_button)
        val cancel = findViewById<Button>(R.id.close_button)
        done.visibility = View.GONE
        delete.visibility = View.GONE
        cancel.visibility = View.GONE

    }

    private fun done (view: View){

        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text1)
        val name = findViewById<EditText>(R.id.name_text)


        if (name.text.toString().isEmpty()){
            first_button.text = "Free"
        }else{
            first_button.text = name.text
        }

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }

    private fun reset (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text1)
        val name = findViewById<EditText>(R.id.name_text)

        license.text = null
        brand.text = null
        name.text = null

    }



    }
