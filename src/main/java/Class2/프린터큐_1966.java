package Class2;


import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class 프린터큐_1966 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        for(int i = 0; i < x; i++){
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> newQueue = new LinkedList<>();
            int N = sc.nextInt();
            int M = sc.nextInt();
            queueImportanceWrite(queue, N);
            int[] array = new int[queue.size()];
            queueArrayMake(queue, array);
            int curicousNum = mFind(queue, M);
            printSort(queue,array, newQueue);
            System.out.println(printM(newQueue, curicousNum));

        }

    }
    public static void queueImportanceWrite(Queue<Integer> importantQueue, int n){
        for(int i = 0; i < n; i++){
            importantQueue.offer(sc.nextInt());
        }
    }
    public static int[] queueArrayMake(Queue<Integer> queue, int[] array){
        Queue<Integer> arrayQueue = new LinkedList<>(queue);
        array = new int[queue.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = arrayQueue.poll();
        }
        return array;
    }
    public static int mFind(Queue<Integer> queue,int m){
        Queue<Integer> tempQueue = new LinkedList<>(queue);
        int res = 0;
        for(int i = 0; i <= m; i++){
            res = tempQueue.poll();
        }
        return res;
    }
    public static void printSort(Queue<Integer> queue, int[] array, Queue<Integer> newQueue){

/*        for(int i = 0; i < queue.size(); i++){
            for(int j = i; j < queue.size(); j++){
                if(array[i] < array[j]){
                    queue.offer(queue.peek());
                    queue.poll();
                }
            }
        }*/

        array = queueArrayMake(queue, array);
/*        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < queue.size(); j++){
                if(queue.peek() == Math.max(queue.peek(), array[j])){
                    queue.offer(queue.peek());
                    queue.poll();
                    queueArrayMake(queue, array);
                    j = 0;
                }
            }
            newQueue.offer(queue.poll());
            queueArrayMake(queue, array);
        }*/
        while(!queue.isEmpty()){
            for(int j = 0; j < array.length; j++){
                int qp = queue.peek();
                if(qp < array[j]){
                    queue.offer(queue.peek());
                    queue.poll();
                    array = queueArrayMake(queue, array);
                    j = 0;
                }
            }
            newQueue.offer(queue.poll());
            array = queueArrayMake(queue, array);
        }

    }
    public static int printM(Queue<Integer> queue, int m){
        int count = 1;
        for(int i = 0; i < queue.size(); i++){
            if(queue.peek() == m){
                return count;
            } else{
                queue.poll();
                count++;
            }
        }
        return count;
    }

}
