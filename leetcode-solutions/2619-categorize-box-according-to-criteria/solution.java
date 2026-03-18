class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String r1="",r2="";
        if(length>=10000 || width>=10000 || height>=10000 || ((long)length*width*height)>=1000000000){
           r1="Bulky";
        }
        if(mass>=100){
            r2="Heavy";
        } 
    if (r1.equals("Bulky") && r2.equals("Heavy")){
        return "Both";
    }
    if(!r1.equals("Bulky") && !r2.equals("Heavy")){
        return "Neither";
    }
    if(r1.equals("Bulky") && !r2.equals("Heavy")){
        return "Bulky";
    }
    if(r2.equals("Heavy") && !r1.equals("Bulky")){
        return "Heavy";
    }

    
    return "";

    }
}
