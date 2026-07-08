class Solution {

    public String encode(List<String> strs) {
          StringBuilder sc=new StringBuilder();
          for(String s:strs)
          {
                 sc.append(s.length());
                 sc.append("#");
                 sc.append(s);
          }
          return sc.toString();
    }

    public List<String> decode(String str) {
          int i=0;
          ArrayList<String> hello=new ArrayList<>();
          while(i<str.length())
          {
                 int j=i;
                 while(str.charAt(j)!='#')
                 {
                    j++;
                 }
                 int length=Integer.parseInt(str.substring(i,j));
                 String s=str.substring(j+1,j+1+length);
                 hello.add(s);
                 i=j+1+length;
          }
          return hello;
    }
}
