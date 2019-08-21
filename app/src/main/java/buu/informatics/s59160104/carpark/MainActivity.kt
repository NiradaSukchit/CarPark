package buu.informatics.s59160104.carpark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.first_button).setOnClickListener{
            park1(it)
        }
        findViewById<Button>(R.id.second_button).setOnClickListener{
            park2(it)
        }
        findViewById<Button>(R.id.third_button).setOnClickListener{
            park3(it)
        }
        findViewById<Button>(R.id.cancel_button).setOnClickListener{
            cancel(it)
        }
    }

    private fun park1 (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text)
        val name = findViewById<EditText>(R.id.name_text)

        license.visibility = View.VISIBLE
        brand.visibility = View.VISIBLE
        name.visibility = View.VISIBLE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)
        done.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE

    }
    private fun park3 (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text)
        val name = findViewById<EditText>(R.id.name_text)

        license.visibility = View.VISIBLE
        brand.visibility = View.VISIBLE
        name.visibility = View.VISIBLE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)
        done.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE

    }
    private fun park2 (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text)
        val name = findViewById<EditText>(R.id.name_text)

        license.visibility = View.VISIBLE
        brand.visibility = View.VISIBLE
        name.visibility = View.VISIBLE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)
        done.visibility = View.VISIBLE
        delete.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE

    }

    private fun cancel (view: View){
        val license = findViewById<EditText>(R.id.car_license_text)
        val brand = findViewById<EditText>(R.id.brand_text)
        val name = findViewById<EditText>(R.id.name_text)
        license.visibility = View.GONE
        brand.visibility = View.GONE
        name.visibility = View.GONE

        val done = findViewById<Button>(R.id.done_button)
        val delete = findViewById<Button>(R.id.delete_button)
        val cancel = findViewById<Button>(R.id.cancel_button)
        done.visibility = View.GONE
        delete.visibility = View.GONE
        cancel.visibility = View.GONE

    }



}
