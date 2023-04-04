package com.example.lazycolumn1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DopFunkciya2   (kaknibud: DataClas1)

{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(3.dp)
            .background(Color.White)
            ){
        Image(
            painter = painterResource(kaknibud.kartinka),   //ЧЕРЕЗ (kaknibud) БЕРЁМ ИЗ DataClas1 ПАРАМЕТР kartinka
            contentDescription = "nazvanie",
            contentScale = ContentScale.Crop,                   // ОБРЕЗАТЬ САМУ КАРТИНКУ ВНУТРИ КРУГА ТО ЧТО НЕ УМЕЩАЕТСЯ
            modifier = Modifier
                .padding(3.dp)                                                // отступ
                .size(64.dp)                                           // размер картинки
                .clip(CircleShape)                                //CircleShape круглая картинка

        )
        Text(
            text = kaknibud.zagolovok)             // пердаём от сюда в DataClas1 в zagolovok
    }

}