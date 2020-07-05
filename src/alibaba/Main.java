package alibaba;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T != 0){

            int n = sc.nextInt();
            char[][] road = new char[n][n];
            for(int i = 0; i < n; i++){
                road[i] = sc.next().toCharArray();
            }

            int begin_i = 0;
            int begin_j = 0;
            int end_i = 0;
            int end_j = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (road[i][j] == 'E'){
                        end_i = i;
                        end_j = j;
                    } else if (road[i][j] == 'S'){
                        begin_i = i;
                        begin_j = j;
                    } else if (road[i][j] == '#'){
                        count++;
                    }
                }
            }

            LinkedList<int[]> path = new LinkedList<>();
            findpath(path,road,begin_i,begin_j,end_i,end_j,count);
            char[] res = pathTpDirect(path);
            System.out.println(res);

            T--;
        }

    }

    public static boolean findpath(LinkedList<int[]> path, char[][] road, int now_i, int now_j, int end_i, int end_j, int count){
        if (count == 0 && now_i == end_i && now_j == end_j){
            path.add(new int[]{now_i, now_j});
            return true;
        } else if (now_i < 0 || now_i >= road.length || now_j >= road.length || road[now_i][now_j] == '.'){
            return false;
        } else {
            path.add(new int[]{now_i,now_j});
            road[now_i][now_j] = '.';
            count--;
            if (findpath(path,road,now_i - 1, now_j, end_i, end_j, count) ||
                    findpath(path,road,now_i, now_j - 1, end_i, end_j, count) ||
                    findpath(path,road,now_i + 1, now_j, end_i, end_j, count) ||
                    findpath(path,road,now_i, now_j + 1, end_i, end_j, count)){
                return true;
            }
            else {
                path.pollLast();
                road[now_i][now_j] = '#';
                count++;
                return  false;
            }
        }
    }
    public static char[] pathTpDirect(LinkedList<int[]> path){
        char[] d = new char[path.size() - 1];
        for (int i = 1; i < path.size(); i++){
            int[] pre = path.get(i - 1);
            int[] now = path.get(i);
            if (pre[0] - now[0] == 1){
                d[i - 1] = 'd';
            } else if (now[0] - pre[0] == 1){
                d[i - 1] = 'u';
            } else if (pre[1] - now[1] == 1){
                d[i - 1] = 'l';
            } else if (now[1] - pre[1] == 1){
                d[i - 1] = 'r';
            }
        }
        return d;
    }

}