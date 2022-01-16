package com.example.finalurgijur.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalurgijur.R
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
                1,
                "https://www.simplyrecipes.com/thmb/8caxM88NgxZjz-T2aeRW3xjhzBg=/2000x1125/smart/filters:no_upscale()/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2019__09__easy-pepperoni-pizza-lead-3-8f256746d649404baa36a44d271329bc.jpg",
                "პიცა",
                "ახალბედა მზარეულსაც კი შეუძლია დაეუფლოს პიცის ხელოვნებას ჩვენი მარტივი ნაბიჯ-ნაბიჯ რეცეპტით. ბელისიმო!"

            )


        )
        foodList.add(
            Recipes(
                2,
                "https://www.saveur.com/uploads/2018/11/20/VW6J76DATFDQVDRX5YV55WOXME-1024x767.jpg?auto=webp",
                "ხაჭაპური",
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
                9,
                "https://gemrielia.ge/media/images/2012-04-25-20-09_ef790.jpg",
                "საცივი",
                "ქართულ საახალწლო სუფრაზე საპიტიო ადგილს ტრადიციულად საცივი იკავებს. შესაბამისად, ამ კერძის მომზადებას ყველა დიასახლისი ამ საუკეთესო რეცეპტით ცდილობს."

            )


        )
        foodList.add(
            Recipes(
                10,
                "https://gastronomia.ge/wp-content/uploads/2021/01/1-1-16.jpg",
                "ბორში",
                "ბორშჩი უკრაინული წვნიანია, ფართოდაა გავრცელებული სლავურ ქვეყნებში, ძალიან პოპულარულია საქართველოშიც."

            )


        )
        foodList.add(
            Recipes(
                11,
                "https://kulinaria.ge/media/recipe-images/2019/01/P5015f8ba_0.jpg",
                "გოგრის კრემ-სუპი",
                "უმარტივესი და უგემრიელესი გოგრის კრემ-სუპის რეცეპტი."

            )


        )
        foodList.add(
            Recipes(
                12,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        foodList.add(
            Recipes(
                1,
                "https://deda.ge/wp-content/uploads/2019/07/mchadi-1.jpg",
                "მჭადი",
                "რეცეპტი ოქროსფერი და ფუმფულა მჭადის მოსამზადებლად."

            )


        )
        return foodList
    }
}