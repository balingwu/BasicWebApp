package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("bakayarou")) {
            return "Ba-ka-ya-rou(馬鹿野郎) is like the f**k word in Japanese";
        }

        if (query.toLowerCase().contains("watashi")) {
            return "Wa-ta-shi(わたし) means \"I\" in Japanese, and the polite form is wa-ta-ku-shi(わたくし).";
        }

        if (query.toLowerCase().contains("sumimasen")) {
            return "Su-mi-ma-sen(すみません) means \"sorry\" in Japanese. \n" +
                    "You can use it at any time when you say \"sorry\" in English!";
        }

        if (query.toLowerCase().contains("nihon")) {
            return "Ni-hon(にほん) is how you say \"Japan\" in Japanese!";
        }
        return "";
    }
}
