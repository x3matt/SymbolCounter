public class SymbolCounter {
    
    public String count(String input){
        String res="";
        int counter=1;
        for(Integer i = 0;i < input.length()-1;i++){
            if(input.charAt(i) == input.charAt(i+1)) counter++;
            if(input.charAt(i) != input.charAt(i+1)){
                res=res+input.charAt(i)+counter;
                counter=1;
            }
            if(i == input.length()-2){res=res+input.charAt(input.length()-1)+counter;}
        }
        return res;
    }
}
