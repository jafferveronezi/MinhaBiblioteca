package br.com.veronezitecnologia.minhabiblioteca

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.veronezitecnologia.minhabiblioteca.demo.Calculadora

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculadora = Calculadora()
        calculadora.somar(1, 2)
    }
}
