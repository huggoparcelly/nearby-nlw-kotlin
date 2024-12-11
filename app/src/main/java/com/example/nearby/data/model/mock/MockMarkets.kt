package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Sabor Grill",
        description = "Melhor Lanche da cidade",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.550520,
        longitude = -46.633308,
        address = "Rua dos Amores, 123",
        phone = "(11) 98765-4321",
        cover = "https://unsplash.com/pt-br/fotografias/hamburguer-com-cebola-e-tomate-firiYA8fMiw"
    ),
    Market(
        id = "2",
        categoryId = "2",
        name = "Lanchonete do Zé",
        description = "Melhor Lanche da cidade",
        coupons = 5,
        rules = emptyList(),
        latitude = -23.550520,
        longitude = -46.633308,
        address = "Rua das Dores, 123",
        phone = "(11) 98765-4322",
        cover = "https://images.unsplash.com/photo-1619719015339-133a130520f6?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
    )
)