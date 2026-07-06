class Solution {

    public String encode(List<String> strs) {
        StringBuilder en = new StringBuilder();
        for(String str: strs){
            en.append(str.length()+"#"+str);
        }
        return en.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> de = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            int j = i;
            while(j+1 < str.length() && !str.substring(j,j+1).equals("#")){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i = j+1;
            //System.out.println(str.substring(j+1,j+2));
            de.add(str.substring(i,i+len));
            //System.out.println(str.substring(i,i+len));
            i += len-1;
            //System.out.println(str.charAt(i));
        }
        return de;
    }
}
