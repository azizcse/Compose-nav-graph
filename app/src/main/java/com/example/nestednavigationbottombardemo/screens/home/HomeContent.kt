package com.example.nestednavigationbottombardemo.screens.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * Created by Azizul Islam on 8/16/22.
 */

@Composable
fun HomeContent(navController: NavHostController, name: String, onClick: () -> Unit) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Home") },
            backgroundColor = MaterialTheme.colors.primary,
        )
    }) {
        LazyColumn(modifier = Modifier.padding(10.dp)) {
            items(50) { item ->
                Card(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()) {
                    Text("Item index $item")
                }
            }
        }
    }
}