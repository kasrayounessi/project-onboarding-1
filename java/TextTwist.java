public class TextTwist {

    public int totalPoints(String[] words, String word){

        String wordArray[] = word.split("");
        int totalScore = 0;

        for(int i = 0; i < words.length; i++){

            String currentWord[] = words[i].split("");
            boolean validWord = true;

            for(int j = 0; j < currentWord.length; j++){
                if(word.indexOf(currentWord[j]) != -1){
                    continue;
                } else{
                    validWord = false;
                    break;
                }
            }

            if(currentWord.length==6){
                for(int k = 0; k < wordArray.length; k++){
                    if(words[i].indexOf(wordArray[k])!=-1){
                        continue;
                    } else{
                        validWord = false;
                        break;
                    }
                }

            }

            if(!validWord){
                continue;
            } else {
                switch(currentWord.length){
                    case 3:
                        totalScore += 1;
                        break;
                    case 4:
                        totalScore += 2;
                        break;
                    case 5:
                        totalScore += 3;
                        break;
                    case 6:
                        totalScore += 54;
                        break;
                    default:
                        totalScore += 0;
                }
            }
        }

        return totalScore;
    }


    public static void main(String[] args) {

        TextTwist textTwist = new TextTwist();
        String[] myArray = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        int result = textTwist.totalPoints(myArray, "tossed");
        System.out.println("your score is: "+result);

    }
}
