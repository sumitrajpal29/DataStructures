public class ShellSort {
    public static void main(String[] args) {
        int[] arr={4,-22,3,1};

        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int selected=arr[i];
                int j;
                for (j=i-gap;j>=0&&selected<arr[j];j-=gap){
                    arr[j+gap]=arr[j];
                }
                arr[j+gap]=selected;
                for(int m:arr)
                    System.out.print(m+",");
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        for (int j:arr)
            System.out.println(j);
    }
}