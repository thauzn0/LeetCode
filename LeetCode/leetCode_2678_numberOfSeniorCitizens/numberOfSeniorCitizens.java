package leetCode_2678_numberOfSeniorCitizens;

import static java.lang.Integer.parseInt;

public class numberOfSeniorCitizens {


    //// Runtime : 2 ms Memory : 42.5 MB
    public static int countSeniors(String[] details) {
        //You are given a 0-indexed array of strings details.
        //Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
        //The first ten characters consist of the phone number of passengers.
        //The next character denotes the gender of the person.
        //The following two characters are used to indicate the age of the person.
        //The last two characters determine the seat allotted to that person.
        //Return the number of passengers who are strictly more than 60 years old.
        //1313579440F2036

        int counter = 0;

        for(int i = 0; i < details.length;i++){
            String temp = Character.toString(details[i].charAt(11)) + Character.toString(details[i].charAt(12));
            //System.out.println(temp);
            //int ageInt = Integer.parseInt(temp);
            //System.out.println(ageInt);



            if(Integer.parseInt(temp) > 60 )
                counter++;



        }

        return counter;

    }


    // Runtime : 1 ms Memory : 42.7 MB
    public static int countSeniorsWithStringBuilder(String[] details) {
        //You are given a 0-indexed array of strings details.
        //Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
        //The first ten characters consist of the phone number of passengers.
        //The next character denotes the gender of the person.
        //The following two characters are used to indicate the age of the person.
        //The last two characters determine the seat allotted to that person.
        //Return the number of passengers who are strictly more than 60 years old.
        //1313579440F2036

        if(details == null){
            return 0;
        }

        int counter = 0;

        for(int i = 0; i < details.length;i++){
            StringBuilder age = new StringBuilder();

            age.append(details[i].charAt(11));
            age.append(details[i].charAt(12));


            int ageInt = Integer.parseInt(age.toString());

            if(ageInt > 60 )
                counter++;



        }

        return counter;

    }

}
