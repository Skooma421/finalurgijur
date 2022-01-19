package com.example.finalurgijur.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalurgijur.R
import com.example.finalurgijur.RecipeClickListener
import com.example.finalurgijur.Recipes
import com.example.finalurgijur.RecycleViewRecipesAdapter

class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewRecipesAdapter: RecycleViewRecipesAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerViewRecipesAdapter = RecycleViewRecipesAdapter(getData())
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = recyclerViewRecipesAdapter


    }



    private fun getData(): List<Recipes> {
        val foodList = ArrayList<Recipes>()
        foodList.add(
            Recipes(
                14,
                "https://bellyfull.net/wp-content/uploads/2019/10/Stuffed-Cabbage-Rolls-blog-4.jpg",
                "ტოლმა",
                "ამ რეცეპტით ტოლმა გამოდის ნაზი, რბილი და გემრიელი."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://shark.iten.ge/wp-content/uploads/2020/11/5.jpg",
                "აჭარული ხაჭაპური",
                "ისწავლეთ როგორ გამოცხოთ მსოფლიოში აღიარებული ქართული კერძი."

            )


        )
        foodList.add(
            Recipes(
                2,
                "https://www.saveur.com/uploads/2018/11/20/VW6J76DATFDQVDRX5YV55WOXME-1024x767.jpg?auto=webp",
                "იმერული ხაჭაპური",
                "ტრადიციული ხაჟაპური. ეს რეცეპტი ძალიან მარტივი მოსამზადებელია და იდეალურია დამწყებთათვის."

            )


        )
        foodList.add(
            Recipes(
                3,
                "https://kulinaria.ge/media/recipe-images/2017/04/xinkali.jpg",
                "ხინკალი",
                "ხინკალი – ქართული ტრადიციული სუფრის უცვლელი და შეუდარებელი ნაწილი !"

            )


        )
        foodList.add(
            Recipes(
                5,
                "https://gastronomia.ge/wp-content/uploads/2018/12/thumb-33.jpg",
                "კარტოფილის ღვეზელი",
                "კარტოფილის თქვენს სტუმრებს აუცილებლად მოეწონებათ: ვერც კი შენიშნავთ, როგორ დაცარიელდება სავსე თასი!"

            )


        )
        foodList.add(
            Recipes(
                4,
                "https://gemrielia.ge/media/images/50905754_289663541748931_5195439139868114944_n.jpg",
                "ლობიანი",
                "საკუთარი ხელით გამომცხვარ ლობიანს სულ სხვა გემო აქვს."

            )


        )
        foodList.add(
            Recipes(
                6,
                "https://megatv.ge/wp-content/uploads/2019/12/%E1%83%99%E1%83%A3%E1%83%91%E1%83%93%E1%83%90%E1%83%A0%E1%83%981-18-scaled.jpg",
                "კუბდარი",
                "სვანური კუბდარი ის კერძია, რომელსაც  ქართულ ცომეულ კულინარიაში ნამდვილად განსაკუთრებული ადგილი უჭირავს."

            )


        )
        foodList.add(
            Recipes(
                7,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                8,
                "https://kulinar.ge/wp-content/uploads/2017/10/gomi.jpg",
                "ღომი",
                "იხილეთ რეცეპტი ყველასათვის საყვარელი ღომის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://gemrielia.ge/media/__sized__/images/26731731_1705357876181221_3586754366985920203_n-crop-c0-5__0-5-450x301-70.jpg",
                "გებჟალია",
                "მეგრული სამზარეულოს ერთ-ერთი საუკეთესო კერძი, გებჟალია, ალბათ ყველასთვის საყვარელი საკვებია. "

            )


        )
        foodList.add(
            Recipes(
                9,
                "https://gemrielia.ge/media/images/2012-04-25-20-09_ef790.jpg",
                "საცივი",
                "ქართულ საახალწლო სუფრაზე საპიტიო ადგილს ტრადიციულად საცივი იკავებს."

            )


        )
        foodList.add(
            Recipes(
                17,
                "https://gastronomia.ge/wp-content/uploads/2019/03/gihlj.jpg",
                "ბადრიჯანი ნიგვზით",
                "ნიგვზიანი ბადრიჯანი ნებისმიერ სუფრას დაგიმშვენებთ.",

                )


        )

        foodList.add(
            Recipes(
                12,
                "https://i.ytimg.com/vi/0nMYuEfbQEA/maxresdefault.jpg",
                "სოკო კეცზე",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                13,
                "https://bernard.ge/wp-content/uploads/2020/12/qababi.jpg",
                "ქაბაბი",
                "მათთვის  ვისაც  ვერ  წარმოუდგენია  რა  მარტივია  ქაბაბის  გაკეთება."

            )


        )

        foodList.add(
            Recipes(
                15,
                "https://kulinaria.ge/media/recipe-images/2017/03/shemwvari-kanWi.jpg",
                "კანჭი",
                "ამ კერძს გარნირად ყველაზე მეტად ჩაშუშული კომბოსტო ან დაკეპილი კომბოსტოს მწნილი უხდება."

            )


        )
        foodList.add(
            Recipes(
                20,
                "https://marao.ge/pictures/image45/f1a9d3aa2c8b514b30bf7f6e9d85afa7.jpg",
                "აფხაზურა",
                "კერძი, რომელიც ქართული სამზარეულოს ნამდვილი შედევრია!"

            )


        )


        foodList.add(
            Recipes(
                18,
                "https://deda.ge/wp-content/uploads/2020/12/%E1%83%A5%E1%83%90%E1%83%97%E1%83%9B%E1%83%98%E1%83%A1-%E1%83%A9%E1%83%90%E1%83%AE%E1%83%9D%E1%83%AE%E1%83%91%E1%83%98%E1%83%9A%E1%83%98-600x381.png",
                "ჩახოხბილი",
                "გთავაზობთ უძველესი ქართული ტრადიციული კერძის, ჩახოხბილის რეცეპტს."

            )


        )

        foodList.add(
            Recipes(
                19,
                "https://gemrielia.ge/media/__sized__/images/kerZi_Aj2AH0U-crop-c0-5__0-5-450x301-70.jpg",
                "გუფთას წვნიანი",
                "ეს სუპი ძალიან სწრაფად მზადდება და თავისი  არომატით ბუნებრივ სიმყუდროვეს ქმნის ოჯახში."

            )


        )


        return foodList
    }


}