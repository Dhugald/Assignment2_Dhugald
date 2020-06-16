package dhugald.bit;

class Question {
    private String ques;
    public String quesAnswer;
    public String quesAnswer2;
    public String quesAnswer3;
    public String quesAnswer4;
    public Question(int i)
    {
        switch (i){
            case 0:
                ques = "How tall is mount cook?";
                quesAnswer = "3724";
                quesAnswer2 = "2980";
                quesAnswer3 = "4152";
                quesAnswer4 = "3420";
                break;
            case 1:
                ques = "What is New Zealands largest glacier?";
                quesAnswer = "Tasman Glacier";
                quesAnswer2 = "Franz Josef Glacier";
                quesAnswer3 = "Fox Glacier";
                quesAnswer4 = "Hooker Glacier";
                break;
            case 2:
                ques = "How many glaciers are there in New Zealand?";
                quesAnswer = "3144";
                quesAnswer2 = "2567";
                quesAnswer3 = "2343";
                quesAnswer4 = "3876";
                break;
            case 3:
                ques = "What is the name of New Zealands largest man made lake?";
                quesAnswer = "Benmore";
                quesAnswer2 = "Ruataniwha";
                quesAnswer3 = "Pukaki";
                quesAnswer4 = "Tekapo";
                break;
            case 4:
                ques = "What year was Mt Cook first climbed?";
                quesAnswer = "1894";
                quesAnswer2 = "1892";
                quesAnswer3 = "1896";
                quesAnswer4 = "1898";
                break;
            case 5:
                ques = "Which of these four were not first to climb Mt Cook?";
                quesAnswer = "Edmund Hillary";
                quesAnswer2 = "Jack Clarke";
                quesAnswer3 = "George Graham";
                quesAnswer4 = "Tom Fyfe";
                break;
            case 6:
                ques = "Which of these mountaineers are a statue in mount cook?";
                quesAnswer = "Edmund Hillary";
                quesAnswer2 = "George Graham";
                quesAnswer3 = "Rob Hall";
                quesAnswer4 = "Peter Mulgrew";
                break;
            case 7:
                ques = "How many people have died climbing Mt Cook?";
                quesAnswer = "80";
                quesAnswer2 = "35";
                quesAnswer3 = "60";
                quesAnswer4 = "95";
                break;
            case 8:
                ques = "How many hike trails are there at Mt Cook";
                quesAnswer = "11";
                quesAnswer2 = "8";
                quesAnswer3 = "17";
                quesAnswer4 = "23";
                break;
            case 9:
                ques = "What is the Maori name for Mt Cook?";
                quesAnswer = "Aoraki";
                quesAnswer2 = "Ruapehu";
                quesAnswer3 = "Hikurangi";
                quesAnswer4 = "Taranaki";
                break;
        }
    }
    public String getAnswer()
    {
        return quesAnswer;
    }
    public String questionString()
    {
        return ques;
    }
}
