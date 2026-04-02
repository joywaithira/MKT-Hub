package com.maryjoy.markethub.ui.screens.about

import androidx.annotation.OptIn
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.maryjoy.markethub.ui.screens.payment.PaymentScreen
import com.maryjoy.markethub.ui.theme.Borange

@kotlin.OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        TopAppBar(
            title ={ Text(text = "about")},
            navigationIcon = {
                IconButton(
                    onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu"
                    ) }
            },


            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Borange,
                navigationIconContentColor = Color.White,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White,
            )


        )




    }


}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){

    AboutScreen()


}