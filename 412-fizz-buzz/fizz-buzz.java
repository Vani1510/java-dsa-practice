class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> t=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
            t.add("FizzBuzz");}
            else if(i%3==0){
            t.add("Fizz");}
            else if(i%5==0){
            t.add("Buzz");}
            else{
            t.add(String.valueOf(i));}
        }
        return t;
    }
    
}