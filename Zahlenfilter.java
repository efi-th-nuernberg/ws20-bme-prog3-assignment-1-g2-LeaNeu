class Main {
  public static void main(String[] args) {
    for (int i = 1; i <=200; i++){
      if( i%5==0){
    System.out.println("Zahl ist durch 5 teilbar!" +i);}
     if( i%10==9 ){
    System.out.println("Zahl endet auf 9!" +i);}
    if(i!=0){
    if(((2*i-1) % 3)==0){
       System.out.println("ZAHL und VORGÄNGER addiert ergeben "+ i +" und "+(i-1) +"ist durch 3 teilbar");}}
    }
  }
}