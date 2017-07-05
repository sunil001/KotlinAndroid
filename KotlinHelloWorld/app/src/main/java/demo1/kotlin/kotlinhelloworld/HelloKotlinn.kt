package demo1.kotlin.kotlinhelloworld

/**
 * Created by sunilhl on 05/07/17.
 */
import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.Button
import android.widget.Toast

class HelloKotlinn : Activity(), View.OnClickListener {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click = findViewById<View>(R.id.click) as Button
        click.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        Toast.makeText(applicationContext, "Hello Kotlin", Toast.LENGTH_SHORT).show()
    }
}

