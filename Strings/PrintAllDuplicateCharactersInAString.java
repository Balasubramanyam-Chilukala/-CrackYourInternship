class solution{
  public void duplicate(String s){
    int freq[] = new int[26];
    Arrays.fill(freq,0);
    for(int i=0;i<s.length();i++){
      freq[s.charAt(i)-97]++;
    }
    for(int i=0;i<26;i++){
      if(freq[i] >1 ){
        char c = i+97;
        System.out.print(c);
      }
    }
  }
}
