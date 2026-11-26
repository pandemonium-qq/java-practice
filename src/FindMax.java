public class FindMax {
    public static int findMax(int[] array){
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int max = array[0];
        for(int i = 1;i < array.length ; i++ ){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        System.out.println(findMax(numbers));
    }
}
