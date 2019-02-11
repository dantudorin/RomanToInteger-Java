class Solution {
    public int romanToInt(String s) {
        int number = 0;
        int i = s.length() - 1;

        while(i >= 0){

            if(s.charAt(i) == 'I'){
                number = number + 1;
                i = i - 1;
            }

            else if(s.charAt(i) == 'V'){
              try{
                if(s.charAt(i-1) == 'I'){
                        number = number + 4;
                        i = i - 2;
                }else{
                        number = number + 5;
                        i = i - 1;
                    }
              }catch(Exception e){
                  return number + 5;
              }

            }

            else if(s.charAt(i) == 'X'){
                try{
                if(s.charAt(i-1) == 'I'){
                        number = number + 9;
                        i = i - 2;
                }else{
                        number = number + 10;
                        i = i - 1;
                    }
              }catch(Exception e){
                  return number + 10;
              }

            }

            else if(s.charAt(i) == 'L'){
              try{
                if(s.charAt(i-1) == 'X'){
                        number = number + 40;
                        i = i - 2;
                }else{
                        number = number + 50;
                        i = i - 1;
                    }
              }catch(Exception e){
                  return number + 50;
              }

            }

            else if(s.charAt(i) == 'C'){
                try{
                if(s.charAt(i-1) == 'X'){
                        number = number + 90;
                        i = i - 2;
                }else{
                        number = number + 100;
                        i = i - 1;
                    }
              }catch(Exception e){
                  return number + 100;
              }

            }

            else if(s.charAt(i) == 'D'){
                try{
                if(s.charAt(i-1) == 'C'){
                        number = number + 400;
                        i = i - 2;
                }else{
                        number = number + 500;
                        i = i - 1;
                    }
              }catch(Exception e){
                  return number + 500;
              }

            }

            else{
                try{
                    if(s.charAt(i-1) == 'C'){
                        number = number + 900;
                        i = i - 2;
                }else{
                        number = number + 1000;
                        i = i - 1;
                    }
              }catch(Exception e){
                  return number + 1000;
              }
            }

        }
        return number;
    }
}
