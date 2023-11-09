class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            String temp=details[i];
            if(((temp.charAt(11)-'0')*10)+(temp.charAt(12)-'0')>60)
                count++;
        }
        return count;
    }
}
