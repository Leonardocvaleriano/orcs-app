package br.com.alura.orgs.ui
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R


class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductsAdapter()
    }
}