public class integration {

    //1-5, 9-11
    public static void main(String[] args){
        int[] array = {1,2,3,7,8,9,11};
        //expected is 1-3,7-9,11
        printArray(array);

    }

    public static void printArray(int[] a){
        StringBuilder stringBuilder = new StringBuilder();
        String beg = "";
        String end = "";
        boolean start = true;
        for(int i=0; i< a.length-1; i++){
            if(i+1 == a.length-1){
                if(start){
                    if(a[i+1]-a[i]==1){
                        beg = Integer.toString(a[i]);
                        end = Integer.toString(a[i+1]);
                        stringBuilder.append(beg + "-" + end);
                    }else {
                        stringBuilder.append(beg + "-" + a[i + 1]);
                    }
                }else{
                    if(a[i+1]-a[i]==1){
                        stringBuilder.append(beg + "-" + a[i + 1]);
                    }else{
                      stringBuilder.append(beg + "-" +a[i]+","+a[i+1]);
                    }
                }
            }else {
                if (a[i + 1] - a[i] == 1 && start) {
                    beg = Integer.toString(a[i]);
                    start = false;
                } else if (a[i + 1] - a[i] != 1 && !start) {
                    end = Integer.toString(a[i]);
                    stringBuilder.append(beg + "-" + end + ",");
                    start = true;
                }
            }
        }

        System.out.println(stringBuilder.toString());
    }
}