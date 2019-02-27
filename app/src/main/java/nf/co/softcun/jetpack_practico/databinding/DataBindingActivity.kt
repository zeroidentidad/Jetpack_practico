package nf.co.softcun.jetpack_practico.databinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nf.co.softcun.jetpack_practico.R
import nf.co.softcun.jetpack_practico.modelo.Usuario

class DataBindingActivity : AppCompatActivity() {

    private lateinit var mListaNombres: ArrayList<Usuario>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_data_binding)

        var binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)

        val usuarioCodigo = Usuario("Jesus", "Ferrer")

        binding.usuario = usuarioCodigo

        mListaNombres = ArrayList()
        for (count in 1..5){
            val usuario = Usuario("Jesus $count", "Ferrer $count")
            mListaNombres.add(usuario)
        }

        binding.listaUsuario = mListaNombres

        val textoGrande = false
        binding.textoGrande = textoGrande


        /*setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
        }*/
    }

}
