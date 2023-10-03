package com.example.myquizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austrailia",
            "Armenia","Austria",
            1
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            2,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Finland", "Hungary",
            "Belgium","Gabon",
            3
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Denmark", "Brazil",
            "Andorra","Iceland",
            2
        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            4,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Nigeria",
            "Brazil","Jordan",
            1
        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            5,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "France", "United Kingdom",
            "Laos","Fiji",
            4
        )
        questionList.add(que5)

        // 6
        val que6 = Question(
            6,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium", "Germany",
            "Bulgaria","Poland",
            2
        )
        questionList.add(que6)

        // 7
        val que7 = Question(
            7,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Ethiopia",
            "India","Moldova",
            3
        )
        questionList.add(que7)

        // 8
        val que8 = Question(
            8,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Oman", "Kuwait",
            "Yemen","Qatar",
            2
        )
        questionList.add(que8)

        // 9
        val que9 = Question(
            9,"What Country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Greece", "Nicaragua",
            "Netherlands","New zealand",
            4
        )
        questionList.add(que9)

        return questionList
    }
}