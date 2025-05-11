package tais.dev.projeto2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class activitySobreMim : AppCompatActivity() {
    private lateinit var button7: Button
    private lateinit var link: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sobre_mim)

        button7 = findViewById(R.id.button7)
        button7.setOnClickListener { val start2 = Intent(
            this, MainActivity::class.java)
            startActivity(start2)

            link = findViewById(R.id.link)
            link.setOnClickListener {
                val url = ""
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)}

        }
    }
}