import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st2.nextToken());
            if(num < X) bw.write(num + " ");
        }
        br.close();
        bw.flush();
        bw.close();
        
    }
}