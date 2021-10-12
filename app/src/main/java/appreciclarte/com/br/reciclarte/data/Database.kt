package appreciclarte.com.br.reciclarte.data

import android.content.Context
import appreciclarte.com.br.reciclarte.R
import appreciclarte.com.br.reciclarte.domain.*


class Database {
    companion object {

        /*
         * Retorna os dados de teste do aplicativo, dados
         * simulados ou dados mock
         * */
        fun getSneakers( context: Context ) =
            listOf(
                Sneaker(
                    R.drawable.recy4,
                    intArrayOf(R.drawable.recy4, R.drawable.recy4, R.drawable.recy4),
                    "Reciclagem Ferraz",
                    Brand(R.drawable.ic_new_balance, "Cód: 1"),
                    true,
                    true,
                    Rating(42, 5),
                    000.00,
                    ExtraInfo(
                        20,
                        context.getString(R.string.value_recommended),
                        context.getString(R.string.value_type),
                        context.getString(R.string.value_composition),
                        context.getString(R.string.value_desc)
                    )
                ),
                Sneaker(
                    R.drawable.recy5,
                    intArrayOf(R.drawable.recy5, R.drawable.recy5, R.drawable.recy5),
                    "BioRecicle",
                    Brand(R.drawable.ic_new_balance, "Cód: 2"),
                    true,
                    false,
                    Rating(91, 5),
                    000.00,
                    ExtraInfo(
                        4,
                        context.getString(R.string.value_recommended),
                        context.getString(R.string.value_type),
                        context.getString(R.string.value_composition),
                        context.getString(R.string.value_desc)
                    )
                ),
                Sneaker(
                    R.drawable.recy7,
                    intArrayOf(R.drawable.recy7, R.drawable.recy7, R.drawable.recy7),
                    "RecyEletron",
                    Brand(R.drawable.ic_new_balance, "Cód: 3"),
                    true,
                    false,
                    Rating(29, 3),
                    000.00,
                    ExtraInfo(
                        4,
                        context.getString(R.string.value_recommended),
                        context.getString(R.string.value_type),
                        context.getString(R.string.value_composition),
                        context.getString(R.string.value_desc)
                    )
                ),
                Sneaker(
                    R.drawable.recy8,
                    intArrayOf(R.drawable.recy8, R.drawable.recy8, R.drawable.recy8),
                    "RecyLamp",
                    Brand(R.drawable.ic_new_balance, "Cód: 4"),
                    true,
                    false,
                    Rating(84, 4),
                    000.00,
                    ExtraInfo(
                        4,
                        context.getString(R.string.value_recommended),
                        context.getString(R.string.value_type),
                        context.getString(R.string.value_composition),
                        context.getString(R.string.value_desc)
                    )
                ),
                Sneaker(
                    R.drawable.recy2,
                    intArrayOf(R.drawable.recy2, R.drawable.recy2, R.drawable.recy2),
                    "EnterVidro",
                    Brand(R.drawable.ic_new_balance, "Cód: 5"),
                    false,
                    true,
                    Rating(19, 5),
                    000.00,
                    ExtraInfo(
                        4,
                        context.getString(R.string.value_recommended),
                        context.getString(R.string.value_type),
                        context.getString(R.string.value_composition),
                        context.getString(R.string.value_desc)
                    )
                ),
                Sneaker(
                    R.drawable.recy6,
                    intArrayOf(R.drawable.recy6, R.drawable.recy6, R.drawable.recy6),
                    "RecycleOrganic",
                    Brand(R.drawable.ic_new_balance, "Cód: 6"),
                    true,
                    true,
                    Rating(42, 5),
                    000.00,
                    ExtraInfo(
                        4,
                        context.getString(R.string.value_recommended),
                        context.getString(R.string.value_type),
                        context.getString(R.string.value_composition),
                        context.getString(R.string.value_desc)
                    )
                )
            )

        /*
         * Retorna o objeto usuário responsável por simular
         * o usuário conectado.
         * */
        fun getUser() : User
            = User(
                "Ram/Eli/Nat/Fer/",
                "reciclarte@gmail.com",
                R.mipmap.logo)
    }
}