package github.vatsal.kandy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class KotlinActivity : AppCompatActivity() {

    // declaring value
    // does not need any type
    // Kotlin does it automatically
    // also notice no more semi-colon(;) needed
    // rad right!
    val textStart = "Made with"
    val textEnd = "using Kotlin!"

    // the ? is used to ensure the null exception never comes
    // we are thy saved
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        // the initialising method call
        init();
    }

    // no more return type for a method :@
    private fun init() {

        // no more typecasting...loving it already?
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        // eliminate the NULL by using question mark
        val tvStart = findViewById(R.id.tv_start) as TextView?
        val tvEnd = findViewById(R.id.tv_end) as TextView?

        // easy val setting
        // not-null assertions(!!)
        tvStart!!.text = textStart
        tvEnd!!.text = textEnd

        val fab = findViewById(R.id.fab) as FloatingActionButton?

        // finally no more big ClickListeners!!
        // just one line
        fab!!.setOnClickListener { openRepo() }

        //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
    }

    private fun openRepo() {
        val url = "https://github.com/code-crusher/KAndy"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_kotlin, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
