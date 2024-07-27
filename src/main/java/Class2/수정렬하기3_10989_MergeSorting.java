package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 수정렬하기3_10989_MergeSorting {
    static int[] sorted; // 병합 정렬에서 정렬된 결과를 임시로 저장할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        sorted = new int[N];

        // 입력 받기
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(numbers, 0, N - 1); // 병합 정렬 실행

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append("\n");
        }
        System.out.println(sb.toString());
    }

    // 병합 정렬 구현
    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = start;

        // 병합 단계
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                sorted[index++] = arr[left++];
            } else {
                sorted[index++] = arr[right++];
            }
        }

        // 남은 요소들 처리
        while (left <= mid) {
            sorted[index++] = arr[left++];
        }
        while (right <= end) {
            sorted[index++] = arr[right++];
        }

        // 정렬된 결과를 원본 배열에 복사
        for (int i = start; i <= end; i++) {
            arr[i] = sorted[i];
        }
    }
}

