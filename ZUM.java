import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class ZUM {
    // public int[] solution(int[][] data) {
    public int[] hi() {
        int data[][] = {{1, 0, 5},{2, 2, 2},{3, 3, 1},{4, 4, 1},{5, 10, 2}};
        int[] answer = process(data);
        // int[][] data
        return answer;
    }

    public int[] process(int[][] data){
        int process_time = 0;
        int process_position_idx = 0;
        int process_end_idx = data.length; 
        ArrayList<int[]> process_wait_arr = new ArrayList<>();

        boolean print_null = true;
        int print_out_time = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while( process_position_idx <= process_end_idx ){

            if ( process_position_idx == process_end_idx ){
                result.add((process_wait_arr.get(0))[0]);
                break;
            }

            // 대기열
            if ( data[process_position_idx][1] == process_time ){
                process_wait_arr.add(data[process_position_idx]);
                process_position_idx++;
                // 대기열에 데이터 추가시 Sort
                process_wait_arr.stream().sorted(Comparator.comparing((int[] s) -> s[2]));
                System.out
            }

            // 인쇄열이 비었을 때 실행
            if ( print_null == true && process_wait_arr.size() != 0){
                result.add((process_wait_arr.get(0))[0]);
                print_out_time = process_time + (process_wait_arr.get(0))[2];
                print_null = false;
                process_wait_arr.remove(0);
            }

            // 인쇄 종료
            if ( print_out_time == process_time ){
                print_out_time = 0;
                print_null = true;
            }

            process_time++;
        } 
        
        int[] array = new int[result.size()];
        int size = 0;
        for(int temp : result){
            array[size++] = temp;
        }
        return array;
        
    }
}