package com.example.lazycolumn1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lazycolumn1.ui.theme.LazyColumn1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn1Theme {
                Spisok ()
            }
        }
    }
}

@Composable
fun Spisok () {

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(3.dp)
            .background(Color.Gray)

    ) {
        itemsIndexed(
            listOf(
                DataClas1(R.drawable.tigr1,"Толя"),
                DataClas1(R.drawable.tigr3,"Тома"),
                DataClas1(R.drawable.tigr4,"Трофим"),
                DataClas1(R.drawable.tigr6,"Таня"),
                DataClas1(R.drawable.tigr7,"Тёма"),
                DataClas1(R.drawable.tigr1,"Тагир"),
            )

        ){_,luboi ->      // прочерк нет нумерации , luboi произвольное названи списка listof
            DopFunkciya2(kaknibud = luboi)   // в функцию DopFunkciya2 передаём список картинок luboi

        }

    }
}

/* РОЛИК НА ЮТУБЕ
 https://www.youtube.com/watch?v=kQS_eN1Z_Wc&list=PLmjT2NFTgg1cyNFqS2ST6nTDxZH_bYjba&index=7

СОЗДАЛИ ЕЩЁ ДАТА КЛАСС И ДОПОЛНИТЕЛЬНУЮ ФУНКЦИЮ ГДЕ ПРОПИСАЛИ КОД
 */
