package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Rule

val mockRules = listOf(
    Rule(
        id = "1",
        description = "Disponível até 31/12/2024",
        marketId = "1"
    ),
    Rule(
        id = "2",
        description = "Válido somente para consumo no local",
        marketId = "2"
    )
)