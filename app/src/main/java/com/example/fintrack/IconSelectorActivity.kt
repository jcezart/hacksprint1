package com.example.fintrack

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IconSelectorActivity : AppCompatActivity() {

    private var selectedColor: Int = 0
    private var selectedIcon: Int = 0  // Variável para manter o ícone selecionado

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icon_selector)

        // Receber a cor selecionada da ColorSelectorActivity
        selectedColor = intent.getIntExtra("selectedColor", 0)

        // Mapeando os botões de ícones
        val btnIcon1: ImageButton = findViewById(R.id.btn_icon1)
        val btnIcon2: ImageButton = findViewById(R.id.btn_icon2)
        val btnIcon3: ImageButton = findViewById(R.id.btn_icon3)
        val btnIcon4: ImageButton = findViewById(R.id.btn_icon4)
        val btnIcon5: ImageButton = findViewById(R.id.btn_icon5)
        val btnIcon6: ImageButton = findViewById(R.id.btn_icon6)
        val btnIcon7: ImageButton = findViewById(R.id.btn_icon7)
        val btnIcon8: ImageButton = findViewById(R.id.btn_icon8)
        val btnIcon9: ImageButton = findViewById(R.id.btn_icon9)
        val btnIcon10: ImageButton = findViewById(R.id.btn_icon10)
        val btnIcon11: ImageButton = findViewById(R.id.btn_icon11)
        val btnIcon12: ImageButton = findViewById(R.id.btn_icon12)

        // Definindo ações para cada botão de ícone
        btnIcon1.setOnClickListener { selectedIcon = R.drawable.ic_wifi }
        btnIcon2.setOnClickListener { selectedIcon = R.drawable.ic_car }
        btnIcon3.setOnClickListener { selectedIcon = R.drawable.ic_clothes }
        btnIcon4.setOnClickListener { selectedIcon = R.drawable.ic_credit_card }
        btnIcon5.setOnClickListener { selectedIcon = R.drawable.ic_electricity }
        btnIcon6.setOnClickListener { selectedIcon = R.drawable.ic_game_control }
        btnIcon7.setOnClickListener { selectedIcon = R.drawable.ic_gas_station }
        btnIcon8.setOnClickListener { selectedIcon = R.drawable.ic_graphic }
        btnIcon9.setOnClickListener { selectedIcon = R.drawable.ic_home }
        btnIcon10.setOnClickListener { selectedIcon = R.drawable.ic_key }
        btnIcon11.setOnClickListener { selectedIcon = R.drawable.ic_shopping_cart }
        btnIcon12.setOnClickListener { selectedIcon = R.drawable.ic_water_drop }

        // Botão para finalizar a seleção
        val btnCreate = findViewById<Button>(R.id.btn_create)
        btnCreate.setOnClickListener {
            if (selectedIcon != 0) {  // Verifica se um ícone foi selecionado
                finishSelection()
            } else {
                Toast.makeText(this, "Please select an icon first.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun finishSelection() {
        val resultIntent = Intent()
        resultIntent.putExtra("selectedIcon", selectedIcon)
        resultIntent.putExtra("selectedColor", selectedColor)
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }
}