package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int counter=0;
        while(counter<=input.length()-1){


        }
        return null;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        int counter=0;
        String oldStr=base;
        String newStr="";
        while(counter<=oldStr.length()-remove.length()){
        if (remove.equals(oldStr.substring(counter, counter+remove.length()))){
            newStr=oldStr.replace(remove, "");
            oldStr=newStr;
            counter=0;
        }
        counter++;
        }
        return oldStr;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int counter=0;
        int isCount=0;
        int notCount=0;
        String str1="";
        String str2="";
        boolean equal;
        while(counter<=input.length()-3){
            str1=input.substring(counter,counter+3);
            if (str1.equals("not")){
            notCount++;
            }
            str1=input.substring(counter,counter+2);
            if(str1.equals("is")){
               isCount++;
            }
            counter++;
        }
        if(input.substring(input.length()-3,input.length()-1)=="is"){isCount++;}
        if(input.substring(input.length()-2)=="is"){isCount++;}
        if(input.substring(input.length()-3)=="not"){notCount++;}
        if(isCount==notCount){equal=true;}
        else equal = false;
        return equal;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        int counter=0;
        boolean happy=false;
        while (counter<input.length()-2){
            if ((input.charAt(counter)==input.charAt(counter+1))&&(input.charAt(counter)=='g')){
                    happy=true;
            }
            counter++;
        }

        return happy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        if (input.length()<3) {
            return 0;
        } else{
            int counter=0;
            int totalTriples=0;
            while(counter<input.length()-3){
                if ((input.charAt(counter)==input.charAt(counter+1))&&(input.charAt(counter)==input.charAt(counter+2))){
                totalTriples++;
                }
                counter++;
        }
            return totalTriples;
        }
    }
}
