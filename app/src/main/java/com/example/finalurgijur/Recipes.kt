package com.example.finalurgijur
var recipesList = mutableListOf<Recipes>()
data class Recipes(
    val id:Int,
    val imageUrl:String,
    val title:String,
    val name:String,
    val id1: Int?= recipesList.size

)
