package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Category
import com.example.nearby.data.model.CategoryFilterChipView

val categories = listOf(
    Category(id = "1", name = CategoryFilterChipView.ALIMENTACAO.description),
    Category(id = "2", name = CategoryFilterChipView.COMPRAS.description),
    Category(id = "3", name = CategoryFilterChipView.HOSPEDAGEM.description),
    Category(id = "4", name = CategoryFilterChipView.SUPERMERCADO.description)
)