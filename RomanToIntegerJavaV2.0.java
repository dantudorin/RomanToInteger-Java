class Solution {
    public int romanToInt(String s) {
        int number = 0;
        int last = 0;
        int current = 0;
        int i = s.length() - 1;

        Map<Character,Integer> romanLetters = new HashMap<>();

        romanLetters.put('I', 1);
        romanLetters.put('V', 5);
        romanLetters.put('X', 10);
        romanLetters.put('L', 50);
        romanLetters.put('C', 100);
        romanLetters.put('D', 500);
        romanLetters.put('M', 1000);

        while(i >= 0){
             current = romanLetters.get(s.charAt(i));
                if(current >= last){
                    number = number + current;
                }else{
                    number = number - current;
                }
            last = current;
            i = i - 1;
        }
        return number;
    }
}
