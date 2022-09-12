package multiThreading;

 class Age {

    String drink;
    public String validateIntAgeToDrink(Age e,int age){
            if(age < 21){
               try {
                throw new IllegalAgeException("Illegal drinking age");
            } catch (IllegalAgeException e1) {
                e.drink= "Ilegal";
            }
            }
            if(age>=21){
                e.drink= "legal";
            }
    return e.drink;
        }





    public String validateIntAgeToDrink(Age e,String age){
            if (age.length() > 2 && Integer.parseInt(age) < 21) {
                try {
                    throw new IllegalAgeException("invalid age detail or drinking age");
                } catch (IllegalAgeException e1) {
                    
                    e.drink = "Ilegal"; 
                }
            }
            if(age.length() < 3 && Integer.parseInt(age) < 21){
                e.drink= "legal";
            }
    return e.drink;
        }
}
