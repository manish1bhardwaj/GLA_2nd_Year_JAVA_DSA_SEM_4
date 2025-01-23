public class ReverseVowel {
    
    public String reverseVowels(String s) {

        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            if(isvowel(arr[i])&&isvowel(arr[j])){
                //swap
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(isvowel(arr[i])){
                j--;
            }else{
                i++;
            }
        }
        return new String(arr);

    }

    public boolean isvowel(char ch){

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}
