package com.example.googlekeepn.ui.theme

import androidx.compose.ui.graphics.Color

//to delete
val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
//End to delete

//Dark Mode App Theme
//check what do what, each thing affect the coloring in the app containers and the contained included
val primaryColorDarkMode = Color(0xFF2d2e31) //color on background on any container
val onPrimaryColorDarkMode = Color(0xFFababac)
val onSurfaceVariantColorDarkMode = Color(0xFFa8a9ac) //Composable on Top App Bar (Part on top of Medium/Large App Bar, usually holding icons and return button and usually doesnt stay onScroll if fixed appBar on scroll isn't used)
val onSurfaceColorDarkMode = Color(0xFFe1e1e2) //Composable colors on Top App Bar (Part where the title resides, usually the part where onScroll its left as the topAppBar)
val surfaceContainerColorDarkMode = Color(0xFF2d2e31) // BottomAppBar Surface color
val secondaryColorDarkMode = Color(0xFFc2c2c3)
val tertiaryColorDarkMode = Color(0xffe1e1e2)

//Todo: Add LightMode App Theme
val black = Color(0xFF000000)

//Composable color usage
val returnIconAppBarLightMode = black
val returnIconAppBarDarkMode = Color(0xFFdadbdf)
